package com.pg.asyncdemo;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pg.asyncdemo.pojo.Album;
import com.pg.asyncdemo.pojo.Todo;
import com.pg.asyncdemo.pojo.User;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	UserAsyncService jsonplaceholder;

	@GetMapping(path = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUser(@PathVariable int id) {

		CompletableFuture<User> user = jsonplaceholder.getUser(id);
		CompletableFuture<List<Album>> albums = jsonplaceholder.getAlbumsByUserId(id);
		CompletableFuture<List<Todo>> todos = jsonplaceholder.getTodosByUserId(id);

		// Wait until they are all done
		CompletableFuture.allOf(user, albums, todos).join();
		CompletableFuture.completedFuture(user);
		User user1 = null;
		try {
			user1 = user.get();
			System.out.println(user1.toString());
			user1.setAlbums(albums.get());
			user1.setTodos(todos.get());
			System.out.println(user1.toString());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		return ResponseEntity.ok(user1);
	}
}

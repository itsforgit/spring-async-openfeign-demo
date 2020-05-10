/**
 * 
 */
package com.pg.asyncdemo;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.pg.asyncdemo.openfeign.JsonplaceholderClient;
import com.pg.asyncdemo.pojo.Album;
import com.pg.asyncdemo.pojo.Todo;
import com.pg.asyncdemo.pojo.User;

@Service
public class UserAsyncService {

	@Autowired
	JsonplaceholderClient jsonplaceholderClient;

	@Async
	public CompletableFuture<User> getUser(int id) {

		User user = jsonplaceholderClient.getUser(id);

		return CompletableFuture.completedFuture(user);
	}

	@Async
	public CompletableFuture<List<Album>> getAlbumsByUserId(int id) {

		List<Album> albums = jsonplaceholderClient.getAlbumsByUserId(id);

		return CompletableFuture.completedFuture(albums);
	}

	@Async
	public CompletableFuture<List<Todo>> getTodosByUserId(int id) {

		List<Todo> todos = jsonplaceholderClient.getTodosByUserId(id);

		return CompletableFuture.completedFuture(todos);

	}
}

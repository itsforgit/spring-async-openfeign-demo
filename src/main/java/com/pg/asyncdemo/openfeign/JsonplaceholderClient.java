package com.pg.asyncdemo.openfeign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pg.asyncdemo.pojo.Album;
import com.pg.asyncdemo.pojo.Todo;
import com.pg.asyncdemo.pojo.User;

@FeignClient(value = "jsonplaceholderclient", url = "https://jsonplaceholder.typicode.com/", configuration = JsonplaceholderConfig.class)
public interface JsonplaceholderClient {

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable int id);

	@RequestMapping(value = "/users/{id}/albums", method = RequestMethod.GET)
	public List<Album> getAlbumsByUserId(@PathVariable int id);

	@RequestMapping(value = "/users/{id}/todos", method = RequestMethod.GET)
	public List<Todo> getTodosByUserId(@PathVariable int id);

}

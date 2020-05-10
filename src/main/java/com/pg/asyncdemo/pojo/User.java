package com.pg.asyncdemo.pojo;

import java.util.List;

public class User {

	private float id;
	private String name;
	private String username;
	private String email;
	Address AddressObject;
	private String phone;
	private String website;
	Company CompanyObject;

	private List<Album> albums;
	private List<Todo> todos;
	private List<Post> posts;

	// Getter Methods

	/**
	 * @return the albums
	 */
	public List<Album> getAlbums() {
		return albums;
	}

	/**
	 * @param albums the albums to set
	 */
	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}

	/**
	 * @return the todos
	 */
	public List<Todo> getTodos() {
		return todos;
	}

	/**
	 * @param todos the todos to set
	 */
	public void setTodos(List<Todo> todos) {
		this.todos = todos;
	}

	/**
	 * @return the posts
	 */
	public List<Post> getPosts() {
		return posts;
	}

	/**
	 * @param posts the posts to set
	 */
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public float getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public Address getAddress() {
		return AddressObject;
	}

	public String getPhone() {
		return phone;
	}

	public String getWebsite() {
		return website;
	}

	public Company getCompany() {
		return CompanyObject;
	}

	// Setter Methods

	public void setId(float id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(Address addressObject) {
		this.AddressObject = addressObject;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public void setCompany(Company companyObject) {
		this.CompanyObject = companyObject;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", AddressObject="
				+ AddressObject + ", phone=" + phone + ", website=" + website + ", CompanyObject=" + CompanyObject
				+ ", albums=" + albums + ", todos=" + todos + ", posts=" + posts + "]";
	}
	
}

package com.axcessfinancial.spring.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "AUTHORITIES")
public class Authority implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "AUTHORITY")
	private String authority;
	@OneToOne(mappedBy = "authority")
	private User user;

	public Authority() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
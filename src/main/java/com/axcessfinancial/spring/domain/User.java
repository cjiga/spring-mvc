package com.axcessfinancial.spring.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name="Users")
public class User implements Serializable,UserDetails{
	private static final long serialVersionUID=1L;

	@Id
	@Column(name="USERNAME")
	private String username;
	@Column(name="ENABLED")
	private String enabled;
	@Column(name="PASSWORD")
	private String password;
	//bi-direcctional one-to-one association to Authority
	@OneToOne
	@JoinColumn(name="USERNAME")
	private Authority authority;
	
	//Getters & Setters for original props
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//Getters and setters for relation property
	public Authority getAuthority() {
		return authority;
	}
	public void setAuthority(Authority authority) {
		this.authority = authority;
	}
	//Spring Security props
	private transient Collection<GrantedAuthority> authorities;
	//UserDetails methods
	@Transient
	public Collection<GrantedAuthority> getAuthorities() {
		return authorities;
	}
	@Transient
	public boolean isAccountNonExpired() {return true;}
	@Transient
	public boolean isAccountNonLocked() {return true;}
	@Transient
	public boolean isCredentialsNonExpired() {return true;}
	@Transient
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return getEnabled().equals("true");
	}
	@Transient
	public void setUserAuthorities(List<String> authorities){
		List<GrantedAuthority> listOfAuthorities = new ArrayList<GrantedAuthority>();
		for (String role : authorities) {
		listOfAuthorities.add(new GrantedAuthorityImpl(role));
		}
		this.authorities = (Collection<GrantedAuthority>) listOfAuthorities;
	}
	//Constructors
	public User(){}

	
	
	
	
	

}

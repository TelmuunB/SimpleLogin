package com.springBootLogin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="id")
  private Integer id;
  
  private String loginid;

  private String password;
	
  public Integer getId() {
	return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
  
  public String getLoginid() {
		return loginid;
	}


  public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	
  public String getPassword() {
		return password;
	}
	
  public void setPassword(String password) {
		this.password = password;
	}
  
}
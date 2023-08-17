package com.example.demo.entity.crmentity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bi_api_tbl_users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sr_no;
	
	@Column(name = "user_email",nullable = false)
	private String user_email;
	 
	@Column(name = "user_password",nullable = false)
	private String user_password;
	 
	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String user_name) {
		this.userName = user_name;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	@Column(name = "user_name",nullable = false)
	private String userName;
	 
	@Column(name = "user_role")
	private String user_role;
	 
	@Column(name = "user_status",nullable = false)
	private String user_status;
	 
	@Column(name = "user_descrip",nullable = false)
	private String user_descrip;
	 
	@Column(name = "contact_no")
	private String contact_no;
	 
	@Column(name = "create_date")
	private Date create_date;
	 
	@Column(name = "update_date",nullable = false)
	private Date update_date;

	

	

	
	
	
}

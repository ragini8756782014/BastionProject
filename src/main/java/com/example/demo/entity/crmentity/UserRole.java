package com.example.demo.entity.crmentity;
import java.security.Timestamp;

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
@Table(name = "bi_api_tbl_user_roles")
public class UserRole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="sr_no" ,nullable = false)
	private int sr_no;
	@Column(name ="role_name" ,nullable = false)
	private String role_name;
	@Column(name ="role_descrip")
	private String role_descrip;
	@Column(name ="create_date" ,nullable = false)
	private Timestamp create_date;
	@Column(name ="update_date" )
	private Timestamp update_date;
}

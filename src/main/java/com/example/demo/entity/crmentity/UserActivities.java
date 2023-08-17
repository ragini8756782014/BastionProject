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
@Table(name = "bi_api_tbl_user_activites")
public class UserActivities {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="sr_no" ,nullable = false)
	private int sr_no;
	@Column(name ="user_email_fk" ,nullable = false)
	private String user_email_fk;
	@Column(name ="threat_flag")
	private byte threat_flag;
	@Column(name ="threat_descrp" )
	private String threat_descrp;
	@Column(name ="login_location" )
	private String login_location;
	@Column(name ="logout_location" )
	private String logout_location;
	@Column(name ="login_time" ,nullable = false)
	private Timestamp login_time;
	@Column(name ="logout_time" )
	private Timestamp logout_time;
	@Column(name ="update_time" )
	private Timestamp update_time;
}

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
@Table(name = "bi_api_tbl_online_activation_activities")
public class OnlineActivationActivities {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="sr_no" ,nullable = false)
	private int sr_no;
	@Column(name ="license_key_fk" ,nullable = false)
	private String license_key_fk;
	@Column(name ="threat_descrip" )
	private String threat_descrip;
	@Column(name ="device_type")
	private String device_type;
	@Column(name ="threat_flag" )
	private byte threat_flag;
	@Column(name ="location")
	private String location;
	@Column(name ="create_date" ,nullable = false)
	private Timestamp create_date;
	@Column(name ="update_date",nullable = false )
	private Timestamp update_date;

}

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
@Table(name = "bi_api_tbl_end_user_activities")
public class EndUserActivities {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name ="sr_no" ,nullable = false)
private int sr_no;
@Column(name ="dongle_uid_fk" ,nullable = false)
private String dongle_uid_fk;
@Column(name ="threat_descrip")
private String threat_descrip;
@Column(name ="threat_flag" )
private byte threat_flag;
@Column(name ="status" )
private String status;
@Column(name ="location" )
private String location;
@Column(name =" create_date" ,nullable = false)
private Timestamp create_date;
@Column(name ="update_date" )
private Timestamp update_date;
}

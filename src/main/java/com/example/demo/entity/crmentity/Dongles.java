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
@Table(name = "bi_api_tbl_dongles")
public class Dongles {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name ="sr_no" ,nullable = false)
private int sr_no;
@Column(name ="dongle_uid" ,nullable = false)
private String dongle_uid;
@Column(name ="inv_id_fk" ,nullable = false)
private String inv_id_fk;
@Column(name ="dongle_type" )
private String dongle_type;
@Column(name ="dongle_color" )
private String dongle_color;
@Column(name ="dongle_descrip")
private String dongle_descrip;
@Column(name ="location" )
private String location;
@Column(name ="dongle_status")
private String dongle_status;
@Column(name ="expiry_date")
private Timestamp expiry_date;
@Column(name ="create_date" ,nullable = false)
private Timestamp create_date;
@Column(name ="update_date")
private Timestamp update_date;
}

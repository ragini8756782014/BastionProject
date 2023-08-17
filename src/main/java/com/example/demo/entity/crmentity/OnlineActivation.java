package com.example.demo.entity.crmentity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.security.Timestamp;
import java.util.Date;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bi_api_tbl_online_activation")
public class OnlineActivation {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sr_no",nullable = false)
    private int sr_no;
	
    @Column(name = "license_key", nullable = false)
    private String license_key;
    
    @Column(name = "inv_id_fk"  )
    private String  inv_id_fk;
    
    @Column(name = " system_count", columnDefinition = "varchar(255) default '2'")
    private String  system_count;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "app_id")
    private String  app_id;
    
    @Column(name = "location")
    private String location;
    
    @Column(name = "os")
    private String   os;
    
    @Column(name = "sysinfo")
    private String sysInfo;
    
    @Column(name = "upd_content")
    private String  upd_content;
    
    @Column(name = "txt_content")
    private String txt_content;
    
    @Column(name = "license_descrp")
    private String   license_descrp;
    
    @Column(name = "expiry_date")
    private Date expiry_date;
    
    @Column(name = "create_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp create_date;
    
    @Column(name = "update_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp  update_date;
	
}

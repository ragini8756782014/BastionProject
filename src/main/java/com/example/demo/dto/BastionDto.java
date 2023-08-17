package com.example.demo.dto;

import java.security.Timestamp;
import java.util.Date;
import org.springframework.stereotype.Component;
import jakarta.persistence.Column;
import lombok.Data;

@Component
@Data
public class BastionDto {

	
	private String license_key;
	

	private String Inv_id_fk;
	

	private String  system_count;

	private String status;

	private String os;
	

    private Timestamp create_date;
    
	private Date expiry_date;
	
}

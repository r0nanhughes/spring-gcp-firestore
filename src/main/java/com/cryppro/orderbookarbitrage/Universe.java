package com.cryppro.orderbookarbitrage;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Entity(name = "universe-u2")
public class Universe {

	@Id
    String id;
	
	private String exchangeID;
}

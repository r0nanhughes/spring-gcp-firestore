package com.cryppro.orderbookarbitrage;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

public interface UniverseRepo extends DatastoreRepository<Universe, String>{
	}
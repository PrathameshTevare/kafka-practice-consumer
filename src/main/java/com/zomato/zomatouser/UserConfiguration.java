package com.zomato.zomatouser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.zomato.zomatouser.constants.Constants;

@Configuration
public class UserConfiguration {
	
	private Logger logger = LoggerFactory.getLogger(UserConfiguration.class);
	
	@KafkaListener(topics = Constants.LOCATION_UPDATE_CONSTANTS, groupId = Constants.GROUP_ID)
	public void updateLocationResults(String location) {
		logger.info("location updated to {}", location);
	}

}

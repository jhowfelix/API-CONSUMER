package com.consumer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consumer.dto.SellerDTO;

@Service
public class SellerService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${url.microservico}")
	private String getUrl;

	public List<SellerDTO> consumerSeller() {
		HttpEntity entity = new HttpEntity(buildHeader());
		var response = restTemplate.exchange(getUrl, HttpMethod.GET, entity,new ParameterizedTypeReference<List<SellerDTO>>(){});
		return response.getBody();
	}

	private HttpHeaders buildHeader() {
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		return header;
	}
}

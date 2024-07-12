package com.security.apisecurityservice.service;

import com.security.apisecurityservice.dto.DataDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class DataServiceImplement implements IDataService{

    @Value("${spring.base.api.url}")
    private String basePath;

    private RestTemplate restTemplate = new RestTemplate();
    /**
     * GetData
     *
     * @return
     */
    @Override
    public DataDTO getByIdData(Long id) {
        return restTemplate.getForObject(basePath+"json/"+id, DataDTO.class);
    }
}

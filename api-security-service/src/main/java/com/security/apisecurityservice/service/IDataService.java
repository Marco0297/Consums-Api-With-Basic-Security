package com.security.apisecurityservice.service;

import com.security.apisecurityservice.dto.DataDTO;

import java.util.List;

public interface IDataService {

    /**
     * GetData
     * @return
     */
    public DataDTO getByIdData(Long id);
}

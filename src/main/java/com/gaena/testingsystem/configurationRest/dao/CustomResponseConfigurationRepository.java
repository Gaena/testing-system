package com.gaena.testingsystem.configurationRest.dao;

import com.gaena.testingsystem.configurationRest.model.CustomResponseConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomResponseConfigurationRepository
        extends JpaRepository<CustomResponseConfiguration, Integer>,
        JpaSpecificationExecutor<CustomResponseConfiguration> {

}
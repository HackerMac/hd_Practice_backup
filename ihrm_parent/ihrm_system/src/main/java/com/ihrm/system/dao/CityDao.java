package com.ihrm.system.dao;
/**
 * @Description TODO
 * @Date 2021/7/10
 * @Created by MINGKU
 */
import com.ihrm.domain.system.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CityDao extends JpaRepository<City,String> ,JpaSpecificationExecutor<City> {
}

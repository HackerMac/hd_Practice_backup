package com.ihrm.atte.dao;

/**
 * @Description TODO
 * @Date 2021/7/12
 * @Created by MINGKU
 */
import com.ihrm.domain.social_security.CompanySettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository("ihrm_attendance")
public interface CompanySettingsDao extends JpaRepository<CompanySettings,String> ,JpaSpecificationExecutor<CompanySettings> {
}

package com.ihrm.employee.dao;
/**
 * @Description TODO
 * @Date 2021/7/11
 * @Created by MINGKU
 */
import com.ihrm.domain.employee.EmployeePositive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 数据访问接口
 */
public interface PositiveDao extends JpaRepository<EmployeePositive, String>, JpaSpecificationExecutor<EmployeePositive> {
    EmployeePositive findByUserId(String uid);
}

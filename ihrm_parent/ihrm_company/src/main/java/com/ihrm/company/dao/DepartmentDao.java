package com.ihrm.company.dao;

import com.ihrm.domain.company.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Classname Department
 * @Description TODO
 * @Date 2021/7/9 20:49
 * @Created by MINGKU
 */
public interface DepartmentDao extends JpaRepository<Department, String>, JpaSpecificationExecutor<Department> {

}

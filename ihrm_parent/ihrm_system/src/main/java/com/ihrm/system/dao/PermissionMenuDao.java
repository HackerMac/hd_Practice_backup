package com.ihrm.system.dao;

/**
 * @Description TODO
 * @Date 2021/7/10
 * @Created by MINGKU
 */

import com.ihrm.domain.system.PermissionMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
  * 企业数据访问接口
  */
public interface PermissionMenuDao extends JpaRepository<PermissionMenu, String>, JpaSpecificationExecutor<PermissionMenu> {

    @Override
    List<PermissionMenu> findAll();
}

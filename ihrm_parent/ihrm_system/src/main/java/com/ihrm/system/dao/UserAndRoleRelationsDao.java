package com.ihrm.system.dao;

import com.ihrm.domain.system.RoleAndUserRelations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @Description TODO
 * @Date 2021/7/10
 * @Created by MINGKU
 */
public interface UserAndRoleRelationsDao extends JpaRepository<RoleAndUserRelations, String> ,
        JpaSpecificationExecutor<RoleAndUserRelations> {


    /**
     * 根据用户id查询对应的角色id
     * @param userId
     * @return
     */
    List<RoleAndUserRelations> findByUserId(String userId);
}

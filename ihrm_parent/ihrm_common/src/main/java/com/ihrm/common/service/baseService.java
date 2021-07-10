package com.ihrm.common.service;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * @Classname baseService
 * @Description TODO
 * @Date 2021/7/9 21:39
 * @Created by MINGKU
 */
public class baseService<T> {
    protected Specification<T> getSpec(String companyId) {
        Specification<T> spec = new Specification<T>() {
            /**
             * 用户构造查询条件
             * root , 包含了所有的用户数据
             * cq 一般不用
             * cb 构造查询条件
             *
             */
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                // 根据企业id进行查询
                return cb.equal(root.get("companyId").as(String.class), companyId);
            }
        };
        return spec;
    }
}

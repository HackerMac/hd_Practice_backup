package com.ihrm.common.service;
/**
 * @Description TODO
 * @Date 2021/7/11
 * @Created by MINGKU
 */
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class BaseService<T> {
    // 提取公共部分
    protected Specification<T> getSpec(String companyId){
        Specification<T> spec = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder cb) {
                return cb.equal(root.get("companyId").as(String.class) , companyId);
            }
        };
        return spec;
    }
}

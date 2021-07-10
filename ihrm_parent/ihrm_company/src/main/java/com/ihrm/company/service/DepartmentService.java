package com.ihrm.company.service;

import com.ihrm.common.Utils.IdWorker;
import com.ihrm.common.service.baseService;
import com.ihrm.company.dao.DepartmentDao;
import com.ihrm.domain.company.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * @Classname DepartmentService
 * @Description TODO
 * @Date 2021/7/9 20:50
 * @Created by MINGKU
 */

@Service
public class DepartmentService extends baseService {

    @Autowired
    private DepartmentDao departmentDao;

    @Autowired
    private IdWorker idWorker;
    /**
     * 1. 保存部门
     */
    public void save(Department department) {
        String id = idWorker.nextId() + "";
        department.setId(id);
        departmentDao.save(department);
    }
    /**
     * 2. 更新部门
     */
    public void update(Department department) {
        Department dept = departmentDao.findById(department.getId()).get();

        dept.setCode(department.getCode());
        dept.setIntroduce(department.getIntroduce());
        dept.setName(department.getName());

        departmentDao.save(dept);
    }
    /**
     * 3. 根据id查询部门
     */
    public Department findById(String id) {
        return departmentDao.findById(id).get();
    }
    /**
     * 4. 查询全部部门列表
     */
    public List<Department> findAll(String companyId) {
        /**
         * 用户构造查询条件
         *  1. 只查询companyId
         *  2. 很多地方都需要根据companyId进行查询
         *  3. 很多对象中都具有comanyId
         */
        //Specification<Department> spec = new Specification<Department>() {
        //    /**
        //     * 用户构造查询条件
        //     * root , 包含了所有的用户数据
        //     * cq 一般不用
        //     * cb 构造查询条件
        //     *
        //     */
        //    @Override
        //    public Predicate toPredicate(Root<Department> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
        //        // 根据企业id进行查询
        //        return cb.equal(root.get("companyId").as(String.class), companyId);
        //    }
        //};
        return departmentDao.findAll(getSpec(companyId));
    }
    /**
     * 5 根据id删除部门
     */
    public void deleteById(String id) {
        departmentDao.deleteById(id);
    }
}

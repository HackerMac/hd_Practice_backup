package com.ihrm.company.controller;

import com.ihrm.common.controller.baseController;
import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import com.ihrm.company.service.CompanyService;
import com.ihrm.company.service.DepartmentService;
import com.ihrm.domain.company.Company;
import com.ihrm.domain.company.Department;
import com.ihrm.domain.company.response.DeptListResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname DepartmentController
 * @Description TODO
 * @Date 2021/7/9 20:59
 * @Created by MINGKU
 */

/**
 * 1. 解决跨域
 * 2. 声明restController
 * 3. 设置父路径
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/company")
public class DepartmentController extends baseController {
    /**
     * 保存
     * @return
     */
    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/department", method = RequestMethod.POST)
    public Result save(@RequestBody Department department) {
        //String companyId = "1";
        department.setCompanyId(companyId);

        departmentService.save(department);
        return new Result(ResultCode.SUCCESS);
    }


    @RequestMapping(value = "/department", method = RequestMethod.GET)
    public Result findAll() {
        //String companyId = "1";
        Company company = companyService.findById(companyId);

        List<Department> list = departmentService.findAll(companyId);

        DeptListResult deptListResult = new DeptListResult(company, list);

        return new Result(ResultCode.SUCCESS, deptListResult);
    }

    /**
     * 根据Id进行查询
     */
    @RequestMapping(value = "/department/{id}", method = RequestMethod.GET)
    public Result findById(@PathVariable(value = "id")String id) {
        Department department = departmentService.findById(id);
        return new Result(ResultCode.SUCCESS, department);
    }

    /**
     * 修改department
     */
    @RequestMapping(value = "/department/{id}", method = RequestMethod.PUT)
    public Result update(@PathVariable(value = "id")String id, @RequestBody Department department) {
        department.setId(id);
        departmentService.update(department);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 根据id 删除
     */
    @RequestMapping(value = "/department/{id}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value = "id")String id) {
        departmentService.deleteById(id);
        return new Result(ResultCode.SUCCESS);
    }
}

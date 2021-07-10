package com.ihrm.domain.company.response;

import com.ihrm.domain.company.Company;
import com.ihrm.domain.company.Department;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @Classname DeptListResult
 * @Description TODO
 * @Date 2021/7/9 21:18
 * @Created by MINGKU
 */

@Getter
@Setter
@NoArgsConstructor
public class DeptListResult {
    private String companyId;
    private String companyName;
    private String companyMange;
    private List<Department> depts;

    public DeptListResult(Company company, List depts) {
        this.companyId = company.getId();
        this.companyName = company.getName();
        this.companyMange = company.getLegalRepresentative();
        this.depts = depts;
    }
}

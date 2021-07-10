package com.ihrm.employee.service;
/**
 * @Description TODO
 * @Date 2021/7/11
 * @Created by MINGKU
 */
import com.ihrm.domain.employee.UserCompanyJobs;
import com.ihrm.employee.dao.UserCompanyJobsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserCompanyJobsService {
    @Autowired
    private UserCompanyJobsDao userCompanyJobsDao;

    public void save(UserCompanyJobs jobsInfo) {
        userCompanyJobsDao.save(jobsInfo);
    }

    public UserCompanyJobs findById(String userId) {
        return userCompanyJobsDao.findByUserId(userId);
    }
}

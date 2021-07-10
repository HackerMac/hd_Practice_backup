package com.ihrm.atte.service;

/**
 * @Description TODO
 * @Date 2021/7/12
 * @Created by MINGKU
 */
import com.ihrm.atte.dao.ArchiveMonthlyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReprortService {


    @Autowired
    private ArchiveMonthlyDao archiveMonthlyDao;

}

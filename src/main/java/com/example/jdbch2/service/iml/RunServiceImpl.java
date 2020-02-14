package com.example.jdbch2.service.iml;

import com.example.jdbch2.dao.UserDao;
import com.example.jdbch2.service.RunService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service

public class RunServiceImpl implements RunService {
    @Resource(name = "userDao")
        private UserDao d;
    @Override
    public String writeRun() {
        d.setStartTime("1234");
        return d.getStartTime();
    }
}

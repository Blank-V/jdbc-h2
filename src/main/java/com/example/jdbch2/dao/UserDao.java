package com.example.jdbch2.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDao")
public class UserDao {
    private String startTime;
    private int endTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}

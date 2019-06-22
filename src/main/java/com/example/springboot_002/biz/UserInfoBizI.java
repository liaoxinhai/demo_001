package com.example.springboot_002.biz;

import com.example.springboot_002.enity.UserInfo;

import java.util.List;

public interface UserInfoBizI {

    public UserInfo save(UserInfo userInfo);

    public List<UserInfo> searchall();
}

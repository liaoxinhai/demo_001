package com.example.springboot_002.biz.BizImol;

import com.example.springboot_002.biz.UserInfoBizI;
import com.example.springboot_002.enity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service(value = "UserInfoBizI")
public class UserInfoBizImpl implements UserInfoBizI {

   static ArrayList<UserInfo> listl=new ArrayList<UserInfo>();
    static {
        for(int i=0;i<=5;i++){
            UserInfo userInfo=new UserInfo();
            userInfo.setUid(i);
            userInfo.setName("jk"+i);
            userInfo.setPass("lxh"+i);
            listl.add(userInfo);
        }


    }


    @Override
    public UserInfo save(UserInfo userInfo) {

        listl.add(userInfo);
        return userInfo;
    }

    @Override
    public List<UserInfo> searchall() {
        return listl;
    }
}

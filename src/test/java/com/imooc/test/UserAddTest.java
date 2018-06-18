package com.imooc.test;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.imooc.mapper.UserMapper;
import com.imooc.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class UserAddTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void addUser(){
        User user = new User();
        user.setUserPassword("283538989cef48f3d7d8a1c1bdf2008f");
        user.setUserName("tom");
        userMapper.insert(user);
    }


    @Test
    public void findUser(){
        List userList = userMapper.selectList(new EntityWrapper<User>().where("user_name={0}","Mark"));
        User user = (User) userList.get(0);
        System.out.println("name:"+user.getUserName()+"id:"+user.getUserId()+ "pass:"+user.getUserPassword());
    }
}

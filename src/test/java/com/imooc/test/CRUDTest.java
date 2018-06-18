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

/**
 * GreatBy: Gzm
 * GreatTime:下午 10:30
 * GreatDate:2018/6/13 0013
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class CRUDTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void findUser(){
        List userList = userMapper.selectList(new EntityWrapper<User>().eq("user_name","Mark"));
        User user = (User) userList.get(0);
        System.out.println(user.toString());
    }
}

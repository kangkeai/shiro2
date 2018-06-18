package com.imooc.test;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;

/**
 * GreatBy: Gzm
 * GreatTime:下午 10:15
 * GreatDate:2018/6/13 0013
 */
public class HashMd5 {
    @Test
    public void HashString(){
        Md5Hash md5Hash = new Md5Hash("123456","Mark");
        System.out.println(md5Hash);
    }
}

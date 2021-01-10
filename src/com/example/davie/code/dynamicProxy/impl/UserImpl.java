package com.example.davie.code.dynamicProxy.impl;

import com.example.davie.code.dynamicProxy.UserDao;

public class UserImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("保存信息...");
    }
}

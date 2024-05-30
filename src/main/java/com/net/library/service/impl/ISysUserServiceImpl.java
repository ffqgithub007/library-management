package com.net.library.service.impl;

import com.net.library.mapper.SysUserMapper;
import com.net.library.pojo.SysUser;
import com.net.library.service.ISysUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISysUserServiceImpl implements ISysUserService {

    @Autowired
    SysUserMapper sysUserMapper;


    @Override
    public PageInfo<SysUser> listPage(Integer pageNum, Integer pageSize,SysUser sysUser) {
        PageHelper.startPage(pageNum,pageSize);
        List<SysUser> users=sysUserMapper.selectAllList(sysUser);
        PageInfo<SysUser> pageInfo =new PageInfo<>(users);
        return pageInfo;
    }

    @Override
    public SysUser selectUserByLoginName(String userName) {
        return sysUserMapper.selectUserByLoginName(userName);
    }

    @Override
    public List<SysUser> selectAllList(SysUser sysUser) {
        return sysUserMapper.selectAllList(sysUser);
    }


    @Override
    public int insertUser(SysUser sysUser) {

        return sysUserMapper.insertUser(sysUser);
    }

    @Override
    public int updateUser(SysUser sysUser) {
        return sysUserMapper.updateUser(sysUser);
    }

    @Override
    public int deleteUser(Long id) {
        return sysUserMapper.deleteUser(id);
    }

    @Override
    public  SysUser  selectUserById(Long id){
        return sysUserMapper.selectUserById(id);
    }
}

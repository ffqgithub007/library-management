package com.net.library.service;

import com.net.library.pojo.SysUser;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ISysUserService{
    /**
     * 分页查询
     */
    PageInfo<SysUser> listPage(Integer pageNum,Integer pageSize,SysUser sysUser);
    /**
     * 通过用户名查询用户
     */
    public SysUser selectUserByLoginName(String userName);

    /**
     * 查询所有的用户
     * @return 用户列表
     */
    List<SysUser> selectAllList(SysUser sysUser);

    /**
     * 添加数据
     */
    int insertUser (SysUser  sysUser);
    /**
     * 修改数据
     */
    int updateUser(SysUser sysUser);
    /**
     * 删除数据
     */
    int deleteUser(Long id);
    /**
     * 通过id来查询用户
     */
    public  SysUser  selectUserById(Long id);
}

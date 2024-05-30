package com.net.library.service;

import com.net.library.pojo.SysMenu;

import java.util.List;

public interface SysMenuService {
    /**
     * 查询所有的菜单
     * @return
     */
    List<SysMenu> selectMenuNormalAll();

}

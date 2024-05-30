package com.net.library.service.impl;

import com.net.library.mapper.SysMenuMapper;
import com.net.library.pojo.SysMenu;
import com.net.library.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    SysMenuMapper sysMenuMapper;

    @Override
    public List<SysMenu> selectMenuNormalAll() {
        return sysMenuMapper.selectMenuNormalAll();
    }
}

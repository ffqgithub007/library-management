package com.net.library.mapper;

import com.net.library.pojo.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysMenuMapper {
    /**
     * 查询所有的菜单
     * @return
     */
    List<SysMenu> selectMenuNormalAll();
}

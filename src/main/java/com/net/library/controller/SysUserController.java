package com.net.library.controller;

import com.net.library.pojo.SysUser;
import com.net.library.service.ISysUserService;
import com.net.library.utils.AjaxResult;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(tags = "用户管理")
@Controller
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    ISysUserService iSysUserService;

    @ApiOperation("列表查询")
    @PostMapping("/list") //前段 ajax 传过来条件查询 所有的数据
    @ResponseBody
    public AjaxResult listAll(@RequestBody SysUser sysUser, ModelMap map){
        PageInfo<SysUser> pageInfo = iSysUserService.listPage(1, 100,sysUser);
            return  AjaxResult.success(pageInfo);
    }

    @ApiOperation("新增")
    @GetMapping("/add")
    public String addPage(ModelMap map){
        map.addAttribute("action","addPost");
        return "books_user/add";
    }

    @ApiOperation("新增重定向")
    @PostMapping("addPost")
    public String addPosts(SysUser sysUser){
        sysUser.setCreateTime(new Date());
        int i = iSysUserService.insertUser(sysUser);
        if (i>0) {
            return "redirect:/system/user";
        }
        return "books_user/add";
    }

    @ApiOperation("主键更新")
    @GetMapping("/update/{id}")
    public String updatePage(@PathVariable("id") long id,ModelMap map){
        map.addAttribute("list",iSysUserService.selectUserById(id));
        map.addAttribute("action","updatePost");
        return "books_user/update";
    }

    @ApiOperation("更新重定向")
    @PostMapping("/updatePost")
    public String updatePosts(SysUser sysUser){
        int i = iSysUserService.updateUser(sysUser);
        return "redirect:/system/user";
    }

    @ApiOperation("主键删除")
    @GetMapping("/delete/{id}")
    public String deletes(@PathVariable("id") long id){
        int i = iSysUserService.deleteUser(id);
        return "redirect:/system/user";
    }
}

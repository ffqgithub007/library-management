package com.net.library.controller;

import com.net.library.pojo.SysUser;
import com.net.library.service.ISysUserService;
import com.net.library.utils.AjaxResult;
import com.net.library.utils.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录验证
 */
@Api(tags = "登录管理")
@Controller
public class SysLoginController extends BaseController {
    @Autowired
    ISysUserService iSysUserService;

    @ApiOperation("登录跳转")
    @GetMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response, ModelMap map)
    {
        return "login";
    }

    @ApiOperation("登录")
    @PostMapping("/login")
    @ResponseBody
    public AjaxResult ajaxLogin(String username,String password)
    {
        SysUser sysUser=null;
        if (username!=null) {   //数据库里的  用户名不能相同
             sysUser = iSysUserService.selectUserByLoginName(username);
        }
        if (sysUser.getPassword().equals(password)){
            return AjaxResult.success();
        }else
        {
         return AjaxResult.error();
        }
    }

}

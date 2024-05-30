package com.net.library.controller;

import com.net.library.pojo.SysUser;
import com.net.library.service.ISysUserService;
import com.net.library.utils.AjaxResult;
import com.net.library.utils.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 注册验证
 *
 * @author fangfeiqiang
 * @date 2024-05-31 0:39:15
 */
@Api(tags = "注册管理")
@Controller
public class SysRegisterController extends BaseController
{
    @Autowired
    ISysUserService iSysUserService;

    @ApiOperation("注册跳转")
    @GetMapping("/register")
    public String register(){
        return "register";
    }


    @ApiOperation("注册")
    @PostMapping("/register")
    @ResponseBody
    public AjaxResult ajaxLogin(SysUser sysUser){

        SysUser sysUsers = iSysUserService.selectUserByLoginName(sysUser.getLoginName());

        if (sysUsers ==  null ) {
            int i = iSysUserService.insertUser(sysUser);
                return AjaxResult.success();
        }else
        return AjaxResult.error("0");
    }

}

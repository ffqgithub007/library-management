package com.net.library.controller;

import com.net.library.pojo.SysUser;
import com.net.library.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 首页  业务处理
 *
 * @Author  fangfeiqiang
 */
@Api(tags = "系统管理")
@Controller
public class SysIndexController {

    @Autowired
    SysMenuService service;

    @Autowired
    BookWarehouseService bookWarehouseService;

    @Autowired
    BookBorrowService bookBorrowService;

    @Autowired
    BookNoticeService bookNoticeService;

    @Autowired
    ISysUserService iSysUserService;

    @Autowired
    BookCardService bookCardService;

    @Autowired
    BookShelfService bookShelfService;

    @ApiOperation("系统首页")
    //系统首页 菜单加载
    @GetMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("menus",service.selectMenuNormalAll());
        return "index";
    }

    @ApiOperation("图书仓库")
    @GetMapping("/system/main") //图书管理   分页查询
    public String main(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                          @RequestParam(required = false, defaultValue = "5") Integer pageSize, ModelMap map) {
        map.addAttribute("bookPages", bookWarehouseService.list(pageNum, pageSize));
        return "/books_jar/main";
    }

    @ApiOperation("图书书架")
    @GetMapping("/system/shelf")//书架管理
    public String shelf(@RequestParam(required = false,defaultValue = "1")Integer pageNum,
                        @RequestParam(required = false,defaultValue = "5") Integer pageSize,ModelMap map){
        map.addAttribute("shelfs",bookShelfService.listPage(pageNum,pageSize));
        return "books_shelf/main";
    }

    @ApiOperation("图书借阅")
    @GetMapping("/system/borrow")//借阅管理    分页查询
    public String lend(@RequestParam(required = false,defaultValue = "1")Integer pageNum,
                       @RequestParam(required = false,defaultValue = "5")Integer pageSize, ModelMap map){
        map.addAttribute("borrowPages",bookBorrowService.listPage(pageNum,pageSize));
        return "/books_borrow/main";
    }

    @ApiOperation("图书公告")
    @GetMapping("/system/notice")//公告管理
    public  String annoction(@RequestParam(required = false,defaultValue = "1")Integer pageNum,
                             @RequestParam(required = false,defaultValue = "5")Integer pageSiz,ModelMap map){
        map.addAttribute("notice",bookNoticeService.listPage(pageNum,pageSiz));
        return "books_notice/main";
    }

    @ApiOperation("图书卡")
    @GetMapping("/system/card")//卡信息管理
    public String card(@RequestParam(required = false,defaultValue = "1")Integer pageNum,
            @RequestParam(required = false,defaultValue = "5")Integer pageSiz,ModelMap map){
        map.addAttribute("cards",bookCardService.listPage(pageNum,pageSiz));
        return "/books_car/main";
    }

    @ApiOperation("用户")
    @GetMapping("/system/user")//用户信息管理
    public String user(@RequestParam(required = false,defaultValue = "1")Integer pageNum,
                       @RequestParam(required = false,defaultValue = "5")Integer pageSize,ModelMap map){
        map.addAttribute("users",iSysUserService.listPage(pageNum,pageSize,new SysUser()));
        return "books_user/main";
    }

}

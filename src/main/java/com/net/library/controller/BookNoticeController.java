package com.net.library.controller;

import com.alibaba.fastjson.JSON;
import com.net.library.pojo.BookNotice;
import com.net.library.service.BookNoticeService;
import com.net.library.utils.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Api(tags = "图书公告管理")
@Controller
@RequestMapping("/notice")
public class BookNoticeController {

    @Autowired
    BookNoticeService bookNoticeService;

    private static final Logger logger = LoggerFactory.getLogger(BookNoticeController.class);


    @ApiOperation("列表查询")
    @PostMapping("/search")
    @ResponseBody
    public AjaxResult list(@RequestBody BookNotice bookNotice){
        logger.info("do listAll,request=[{}]", JSON.toJSONString(bookNotice));

        List<BookNotice> bookNotices = bookNoticeService.selectAll(bookNotice);
            return AjaxResult.success(bookNotices);
    }

    @ApiOperation("主键删除")
    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Long id){
        Long aLong = bookNoticeService.deleteNoticeById(id);
         return "redirect:/system/notice";
    }

    @ApiOperation("新增")
    @GetMapping("/add")
    public String addPage(ModelMap map){
        map.addAttribute("action","addPost");
        return "/books_notice/add";
    }

    @ApiOperation("新增重定向")
    @PostMapping("/addPost")
    public String adddate(BookNotice bookNotice){
        bookNotice.setCreateTime(new Date());
        Long aLong = bookNoticeService.insertAll(bookNotice);
        return "redirect:/system/notice";
    }

    @ApiOperation("主键更新")
    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") Long id,ModelMap map){
        map.addAttribute("notices",bookNoticeService.findNoticeById(id));
        map.addAttribute("action","updatePost");
        return "books_notice/update";
    }

    @ApiOperation("更新重定向")
    @PostMapping("/updatePost")
    public String updateDate(BookNotice bookNotice){
        Long aLong = bookNoticeService.updateNotice(bookNotice);
        return "redirect:/system/notice";
    }
}

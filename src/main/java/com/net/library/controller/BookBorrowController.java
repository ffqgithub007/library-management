package com.net.library.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.net.library.pojo.BookBorrow;
import com.net.library.service.BookBorrowService;
import com.net.library.utils.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


import java.util.Date;
import java.util.List;

@Api(tags = "图书借阅管理")
@Controller
@RequestMapping("/borrow")
@Slf4j
public class BookBorrowController {

    @Autowired
    BookBorrowService bookBorrowService;

    private static final Logger logger = LoggerFactory.getLogger(BookBorrowController.class);

    @ApiOperation("列表查询")
    @PostMapping("/list")   // 条件查询
    @ResponseBody
    public AjaxResult listAll(@RequestBody BookBorrow bookBorrow){
        logger.info("do listAll,request=[{}]",JSON.toJSONString(bookBorrow));
        List<BookBorrow> bookBorrows = bookBorrowService.selectAllList(bookBorrow);
            return AjaxResult.success(bookBorrows);
    }

    @ApiOperation("删除")
    @GetMapping(value = "/delete/{id}")
    public String deletes(@PathVariable("id") Long id){
        logger.info("do deletes,request=[{}]",id);

        bookBorrowService.deleteById(id);
    return "redirect:/system/borrow";
    }

    @ApiOperation("更新")
    @GetMapping(value = "/update/{id}")
    public String update(@PathVariable("id") Long id, ModelMap map){
        logger.info("do update,request=[{}]",id);

        map.addAttribute("list",bookBorrowService.selectId(id));
        map.addAttribute("action","updates");
        return "books_borrow/update";
    }

    @ApiOperation("保存")
    @PostMapping("/updates")
    public String save(BookBorrow bookBorrow){
        logger.info("do save,request=[{}]",JSON.toJSONString(bookBorrow));

        bookBorrowService.updateByID(bookBorrow);
        return "redirect:/system/borrow";
    }

    @ApiOperation("新增图书借阅用户")
    @GetMapping(value = "/addUser")
    public String add(ModelMap map){
        map.addAttribute("action","save");
        return "books_borrow/add";
    }

    @ApiOperation("图书借阅重定向")
    @PostMapping(value = "/save")
    public  String saveValue(BookBorrow bookBorrow){
        logger.info("do saveValue,request=[{}]",JSON.toJSONString(bookBorrow));

        bookBorrow.setBorrowDate(new Date());
        bookBorrowService.save(bookBorrow);
        return "redirect:/system/borrow";
    }
}

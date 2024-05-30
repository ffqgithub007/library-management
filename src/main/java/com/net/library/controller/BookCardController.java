package com.net.library.controller;

import com.alibaba.fastjson.JSON;
import com.net.library.pojo.BookCard;
import com.net.library.service.BookCardService;
import com.net.library.utils.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "图书卡信息管理")
@Controller
@RequestMapping("/card")
public class BookCardController {

    @Autowired
    BookCardService bookCardService;

    private static final Logger logger = LoggerFactory.getLogger(BookCardController.class);


    @ApiOperation("列表查询")
    @PostMapping("/search")//将数据返回到页面 //requestbody 请求值
    @ResponseBody
    public AjaxResult list(@RequestBody BookCard bookCard){
        logger.info("do listAll,request=[{}]", JSON.toJSONString(bookCard));

        List<BookCard> bookCards = bookCardService.selectAllList(bookCard);
            return AjaxResult.success(bookCards);
    }

    @ApiOperation("删除")
    @GetMapping("/delete/{id}")//pathvariable占位符
    public String deleteById(@PathVariable("id") Long id){
        int i = bookCardService.deleteById(id);
        return "redirect:/system/card";
    }

    @ApiOperation("新增")
    @GetMapping("/add")
    public String addPage(ModelMap map){
//        map.addAttribute("action","addPost");
        return "/books_car/add";
    }

    @ApiOperation("保存重定向")
    @PostMapping("/addPost")
    public String adddate(BookCard bookCard){
        int save = bookCardService.save(bookCard);
        return "redirect:/system/card";
    }

    @ApiOperation("更新")
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id,ModelMap map){
        map.addAttribute("cards",bookCardService.selectId(id));
        return "books_car/update";
    }

    @ApiOperation("更新重定向")
    @PostMapping("/updatePost")
    public String updateDate(BookCard bookCard){
        int i = bookCardService.updateByID(bookCard);
        return "redirect:/system/card";
    }
}

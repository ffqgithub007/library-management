package com.net.library.controller;

import com.net.library.pojo.BookShelf;
import com.net.library.service.BookShelfService;
import com.net.library.utils.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "图书上架管理")
@Controller
@RequestMapping("/shelf")//处理请求地址映射
public class BookShelfController {

    @Autowired
    BookShelfService bookShelfService;

    @ApiOperation("列表查询")
    @PostMapping("/search")//将前端页面中的数据进行映射
    @ResponseBody//通过ajax把数据返回给前端
    public AjaxResult list(@RequestBody BookShelf bookShelf){
        List<BookShelf> bookShelves = bookShelfService.selectAll(bookShelf);
            return AjaxResult.success(bookShelves);
    }

    @ApiOperation("主键删除")
    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Long id){
        int aLong = bookShelfService.deleteNoticeById(id);
         return "redirect:/system/shelf";
    }

    @ApiOperation("新增")
    @GetMapping("/add")
    public String addPage(ModelMap map){
        return "/books_shelf/add";
    }

    @ApiOperation("新增重定向")
    @PostMapping("/addPost")
    public String adddate(BookShelf bookShelf){
        int aLong = bookShelfService.insertAll(bookShelf);
        return "redirect:/system/shelf";
    }

    @ApiOperation("主键更新")
    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") Long id,ModelMap map){
        BookShelf shelfById = bookShelfService.findShelfById(id);
        map.addAttribute("shelfs",shelfById);
        return "books_shelf/update";
    }

    @ApiOperation("更新重定向")
    @PostMapping("/updatePost")
    public String updateDate(BookShelf bookShelf){
        int aLong = bookShelfService.updateShelf(bookShelf);
        return "redirect:/system/shelf";
    }
}

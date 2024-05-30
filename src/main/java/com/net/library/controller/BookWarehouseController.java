package com.net.library.controller;

import com.net.library.pojo.BookWarehouse;
import com.net.library.service.BookWarehouseService;

import com.net.library.utils.AjaxResult;
import com.net.library.utils.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "图书仓库管理")
@Controller
@RequestMapping("/book")
public class BookWarehouseController extends BaseController {

    @Autowired
    BookWarehouseService bookWarehouseService;

    @ApiOperation("列表查询")
    @PostMapping("/list")
    @ResponseBody
    public AjaxResult finddby(@RequestBody BookWarehouse bookWarehouse) {
        List<BookWarehouse> bookWarehouses = bookWarehouseService.selectBooksList(bookWarehouse);
            return AjaxResult.success(bookWarehouses);
    }

    @ApiOperation("主键删除")
    @GetMapping(value = "/delete/{bookID}")
    public String delete(@PathVariable("bookID") String bookID){
        bookWarehouseService.deleteBookById(bookID);
        return "redirect:/system/main";
    }

    @ApiOperation("保存")
    @GetMapping("/savePage")
    public String save(ModelMap map){
            map.addAttribute("action","savePost");
        return "/books_jar/save";
    }

    @ApiOperation("保存重定向")
    @PostMapping("/savePost")
    public String saveData(BookWarehouse bookWarehouse){
        bookWarehouseService.insertBook(bookWarehouse);
        return "redirect:/system/main";
    }

    @ApiOperation("主键更新")
    @GetMapping("/update/{bookId}")
    public String findupdate(@PathVariable("bookId") String ISBN,ModelMap map){
        BookWarehouse bookWarehouse = bookWarehouseService.selectBookById(ISBN);
        map.addAttribute("books", bookWarehouse);
        map.addAttribute("action","updatePost");
        return "books_jar/update";
    }

    @ApiOperation("更新重定向")
    @PostMapping("/updatePost")
    public String updatece(BookWarehouse bookWarehouse){
        bookWarehouseService.updateBook(bookWarehouse);
        return "redirect:/system/main";
    }

    @ApiOperation("借阅图书数量")
    @GetMapping("/lend/{bookId}")
    public String lendBooks(@PathVariable("bookId") String ISBN){

        return "redirect:/system/main";
    }

    @ApiOperation("借阅图书重定向")
    @GetMapping("/system/borrow")
    public  String borrows(){
        return "redirect:/system/borrow";
    }

}

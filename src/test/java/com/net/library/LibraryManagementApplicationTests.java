package com.net.library;

import com.net.library.mapper.BookCardMapper;
import com.net.library.mapper.SysUserMapper;
import com.net.library.pojo.*;

import com.net.library.service.*;
import com.net.library.pojo.BookCard;
import com.net.library.pojo.BookNotice;
import com.net.library.service.BookNoticeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LibraryManagementApplicationTests {

    @Autowired
    BookNoticeService bookNoticeService;
    @Autowired
    SysUserMapper sysUserMapper;
    @Autowired
    BookCardMapper bookCardMapper;

    @Test
    void insert(){ //插入数据
        Long aLong = bookNoticeService.insertAll(new BookNotice(1l,""));
    }

    @Test
    void delete(){//删除数据
        Long i = bookNoticeService.deleteNoticeById(1l);
    }
    @Test
    public void update(){ //更新数据  通过id来进行更新数据
        Long as = bookNoticeService.updateNotice(new BookNotice(1l, "hello-book"));
        System.out.println(as);
    }

    @Test
    public void selectById() { //
        BookCard bookCard = bookCardMapper.selectId(1L);
        System.out.println(bookCard);
    }
}

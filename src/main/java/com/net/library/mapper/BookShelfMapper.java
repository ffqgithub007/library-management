package com.net.library.mapper;

import com.net.library.pojo.BookShelf;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookShelfMapper {
    /**
     * 查询所有
     * @param bookShelf
     * @return
     */
    List<BookShelf> selectAll (BookShelf bookShelf);
    /**
     * 通过id来进行查询
     */
    BookShelf findShelfById(Long id);
    /**
     * 插入
     */
    int insertAll(BookShelf bookShelf);
    /**
     * 修改
     */
    int updateShelf(BookShelf bookShelf);
    /**
     * 假删除
     */
    int deleteNoticeById(Long id);
}

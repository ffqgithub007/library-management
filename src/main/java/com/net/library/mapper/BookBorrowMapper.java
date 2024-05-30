package com.net.library.mapper;

import com.net.library.pojo.BookBorrow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookBorrowMapper {
    /**
     * 查询所有的 借阅图书 并分页
     * @param
     */
    public List<BookBorrow> selectAllList(BookBorrow bookBorrow);
    /**
     * 查询ISBN码
     */
    public BookBorrow selectId(Long id);
    /**
     * 删除
     */
    public int deleteById(Long id);
    /**
     * 修改
     */
    public int updateByID(BookBorrow bookBorrow);
    /**
     * 保存
     *
     */
    public int save(BookBorrow bookBorrow);
}

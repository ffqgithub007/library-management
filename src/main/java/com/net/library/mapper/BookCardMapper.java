package com.net.library.mapper;

import com.net.library.pojo.BookCard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookCardMapper {
    /**
     * 查询所有的 借阅图书
     * @param
     */
    public List<BookCard> selectAllList(BookCard bookCard);
    /**
     * 查询ISBN码
     */
    public BookCard selectId(Long id);
    /**
     * 删除
     */
    public int deleteById(Long id);
    /**
     * 修改
     */
    public int updateByID(BookCard bookCard);
    /**
     * 保存
     *
     */
    public int save(BookCard bookCard);
}

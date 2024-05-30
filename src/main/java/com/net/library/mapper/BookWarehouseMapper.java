package com.net.library.mapper;

import com.net.library.pojo.BookWarehouse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookWarehouseMapper
{
    /**
     * 查询图书
     *
     * @param id 图书ID
     * @return  图书
     */
    public BookWarehouse selectBookById(String id);


    /**
     * 查询图书列表
     *
     * @param  bookWarehouse 图书
     * @return 图书集合
     */
    List<BookWarehouse> selectBooksList(BookWarehouse bookWarehouse);

    /**
     * 添加图书
     *
     * @param bookWarehouse 图书
     * @return 结果
     */
    public  int insertBook(BookWarehouse bookWarehouse);

    /**
     * 修改图书
     *
     * @param  bookWarehouse 图书
     * @return 结果
     */
    public int updateBook(BookWarehouse bookWarehouse);

    /**
     * 删除图书
     *
     * @param id 需要删除的数据ID
     * @return 结果
     */
    public int deleteBookById(String id);

    /**
     * 批量删除图书
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBookByIds(String [] ids);

    /**
     * 批量假删除 图书
     * @param ids 需要删除的数据id
     * @return 结果
     */
    public int deleteDelBookByIds(String [] ids);

}

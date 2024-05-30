package com.net.library.service;

import com.net.library.pojo.BookWarehouse;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookWarehouseService {

    PageInfo<BookWarehouse> list(Integer pageNum, Integer pageSize);

    /**
     * 查询图书
     *
     * @param ISBN 图书ISBN
     * @return  图书
     */
    public BookWarehouse selectBookById(String ISBN);


    /**
     * 查询图书的信息
     * @return 列表
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
     * @param id 图书
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

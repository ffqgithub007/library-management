package com.net.library.utils;

import static com.net.library.utils.AjaxResult.error;
import static com.net.library.utils.AjaxResult.success;

/**
 * web通用数据处理
 *
 * @author fangfeiqiang
 */
public class BaseController {
    /**
     * 相应返回结果
     *
     * @param rows 影响行数
     * @return 操作结果
     */
    protected AjaxResult toAjax(int rows)
    {
        return rows >0 ? success() : error();
    }
}

package com.net.library.utils;

import java.util.HashMap;

/**
 * 操作消息提醒
 *
 * @author fangfeiqiang
 */
public class AjaxResult extends HashMap<String ,Object>
{
    private static final long serialVersionUID = 1l;

    /** 状态码 **/
    public static final String CODE_TAG = "code";

    /** 返回类容 **/
    public static final String MSG_TAG = "msg";

    /** 数据对象 **/
    public static final String DATA_TAG = "data";


    /**
     * 状态类型
     */
    public enum Type
    {
        SUCCESS(200),
        WARN(301),
        ERROR(500);
        private final int value;

        Type(int value) {
            this.value=value;
        }
        public int value(){
            return this.value;
        }
    }

    /**
     *  初始化一个新创建的 AjaxResult 对象，使其表示一个空消息
     */

    public  AjaxResult()
    {
    }

    /**
     *  初始化一个新创建的 AjaxResult 对象
     */
    public AjaxResult(Type type, String msg, Object data)
    {
        super.put(CODE_TAG,type.value);
        super.put(MSG_TAG,msg);
        if (data!=null)
        {
            super.put(DATA_TAG,data);
        }
    }


    public  static AjaxResult success()
    {
        return AjaxResult.success("操作成功");
    }

    /**
     * 返回成功消息
     * 一个参数
     */
    public static AjaxResult success(String msg)
    {
        return AjaxResult.success(msg,null);
    }

    /**
     * 返回成功消息
     * 两个参数
     */
    public static AjaxResult success(String msg,Object data)
    {
        return new AjaxResult(Type.SUCCESS,msg, data);
    }

    /**
     * 返回错误消息
     */
    public  static AjaxResult error(){
        return AjaxResult.error("操作失败");
    }

    /**
     * 返回错误消息
     * 一个参数
     */
    public static AjaxResult error(String msc){
        return AjaxResult.error(msc,null);
    }
    /**
     * 返回错误消息
     * 两个参数
     */
    public static AjaxResult error(String msc,Object data){
        return new AjaxResult(Type.ERROR,msc,data);
    }
    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static AjaxResult success(Object data)
    {
        return AjaxResult.success("操作成功", data);
    }

}

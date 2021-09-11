package com.feyl.ssm.commonutils;


import lombok.Data;

import java.util.HashMap;
import java.util.Map;


//同一返回的数据格式
@Data
public class R<T> {
    //是否成功
    private Boolean success;

    //返回的状态码
    private Integer code;

    //返回的消息
    private String message;

    //返回的数据
    private Map<String,T> data = new HashMap<>();


    private R(){}

    public static <T> R<T> ok(){
        R<T> r = new R<>();
        r.success(true);
        r.code(ResultCode.SUCCESS);
        r.message("成功");
        return r;
    }


    public static <T> R<T> error(){
        R<T> r = new R<>();
        r.success(false);
        r.code(ResultCode.ERROR);
        r.message("失败");
        return r;
    }

    public void success(Boolean success) {
        this.success = success;
    }

    public void code(Integer code) {
        this.code = code;
    }

    public R<T> message(String message) {
        this.message = message;
        return this;
    }


    public R<T> data(String key, T value){
        this.data.put(key, value);
        return this;
    }

    public R<T> data(Map<String, T> map){
        this.setData(map);
        return this;
    }
}

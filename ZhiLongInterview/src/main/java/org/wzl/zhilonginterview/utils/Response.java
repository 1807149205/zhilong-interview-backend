package org.wzl.zhilonginterview.utils;


import lombok.Data;

/**
 * @author : 卫志龙
 * @date : 2023/5/13
 */
@Data
public class Response<T> {

    private T data;
    private boolean success;

    public static <T> Response<T> ok() {
        Response<T> response = new Response<>();
        response.success = true;
        return response;
    }

    public Response<T> setData(T data) {
        this.data = data;
        return this;
    }

}

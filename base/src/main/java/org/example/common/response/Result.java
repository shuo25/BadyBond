package org.example.common.response;

import lombok.Data;
import org.example.common.constant.CommonConstant;

/**
 * Author: 18615
 * Date: 2024/3/18 20:41
 */
@Data
public class Result<T> {
    /**
     * 成功标志
     */
    private boolean success = true;
    /**
     * 返回代码
     */
    private int code;
    /**
     * 返回处理消息
     */
    private String message;
    /**
     * 返回数据对象 data
     */
    private T data;
    /**
     * 时间戳
     */
    private long timestamp = System.currentTimeMillis();
    public Result() {
    }
    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static<T> Result<T> ok(T data) {
        Result<T> r = new Result<T>();
        r.setSuccess(true);
        r.setCode(CommonConstant.SC_OK_200);
        r.setData(data);
        return r;
    }

}

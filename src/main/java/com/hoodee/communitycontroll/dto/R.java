package com.hoodee.communitycontroll.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hoodee.communitycontroll.constant.Constants;

import java.io.Serializable;

/**
 * Package: com.hoodee.communitycontroll.dto
 * Description：
 * Author: wude
 * Date:  2020.02.28 22:39
 * Modified By:
 */
public class R implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code;
    private String msg;
    private Object data;
    private Long total; // 分页信息：总条数

    private R(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        if (data instanceof Page<?>) {
            Page<?> page = (Page<?>) data;
            this.total = page.getTotal();
            this.data = page.getRecords();
        } else {
            this.data = data;
        }
    }

    public static R ok() {
        return new R(Constants.OK_CODE, Constants.OK_MSG, null);
    }

    public static R ok(Object data) {
        return new R(Constants.OK_CODE, Constants.OK_MSG, data);
    }

    public static R ok(String msg, Object data) {
        return new R(Constants.OK_CODE, msg, data);
    }

    public static R fail(String msg) {
        return new R(Constants.FAIL_CODE, msg, null);
    }

    public static R fail(int errorCode, String msg) {
        return new R(errorCode, msg, null);
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public Long getTotal() {
        return total;
    }
}

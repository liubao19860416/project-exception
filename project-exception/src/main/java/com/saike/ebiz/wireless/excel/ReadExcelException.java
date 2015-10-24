package com.saike.ebiz.wireless.excel;

import com.saike.ebiz.wireless.service.exception.BaseException;

/**
 * 
 * 读取Excel异常对象
 *
 * @author v_liuli0101
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ReadExcelException extends BaseException {
    /**
     * 读取Excel异常
     */
    private static final long serialVersionUID = -7141181335097826653L;

    /**
     * 读取Excel异常构造
     * @param code 错误码
     * @param msg 信息
     */
    public ReadExcelException(int code, String msg) {
        super(String.valueOf(code), msg);
    }
    public ReadExcelException(int code, String msg, Throwable cause) {
        super(""+code,msg,cause);
        
    }
}

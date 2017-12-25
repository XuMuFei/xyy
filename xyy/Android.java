/*
 * Create by Gemini Y on 16-12-15 上午9:10
 * Copyright (c) 2016. All right reserved.
 *
 * Last modified 16-12-15 上午9:10
 */

package com.ebnews.uc.bean;

import java.io.Serializable;

/**
 * The type Error msg.
 * 修复了v1.0.0 中的bug
 * @description:
 * @author: xuyangyang
 * @email: xuyangyang @ebrun.com
 * @version: V1.0.0
 * @create: 2017 /11/30 10:36
 * @modify:
 */
public class ErrorMsg implements Serializable {


    /**
     * error : invalid_request
     * message : The request is missing a required parameter, includes an invalid parameter value, includes a parameter more than once, or is otherwise malformed.
     * hint : 请填写正确的手机号
     */

    private String error;
    private String message;
    private String hint;
    private int code;
    private String msg;
	private String str;
	
	public String getStr(){
		
	}
	
	public void setStr(String str){
		this.str = str;
	}

    /**
     * Gets code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code
     *         the code
     */
    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Gets error.
     *
     * @return the error
     */
    public String getError() {
        return error;
    }

    /**
     * Sets error.
     *
     * @param error
     *         the error
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message
     *         the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets hint.
     *
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * Sets hint.
     *
     * @param hint
     *         the hint
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

    @Override
    public String toString() {
        return "ErrorMsg{" +
                "error='" + error + '\'' +
                ", message='" + message + '\'' +
                ", hint='" + hint + '\'' +
                '}';
    }
}

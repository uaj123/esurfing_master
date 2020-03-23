package cn.uaj.exception;

/**
 * @Author: wushaojie
 * @Date: 2020/2/8 15:49
 */
public class SysException extends Exception{
    // 存储提示信息的
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException(String message) {
        this.message = message;
    }
}

package site.zhangsun.imageio.common;

import java.io.Serializable;

/**
 * @program: {Project_name}
 * @description:
 * @author: {}
 */
public class ResultDTO<T> implements Serializable {

    private String message;

    private String code;

    private Boolean status;

    private T date;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ResultDTO{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", status=" + status +
                ", date=" + date +
                '}';
    }
}

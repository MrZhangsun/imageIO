package site.zhangsun.imageio.xml;

import java.io.Serializable;

/**
 * @program: {Project_name}
 * @description:
 * @author: {}
 */
public class ResultDTO implements Serializable {

    private String msg;

    private String code;

    private Boolean status;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
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
}

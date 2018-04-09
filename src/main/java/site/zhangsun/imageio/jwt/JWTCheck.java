package site.zhangsun.imageio.jwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.zhangsun.imageio.common.ResultDTO;
import java.util.ArrayList;

/**
 * @program: JWT权限校验测试
 * @description:
 * @author: Murphy 2018-04-09
 */
@RestController
@RequestMapping("/jwt")
public class JWTCheck {


    // 路由映射到/users
    @GetMapping(value = "/users", produces="application/json;charset=UTF-8")
    public ResultDTO<String> usersList() {

        ResultDTO<String> resultDTO = new ResultDTO<>();

        ArrayList<String> users =  new ArrayList<String>();
        users.add("freewolf");
        users.add("tom");
        users.add("jerry");

        resultDTO.setCode("Success");
        resultDTO.setMessage("successfully!");
        resultDTO.setDate(users.toString());
        resultDTO.setStatus(true);
        return resultDTO;
    }

    @GetMapping(value = "/hello", produces="application/json;charset=UTF-8")
    public ResultDTO<String> hello() {
        ResultDTO<String> resultDTO = new ResultDTO<>();
        ArrayList<String> users =  new ArrayList<String>(){{ add("hello"); }};

        resultDTO.setCode("Success");
        resultDTO.setMessage("successfully!");
        resultDTO.setDate(users.toString());
        resultDTO.setStatus(true);
        return resultDTO;
    }

    @GetMapping(value = "/world")
    public ResultDTO<String> world() {
        ResultDTO<String> resultDTO = new ResultDTO<>();
        ArrayList<String> users =  new ArrayList<String>(){{ add("world"); }};

        resultDTO.setCode("Success");
        resultDTO.setMessage("successfully!");
        resultDTO.setDate(users.toString());
        resultDTO.setStatus(true);
        return resultDTO;
    }

}

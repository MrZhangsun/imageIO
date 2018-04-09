package site.zhangsun.imageio.xml;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: {Project_name}
 * @description:
 * @author: {}
 */
@RestController
public class XMLParser {

    /**
     * 测试返回xml格式的数据报文
     * @param name 请求吃参数
     * @param password 请求参数
     * @return
     */
    @RequestMapping(value = "/name", method = RequestMethod.POST, produces = "application/xml;charset=UTF-8",
            consumes = "application/xml;charset=UTF-8")
    public ResultDTO input(String name, String password) {
        System.out.println(name + "---" + password);

        ResultDTO resultDTO = new ResultDTO();

        resultDTO.setCode("success_01");
        resultDTO.setMsg("successfully");
        resultDTO.setStatus(true);
        return resultDTO;
    }
}

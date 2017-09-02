package cn.yjxxclub.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-5-11
 * Time: 下午8:10
 * Describe: index
 */
@Controller
@RequestMapping("/books")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public Object init(HttpServletResponse response)throws Exception{
        log("--------exe---------");
        return "init";
    }

    void log(Object str){
        System.out.println(str);
    }

}
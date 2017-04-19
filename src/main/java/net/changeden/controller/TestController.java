package net.changeden.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Changeden on 2017/4/19
 */
@Controller
public class TestController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String demo1(){
        Map<String,Object> res=new HashMap<>();
        res.put("code",0);
        res.put("message","success");
        Map<String,Object> result=new HashMap<>();
        result.put("list",new ArrayList<String>());
        result.put("total",0);
        result.put("page",1);
        result.put("size",10);
        res.put("result",result);
        return JSON.toJSONString(res);
    }
}

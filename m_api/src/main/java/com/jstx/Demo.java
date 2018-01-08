package com.jstx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2018/1/4.
 */
@Controller
@RequestMapping("/demo")
public class Demo {

    @RequestMapping(value = {"/getNewVipList/{mac}/{sn}/{model}/{rowVersion}/{version}/{userId}"})
    @ResponseBody
    public Object getNewVipList(@PathVariable String mac, @PathVariable String sn, @PathVariable String model, @PathVariable String rowVersion , @PathVariable String version, @PathVariable String userId) {
        Map result = new HashMap();
        List<Map> vipList = new ArrayList<Map>();
        try {
            return JsonMessage.create(0, "", result);
        } catch (Exception ex) {
            ex.printStackTrace();
            return JsonMessage.create(-1L, ex.getMessage(), "hello world !");
        }
    }
}

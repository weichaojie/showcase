package com.example.demo.controller;

import com.example.demo.entity.BrainCoData;
import com.example.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author macbookproz11
 */
@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/query")
    @ResponseBody
    public List<BrainCoData> queryData(){
//        List<BrainCoData> list = indexService.list();
        List<BrainCoData> list = new ArrayList<>();
        return list;
    }
}

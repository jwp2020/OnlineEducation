package com.atguigu.eduservice.controller;

import com.atguigu.commonutils.R;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eduservice/user")
@CrossOrigin
public class EduLoginController {

    //login
    @PostMapping("login")
    public R login(){
        return R.ok().data("token", "admin");
    }

    //info
    @GetMapping("info")
    public R info(){
        return R.ok().data("roles", "[admin]").data("name", "admin").data("avatar","http://t7.baidu.com/it/u=3616242789,1098670747&fm=79&app=86&f=JPEG?w=900&h=1350");
    }
}

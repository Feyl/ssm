package com.feyl.ssm.controller;

import com.feyl.ssm.commonutils.R;
import com.feyl.ssm.entity.User;
import com.feyl.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/findUser/{id}")
    public R findById(@PathVariable("id") Long id){
        User user = userService.findById(id);
        if(user!=null){
            return R.ok().data("user",user).message("查询成功!");
        }{
            return R.error().message("查询失败!");
        }
    }


    @PostMapping("/addUser")
    public R addUser(@RequestBody User user){
        Integer num =  userService.addUser(user);
        if(num==1){
            return R.ok().message("添加成功!");
        }{
            return R.error().message("添加失败!");
        }
    }

    @DeleteMapping("/deleteUser/{id}")
    public R deleteUser(@PathVariable("id") Long id){
        Integer num =  userService.deleteUser(id);
        if(num==1){
            return R.ok().message("删除成功!");
        }{
            return R.error().message("删除失败!");
        }
    }

    @PutMapping("/updateUser")
    public R updateUser(@RequestBody User user){
        Integer num =  userService.updateUser(user);
        if(num==1){
            return R.ok().message("更新成功!");
        }{
            return R.error().message("更新失败!");
        }
    }

}

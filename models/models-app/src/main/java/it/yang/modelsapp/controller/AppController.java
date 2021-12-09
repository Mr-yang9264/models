package it.yang.modelsapp.controller;

import it.yang.modelscommon.entity.User;
import it.yang.modelsutils.service.DaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yang
 * @description 测试controller
 * @date 2021/12/9
 */
@RestController
@RequestMapping("/app")
public class AppController {

    @Resource
    private DaoService daoService;

    @GetMapping("/user")
    public User reBackUser(){
        return daoService.getUser();
    }
}

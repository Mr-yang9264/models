package it.yang.modelsutils.service;

import it.yang.modelscommon.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author Yang
 * @description 对接数据库
 * @date 2021/12/9
 */
@Service
public class DaoService {

    public User getUser(){
        User user = new User();
        user.setName("小赵");
        user.setAge(22);
        return user;
    }
}

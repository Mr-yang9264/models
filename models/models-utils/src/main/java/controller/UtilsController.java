package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang
 * @description uitils
 * @date 2021/12/9
 */
@RestController
@RequestMapping("/info")
public class UtilsController {

    @GetMapping("/get")
    public String getInfo(){
        return "离家出走了";
    }
}
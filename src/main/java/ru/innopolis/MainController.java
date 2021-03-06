package ru.innopolis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Kuznetsov on 15/05/2017.
 */

@Controller
public class MainController {

    @RequestMapping("/")
    public String main(Model model) {

        model.addAttribute("title", "Главная");

        return "main";
    }

    @RequestMapping(value = "/auth/", method = RequestMethod.GET)
    public ModelAndView auth(
            @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {

        ModelAndView mav = new ModelAndView();

        mav.addObject("title", "Авторизация");

        if (error != null) {
            mav.addObject("error", "Неправильный e-mail или пароль!");
        }

        if (logout != null) {
            mav.addObject("msg", "Вы успешно вышли!");
        }

        mav.setViewName("auth");

        return mav;
    }

    @RequestMapping("/user/")
    public String user(Model model) {

        model.addAttribute("title", "Страница пользователя");

        return "user";
    }

    @RequestMapping("/admin/")
    public String admin(Model model) {

        model.addAttribute("title", "Страница администратора");

        return "admin";
    }

    @RequestMapping("/403/")
    public String e403(Model model) {

        model.addAttribute("title", "Доступ запрещен");

        return "403";
    }

}
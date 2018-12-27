package org.troparo.controller;

import org.troparo.service.AddService;
import org.troparo.source.BookTypeOut;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class AddController {
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));
        AddService as = new AddService();
        int k = as.add(i, j);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display.jsp");
        mv.addObject("t1", i);
        mv.addObject("t2", j);
        mv.addObject("result", k);
        return mv;
    }

    @RequestMapping("/testBook")
    public ModelAndView testBook(HttpServletRequest request, HttpServletResponse response) {
        AddService as = new AddService();
        List<BookTypeOut> brt  = as.testBook();

        ModelAndView mv = new ModelAndView();
        mv.setViewName("WEB-INF/book/bookDetails.jsp");
        mv.addObject("ploc", brt.get(0));
        mv.addObject("result", brt);
        return mv;
    }
}

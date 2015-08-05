package main.java.controllers;

import main.java.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by B50-30 on 02.08.2015.
 */
@Controller
public class MainController {


//    @Autowired  //Если один, то так
//    @Qualifier("rectanglePoint") //Если объектов много, то лучше инициализировать
//    private Shape rectanglePoint;

//    @Autowired  //Если один, то так
//    @Qualifier("rectangle") //Если объектов много, то лучше инициализировать
//    private Shape rectangle;

    @Autowired  //Если один, то так
    @Qualifier("circle") //Если объектов много, то лучше инициализировать
    private Shape circle;

    public MainController(){

    }

    @RequestMapping(value = "/default", method = RequestMethod.GET)
    public ModelAndView defaultSape(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("square", circle.square());
        modelAndView.addObject("perimeter", circle.perimeter());
        modelAndView.setViewName("first");
        return modelAndView;
    }

    @RequestMapping(value = "/rectanglepoint", method = RequestMethod.GET)
    public ModelAndView rectanglepoint(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();

        double x1 = Double.parseDouble(request.getParameter("x1"));
        double y1 = Double.parseDouble(request.getParameter("y1"));
        double x2 = Double.parseDouble(request.getParameter("x2"));
        double y2 = Double.parseDouble(request.getParameter("y2"));

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        Shape rectanglePoint = new RectanglePoint(p1, p2);

        modelAndView.addObject("square", rectanglePoint.square());
        modelAndView.addObject("perimeter", rectanglePoint.perimeter());
        modelAndView.setViewName("first");
        return modelAndView;
    }

    @RequestMapping(value = "/rectangle", method = RequestMethod.GET)
    public ModelAndView rectangle(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();

        double width = Double.parseDouble(request.getParameter("width"));
        double hight = Double.parseDouble(request.getParameter("hight"));

        Shape rectangle = new Rectangle(width, hight);

        modelAndView.addObject("square", rectangle.square());
        modelAndView.addObject("perimeter", rectangle.perimeter());
        modelAndView.setViewName("first");
        return modelAndView;
    }

    @RequestMapping(value = "/circle", method = RequestMethod.GET)
    public ModelAndView circle(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();

        double radius = Double.parseDouble(request.getParameter("radius"));

        Shape circle = new Circle(radius);

        modelAndView.addObject("square", circle.square());
        modelAndView.addObject("perimeter", circle.perimeter());
        modelAndView.setViewName("first");
        return modelAndView;
    }

}

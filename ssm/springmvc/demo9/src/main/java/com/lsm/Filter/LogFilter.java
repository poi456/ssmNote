package com.lsm.Filter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogFilter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("===============执行前============");
        HttpSession session = request.getSession();
        if (session.getAttribute("sessionInfo")!=null){
            System.out.println("session走了");
            return true;
        }
        if (request.getRequestURI().contains("c")){
            System.out.println("session走 c 去了");
            return true;
        }
        if (request.getRequestURI().contains("a")){
            request.getRequestDispatcher("/WEB-INF/jsp/froma.jsp").forward(request,response);
            return false;
        }
        request.getRequestDispatcher("/WEB-INF/jsp/froma.jsp").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }


}

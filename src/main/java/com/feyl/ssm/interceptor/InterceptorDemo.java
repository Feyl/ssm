package com.feyl.ssm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 */
/*public class InterceptorDemo implements HandlerInterceptor {

    @Override//在目标方法执行之前执行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {//参数封装了代表请求参数和响应参数
        System.out.println("preHandle...");//参数封装了代表请求参数和响应参数
        String param = request.getParameter("param");
        if("yes".equals(param)){
            return true;
        }else {
            request.getRequestDispatcher("/error.jsp").forward(request,response);
            return false;
        }
//        return true;//true代表放行,返回false代表不放行
    }

    @Override//在目标方法执行之后 视图返回之前执行
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {//可以获取并修改目标方法封装的ModelAndView对象
        modelAndView.addObject("name","flow");//可以获取并修改目标方法封装的ModelAndView对象
        System.out.println("postHandle...");
    }

    @Override//在流程执行完毕后执行
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion...");
    }
}*/

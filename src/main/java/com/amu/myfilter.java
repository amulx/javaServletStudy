package com.amu;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class myfilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=UTF-8");

        if (((HttpServletRequest)servletRequest).getHeader("User-Agent").toLowerCase().indexOf("firefox")>0){
            servletResponse.getWriter().write("不支持火狐浏览器");
        } else {
            filterChain.doFilter(servletRequest,servletResponse);// 重新将请求和响应传递给下文
        }
    }

    public void destroy() {

    }
}

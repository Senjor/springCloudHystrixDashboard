/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: TokenFilter
 * Author:   laosun
 * Date:     2019/11/23 10:13 上午
 * Description:
 */
package com.zhiyou100.serverzuul;

import com.netflix.zuul.ZuulFilter;

import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;


import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {



        RequestContext ctx = RequestContext.getCurrentContext();

        HttpServletRequest request = ctx.getRequest();

        Object accessToken = request.getParameter("token");

        System.out.println("token=" + accessToken);

        if (null == accessToken){

            ctx.setSendZuulResponse(false);

            ctx.setResponseStatusCode(401);

            try {
                ctx.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }


        return null;
    }
}

package com.gs.struts;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.SessionMap;

import java.util.Map;

/**
 * Created by WangGenshen on 2/26/16.
 * 通过ActionContext获取application, session, request和parameters
 */
public class ContextAction extends ActionSupport {

    public String execute() {
        ActionContext actionContext = ActionContext.getContext(); // ActionContext对象存储了Action的所有信息
        Map<String, Object> applicationMap = actionContext.getApplication();
        applicationMap.put("applicationKey", "applicationValue");

        Map<String, Object> sessionMap = actionContext.getSession();
        sessionMap.put("sessionKey", "sessionValue");

        /**
         * 获取的sessionMap实际上是SessionMap对象,其有invalidate方法使session失效
         */
        if (sessionMap instanceof SessionMap) {
            SessionMap<String, Object> session = (SessionMap<String, Object>) sessionMap;
            session.invalidate();
            System.out.println("session失效");
        }

        Map<String, Object> requestMap = (Map<String, Object>) actionContext.get("request");
        requestMap.put("requestKey", "requestValue");

        //getParameters()返回的map只读,可写入但不起作用（没必要去写入数据）
        Map<String, Object> params = actionContext.getParameters();
        if (params.get("pname") != null) {
            System.out.println(((String[]) params.get("pname"))[0]);
        }

        return SUCCESS;
    }

}

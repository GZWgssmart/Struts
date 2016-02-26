package com.gs.struts;

import org.apache.struts2.interceptor.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by WangGenshen on 2/26/16.
 */
public class AwareAction implements ApplicationAware, RequestAware, SessionAware, ParameterAware, ServletRequestAware, ServletResponseAware {

    private Map<String, Object> application;
    private Map<String, Object> request;
    private Map<String, Object> session;
    private Map<String, String[]> params;

    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;

    @Override
    public void setApplication(Map<String, Object> map) {
        this.application = map;
    }

    @Override
    public void setRequest(Map<String, Object> map) {
        this.request = map;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }

    @Override
    public void setParameters(Map<String, String[]> map) {
        this.params = map;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.servletRequest = request;
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
        this.servletResponse = response;
    }

    public String execute() {
        application.put("applicationKey", "applicationValue");
        session.put("sessionKey", "sessionValue");
        request.put("requestKey", "requestValue");
        servletRequest.setAttribute("requestKey", "requestValue1");
        System.out.println(params.get("pname")[0]);
        return "success";
    }

}

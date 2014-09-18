<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String json = "[{text:'模块1',id:'1',leaf: false,children: [{ text: '功能1',id:'2', leaf: true,url:'/toPage/module_demo001.do' },{ text: '功能2',id:'3', leaf: true ,url:'/toPage/module_demo002.do'},{ text: '功能3',id:'4', leaf: true ,url:'/toPage/module_demo003.do'}]}]";
    response.getWriter().write(json);
%>
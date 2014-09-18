<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String json = "{\"total\":\"2\",\"rows\": [{\"name\":\"fnzi\",\"sex\":\"M\"},{\"name\":\"fnzi1\",\"sex\":\"W\"}]}";
    response.getWriter().write(json);
%>
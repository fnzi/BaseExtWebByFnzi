<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String extPath = request.getContextPath();
String extBasePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+extPath+"/";
%>
<style type="text/css">
.x-btn-text{
 font-size:15px;
}
.x-btn-text-icon .x-btn-icon-small-left .x-btn-text{
    background-position: 0 center;/*默认*/
    background-repeat: no-repeat;/*默认*/
    padding-left:18px;/*默认*/
    height:16px;/*默认*/
    font-size:15px;/*字体大小设置*/
}

</style>
<!-- 样式区 （开始） -->
<!-- Extjs 核心样式库 -->
<link rel="stylesheet" type="text/css" href="<%=extPath %>/js/extjs42-lib/resources/css/ext-all.css" />
<!-- Extjs 中文字体显示效果补丁 -->
<link rel="stylesheet" type="text/css" href="<%=extPath %>/js/extjs42-lib/resources/css/ext-ch-patch.css" />
<!-- 小图标样式 -->
<link rel="stylesheet" type="text/css" href="<%=extPath %>/js/extjs42-lib/resources/css/icons.css" />
<!-- 样式区 （结束） -->
<!-- JavaScript （开始） -->
<!-- 定义Extjs常量 -->
<script type="text/javascript">
    //域路径
    var extPath = '<%=extPath%>';
    //域名访问路径
    var extBasePath = '<%=extBasePath%>';
</script>
<!-- Extjs 核心脚本 -->
<script type="text/javascript" src="<%=extPath %>/js/extjs42-lib/ext-all-dev.js"></script>
<!-- Extjs 中文脚本 -->
<script type="text/javascript" src="<%=extPath %>/js/extjs42-lib/locale/ext-lang-zh_CN.js"></script>
<!-- JavaScript （结束） -->
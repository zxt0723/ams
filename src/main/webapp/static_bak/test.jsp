<%@ page contentType="text/html; charset=GBK"%>
<% out.println("�� �� ��: " + java.lang.Runtime.getRuntime().totalMemory() / 1024 / 1024 + "MB");

 out.println("<br>");

 out.println("�����ڴ�: " + java.lang.Runtime.getRuntime().freeMemory()  / 1024 / 1024 + "MB");%>
/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-23 04:00:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("    <meta http-equiv=\"Cache-Control\" content=\"no-cache,must-revalidate\">\r\n");
      out.write("    <title>注册-个人用户</title>\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"/css/regist.personal.css\"/>\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"/css/passport.base.css\"/>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/jquery-1.6.4.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"w\" id=\"logo\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <a href=\"http://localhost:8082\">\r\n");
      out.write("            <img src=\"/images/taotao-logo.gif\" alt=\"淘淘商城\" width=\"170\" height=\"60\"/>\r\n");
      out.write("        </a> <b></b>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"w\" id=\"regist\">\r\n");
      out.write("    <div class=\"mt\">\r\n");
      out.write("        <ul class=\"tab\">\r\n");
      out.write("            <li class=\"curr\">个人用户</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"extra\">\r\n");
      out.write("        <span>我已经注册，现在就&nbsp;\r\n");
      out.write("        \t<a href=\"/user/showLogin\" class=\"flk13\">登录</a>\r\n");
      out.write("        </span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"mc\">\r\n");
      out.write("        <form id=\"personRegForm\" method=\"post\" onsubmit=\"return false;\">\r\n");
      out.write("            <div class=\"form\" onselectstart=\"return false;\">\r\n");
      out.write("                <div class=\"item\" id=\"select-regName\">\r\n");
      out.write("                    <span class=\"label\"><b class=\"ftx04\">*</b>用户名：</span>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"fl item-ifo\">\r\n");
      out.write("                        <div class=\"o-intelligent-regName\">\r\n");
      out.write("                            <input type=\"text\" id=\"regName\" name=\"username\" class=\"text\" tabindex=\"1\" autoComplete=\"off\"\r\n");
      out.write("                                   onpaste=\"return false;\"\r\n");
      out.write("                                   value=\"\"\r\n");
      out.write("                                   onfocus=\"if(this.value=='') this.value='';this.style.color='#333'\"\r\n");
      out.write("                                   onblur=\"if(this.value=='') {this.value='';this.style.color='#999999'}\"/>\r\n");
      out.write("                            <i class=\"i-name\"></i>\r\n");
      out.write("                            <ul id=\"intelligent-regName\" class=\"hide\"></ul>\r\n");
      out.write("                            <label id=\"regName_succeed\" class=\"blank\"></label>\r\n");
      out.write("                            <label id=\"regName_error\" class=\"hide\"></label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"o-password\">\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <span class=\"label\"><b class=\"ftx04\">*</b>请设置密码：</span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"fl item-ifo\">\r\n");
      out.write("                            <input type=\"password\" id=\"pwd\" name=\"password\" class=\"text\" tabindex=\"2\"\r\n");
      out.write("                                   style=\"ime-mode:disabled;\"\r\n");
      out.write("                                   onpaste=\"return  false\" autocomplete=\"off\"/>\r\n");
      out.write("                            <i class=\"i-pass\"></i>\r\n");
      out.write("                            <label id=\"pwd_succeed\" class=\"blank\"></label>\r\n");
      out.write("                            <label id=\"pwd_error\"></label>\r\n");
      out.write("                            <span class=\"clr\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <span class=\"label\"><b class=\"ftx04\">*</b>请确认密码：</span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"fl item-ifo\">\r\n");
      out.write("                            <input type=\"password\" id=\"pwdRepeat\" name=\"pwdRepeat\" class=\"text\" tabindex=\"3\"\r\n");
      out.write("                                   onpaste=\"return  false\" autocomplete=\"off\"/>\r\n");
      out.write("                            <i class=\"i-pass\"></i>\r\n");
      out.write("                            <label id=\"pwdRepeat_succeed\" class=\"blank\"></label>\r\n");
      out.write("                            <label id=\"pwdRepeat_error\"></label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\" id=\"dphone\">\r\n");
      out.write("                        <span class=\"label\"><b class=\"ftx04\">*</b>验证手机：</span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"fl item-ifo\">\r\n");
      out.write("                            <input type=\"text\" id=\"phone\" maxlength=\"11\" name=\"phone\"\r\n");
      out.write("                                   class=\"text\" tabindex=\"4\"\r\n");
      out.write("                                   autocomplete=\"off\"/> <i class=\"i-phone\"></i> <label\r\n");
      out.write("                                id=\"phone_succeed\" class=\"blank\"></label> <label\r\n");
      out.write("                                id=\"phone_error\"></label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item item-new\">\r\n");
      out.write("                    <span class=\"label\">&nbsp;</span>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"fl item-ifo\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"checkbox\" checked=\"checked\" id=\"readme\"\r\n");
      out.write("                               onclick=\"agreeonProtocol();\">\r\n");
      out.write("                        <label for=\"protocol\">我已阅读并同意<a href=\"#\" class=\"blue\" id=\"protocol\">《淘淘用户注册协议》</a></label>\r\n");
      out.write("                        <span class=\"clr\"></span>\r\n");
      out.write("                        <label id=\"protocol_error\" class=\"error hide\">请接受服务条款</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <span class=\"label\">&nbsp;</span>\r\n");
      out.write("                    <input type=\"button\" class=\"btn-img btn-regist\" id=\"registsubmit\" value=\"立即注册\" tabindex=\"8\"\r\n");
      out.write("                           clstag=\"regist|keycount|personalreg|07\"\r\n");
      out.write("                           onclick=\"REGISTER.reg();\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"phone\">\r\n");
      out.write("                <img width=\"180\" height=\"180\" src=\"/images/phone-bg.jpg\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <span class=\"clr\"></span>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        var REGISTER = {\r\n");
      out.write("            param: {\r\n");
      out.write("                //单点登录系统的url\r\n");
      out.write("                surl: \"\"\r\n");
      out.write("            },\r\n");
      out.write("            inputcheck: function () {\r\n");
      out.write("                //不能为空检查\r\n");
      out.write("                if ($(\"#regName\").val() == \"\") {\r\n");
      out.write("                    alert(\"用户名不能为空\");\r\n");
      out.write("                    $(\"#regName\").focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if ($(\"#pwd\").val() == \"\") {\r\n");
      out.write("                    alert(\"密码不能为空\");\r\n");
      out.write("                    $(\"#pwd\").focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if ($(\"#phone\").val() == \"\") {\r\n");
      out.write("                    alert(\"手机号不能为空\");\r\n");
      out.write("                    $(\"#phone\").focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\\d{8})$/;\r\n");
      out.write("                if (!myreg.test($(\"#phone\").val())) {\r\n");
      out.write("                    alert(\"请输入正确的手机号\");\r\n");
      out.write("                    $(\"#phone\").focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                //密码检查\r\n");
      out.write("                if ($(\"#pwd\").val() != $(\"#pwdRepeat\").val()) {\r\n");
      out.write("                    alert(\"确认密码和密码不一致，请重新输入！\");\r\n");
      out.write("                    $(\"#pwdRepeat\").select();\r\n");
      out.write("                    $(\"#pwdRepeat\").focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                return true;\r\n");
      out.write("            },\r\n");
      out.write("            beforeSubmit: function () {\r\n");
      out.write("                //检查用户是否已经被占用\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    url: REGISTER.param.surl + \"/user/check/\" + escape($(\"#regName\").val()) + \"/1?r=\" + Math.random(),\r\n");
      out.write("                    success: function (data) {\r\n");
      out.write("                        if (data.data) {\r\n");
      out.write("                            //检查手机号是否存在\r\n");
      out.write("                            $.ajax({\r\n");
      out.write("                                url: REGISTER.param.surl + \"/user/check/\" + $(\"#phone\").val() + \"/2?r=\" + Math.random(),\r\n");
      out.write("                                success: function (data) {\r\n");
      out.write("                                    if (data.data) {\r\n");
      out.write("                                        REGISTER.doSubmit();\r\n");
      out.write("                                    } else {\r\n");
      out.write("                                        alert(\"此手机号已经被注册！\");\r\n");
      out.write("                                        $(\"#phone\").select();\r\n");
      out.write("                                    }\r\n");
      out.write("                                }\r\n");
      out.write("                            });\r\n");
      out.write("                        } else {\r\n");
      out.write("                            alert(\"此用户名已经被占用，请选择其他用户名\");\r\n");
      out.write("                            $(\"#regName\").select();\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("            },\r\n");
      out.write("            doSubmit: function () {\r\n");
      out.write("                $.post(\"/user/register\", $(\"#personRegForm\").serialize(), function (data) {\r\n");
      out.write("                    if (data.status == 200) {\r\n");
      out.write("                        alert('用户注册成功，请登录！');\r\n");
      out.write("                        REGISTER.login();\r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert(\"注册失败！\");\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            },\r\n");
      out.write("            login: function () {\r\n");
      out.write("                location.href = \"/user/showLogin\";\r\n");
      out.write("                return false;\r\n");
      out.write("            },\r\n");
      out.write("            reg: function () {\r\n");
      out.write("                if (this.inputcheck()) {\r\n");
      out.write("                    this.beforeSubmit();\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2020-11-16 08:13:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LiveDie_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Kosmo/eclipse-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp4/wtpwebapps/JQueryProj/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1604477667001L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>LiveDie</title>\r\n");
      out.write("<style>\r\n");
      out.write("div {\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tline-height: 100px;\r\n");
      out.write("\tbackground-color: black;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tborder: 2px solid white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<!-- jQuery사용을 위한 라이브러리 임베딩 -->\r\n");
      out.write("<!-- 1]다운 받은 .js파일 임베디드 -->\r\n");
      out.write("<!-- \r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write(" -->\r\n");
      out.write("<!-- 2]CDN(Content Delivery Network)주소 사용 -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<!-- Deprecated된 함수 사용시 아래 라이브러리 임베드 -->\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t//factory함수*(나중에 배움)\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t//bind()함수로 이벤트 바인딩]\r\n");
      out.write("\t\t/*\r\n");
      out.write("\t\t$('div').bind('click',function(){\r\n");
      out.write("\t\t\t$(this).after('<div>동적으로 추가한 div</div>');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t*/\r\n");
      out.write("\t\t/*\r\n");
      out.write("\t\tlive()및 die()함수는 1.9버전부터 제거됨.\r\n");
      out.write("\t\t사용시에는 1.9버전 미만 라이브러리를 임베드 하거나 혹은 마이그레이션 라이브러리를 현 최신버전 혹은 최근엔 live나 bind대신 on()함수 사용, 단, 기능은 bind와 같다\r\n");
      out.write("\t\t*/\r\n");
      out.write("\t\t//live()함수로 이벤트 바인딩]\r\n");
      out.write("\t\t//-동적으로 추가한 div에도 이벤트가 바인딩됨]\r\n");
      out.write("\t\t/*\r\n");
      out.write("\t\t$('div').live('click',function(){\r\n");
      out.write("\t\t\t$(this).after('<div>동적으로 추가한 div</div>');\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t\t$('button').click(function(){\r\n");
      out.write("\t\t\t$('div').die('click');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t*/\r\n");
      out.write("\t\t/*\r\n");
      out.write("\t\ton()함수 사용]\r\n");
      out.write("\t\t$('선택자').on(\"이벤트\",콜백함수)는 이벤트 바인딩하나 동적으로 추가된 태그에는 이벤트가 바인딩 안됨\r\n");
      out.write("\t\t이벤트 해제시:$(\"선택자\").off(\"이벤트\")\r\n");
      out.write("\t\t*/\r\n");
      out.write("\t\t$('div').on('click',function(){\r\n");
      out.write("\t\t\t$(this).after('<div>동적으로 추가한 div</div>');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//on으로 바인딩한 이벤트는 off로 이벤트 해제]\r\n");
      out.write("\t\t$('button').click(function(){\r\n");
      out.write("\t\t\t$('div').off('click');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//선택자 : gt(인덱스) - 인덱스보다 큰 선택자들]\r\n");
      out.write("\t\t$('table tr:gt(0)').mouseover(function(){\r\n");
      out.write("\t\t\t$(this).css('backgroundColor','lightgreen');\r\n");
      out.write("\t\t}).mouseout(function(){\r\n");
      out.write("\t\t\t$(this).css('backgroundColor','white');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//children([선택자])함수\r\n");
      out.write("\t\t$('table tr:gt(0)').click(function(){\r\n");
      out.write("\t\t\tconsole.log('클릭한 tr의 자식인 td의 개수 ',$(this).children().length);\r\n");
      out.write("\t\t\tif($(this).children().length > 2){\r\n");
      out.write("\t\t\t\tvar title = $(this).children(':eq(1)').html();\r\n");
      out.write("\t\t\t\tvar name = $(this).children(':eq(2)').html();\r\n");
      out.write("\t\t\t\tconsole.log('클릭한 행의 제목:%s, 작성자:%s',title,name);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<fieldset>\r\n");
      out.write("\t\t<legend>live(\"이벤트명\",콜백함수),die(\"해제할이벤트명\"),children([선택자])함수,on(\"이벤트명\",콜백함수),off(\"해제할이벤트명\"),gt(인덱스)</legend>\r\n");
      out.write("\t\t<div>미리 만들어 놓은 DIV</div>\r\n");
      out.write("\t\t<button>이벤트 해제</button>\r\n");
      out.write("\t\t<!--각 행에 마우스 오버시에는 행의 배경색이 gray 마우스 아웃시에는 배경색이 white 단,제목에는 적용하지 마세요..... -->\r\n");
      out.write("\t\t<table cellspacing=\"1\" bgcolor=\"gray\" width=\"60%\">\r\n");
      out.write("\t\t\t<tr bgcolor=\"white\">\r\n");
      out.write("\t\t\t\t<th>번호</th>\r\n");
      out.write("\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t\t<th>작성일</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"white\">\r\n");
      out.write("\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t<td>제목1</td>\r\n");
      out.write("\t\t\t\t<td>작성자1</td>\r\n");
      out.write("\t\t\t\t<td>2013-9-12</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"white\">\r\n");
      out.write("\t\t\t\t<td>2</td>\r\n");
      out.write("\t\t\t\t<td>제목2</td>\r\n");
      out.write("\t\t\t\t<td>작성자2</td>\r\n");
      out.write("\t\t\t\t<td>2013-9-12</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"white\">\r\n");
      out.write("\t\t\t\t<td>3</td>\r\n");
      out.write("\t\t\t\t<td>제목3</td>\r\n");
      out.write("\t\t\t\t<td>작성자3</td>\r\n");
      out.write("\t\t\t\t<td>2013-9-12</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"white\">\r\n");
      out.write("\t\t\t\t<td>4</td>\r\n");
      out.write("\t\t\t\t<td>제목4</td>\r\n");
      out.write("\t\t\t\t<td>작성자4</td>\r\n");
      out.write("\t\t\t\t<td>2013-9-12</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"white\">\r\n");
      out.write("\t\t\t\t<td>총계</td>\r\n");
      out.write("\t\t\t\t<td colspan='3'>세개 셀 병합</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</fieldset>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /Core/LiveDie.jsp(23,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/js/jquery-3.5.1.js");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /Core/LiveDie.jsp(28,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/js/jquery-migrate-1.4.1.min.js");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }
}

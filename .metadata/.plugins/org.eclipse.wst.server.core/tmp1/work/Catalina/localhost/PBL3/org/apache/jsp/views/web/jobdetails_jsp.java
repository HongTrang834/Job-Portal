/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-04-10 05:22:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jobdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/D:/PBL3/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/PBL3/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1712144786899L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1711982526419L));
    _jspx_dependants.put("jar:file:/D:/PBL3/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/PBL3/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1712141790945L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Job Portal</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<main> <!-- Hero Area Start-->\r\n");
      out.write("	<div class=\"slider-area \">\r\n");
      out.write("		<div\r\n");
      out.write("			class=\"single-slider section-overly slider-height2 d-flex align-items-center\"\r\n");
      out.write("			data-background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/hero/about.jpg\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-xl-12\">\r\n");
      out.write("						<div class=\"hero-cap text-center\">\r\n");
      out.write("							<h2>UI/UX Designer</h2>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- Hero Area End --> <!-- job post company Start -->\r\n");
      out.write("	<div class=\"job-post-company pt-120 pb-120\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row justify-content-between\">\r\n");
      out.write("				<!-- Left Content -->\r\n");
      out.write("				<div class=\"col-xl-7 col-lg-8\">\r\n");
      out.write("					<!-- job single -->\r\n");
      out.write("					<div class=\"single-job-items mb-50\">\r\n");
      out.write("						<div class=\"job-items\">\r\n");
      out.write("							<div class=\"company-img company-img-details\">\r\n");
      out.write("								<a href=\"#\"><img\r\n");
      out.write("									src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/icon/job-list1.png\"\r\n");
      out.write("									alt=\"\"></a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"job-tittle\">\r\n");
      out.write("								<a href=\"#\">\r\n");
      out.write("									<h4>Digital Marketer</h4>\r\n");
      out.write("								</a>\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li>Creative Agency</li>\r\n");
      out.write("									<li><i class=\"fas fa-map-marker-alt\"></i>Athens, Greece</li>\r\n");
      out.write("									<li>$3500 - $4000</li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- job single End -->\r\n");
      out.write("\r\n");
      out.write("					<div class=\"job-post-details\">\r\n");
      out.write("						<div class=\"post-details1 mb-50\">\r\n");
      out.write("							<!-- Small Section Tittle -->\r\n");
      out.write("							<div class=\"small-section-tittle\">\r\n");
      out.write("								<h4>Job Description</h4>\r\n");
      out.write("							</div>\r\n");
      out.write("							<p>It is a long established fact that a reader will beff\r\n");
      out.write("								distracted by vbthe creadable content of a page when looking at\r\n");
      out.write("								its layout. The pointf of using Lorem Ipsum is that it has ahf\r\n");
      out.write("								mcore or-lgess normal distribution of letters, as opposed to\r\n");
      out.write("								using, Content here content here making it look like readable.</p>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"post-details2  mb-50\">\r\n");
      out.write("							<!-- Small Section Tittle -->\r\n");
      out.write("							<div class=\"small-section-tittle\">\r\n");
      out.write("								<h4>Required Knowledge, Skills, and Abilities</h4>\r\n");
      out.write("							</div>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li>System Software Development</li>\r\n");
      out.write("								<li>Mobile Applicationin iOS/Android/Tizen or other\r\n");
      out.write("									platform</li>\r\n");
      out.write("								<li>Research and code , libraries, APIs and frameworks</li>\r\n");
      out.write("								<li>Strong knowledge on software development life cycle</li>\r\n");
      out.write("								<li>Strong problem solving and debugging skills</li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"post-details2  mb-50\">\r\n");
      out.write("							<!-- Small Section Tittle -->\r\n");
      out.write("							<div class=\"small-section-tittle\">\r\n");
      out.write("								<h4>Education + Experience</h4>\r\n");
      out.write("							</div>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li>3 or more years of professional design experience</li>\r\n");
      out.write("								<li>Direct response email experience</li>\r\n");
      out.write("								<li>Ecommerce website design experience</li>\r\n");
      out.write("								<li>Familiarity with mobile and web apps preferred</li>\r\n");
      out.write("								<li>Experience using Invision a plus</li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- Right Content -->\r\n");
      out.write("				<div class=\"col-xl-4 col-lg-4\">\r\n");
      out.write("					<div class=\"post-details3  mb-50\">\r\n");
      out.write("						<!-- Small Section Tittle -->\r\n");
      out.write("						<div class=\"small-section-tittle\">\r\n");
      out.write("							<h4>Job Overview</h4>\r\n");
      out.write("						</div>\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li>Posted date : <span>12 Aug 2019</span></li>\r\n");
      out.write("							<li>Location : <span>New York</span></li>\r\n");
      out.write("							<li>Vacancy : <span>02</span></li>\r\n");
      out.write("							<li>Job nature : <span>Full time</span></li>\r\n");
      out.write("							<li>Salary : <span>$7,800 yearly</span></li>\r\n");
      out.write("							<li>Application date : <span>12 Sep 2020</span></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("						<div class=\"apply-btn2\">\r\n");
      out.write("							<a href=\"#\" class=\"btn\">Apply Now</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"post-details4  mb-50\">\r\n");
      out.write("						<!-- Small Section Tittle -->\r\n");
      out.write("						<div class=\"small-section-tittle\">\r\n");
      out.write("							<h4>Company Information</h4>\r\n");
      out.write("						</div>\r\n");
      out.write("						<span>Colorlib</span>\r\n");
      out.write("						<p>It is a long established fact that a reader will be\r\n");
      out.write("							distracted by the readable content of a page when looking at its\r\n");
      out.write("							layout.</p>\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li>Name: <span>Colorlib </span></li>\r\n");
      out.write("							<li>Web : <span> colorlib.com</span></li>\r\n");
      out.write("							<li>Email: <span>carrier.colorlib@gmail.com</span></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- job post company End --> </main>\r\n");
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
}

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register</title>\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Theme CSS -->\n");
      out.write("        <link href=\"css/freelancer.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page-top\" class=\"index\">\n");
      out.write("        <section id=\"contact\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12 text-center\">\n");
      out.write("                        <h2>Register</h2>\n");
      out.write("                        <hr class=\"star-primary\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("                        <form action=\"");
      out.print(request.getContextPath());
      out.write("/SignUpServlet\" name=\"\" method=\"post\">\n");
      out.write("                            <div class=\"row control-group\">\n");
      out.write("                                <div class=\"form-group col-xs-12 floating-label-form-group controls\">\n");
      out.write("                                    <label for=\"name\">Username</label>\n");
      out.write("                                    <input name=\"username\" type=\"text\" class=\"form-control\" placeholder=\"Username\" id=\"name\" >\n");
      out.write("                                    <p class=\"help-block text-danger\"></p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row control-group\">\n");
      out.write("                                <div class=\"form-group col-xs-12 floating-label-form-group controls\">\n");
      out.write("                                    <label for=\"password\">Password</label>\n");
      out.write("                                    <input name=\"password\" type=\"password\" class=\"form-control\" placeholder=\"Password\" id=\"pass\" >\n");
      out.write("                                    <p class=\"help-block text-danger\"></p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"row control-group\">\n");
      out.write("                                <div class=\"form-group col-xs-12 floating-label-form-group controls\">\n");
      out.write("                                    <label for=\"confirmpassword\">ConfirmPassword</label>\n");
      out.write("                                    <input name=\"confirmpassword\" type=\"password\" class=\"form-control\" placeholder=\"Confirmpassword\" id=\"confirmpass\" >\n");
      out.write("                                    <p class=\"help-block text-danger\"></p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorRegister}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"form-group col-xs-12\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-success btn-lg\">Sign up</button>\n");
      out.write("                                   \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                            \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\">\n");
      out.write("             \n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Plugin JavaScript -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Contact Form JavaScript -->\n");
      out.write("        <script src=\"js/jqBootstrapValidation.js\"></script>\n");
      out.write("        <script src=\"js/contact_me.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Theme JavaScript -->\n");
      out.write("        <script src=\"js/freelancer.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

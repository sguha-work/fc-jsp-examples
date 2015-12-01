package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import FusionCharts.FusionCharts;

public final class render_002dpyramid_002dand_002dfunnel_002dcharts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Render Pyramid and Funnel Charts</title>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\" src=\"http://static.fusioncharts.com/code/latest/fusioncharts.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://static.fusioncharts.com/code/latest/fusioncharts.charts.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://static.fusioncharts.com/code/latest/themes/fusioncharts.theme.ocean.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"chart1\"></div>\n");
      out.write("        <div id=\"chart2\"></div>\n");
      out.write("        \n");
      out.write("        ");
 
            FusionCharts pyramid = new FusionCharts(
                        "pyramid",// chartType
                        "ex9",// chartId
                        600,400,// chartWidth, chartHeight
                        "chart1",// chartContainer
                        "json",// dataFormat
                        "{\"chart\": {\"bgcolor\": \"FFFFFF\",\"caption\": \"Revenue distribution for 2013\",\"basefontcolor\": \"333333\",\"decimals\": \"0\",\"numbersuffix\": \"M\",\"numberprefix\": \"$\",\"pyramidyscale\": \"40\",\"chartbottommargin\": \"0\",\"captionpadding\": \"0\",\"showborder\": \"0\"},\"data\": [{\"value\": \"17\",\"name\": \"Products\",\"color\": \"008ee4\"},{\"value\": \"21\",\"name\": \"Services\",\"color\": \"6baa01\"},{\"value\": \"20\",\"name\": \"Consultancy\",\"color\": \"f8bd19\"},{\"value\": \"5\",\"name\": \"Others\",\"color\": \"e44a00\"}]}"
                    );
            FusionCharts funnel = new FusionCharts(
                        "funnel",// chartType
                        "ex92",// chartId
                        600,400,// chartWidth, chartHeight
                        "chart2",// chartContainer
                        "json",// dataFormat
                        "{\"chart\": {\"bgcolor\": \"FFFFFF\",\"caption\": \"Conversion Funnel - 2013\",\"decimals\": \"1\",\"basefontsize\": \"11\",\"issliced\": \"0\",\"ishollow\": \"1\",\"labeldistance\": \"8\",\"showBorder\": \"0\"},\"data\": [{\"label\": \"Website Visits\",\"value\": \"385634\"},{\"label\": \"Downloads\",\"value\": \"145631\",\"color\": \"008ee4\"},{\"label\": \"Interested to buy\",\"value\": \"84564\",\"color\": \"f8bd19\"},{\"label\": \"Contract finalized\",\"value\": \"50654\",\"color\": \"6baa01\"},{\"label\": \"Purchased\",\"value\": \"25342\",\"color\": \"e44a00\"}]}"
                    );
        
      out.write("\n");
      out.write("        ");
      out.print(
                pyramid.render()
        );
      out.write("\n");
      out.write("        ");
      out.print(
                funnel.render()
        );
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import FusionCharts.FusionCharts;

public final class render_002dangular_002dand_002dcylinder_002dgauge_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Render Angular and Cylinder Gauge</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://static.fusioncharts.com/code/latest/fusioncharts.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://static.fusioncharts.com/code/latest/fusioncharts.charts.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://static.fusioncharts.com/code/latest/themes/fusioncharts.theme.ocean.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"chart\"></div>\n");
      out.write("        ");

            /* **Step 1:** Include the `FusionCharts.java` file as a package in your project. Suppose the package named com.example */
            /* **Step 2:** Include the package in the file where you want to show FusionCharts as follows */    
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 
            /* **Step 3:** Create a chart object using the FusionCharts JAVA class constructor. Syntax for the constructor: `FusionCharts("type of chart", "unique chart id", "width of chart", "height of chart", "div id to render the chart", "data format", "data source")`   */
            FusionCharts lineChart = new FusionCharts(
                        "AngularGauge",// chartType
                        "ex3",// chartId
                        600,400,// chartWidth, chartHeight
                        "chart",// chartContainer
                        "json",// dataFormat
                        "{\"chart\": {\"caption\": \"Customer Satisfaction Score\",\"lowerlimit\": \"0\",\"upperlimit\": \"100\",\"lowerlimitdisplay\": \"Bad\",\"upperlimitdisplay\": \"Good\",\"palette\": \"1\",\"numbersuffix\": \"%\",\"tickvaluedistance\": \"10\",\"showvalue\": \"0\",\"gaugeinnerradius\": \"0\",\"bgcolor\": \"FFFFFF\",\"pivotfillcolor\": \"333333\",\"pivotradius\": \"8\",\"pivotfillmix\": \"333333, 333333\",\"pivotfilltype\": \"radial\",\"pivotfillratio\": \"0,100\",\"showtickvalues\": \"1\",\"showborder\": \"0\"},\"colorrange\": {\"color\": [{\"minvalue\": \"0\",\"maxvalue\": \"45\",\"code\": \"e44a00\"},{\"minvalue\": \"45\",\"maxvalue\": \"75\",\"code\": \"f8bd19\"},{\"minvalue\": \"75\",\"maxvalue\": \"100\",\"code\": \"6baa01\"}]},\"dials\": {\"dial\": [{\"value\": \"92\",\"rearextension\": \"15\",\"radius\": \"100\",\"bgcolor\": \"333333\",\"bordercolor\": \"333333\",\"basewidth\": \"8\"}]}}"
                    );
        
      out.write("\n");
      out.write("        ");

            /* **Step 4:** Render the chart */
        
      out.write("\n");
      out.write("        ");
      out.print(lineChart.render());
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

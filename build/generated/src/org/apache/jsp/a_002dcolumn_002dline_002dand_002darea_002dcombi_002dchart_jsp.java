package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import FusionCharts.FusionCharts;

public final class a_002dcolumn_002dline_002dand_002darea_002dcombi_002dchart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>A Column, Line and Area Combi Chart</title>\n");
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
                        "mscombi2d",// chartType
                        "ex3",// chartId
                        600,400,// chartWidth, chartHeight
                        "chart",// chartContainer
                        "json",// dataFormat
                        "{\"chart\": {\"caption\": \"Actual Revenues, Targeted Revenues & Profits\",\"subcaption\": \"Last year\",\"xaxisname\": \"Month\",\"yaxisname\": \"Amount (In USD)\",\"numberprefix\": \"$\",\"theme\": \"ocean\"			},			\"categories\": 			[{\"category\": [{\"label\": \"Jan\"					},					{\"label\": \"Feb\"					},					{\"label\": \"Mar\"					},					{\"label\": \"Apr\"					},					{\"label\": \"May\"					},					{\"label\": \"Jun\"					},					{\"label\": \"Jul\"					},					{\"label\": \"Aug\"					},					{\"label\": \"Sep\"					},					{\"label\": \"Oct\"					},					{\"label\": \"Nov\"					},					{\"label\": \"Dec\"					}				]			}],			\"dataset\": 			[{				\"seriesname\": \"Actual Revenue\",				\"data\": 				[					{\"value\": \"16000\"					},					{\"value\": \"20000\"					},					{\"value\": \"18000\"					},					{\"value\": \"19000\"					},					{\"value\": \"15000\"					},					{\"value\": \"21000\"					},					{\"value\": \"16000\"					},					{\"value\": \"20000\"					},					{\"value\": \"17000\"					},					{\"value\": \"25000\"					},					{\"value\": \"19000\"					},					{\"value\": \"23000\"					}				]			 },			 {				\"seriesname\": \"Projected Revenue\",				\"renderas\": \"line\",				\"showvalues\": \"0\",				\"data\": 				[					{\"value\": \"15000\"					},					{\"value\": \"16000\"					},					{\"value\": \"17000\"					},					{\"value\": \"18000\"					},					{\"value\": \"19000\"					},					{\"value\": \"19000\"					},					{\"value\": \"19000\"					},					{\"value\": \"19000\"					},					{\"value\": \"20000\"					},					{\"value\": \"21000\"					},					{\"value\": \"22000\"					},					{\"value\": \"23000\"					}				]			 },			 {				\"seriesname\": \"Profit\",				\"renderas\": \"area\",				\"showvalues\": \"0\",				\"data\": 				[					{\"value\": \"4000\"					},					{\"value\": \"5000\"					},					{\"value\": \"3000\"					},					{\"value\": \"4000\"					},					{\"value\": \"1000\"					},					{\"value\": \"7000\"					},					{\"value\": \"1000\"					},					{\"value\": \"4000\"					},					{\"value\": \"1000\"					},					{\"value\": \"8000\"					},					{\"value\": \"2000\"					},					{\"value\": \"7000\"					}				]			}]	}"
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

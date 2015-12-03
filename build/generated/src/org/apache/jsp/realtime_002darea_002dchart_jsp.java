package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import FusionCharts.FusionCharts;

public final class realtime_002darea_002dchart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Realtime Area Chart</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://static.fusioncharts.com/code/latest/fusioncharts.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://static.fusioncharts.com/code/latest/fusioncharts.charts.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://static.fusioncharts.com/code/latest/themes/fusioncharts.theme.ocean.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"chart\"></div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
 
            
            FusionCharts realtimearea = new FusionCharts(
                        "realtimearea",// chartType
                        "stockRealTimeChart",// chartId
                        "100%","400",// chartWidth, chartHeight
                        "chart",// chartContainer
                        "json",// dataFormat
                        "{\"chart\": {\"caption\": \"Real-time stock price monitor\",\"subCaption\": \"Harry\'s SuperMart\",\"xAxisName\": \"Time\",\"yAxisName\": \"Stock Price\",\"numberPrefix\": \"$\",\"refreshinterval\": \"5\",\"yaxisminvalue\": \"35\",\"yaxismaxvalue\": \"36\",\"numdisplaysets\": \"10\",\"labeldisplay\": \"rotate\",\"showValues\": \"0\",\"showRealTimeValue\": \"0\", \"paletteColors\" : \"#0075c2,#1aaf5d\",\"baseFontColor\" : \"#333333\",\"baseFont\" : \"Helvetica Neue,Arial\",\"captionFontSize\" : \"14\",\"subcaptionFontSize\" : \"14\",\"subcaptionFontBold\" : \"0\",\"showBorder\" : \"0\",\"bgColor\" : \"#ffffff\",\"showShadow\" : \"0\",\"canvasBgColor\" : \"#ffffff\",\"canvasBorderAlpha\" : \"0\",\"divlineAlpha\" : \"100\",\"divlineColor\" : \"#999999\",\"divlineThickness\" : \"1\",\"divLineIsDashed\" : \"1\",\"divLineDashLen\" : \"1\",\"divLineGapLen\" : \"1\",\"usePlotGradientColor\" : \"0\",\"showplotborder\" : \"0\",\"showXAxisLine\" : \"1\",\"xAxisLineThickness\" : \"1\",\"xAxisLineColor\" : \"#999999\",\"showAlternateHGridColor\" : \"0\"},\"categories\": [{\"category\": [{ \"label\": \"Day Start\" }]}],\"dataset\": [{\"data\": [{ \"value\": \"35.27\" }]}]}",//datasource
                        "{\"events\": {			\"initialized\": function (e) {				function addLeadingZero(num){					return (num <= 9)? (\"0\"+num) : num;				}				function updateData() {					var chartRef = FusionCharts(\"stockRealTimeChart\"),						currDate = new Date(),						label = addLeadingZero(currDate.getHours()) + \":\" +						addLeadingZero(currDate.getMinutes()) + \":\" +						addLeadingZero(currDate.getSeconds()),												randomValue = Math.floor(Math.random()     												 * 50) / 100 + 35.25,												strData = \"&label=\" + label + \"&value=\" + randomValue;										chartRef.feedData(strData);				}								var myVar = setInterval(function () {					updateData();				}, 5000);			}		}}"
                    );
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.print(realtimearea.render());
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

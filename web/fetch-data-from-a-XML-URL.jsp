<%-- 
    Document   : fetch-data-from-a-XML-URL
    Created on : 1 Dec, 2015, 3:40:19 PM
    Author     : sguha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fetch data from a XML URL</title>
        <script type="text/javascript" src="http://static.fusioncharts.com/code/latest/fusioncharts.js"></script>
        <script type="text/javascript" src="http://static.fusioncharts.com/code/latest/fusioncharts.charts.js"></script>
        <script type="text/javascript" src="http://static.fusioncharts.com/code/latest/themes/fusioncharts.theme.ocean.js"></script>
    </head>
    <body>
        <div id="chart"></div>
        <%@page import="FusionCharts.FusionCharts" %>
        <% 

            FusionCharts lineChart = new FusionCharts(
                        "column2d",// chartType
                        "ex6",// chartId
                        "600", "400",// chartWidth, chartHeight
                        "chart",// chartContainer
                        "xmlurl",// dataFormat
                        "data/data.xml"
                    );
        %>
        <%
            /* **Step 4:** Render the chart */
        %>
        <%=lineChart.render()%>
    </body>
</html>

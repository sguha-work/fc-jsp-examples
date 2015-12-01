<%-- 
    Document   : fetch-data-from-a-JSON-URL
    Created on : 1 Dec, 2015, 3:18:52 PM
    Author     : sguha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fetch data from a JSON URL</title>
        <script type="text/javascript" src="http://static.fusioncharts.com/code/latest/fusioncharts.js"></script>
        <script type="text/javascript" src="http://static.fusioncharts.com/code/latest/fusioncharts.charts.js"></script>
        <script type="text/javascript" src="http://static.fusioncharts.com/code/latest/themes/fusioncharts.theme.ocean.js"></script>
    </head>
    <body>
        <div id="chart"></div>
        <%
            /* **Step 1:** Include the `FusionCharts.java` file as a package in your project. Suppose the package named com.example */
            /* **Step 2:** Include the package in the file where you want to show FusionCharts as follows */    
        %>
        <%@page import="FusionCharts.FusionCharts" %>
        <% 
            /* **Step 3:** Create a chart object using the FusionCharts JAVA class constructor. Syntax for the constructor: `FusionCharts("type of chart", "unique chart id", "width of chart", "height of chart", "div id to render the chart", "data format", "data source")`   */
            FusionCharts lineChart = new FusionCharts(
                        "column2d",// chartType
                        "ex5",// chartId
                        600,400,// chartWidth, chartHeight
                        "chart",// chartContainer
                        "jsonurl",// dataFormat
                        "data/data.json"
                    );
        %>
        <%
            /* **Step 4:** Render the chart */
        %>
        <%=lineChart.render()%>
    </body>
</html>

<%-- 
    Document   : render-angular-and-cylinder-gauge
    Created on : 1 Dec, 2015, 4:09:40 PM
    Author     : sguha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Render Angular and Cylinder Gauge</title>
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
                        "AngularGauge",// chartType
                        "ex8",// chartId
                        600,400,// chartWidth, chartHeight
                        "chart",// chartContainer
                        "json",// dataFormat
                        "{\"chart\": {\"caption\": \"Customer Satisfaction Score\",\"lowerlimit\": \"0\",\"upperlimit\": \"100\",\"lowerlimitdisplay\": \"Bad\",\"upperlimitdisplay\": \"Good\",\"palette\": \"1\",\"numbersuffix\": \"%\",\"tickvaluedistance\": \"10\",\"showvalue\": \"0\",\"gaugeinnerradius\": \"0\",\"bgcolor\": \"FFFFFF\",\"pivotfillcolor\": \"333333\",\"pivotradius\": \"8\",\"pivotfillmix\": \"333333, 333333\",\"pivotfilltype\": \"radial\",\"pivotfillratio\": \"0,100\",\"showtickvalues\": \"1\",\"showborder\": \"0\"},\"colorrange\": {\"color\": [{\"minvalue\": \"0\",\"maxvalue\": \"45\",\"code\": \"e44a00\"},{\"minvalue\": \"45\",\"maxvalue\": \"75\",\"code\": \"f8bd19\"},{\"minvalue\": \"75\",\"maxvalue\": \"100\",\"code\": \"6baa01\"}]},\"dials\": {\"dial\": [{\"value\": \"92\",\"rearextension\": \"15\",\"radius\": \"100\",\"bgcolor\": \"333333\",\"bordercolor\": \"333333\",\"basewidth\": \"8\"}]}}"
                    );
        %>
        <%
            /* **Step 4:** Render the chart */
        %>
        <%=lineChart.render()%>
    </body>
</html>

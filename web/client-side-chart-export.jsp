<%-- 
    Document   : client-side-chart-export
    Created on : 1 Dec, 2015, 3:56:26 PM
    Author     : sguha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client Side Chart Export</title>
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
                        "ex7",// chartId
                        "600", "400",// chartWidth, chartHeight
                        "chart",// chartContainer
                        "json",// dataFormat
                        // dataSource
                        "{  \"chart\":	  {	 \"caption\":\"Harry\'s SuperMart\",		 \"subCaption\":\"Top 5 stores in last month by revenue\",		 \"numberPrefix\":\"$\",		 \"exportEnabled \":\"1\",		 \"theme\":\"ocean\"	  },	  \"data\":	  [	 {		\"label\":\"Bakersfield Central\",			\"value\":\"880000\"		 },		 {		\"label\":\"Garden Groove harbour\",			\"value\":\"730000\"		 },		 {		\"label\":\"Los Angeles Topanga\",			\"value\":\"590000\"		 },		 {		\"label\":\"Compton-Rancho Dom\",			\"value\":\"520000\"		 },		 {		\"label\":\"Daly City Serramonte\",			\"value\":\"330000\"		 }	  ]		}"
                    );
        %>
        
        <%=lineChart.render()%>
    </body>
</html>

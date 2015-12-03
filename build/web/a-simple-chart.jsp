<%-- 
    Document   : a-simple-chart
    Created on : 1 Dec, 2015, 1:27:22 PM
    Author     : sguha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>A Simple Chart</title>
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
                        "ex1",// chartId
                        "600","400",// chartWidth, chartHeight
                        "chart",// chartContainer
                        "json",// dataFormat
                        // dataSource
                        "{\"chart\":{\"caption\":\"Harry\'sSuperMart\",\"subCaption\":\"Top5storesinlastmonthbyrevenue\",\"numberPrefix\":\"$\",\"theme\":\"ocean\"			},			\"data\":			[{\"label\":\"BakersfieldCentral\",\"value\":\"880000\"				},				{\"label\":\"GardenGrooveharbour\",\"value\":\"730000\"				},				{\"label\":\"LosAngelesTopanga\",\"value\":\"590000\"				},				{\"label\":\"Compton-RanchoDom\",\"value\":\"520000\"	},	{\"label\":\"DalyCitySerramonte\",\"value\":\"330000\"	}]}"
                    );
        %>
        
        <%=lineChart.render()%>
    </body>
</html>

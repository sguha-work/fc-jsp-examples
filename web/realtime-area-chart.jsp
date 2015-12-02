<%-- 
    Document   : realtime-area-chart
    Created on : 2 Dec, 2015, 11:55:32 AM
    Author     : sguha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Realtime Area Chart</title>
        <script type="text/javascript" src="http://static.fusioncharts.com/code/latest/fusioncharts.js"></script>
        <script type="text/javascript" src="http://static.fusioncharts.com/code/latest/fusioncharts.charts.js"></script>
        <script type="text/javascript" src="http://static.fusioncharts.com/code/latest/themes/fusioncharts.theme.ocean.js"></script>
    </head>
    <body>
        <div id="chart"></div>
        
        <%@page import="FusionCharts.FusionCharts" %>
        <% 
            
            FusionCharts realtimearea = new FusionCharts(
                        "realtimearea",// chartType
                        "stockRealTimeChart",// chartId
                        "100%","400",// chartWidth, chartHeight
                        "chart",// chartContainer
                        "json",// dataFormat
                        "{\"chart\": {\"caption\": \"Real-time stock price monitor\",\"subCaption\": \"Harry\'s SuperMart\",\"xAxisName\": \"Time\",\"yAxisName\": \"Stock Price\",\"numberPrefix\": \"$\",\"refreshinterval\": \"5\",\"yaxisminvalue\": \"35\",\"yaxismaxvalue\": \"36\",\"numdisplaysets\": \"10\",\"labeldisplay\": \"rotate\",\"showValues\": \"0\",\"showRealTimeValue\": \"0\", \"paletteColors\" : \"#0075c2,#1aaf5d\",\"baseFontColor\" : \"#333333\",\"baseFont\" : \"Helvetica Neue,Arial\",\"captionFontSize\" : \"14\",\"subcaptionFontSize\" : \"14\",\"subcaptionFontBold\" : \"0\",\"showBorder\" : \"0\",\"bgColor\" : \"#ffffff\",\"showShadow\" : \"0\",\"canvasBgColor\" : \"#ffffff\",\"canvasBorderAlpha\" : \"0\",\"divlineAlpha\" : \"100\",\"divlineColor\" : \"#999999\",\"divlineThickness\" : \"1\",\"divLineIsDashed\" : \"1\",\"divLineDashLen\" : \"1\",\"divLineGapLen\" : \"1\",\"usePlotGradientColor\" : \"0\",\"showplotborder\" : \"0\",\"showXAxisLine\" : \"1\",\"xAxisLineThickness\" : \"1\",\"xAxisLineColor\" : \"#999999\",\"showAlternateHGridColor\" : \"0\"},\"categories\": [{\"category\": [{ \"label\": \"Day Start\" }]}],\"dataset\": [{\"data\": [{ \"value\": \"35.27\" }]}]}",//datasource
                        "{\"events\": {			\"initialized\": function (e) {				function addLeadingZero(num){					return (num <= 9)? (\"0\"+num) : num;				}				function updateData() {					var chartRef = FusionCharts(\"stockRealTimeChart\"),						currDate = new Date(),						label = addLeadingZero(currDate.getHours()) + \":\" +						addLeadingZero(currDate.getMinutes()) + \":\" +						addLeadingZero(currDate.getSeconds()),												randomValue = Math.floor(Math.random()     												 * 50) / 100 + 35.25,												strData = \"&label=\" + label + \"&value=\" + randomValue;										chartRef.feedData(strData);				}								var myVar = setInterval(function () {					updateData();				}, 5000);			}		}}"
                    );
        %>
        
        <%=realtimearea.render()%>
    </body>
</html>

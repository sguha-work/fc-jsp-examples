<%-- 
    Document   : a-3D-pie-chart
    Created on : 1 Dec, 2015, 2:17:23 PM
    Author     : sguha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>A 3D Pie Chart</title>
        <script type="text/javascript" src="http://static.fusioncharts.com/code/latest/fusioncharts.js"></script>
        <script type="text/javascript" src="http://static.fusioncharts.com/code/latest/fusioncharts.charts.js"></script>
        <script type="text/javascript" src="http://static.fusioncharts.com/code/latest/themes/fusioncharts.theme.ocean.js"></script>
    </head>
    <body>
        <div id="chart"></div>
        
        <%@page import="FusionCharts.FusionCharts" %>
        <% 
        
            FusionCharts lineChart = new FusionCharts(
                        "pie3d",// chartType
                        "ex2",// chartId
                        "600","400",// chartWidth, chartHeight
                        "chart",// chartContainer
                        "json",// dataFormat
                        // dataSource
                        "{\"chart\":{\"caption\":\"Ageprofileofwebsitevisitors\",\"subcaption\":\"LastYear\",\"startingangle\":\"120\",\"showlabels\":\"0\",\"showlegend\":\"1\",\"enablemultislicing\":\"0\",\"slicingdistance\":\"15\",\"showpercentvalues\":\"1\",\"showpercentintooltip\":\"0\",\"plottooltext\":\"Agegroup:$labelTotalvisit:$datavalue\",\"theme\":\"ocean\"},				\"data\":				[{\"label\":\"Teenage\",\"value\":\"1250400\"					},					{\"label\":\"Adult\",\"value\":\"1463300\"					},					{\"label\":\"Mid-age\",\"value\":\"1050700\"					},					{\"label\":\"Senior\",\"value\":\"491000\"					}				]}"
                    );
        %>
        
        <%=lineChart.render()%>
    </body>
</html>

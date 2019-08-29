<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Factor_1', 'Mood'],
          [ 5,      4],
          [ 2,      2],
          [ 1,     2],
          [ 2,      1],
          [ 5,      4],
          [ 4,    5]
        ]);

        var options = {
          title: 'Factor1 Effects on Mood',
          hAxis: {title: 'Factor_1', minValue: 0, maxValue: 5},
          vAxis: {title: 'Mood', minValue: 0, maxValue: 5},
          legend: 'none'
        };

        var chart = new google.visualization.ScatterChart(document.getElementById('chart_div'));

        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    <div id="chart_div" style="width: 900px; height: 500px;"></div>
  </body>
</html>


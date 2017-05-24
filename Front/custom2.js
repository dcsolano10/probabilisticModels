var ctx = document.getElementById("g1").getContext('2d');
var myChart = new Chart(ctx, {
  type: 'pie',
  data: {
    labels: ["0 ventas", "3 ventas", "6 ventas"],
    datasets: [{
      backgroundColor: [
        "#2ecc71",
        "#3498db",
        "#95a5a6"
      ],
      data: [0.39, 0.19, 0.42]
    }]
  }
});

var ctx2 = document.getElementById("g2").getContext('2d');
var myChart2 = new Chart(ctx2, {
  type: 'pie',
  data: {
    labels: ["0 ventas", "3 ventas", "6 ventas"],
    datasets: [{
      backgroundColor: [
        "#2ecc71",
        "#3498db",
        "#95a5a6"
              ],
      data: [0.35, 0.15, 0.5]
    }]
  }
});

var g5 = document.getElementById('g5').getContext('2d');
var myG5 = new Chart(g5, {
  type: 'line',
  data: {
    labels: ['0.1', '0.2', '0.3', '0.4', '0.5', '0.6', '0.7', '0.8'],
    datasets: [{
      label: 'Ganacia total en pesos',
      data: [985243, 995391, 1007524, 1154346, 1384538, 1504738, 1499393, 1452039],
      backgroundColor: "rgb(0,122,122)"
    }]
  }
});
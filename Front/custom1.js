var ctx = document.getElementById("g1").getContext('2d');
var myChart = new Chart(ctx, {
  type: 'bar',
  data: {
    labels: ["M", "T", "W", "T", "F", "S", "S"],
    datasets: [{
      label: 'apples',
      data: [12, 19, 3, 17, 28, 24, 7],
      backgroundColor: "rgb(0,122,122)"
    }, {
      label: 'oranges',
      data: [30, 29, 5, 5, 20, 3, 10],
      backgroundColor: "rgb(192,192,192)"
    }]
  }
});

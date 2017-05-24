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

function alternativa1()
{
  document.getElementById('p1').innerHTML = '3';
  document.getElementById('p2').innerHTML = '3';
  document.getElementById('p3').innerHTML = '3';
  document.getElementById('p4').innerHTML = '0';
  document.getElementById('p5').innerHTML = '0';
  document.getElementById('p6').innerHTML = '0';
  document.getElementById('p7').innerHTML = '0';
  document.getElementById('p8').innerHTML = '0';
  document.getElementById('p9').innerHTML = '0';

  document.getElementById('s1').innerHTML = '6';
  document.getElementById('s2').innerHTML = '0';
  document.getElementById('s3').innerHTML = '0';
  document.getElementById('s4').innerHTML = '3';
  document.getElementById('s5').innerHTML = '0';
  document.getElementById('s6').innerHTML = '0';
  document.getElementById('s7').innerHTML = '3';
  document.getElementById('s8').innerHTML = '3';
  document.getElementById('s9').innerHTML = '0';
  document.getElementById('costototal').innerHTML = '1.167.572,44';
}

function alternativa2()
{
  document.getElementById('p1').innerHTML = '3';
  document.getElementById('p2').innerHTML = '6';
  document.getElementById('p3').innerHTML = '6';
  document.getElementById('p4').innerHTML = '3';
  document.getElementById('p5').innerHTML = '3';
  document.getElementById('p6').innerHTML = '3';
  document.getElementById('p7').innerHTML = '0';
  document.getElementById('p8').innerHTML = '0';
  document.getElementById('p9').innerHTML = '0';

  document.getElementById('s1').innerHTML = '6';
  document.getElementById('s2').innerHTML = '0';
  document.getElementById('s3').innerHTML = '0';
  document.getElementById('s4').innerHTML = '6';
  document.getElementById('s5').innerHTML = '3';
  document.getElementById('s6').innerHTML = '0';
  document.getElementById('s7').innerHTML = '6';
  document.getElementById('s8').innerHTML = '3';
  document.getElementById('s9').innerHTML = '0';
  document.getElementById('costototal').innerHTML = '1.746.788,87';
}

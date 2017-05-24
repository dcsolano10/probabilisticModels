var g1 = document.getElementById("g1").getContext('2d');
var myG1 = new Chart(g1, {
  type: 'bar',
  data: {
    labels: ["S", "M", "L"],
    datasets: [{
      label: 'Principal',
      data: [0.5865, 0.5343, 0.5754],
      backgroundColor: "rgb(0,122,122)"
    }, {
      label: 'Secundaria',
      data: [0.5845, 0.5092, 0.4896],
      backgroundColor: "rgb(192,192,192)"
    }]
  }
});

var g2 = document.getElementById("g2").getContext('2d');
var myG2 = new Chart(g2, {
  type: 'bar',
  data: {
    labels: ["S", "M", "L"],
    datasets: [{
      label: 'Principal',
      data: [0.1477, 0.1232, 0.1577],
      backgroundColor: "rgb(0,122,122)"
    }, {
      label: 'Secundaria',
      data: [0.1437, 0.1072, 0.0921],
      backgroundColor: "rgb(192,192,192)"
    }]
  }
});

var g3 = document.getElementById("g3").getContext('2d');
var myG3 = new Chart(g3, {
  type: 'bar',
  data: {
    labels: ["S", "M", "L"],
    datasets: [{
      label: 'Principal',
      data: [2.89, 7.11, 4.89],
      backgroundColor: "rgb(0,122,122)"
    }, {
      label: 'Secundaria',
      data: [1.94, 5.94, 4.94],
      backgroundColor: "rgb(192,192,192)"
    }]
  }
});

var g4 = document.getElementById("g4").getContext('2d');
var myG4 = new Chart(g4, {
  type: 'bar',
  data: {
    labels: ["Ganancia", "C. exhibición", "C. envío", "C. traslado"],
    datasets: [{
      label: 'Valor total en pesos',
      data: [4056390.09, 779046.51, 167575.94, 5445.99],
      backgroundColor: "rgb(192,192,192)"
    }]
  }
});

var g5 = document.getElementById('g5').getContext('2d');
var myG5 = new Chart(g5, {
  type: 'line',
  data: {
    labels: ['1 A/Q', '3 A/Q', '6 A/Q', '9 A/Q', '11 A/Q', '13 A/Q', '16 A/Q'],
    datasets: [{
      label: 'Ganacia total en pesos',
      data: [75458, 298736, 576025, 728003, 875304, 995010, 1112020],
      backgroundColor: "rgb(0,122,122)"
    }]
  }
});

var g6 = document.getElementById("g6").getContext('2d');
var myG6 = new Chart(g6, {
  type: 'bar',
  data: {
    labels: ["S", "M", "L"],
    datasets: [{
      label: 'Principal',
      data: [2.689, 5.890, 4.508],
      backgroundColor: "rgb(0,122,122)"
    }, {
      label: 'Secundaria',
      data: [1.750, 4.457, 3.497],
      backgroundColor: "rgb(192,192,192)"
    }]
  }
});

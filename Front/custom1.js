var g1 = document.getElementById("g1").getContext('2d');
var myG1 = new Chart(g1, {
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

var g2 = document.getElementById("g2").getContext('2d');
var myG2 = new Chart(g2, {
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

var g3 = document.getElementById("g3").getContext('2d');
var myG3 = new Chart(g3, {
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

var g4 = document.getElementById("g4").getContext('2d');
var myG4 = new Chart(g4, {
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

var g5 = document.getElementById('g5').getContext('2d');
var myG5 = new Chart(g5, {
  type: 'line',
  data: {
    labels: ['M', 'T', 'W', 'T', 'F', 'S', 'S'],
    datasets: [{
      label: 'apples',
      data: [12, 19, 3, 17, 6, 3, 7],
      backgroundColor: "rgb(0,122,122)"
    }]
  }
});

var g6 = document.getElementById("g6").getContext('2d');
var myG6 = new Chart(g6, {
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

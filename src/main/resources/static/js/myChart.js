
new Chart(document.getElementById("myPieChart"), {
    type: 'pie',
    data: {
        labels: ['Sarah', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
        datasets: [{
            label: '# of Votes',
            data: [7, 4, 3, 5, 2, 3],

            borderWidth: 1
        }]
    },

    options:{}
});
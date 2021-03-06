// ================================
// START YOUR APP HERE
// ================================



const init = {
	monList: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
	dayList: ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'],
	today: new Date(),
	monForChange: new Date().getMonth(),
	activeDate: new Date(),
	getFirstDay: (yy, mm) => new Date(yy, mm, 1),
	getLastDay: (yy, mm) => new Date(yy, mm + 1, 0),
	nextMonth: function() {
		let d = new Date();
		d.setDate(1);
		d.setMonth(++this.monForChange);
		this.activeDate = d;
		return d;
	},
	prevMonth: function() {
		let d = new Date();
		d.setDate(1);
		d.setMonth(--this.monForChange);
		this.activeDate = d;
		return d;
	},
	addZero: (num) => (num < 10) ? '0' + num : num,
	activeDTag: null,
	getIndex: function(node) {
		let index = 0;
		while (node = node.previousElementSibling) {
			index++;
		}
		return index;
	}
};

const $calBody = document.querySelector('.cal-body');
const $btnNext = document.querySelector('.btn-cal.next');
const $btnPrev = document.querySelector('.btn-cal.prev');

/**
 * @param {number} date
 * @param {number} dayIn
*/
//   function loadDate (date, dayIn) {
//     document.querySelector('.cal-date').textContent = date;
//     document.querySelector('.cal-day').textContent = init.dayList[dayIn];
//   }

/**
 * @param {date} fullDate
 */
function loadYYMM(fullDate) {
	let yy = fullDate.getFullYear();
	let mm = fullDate.getMonth();
	let firstDay = init.getFirstDay(yy, mm);
	let lastDay = init.getLastDay(yy, mm);
	let markToday;  // for marking today date

	if (mm === init.today.getMonth() && yy === init.today.getFullYear()) {
		markToday = init.today.getDate();
	}

	document.querySelector('.cal-month').textContent = init.monList[mm];
	document.querySelector('.cal-year').textContent = yy;

	let trtd = '';
	let startCount;
	let countDay = 0;
	for (let i = 0; i < 6; i++) {
		trtd += '<tr>';
		for (let j = 0; j < 7; j++) {
			if (i === 0 && !startCount && j === firstDay.getDay()) {
				startCount = 1;
			}
			if (!startCount) {
				trtd += '<td>'
			} else {
				let fullDate = yy + '.' + init.addZero(mm + 1) + '.' + init.addZero(countDay + 1);
				trtd += '<td class="day';
				trtd += (markToday && markToday === countDay + 1) ? ' today" ' : '"';
				trtd += ` data-date="${countDay + 1}" data-fdate="${fullDate}">`;
			}
			trtd += (startCount) ? ++countDay : '';
			if (countDay === lastDay.getDate()) {
				startCount = 0;
			}
			trtd += '</td>';
		}
		trtd += '</tr>';
	}
	$calBody.innerHTML = trtd;
}

/**
 * @param {string} val
 */
function createNewList(val) {
	let id = new Date().getTime() + '';
	let yy = init.activeDate.getFullYear();
	let mm = init.activeDate.getMonth() + 1;
	let dd = init.activeDate.getDate();
	const $target = $calBody.querySelector(`.day[data-date="${dd}"]`);

	let date = yy + '.' + init.addZero(mm) + '.' + init.addZero(dd);

	let eventData = {};
	eventData['date'] = date;
	eventData['memo'] = val;
	eventData['complete'] = false;
	eventData['id'] = id;
	init.event.push(eventData);
	$todoList.appendChild(createLi(id, val, date));
}

loadYYMM(init.today)
//   loadDate(init.today.getDate(), init.today.getDay());

$btnNext.addEventListener('click', () => {
	loadYYMM(init.nextMonth());
	let mm = init.activeDate.getMonth() + 1;
	console.log('mm : ' + mm);
	$(function() {
		$.ajax({
			url: '/project333333/CalDate.do?nm=' +   mm,
			success: function() {

			}, error: function() {

			}

		});
	})
});
$btnPrev.addEventListener('click', () => {
	loadYYMM(init.prevMonth());
	let mm = init.activeDate.getMonth() + 1;
	console.log(mm);
	$(function() {
		$.ajax({
			url: '/project333333/CalDate.do?nm=' + mm,
			success: function() {

			}, error: function() {

			}

		});

	})

});


	let ctx = document.getElementById('pieChartCanvas').getContext('2d');

		let pieChartData = {
			labels : [ '100???', '200???', '300???' ],
			datasets : [ {
				data : [ 4, 2, 3 ],
				backgroundColor : [ 'rgb(255, 99, 132)', 'rgb(255, 159, 64)',
						'rgb(255, 205, 86)' ]
			} ]
		};

		var chart = new Chart(ctx, {
			type : 'pie',
			data : pieChartData,
			options : {
				plugins : {
					labels : {
						render : 'percentage',
						showActualPercentages : true
					}
				}
			}
		});

		//bar chart
		let ctx2 = document.getElementById('barChartCanvas').getContext('2d');
		var myBarChart = new Chart(ctx2, {
			type : 'bar',
			data : {
				labels : [ "101???", "102???","103???", "201???","202???", "203???","301???", "302???","303???"],
				datasets : [ {

					data : [ 13, 11, 14, 15, 12, 17, 19, 17, 16 ],
					backgroundColor : [ 
							"#f5cd79", "rgb(255, 159, 64)",  "rgba(255,1,1,0.5)","#B53471","rgba(1,255,1,0.5)","rgba(100,255,100,0.5)","#45aaf2",
						 "rgba(1,1,255,0.5)", "rgb(25,42,86)"],
							
				} ]
			},
			options : {
				legend : {
					display : false
				},
				hover : {
					mode : 'index'
				},
				responsive : false,
				scales : {
					xAxes : [ {
						ticks : {
							fontColor : "rgba(225,225,225)",
							fontSize : 20
						},
						gridLines : {
							color : "rgba(0,0,0,0)"
						}
					} ],
					yAxes : [ {

						gridLines : {
							color : "rgba(0,0,0,0)"
						},
						ticks : {
							beginAtZero : true,
							stepSize : 10,
							fontColor : "rgba(225,225,225)",
							fontSize : 20
						}
					} ]
				}
			}
		});






$calBody.addEventListener('click', (e) => {
	if (e.target.classList.contains('day')) {

		if (init.activeDTag) {
			init.activeDTag.classList.remove('day-active');
		}
		let day = Number(e.target.textContent);
		let yy = init.activeDate.getFullYear();
		let mm = init.activeDate.getMonth() + 1;


		$(function() {
			$.ajax({
				url: '/project333333/AdminData.do?yy=' + yy + '&mm=' + mm + '&dd=' + day,
				dataType: 'json',
				success: function(data) {
					var view1 = parseInt(data.view0);
					var view2 = parseInt(data.view1);
					var view3 = parseInt(data.view2);
					var view4 = parseInt(data.view3);
					var view5 = parseInt(data.view4);
					var view6 = parseInt(data.view5);
					var view7 = parseInt(data.view6);
					var view8 = parseInt(data.view7);
					var view9 = parseInt(data.view8);
					var sum100 = parseInt(data.sum100);
					var sum200 = parseInt(data.sum200);
					var sum300 = parseInt(data.sum300);

					let ctx = document.getElementById('pieChartCanvas').getContext('2d');
					chart.destroy();

					pieChartData = {
						labels: ['100???', '200???', '300???'],
						datasets: [{
							data: [sum100, sum200, sum300],
							backgroundColor: ['rgb(255, 99, 132)', 'rgb(255, 159, 64)', 'rgb(255, 205, 86)']
						}]
					};

					chart = new Chart(ctx, {
						type: 'pie',
						data: pieChartData,
						options: {}
					});


					let ctx2 = document.getElementById('barChartCanvas').getContext('2d');
					myBarChart.destroy();
					myBarChart = new Chart(ctx2, {
						type: 'bar',
						data: {
							labels: ["101???", "102???", "103???", "201???", "202???", "203???", "301???", "302???", "303???",],
							datasets: [{
								label: '??? ?????? ?????? ?????????',
								data: [view1, view2, view3, view4, view5, view6, view7, view8, view9],
								backgroundColor: ["rgba(255,1,1,0.5)", "rgba(255,100,100,0.5)", "rgba(255,200,200,0.5)", "rgba(1,255,1,0.5)",
									"rgba(100,255,100,0.5)", "rgba(1,1,255,0.5)", "rgba(100,100,255,0.5)"],
							}]
						},
						options: {
							legend: {
								display: false
							},
							hover: {
								mode: 'index'
							},
							responsive: false,
							scales: {
								xAxes: [{
									ticks: {
										fontColor: "rgba(225,225,225)",
										fontSize: 20
									},
									gridLines: {
										color: "rgba(0,0,0,0)"
									}
								}],
								yAxes: [{

									gridLines: {
										color: "rgba(0,0,0,0)"
									},
									ticks: {
										beginAtZero: true,
										stepSize: 40,
										fontColor: "rgba(225,225,225)",
										fontSize: 20
									}
								}]
							}
						}
					});
				}, error: function() {

				}
			});
		})
				e.target.classList.add('day-active');
		/*loadDate(day, e.target.cellIndex);*/
		init.activeDTag = e.target;
		init.activeDate.setDate(day);
	}
});







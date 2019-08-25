/*function calendar(){
    var day=['Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday'];
    var month=['January','February','March','April','May','June','July','August','September','October','November','December'];
    var d=new Date();
    setText('calendar-day', day[d.getDay()]);
    setText('calendar-date', d.getDate());
    setText('calendar-month-year', month[d.getMonth()]+' '+(1900+d.getYear()));
};

function setText(id, val){
    if(val < 10){
        val = '0' + val; 
    }
    document.getElementById(id).innerHTML = val;
};
window.onload = calendar;*/

document.addEventListener('DOMContentLoaded', function() {
  var calendarEl = document.getElementById('calendar');

  var calendar = new FullCalendar.Calendar(calendarEl, {
    plugins: [ 'interaction', 'dayGrid', 'timeGrid' ],
    defaultView: 'dayGridMonth',
    defaultDate: '2019-08-07',
    header: {
      left: 'prev,next today',
      center: 'title',
      right: 'dayGridMonth,timeGridWeek,timeGridDay'
    },
    events: [
      {
        title: 'All Day Event',
        start: '2019-08-01'
      },
      {
        title: 'Long Event',
        start: '2019-08-07',
        end: '2019-08-10'
      },
      {
        groupId: '999',
        title: 'Repeating Event',
        start: '2019-08-09T16:00:00'
      },
      {
        groupId: '999',
        title: 'Repeating Event',
        start: '2019-08-16T16:00:00'
      },
      {
        title: 'Conference',
        start: '2019-08-11',
        end: '2019-08-13'
      },
      {
        title: 'Meeting',
        start: '2019-08-12T10:30:00',
        end: '2019-08-12T12:30:00'
      },
      {
        title: 'Lunch',
        start: '2019-08-12T12:00:00'
      },
      {
        title: 'Meeting',
        start: '2019-08-12T14:30:00'
      },
      {
        title: 'Birthday Party',
        start: '2019-08-13T07:00:00'
      },
      {
        title: 'Click for Google',
        url: 'http://google.com/',
        start: '2019-08-28'
      }
    ]
  });

  calendar.render();
});
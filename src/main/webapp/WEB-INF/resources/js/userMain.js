loadJQuery();


$(document).on('click', ".delBtn", function() {
	var clickedRow = $(this).parent().parent();
	var cls = clickedRow.attr("class");


	clickedRow.remove();
});

$(document).on('click', "#addItemBtn", function() {
	// item 의 최대번호 구하기
	var lastItemNo = $("#example tr:last").attr("class").replace("item", "");
	alert(lastItemNo);
	var newitem = $("#example tr:eq(0)").clone();
	newitem.removeClass();
	newitem.find("td:eq(0)").attr("rowspan", "1");
	newitem.addClass("item" + (parseInt(lastItemNo) + 1));

	$("#example").append(newitem);
});

function loadJQuery() {
	var oScript = document.createElement("script");
	oScript.type = "text/javascript";
	oScript.charset = "utf-8";
	oScript.src = "http://code.jquery.com/jquery-1.6.2.min.js";
	document.getElementsByTagName("head")[0].appendChild(oScript);
}

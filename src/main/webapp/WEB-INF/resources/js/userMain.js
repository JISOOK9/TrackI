loadJQuery();


$(document).on('click', ".delBtn", function() {
	var clickedRow = $(this).parent().parent();
	var cls = clickedRow.attr("class");


	clickedRow.remove();
});

$(document).on('click', "#addItemBtn", function() {
	// item 의 최대번호 구하기
	var lastItemNo = $("#factorTbl tr:last").attr("class").replace("item", "");
	/*alert(lastItemNo);*/
/*	alert($("#factorTbl tr:last").attr("class"));*/
	var newitem = $("#factorTbl tr:eq(0)").clone();
	newitem.removeClass();
	newitem.find("td:eq(0)").attr("rowspan", "1");

		/*$("#factorTbl tr td input").eq(0).attr("id");*/
	var classname = "item" + (parseInt(lastItemNo) + 1);
	var inputid = classname.replace("item", "factor");
	newitem.addClass(classname);

	$("#factorTbl").append(newitem);
	var newinput = $("#factorTbl tr:last td input");
	//newinput.addClass(inputid);
	$("#factorTbl tr:last td input").attr("name", inputid);
	var test = $("#factorTbl tr:last td input").attr("name");
/*	alert(test);*/
});

$(document).on('click', "#logoutBtn", function() {
	if(window.confirm("Do you want to logout?")) {
		
		window.location.href="userLogout";
	}
});

function loadJQuery() {
	var oScript = document.createElement("script");
	oScript.type = "text/javascript";
	oScript.charset = "utf-8";
	oScript.src = "http://code.jquery.com/jquery-1.6.2.min.js";
	document.getElementsByTagName("head")[0].appendChild(oScript);
}


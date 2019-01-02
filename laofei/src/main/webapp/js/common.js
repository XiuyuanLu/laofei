function redirect(path){
	location.href=path;
}

$(document).ready(function (){
	if(typeof(onLoad) != "undefined"){
		onLoad();
	}
});
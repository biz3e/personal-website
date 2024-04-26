/**
 * 
 */
function navToProject(project, location) {
	if (project == "QuickRoute" && location == "More"){
		window.location.href = "/quickroute";
	} else if (project == "QuickRoute" && location == "Github"){
		window.open("https://github.com/biz3e/QuickRoute-WebApp", "_blank").focus();
	} else if (project == "MazeGame" && location == "More"){
		window.location.href = "/mazegame";
	} else if (project == "MazeGame" && location == "Github"){
		window.open("https://github.com/biz3e/A-Maze-Game", "_blank").focus();
	} else if (project == "ThisWebsite" && location == "More"){
		window.location.href = "/thiswebsite";
	} else if (project == "ThisWebsite" && location == "Github"){
		window.open("https://github.com/biz3e/personal-website", "_blank").focus();
	} 
}

function toggleMobileMenu() {
	document.getElementById("navbar").classList.toggle("open");
	document.getElementById("hamburger").classList.toggle("open");
}


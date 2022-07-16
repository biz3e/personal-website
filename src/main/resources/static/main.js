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
	} 
}

function toggleMobileMenu(menu) {
	menu.classList.toggle("open");
}


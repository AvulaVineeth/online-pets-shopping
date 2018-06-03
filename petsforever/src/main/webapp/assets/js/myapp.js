$(function(){
	// solving the active menu problem
	switch(menu){
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Pets':
		$('#listPets').addClass('active');
		break;
	default:
		$('#listPets').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}
});
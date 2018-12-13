
window.onload = () => {
	$.ajax({
    	method: "GET",
    	url:	"https://euw1.api.riotgames.com/lol/status/v3/shard-data?api_key=RGAPI-36379283-87bf-4704-81e8-e337ec56af96"
    }).done((data) => {
    	setFields(data); 
    });	
};

function setFields(data) {
	let topLevelLength = Object.keys(data).length;
	
	let region		= data.name;
	let regionTag 	= data.region_tag;
	let hostname	= data.hostname;
	let locales		= data.locales;
	let slug		= data.slug;
	let services	= data.services;
	
	regionTag	= "Tag: " + regionTag;
	hostname	= "Hostname: " + hostname;
	slug		= "Slug: " + slug;
	
	$(".lgi-region").text(region);
	$(".lgi-region-regiontag").text(regionTag);
	$(".lgi-region-hostname").text(hostname);
	$(".lgi-region-locales").text("Locales: " + locales);
	$(".lgi-region-slug").text(slug);
	$(".lgi-region-services").text(" << See services list >> ");
	
	for(let locale of locales) {
		switch(locale) {
		case "en_GB":
			locale = "English";
			break;
		case "fr_FR":
			locale = "French"
			break;
		case "it_IT":
			locale = "Italian"
			break;
		case "es_ES":
			locale = "Spanish"
			break;
		case "de_DE":
			locale = "German"
			break;
		}
		$(".lgi-locales-list").append("<li class='list-group-item'>"+locale+"</li>");
	}
	
	for(let service of services) {
		$(".row").append("" +
			"<div class='card col-lg-4'>" +
				"<div class='card-header'>"+service.name+"</div>" +
				"<ul class='list-group list-group-flush lgi-services-list'>" +
					"<li class='list-group-item lgi-service-item'>"+service.status+"</li>" +
					"<button class='"+service.name+"-incidents btn btn-primary' type='button' data-toggle='modal' data-target='#incidents-modal'>Incidents</button>" +
				"</ul>" +
			"</div>"
		);
		
		if(service.status == "online") {
			$(".lgi-service-item").css("color", "green");
		}else{
			$(".lgi-service-item").css("color", "red");
		}
	}
	

	
}

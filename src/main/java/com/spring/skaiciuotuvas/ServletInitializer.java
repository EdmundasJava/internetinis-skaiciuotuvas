package com.spring.skaiciuotuvas;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
//servet yra java programos veikimui web serveryje
	//servet paleidziam kai vartotojas paspaudzia nuoroda
	//pateikia forma ar atlieka kito tipo veiksmus internetineje svetaineje

	//klijento uzklausa praeina per servlet kuris ji perduoda kontrolerio reqest maping atributelet
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(InternetinisSkaiciuotuvasApplication.class);
	}

}

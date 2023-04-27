package com.spring.skaiciuotuvas;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


//servet yra java programos veikimui web serveryje
    //servet paleidziam kai vartotojas paspaudzia nuoroda
    //pateikia forma ar atlieka kito tipo veiksmus internetineje svetaineje

    //klijento uzklausa praeina per servlet kuris ji perduoda kontrolerio reqest maping builet
    public class ServletInitializer extends SpringBootServletInitializer {
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(InternetinisSkaiciuotuvasApplication.class);

        }
    }



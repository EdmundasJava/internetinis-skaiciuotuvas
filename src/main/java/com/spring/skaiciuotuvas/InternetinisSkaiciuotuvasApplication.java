package com.spring.skaiciuotuvas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//si anotacija yra lygi @konfigacion @enablekonfigureisen @component scan
//si anotacija nurodoma klaseje  turincioje pagrindi main metode
@SpringBootApplication
public class InternetinisSkaiciuotuvasApplication {

	public static void main(String[] args) {

		SpringApplication.run(InternetinisSkaiciuotuvasApplication.class, args);
	}
//programos kontrole deleguojama statiniam clas metodui run
	//nurodant aplikacijos saknini komponenta root
	//spring karkasas paleis aplikacija ty startuos tomcat serveryje
}

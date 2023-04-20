package com.spring.skaiciuotuvas;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
//web controleris leidzia viduj naudoti @reqestMaping
//restcontoller anotacija nurodo, jog pvz string tipo rezuoltatas turi but spausdinamas klientuoi toks koks yra

@RestController
//zymi konfiguracijos komponenta viduje leidzia kuri bean per metodus su @bean anotacija
//si clas lygio anotacija nurodo spring karkasui "atspeti konfiguracija
//rementis prikausonybemis (jar bible kurias programuotojas itrauke iprpojekta pmxzl
//jis veikia su main metodu
@EnableAutoConfiguration
public class ControllerInternetinisSkaiciuotuvas {
    @RequestMapping(method = RequestMethod.GET, value = "/skaiciuoti")    //("/")interneto adresas
    //recestparam anotacija perduoda per URL perduotus duomenis (du sk ir oeracijos zenkla kurie patalpinami i sarasa(raktas reiksme)
    public String skaiciuoti(@RequestParam HashMap<String, String> skaiciai) {
        //pirmas stringas yra rakta(sk1,sk2 zenklas, o antras reiksme 8,5,+
        //raktai tiek frontende ir bekende turi sutapt

        //per url perduodamas raktas turi pavadinima - sk1
        //pagal rakta sk1 istraukiam reiksme pvz tarkim ivede 8
        //vadinasi reikia konvertuoti is stringo i int kad paskaiciuotu rezultata

     //   String zenklas = skaiciai.get("zenklas");
        //Todo suskaiciuoti ir atspausdinti rezultata, nurodant kas is ko gauta+
        int sk1 = Integer.parseInt(skaiciai.get("sk1"));
        int sk2 = Integer.parseInt(skaiciai.get("sk2"));
        String zenklas = skaiciai.get("zenklas");

        double ats = 0;
        if (zenklas.equals("+")) {
            ats = sk1 + sk2;
        } else if (zenklas.equals("-")) {
            ats = sk1 - sk2;
        } else if (zenklas.equals("*")) {
            ats = sk1 * sk2;
        } else if (zenklas.equals("/") && sk2 != 0) {
            ats = sk1 / sk2;
        }
        return sk1 + " " + zenklas + " " + sk2 + " = " + ats;





        //aplicacioncontext skirtas suteikti info apie aplikacijos kofiguracija
        //naudojama aplikacija paimama is beans.xmp failo

        // /  ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

        // /bean-clas objektas atitinka singelton sablona

        ///   HelloWorld bean = (HelloWorld) appContext.getBean("helloWorld");
        //  return bean.getHello();
        //  return "internetinis skaicuotuvas<p>" +
        //          "galimos operacijos:<br>" +
        //          "&nbsp;&nbsp; sudeti<br>" +
        //         "&nbsp;&nbsp; dauginti<br>" +
        //          "&nbsp;&nbsp; dalinti<br>" +
        //          "&nbsp;&nbsp; atimti<br><p>";

    }


}


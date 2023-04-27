package com.spring.skaiciuotuvas;


import jakarta.validation.Valid;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import java.util.HashMap;
//web controleris leidzia viduj naudoti @reqestMaping
//restcontoller anotacija nurodo, jog pvz string tipo rezuoltatas turi but spausdinamas klientuoi toks koks yra


//restkotroler anotacija naudojama tada kai frontende nenaudojam springo jav skript reakt regular
// dazniausiai grazinami formata json,xml
//tai yra negraziname vaizdo(formos html jsp)
//kadangi reikia grazinti vaizda viev naudosime anotacija @controler

@Controller
//zymi konfiguracijos komponenta viduje leidzia kuri bean per metodus su @bean anotacija
//si clas lygio anotacija nurodo spring karkasui "atspeti konfiguracija
//rementis prikausonybemis (jar bible kurias programuotojas itrauke iprpojekta pmxzl
//jis veikia su main metodu
@EnableAutoConfiguration
public class ControllerInternetinisSkaiciuotuvas {

    //kadangi skaicuotuvo forma naudoja post metoda  tai (skaiciuoti vaizas) irgi nurodysim post
    @PostMapping("/skaiciuoti")
    //("/")interneto adresas  //((method = RequestMethod.POST, value =iskeliau is skliasteliu))
    //recestparam anotacija perduoda per URL perduotus duomenis (du sk ir oeracijos zenkla kurie patalpinami i sarasa(raktas reiksme)


    public String skaiciuoti(
            //bindingRezult turi eiti iskart po anotacijos @Valid
            @Valid @ModelAttribute("number") Number numb, BindingResult bindingResult,
            @RequestParam HashMap<String, String> ivedimoSarasas, ModelMap isvedimoSarasas) {
        //jei validacijos klaidos zrek i Number cllas aprasyta validacija
        if (bindingResult.hasErrors()) {
            //vartotojas puslapyje lieka tol kol neistaiso klaidu
            return "skaiciuotuvas";
        } else


            return "skaiciuotuvas";
        //pirmas stringas yra rakta(sk1,sk2 zenklas, o antras reiksme 8,5,+
        //raktai tiek frontende ir bekende turi sutapt

        //per url perduodamas raktas turi pavadinima - sk1
        //pagal rakta sk1 istraukiam reiksme pvz tarkim ivede 8
        //vadinasi reikia konvertuoti is stringo i int kad paskaiciuotu rezultata

        //   String zenklas = skaiciai.get("zenklas");
        //Todo suskaiciuoti ir atspausdinti rezultata, nurodant kas is ko gauta+


    int sk1 = Integer.parseInt(ivedimoSarasas.get("sk1"));
    int sk2 = Integer.parseInt(ivedimoSarasas.get("sk2"));
    String zenklas = ivedimoSarasas.get("zenklas");


    double ats = 0;
        if(zenklas.equals("+"))

    {
        ats = sk1 + sk2;
    } else if(zenklas.equals("-"))

    {
        ats = sk1 - sk2;
    } else if(zenklas.equals("*"))

    {
        ats = sk1 * sk2;
    } else if(zenklas.equals("/")&&sk2 !=0)

    {
        ats = sk1 / sk2;
    }


    //Ivedimo sarasas naudojamas siusti duomenis is spring mvc controlerio i jsp faila (vaizda)
        isvedimoSarasas.put("sk1",sk1);
        isvedimoSarasas.put("sk2",sk2);
        isvedimoSarasas.put("zenklas",zenklas);
        isvedimoSarasas.put("rezultatas",ats);

    //gazinamas vaizdas(forma)
    //svarbu nurodyti aplicaisen.propertis prefix ir suffix
    //nes tada grazins vaizda projekte

        return"skaiciuoti";
}


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



@GetMapping(method = RequestMethod.POST, value = "/")
public String rodytiNamuPuslapi(Model model){
        //jegu Mdell "nunber claseje "nepreina vlidacijos tai jis grazina i Viev
        model.addAttribute("number",new Number());

        //graziname jsp faila kuris turi buti talpinama  "webapp -> WEB-INF ->  JSP" aplankas
        return"skaiciuotuvas";

        }


        }


//<groupId>jakarta.servlet</groupId>
//            <artifactId>jakarta.servlet-api</artifactId>
//            <version>6.0.0</version>
//            <scope>provided</scope>


//<dependency>
//            <groupId>org.springframework</groupId>
//            <artifactId>spring-web</artifactId>
//            <version>6.0.7</version>
//        </dependency>
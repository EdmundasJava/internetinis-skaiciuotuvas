package com.spring.skaiciuotuvas;

import jakarta.validation.constraints.Min;

public class Number {

    @Min(value= 0,message= "validacijos klaida skaicius negali buti neigiamas")
    private int  sk1;
    @Min(value= 0,message= "validacijos klaida skaicius negali buti neigiamas")
    private int sk2;
    private String veiksmas;
    private int rezultatas;

    public Number(int sk1, int sk2, String veiksmas, int rezultatas) {
        this.sk1 = sk1;
        this.sk2 = sk2;
        this.veiksmas = veiksmas;
        this.rezultatas = rezultatas;

    }

    public int getSk1() {
        return sk1;
    }

    public void setSk1(int sk1) {
        this.sk1 = sk1;
    }

    public int getSk2() {
        return sk2;
    }

    public void setSk2(int sk2) {
        this.sk2 = sk2;
    }

    public String getVeiksmas() {
        return veiksmas;
    }

    public void setVeiksmas(String veiksmas) {
        this.veiksmas = veiksmas;
    }

    public int getRezultatas() {
        return rezultatas;
    }

    public void setRezultatas(int rezultatas) {
        this.rezultatas = rezultatas;
    }

    @Override
    public String toString() {
        return "Number{" +
                "sk1=" + sk1 +
                ", sk2=" + sk2 +
                ", veiksmas='" + veiksmas + '\'' +
                ", rezultatas=" + rezultatas +
                '}';
    }

    //butinas naudojant spring karkasa
    public Number() {



    }
}

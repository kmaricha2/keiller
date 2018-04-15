package com.example.keiller.Listview;

import java.util.ArrayList;

/**
 * Created by KEILLER on 14/04/2018.
 */

//Aqui almacenaremos los datos
public class Datos {

    private static ArrayList<Operaciones> op = new ArrayList<>();

    public static void GuardarOperacion(Operaciones p){
        op.add(p);
    }

    public static ArrayList<Operaciones> Obtener(){
        return  op;
    }

public static String CalcularAreaCuadrado(double l){
    String Res = "" + (l * l);
    Operaciones x = new Operaciones("Area del Cuadrado","Lado : "+l,Res);
    GuardarOperacion(x);
    return Res;
}

    public static String CalcularAreaTriangulo(double b, double h){
        double Res = (b * h)/2;
        String datos = "Base : " + b +" - Altura: "+ h;
        Operaciones x = new Operaciones("Area del Triangulo",datos,Res+"");
        GuardarOperacion(x);
        return Res+"";
    }
    public static String CalcularAreaRectangulo(double a, double b){
        double Res = a * b;
        String datos = "Lado A : " + a +" - Lado B: "+ b;
        Operaciones x = new Operaciones("Area del Rectangulo",datos,Res+"");
        GuardarOperacion(x);
        return Res+"";
    }
    public static String CalcularAreaCirculo(double r){
        double Res = 3.14 * (r * r);
        Operaciones x = new Operaciones("Area del Circulo:","Radio : "+r,Res+"");
        GuardarOperacion(x);
        return Res + "";
    }

    public static String CalcularVolumenEsfera(double r){
        double Res = (4 * 3.14 * (r*r*r))/3;
        Res = Res*100;
        Res = java.lang.Math.round(Res);
        Res = Res/100;
        String datos = "Radio : " + r;
        Operaciones x = new Operaciones("Volumen Esfera",datos,Res+"");
        GuardarOperacion(x);
        return Res+"";
    }
    public static String CalcularVolumenCilindro(double r,double a){
        double Res = 3.14 * (r*r) * a;
        Res = Res*100;
        Res = java.lang.Math.round(Res);
        Res = Res/100;
        String datos = "Radio : " + r + " - "+"Atlura : " + a;
        Operaciones x = new Operaciones("Volumen Cilindro",datos,Res+"");
        GuardarOperacion(x);
        return Res+"";
    }
    public static String CalcularVolumenCono(double r,double a){
        double Res = (3.14 * (r*r) * a)/3;
        Res = Res*100;
        Res = java.lang.Math.round(Res);
        Res = Res/100;
        String datos = "Radio : " + r + " - "+"Atlura : " + a;
        Operaciones x = new Operaciones("Volumen Cono",datos,Res+"");
        GuardarOperacion(x);
        return Res+"";
    }

    public static String CalcularVolumenCubo(double r){
        double Res = (r*r*r);
        String datos = "Arista : " + r ;
        Operaciones x = new Operaciones("Volumen Cubo",datos,Res+"");
        GuardarOperacion(x);
        return Res+"";
    }
}
//Gracias Keiller por esta obra de arte k
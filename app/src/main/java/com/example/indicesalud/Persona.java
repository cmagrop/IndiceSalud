package com.example.indicesalud;

public class Persona {
    //atributos
    String rut;
    String nombre;
    int edad;
    double altura,peso;


    //métodos /funciones / acciones / procedimientos

    //método que retorna el valor del IMC
    public double IMC()
    {

        double imc; //variable local
        imc = this.peso/(this.altura*this.altura);
        //imc = this.peso/Math.pow(this.altura,2);
        return imc;
    }

    public void Verificar()
    {
        System.out.println("Rut: "+this.rut);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Altura: "+this.altura);
        System.out.println("Peso: "+this.peso);

    }


    public void Clasificacion(double imc)
    {
        System.out.println("Clasificacion IMC "+imc);

        //condiciones para mostrar la clasificación
        if(imc<16.0)
            System.out.println("INFRAPESO: Delgadez Severa");
        else if(imc>=16.0 && imc<=16.99)
            System.out.println("INFRAPESO: Delgadez Moderada");
        else if(imc>=17.0 && imc<=18.49)
            System.out.println("INFRAPESO: Delgadez Aceptable");
        else if(imc>=18.5 && imc<=24.99)
            System.out.println("Peso Normal");
        else if(imc>=25.0 && imc<=29.99)
            System.out.println("Sobrepeso");
        else if(imc>=30.0 && imc<=34.99)
            System.out.println("OBESO: Tipo I");
        else if(imc>=35.0 && imc<=40.0)
            System.out.println("OBESO: Tipo II");
        else
            System.out.println("OBESO: Tipo III");




    }


    public void Imprimir()
    {
        double imc_local = IMC(); //guarda el valor de retorno del metodo IMC()
        System.out.println("el IMC es "+imc_local);
        Clasificacion(imc_local); //llama al método Clasificacion y manda el imc_local

    }

    //constructores

    public Persona()
    {

    }

    public Persona(String rut, String nombre,int edad,double altura,double peso)
    {

        this.rut=rut;
        this.nombre=nombre;
        this.edad = edad;
        this.altura= altura;
        this.peso = peso;
    }





}


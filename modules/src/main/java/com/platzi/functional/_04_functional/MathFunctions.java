package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };
        System.out.println(square.apply(5));
        System.out.println(squareFunction(10));

        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;
        Predicate<Integer> isEven = x -> x %2 ==0;
        isEven.test(4); // Debe devolver un true
        //Función para determinar si un estudiante aprueba o no.
        Predicate<Estudiante> isAprovedd = estudiante -> estudiante.getCalificacion() >=6.0;
        Estudiante Alexis = new Estudiante(4);
        System.out.println(isAprovedd.test(Alexis));
    }
     static int squareFunction(int x){
        return x*x;
    }

    static class Estudiante{
        private double calificacion;

        public Estudiante(double calificacion){
            this.calificacion = calificacion;
        }
        public double getCalificacion(){
            return calificacion;
        }
    }
}

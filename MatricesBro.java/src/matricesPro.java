import java.util.Scanner;

public class matricesPro {
    public static byte opc, filasAd,columAd, filasBc,columBc, escalar, opc2 ;
    public static boolean comparar;
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("¿Que tipo de operación desea hacer?\n" +
                            "1) Igualdad de matrices\n" +//si
                            "2) Suma de matrices\n" +//si
                            "3) Generar matriz de 0\n" +//si
                            "4) Inverso aditivo de una matriz\n"+//si
                            "5) Resta de matrices\n" +//si
                            "6) Multiplicacion por un escalar\n" +//si
                            "7) Multiplicacion de matrices - Recuerde que esto se efectua si las columnas de la matriz A son iguales a las filas de B. \n"+
                            "8)Matriz identidad\n"+
                            "9)Matriz inversa\n"+
                            "10)Determinante de una matriz\n");

        do {
           opc = scan.nextByte(); 
        } while (opc < 1 || opc >= 10);

        System.out.println("Ingrese las filas que tendra la matriz A: ");
                do {
                    filasAd = scan.nextByte(); 
                } while (filasAd <= 0);
                System.out.println("Ingrese las columnas que tendra la matriz A: ");
                do {
                    columAd = scan.nextByte(); 
                } while (columAd <= 0);
        System.out.println("Ingrese las filas que tendra la matriz B: ");
                do {
                    filasBc = scan.nextByte(); 
                } while (filasBc <= 0);
                System.out.println("Ingrese las columnas que tendra la matriz B: ");
                do {
                    columBc = scan.nextByte(); 
                } while (columBc <= 0);
                int [][] matrizA = new int[filasAd][columAd];
                int [][] matrizB = new int[filasBc][columBc];
                int [][] resultado = new int[filasAd][columAd];

        switch (opc) {
            case 1:
             System.out.println(":::::::::::::::::::::::::::::::::");
            System.out.println("IGUALDAD DE MATRICES");

                System.out.println("Ingrese los elementos de la matriz A: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        System.out.print("Matriz A [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextInt();
                    }
                }
                
                System.out.println("Ingrese los elementos de la matriz B: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        System.out.print("Matriz B [" + i + "," + j + "] = ");
                        matrizB[i][j] = scan.nextInt();
                    }
                }
                System.out.println(":::::::::::::::::::::::::::::::::");
                
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        if (matrizA[i][j] != matrizB[i][j]) {
                            comparar = false;      
                        }else{
                            comparar = true;
                        }
                    }
                }
                if (comparar) {
                    System.out.println("Las matrices son iguales");
                }else{
                    System.out.println("Las matrices no son iguales");
                }
                
            break;

            case 2:
            System.out.println(":::::::::::::::::::::::::::::::::");
            System.out.println("SUMA DE MATRICES");
                
                if (filasAd == filasBc && columAd == columBc) {
                System.out.println("Ingrese los elementos de la matriz: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        System.out.print("Matriz A [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextInt();
                    }
                }
                System.out.println("Ingrese los elementos de la matriz: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        System.out.print("Matriz B [" + i + "," + j + "] = ");
                        matrizB[i][j] = scan.nextInt();
                    }
                }
                System.out.println(":::::::::::::::::::::::::::::::::");
                System.out.println("La suma de A y B es: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        resultado[i][j] = matrizA[i][j] + matrizB[i][j];
                        System.out.print(resultado[i][j] + "\t");
                    }
                    System.out.println();
                }
                } else {
                    System.out.println("Para poder sumar las matrices deben tener las mismas dimensiones");
                }
                

                break;

            case 3:

            System.out.println("Ingrese los elementos de la matriz: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        System.out.print("Matriz  [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextInt();
                    }
                }

                System.out.println(":::::::::::::::::::::::::::::");
                System.out.println("La matriz nula es: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        resultado[i][j] = matrizA[i][j] * 0;
                        System.out.print(resultado[i][j] + "\t");
                    }
                    System.out.println();
                }
                // for (int i = 0; i < filasAd; i++) {
                //     for (int j = 0; j < columAd; j++) {
                //         resultado[i][j] = matrizA[i][j] * 0 ;
                //         System.out.println(resultado[i][j] + "\t" );
                //     }
                // System.out.println();
                // }


                break;

            case 4:

            System.out.println("Ingrese los elementos de la matriz: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        System.out.print("Matriz  [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextInt();
                    }
                }

                System.out.println(":::::::::::::::::::::::::::::");
                System.out.println("La matriz nula es: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        resultado[i][j] = matrizA[i][j] * -1;
                        System.out.print(resultado[i][j] + "\t");
                    }
                    System.out.println();
                    }

                break;

            case 5:

            System.out.println(":::::::::::::::::::::::::::::::::");
            System.out.println("RESTA DE MATRICES");
              
                if (filasAd == filasBc && columAd == columBc) {
                System.out.println("Ingrese los elementos de la matriz: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        System.out.print("Matriz A [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextInt();
                    }
                }
                
                System.out.println("Ingrese los elementos de la matriz: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        System.out.print("Matriz B [" + i + "," + j + "] = ");
                        matrizB[i][j] = scan.nextInt();
                    }
                }
                System.out.println(":::::::::::::::::::::::::::::::::");
                System.out.println("La resta de A y B es: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        resultado[i][j] = matrizA[i][j] - matrizB[i][j];
                        System.out.print(resultado[i][j] + "\t");
                    }
                    System.out.println();
                }
                } else {
                    System.out.println("Para poder restar las matrices deben tener las mismas dimensiones");
                }

                break;

            case 6:

                System.out.println("::::::::::::::::::::::::::::::::");
                System.out.println("MULTIPLICACION DE MATRIZ POR UN ESCALAR");

                System.out.print("Ingrese una de las opciones siguientes: 1.Matriz A 2.Matriz B: ");
                opc2 = scan.nextByte();

                switch(opc2){
                    case 1:
                    System.out.println("Ingrese el escalar por el cual multiplicar la matriz:");
                        escalar = scan.nextByte();

                        System.out.println("Ingrese los elementos de la matriz: ");

                        if (matrizA.length < 20) {
                            for (int i = 0; i < matrizA.length; i++) { // Corrección 1: Cambia "i <= matrizA.length" a
                                                                       // "i < matrizA.length"
                                for (int j = 0; j < matrizA[0].length; j++) { // Corrección 2: Cambia "j <=
                                                                              // matrizA.length" a "j <
                                                                              // matrizA[0].length"
                                    System.out.print("Matriz [" + i + "-" + j + "] = ");
                                    matrizA[i][j] = scan.nextInt();
                                }
                            }

                            System.out.println(":::::::::::::::::::::::::::::::::");
                            System.out.println("La multiplicación es: ");

                            for (int i = 0; i < filasAd; i++) {
                                for (int j = 0; j < columAd; j++) {
                                    matrizA[i][j] *= escalar;
                                    System.out.print(matrizA[i][j] + "\t");
                                }
                                System.out.println();
                            }
                        }
                    break;

                    case 2:
                        
                        System.out.println("Ingrese el escalar por el cual multiplicar la matriz:");
                        escalar = scan.nextByte();

                        System.out.println("Ingrese los elementos de la matriz: ");

                        if (matrizB.length < 20) {
                            for (int i = 0; i < matrizB.length; i++) { // Corrección 1: Cambia "i <= matrizA.length" a
                                                                       // "i < matrizA.length"
                                for (int j = 0; j < matrizB[0].length; j++) { // Corrección 2: Cambia "j <=
                                                                              // matrizA.length" a "j <
                                                                              // matrizA[0].length"
                                    System.out.print("Matriz [" + i + "-" + j + "] = ");
                                    matrizB[i][j] = scan.nextInt();
                                }
                            }

                            System.out.println(":::::::::::::::::::::::::::::::::");
                            System.out.println("La multiplicación es: ");

                            for (int i = 0; i < filasBc; i++) {
                                for (int j = 0; j < columBc; j++) {
                                    matrizB[i][j] *= escalar;
                                    System.out.print(matrizB[i][j] + "\t");
                                }
                                System.out.println();
                            }
                        }
                    break;
                
            case 7:
                
                System.out.println(":::::::::::::::::::::::::::::::::");
                System.out.println("MULTIPLICACION DE MATRICES");


                        System.out.println("Ingrese los elementos de la matriz A: ");

                        if(columAd != filasBc){
                            System.out.println("No se puede realizar la multiplciacion:");
                        }else if(columAd == filasBc){

                            for (int i = 0; i < matrizA.length; i++) { // Corrección 1: Cambia "i <= matrizA.length" a
                                                                       // "i < matrizA.length"
                                for (int j = 0; j < matrizA[0].length; j++) { // Corrección 2: Cambia "j <=
                                                                              // matrizA.length" a "j <
                                                                              // matrizA[0].length"
                                    System.out.print("Matriz [" + i + "-" + j + "] = ");
                                    matrizA[i][j] = scan.nextInt();
                                }
                            }
                
                            System.out.println("Ingrese los elementos de la matriz B: ");

                            for (int i = 0; i < matrizB.length; i++) { // Corrección 1: Cambia "i <= matrizA.length" a
                                                                       // "i < matrizA.length"
                                for (int j = 0; j < matrizB[0].length; j++) { // Corrección 2: Cambia "j <=
                                                                              // matrizA.length" a "j <
                                                                              // matrizA[0].length"
                                    System.out.print("Matriz [" + i + "-" + j + "] = ");
                                    matrizB[i][j] = scan.nextInt();

                                    }
                                }
                            }
                
                break;

            case 8:

                break;

            case 9:

                break;

            case 10:

                break;

            }
            
            //do while para poder reiniciar el menu denuevo
        }
        

    }

}

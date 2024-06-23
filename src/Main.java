import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();


        int opcion=9999;
        int cantidadConvertir;

        double tasaCambioUSD_ARS = Double.valueOf(consulta.monedaUSD_ARS("USD").conversion_rate());
        double tasaCambioARS_USD = Double.valueOf(consulta.monedaARS_USD("USD").conversion_rate());

        double tasaCambioUSD_BRL = Double.valueOf(consulta.monedaUSD_BRL("COP").conversion_rate());
        double tasaCambioBRL_USD = Double.valueOf(consulta.monedaBRL_USD("ARS").conversion_rate());

        double tasaCambioUSD_COP = Double.valueOf(consulta.monedaUSD_COP("BRL").conversion_rate());
        double tasaCambioCOP_USD = Double.valueOf(consulta.monedaCOP_USD("COP").conversion_rate());

        while (opcion!=8){


            try {
                System.out.println("""
                        
                        ***************************************************
                        Bienvenido al Conversor de Moneda!!!                       
                     
                        1) Dolar [USD] ==> Peso argentino [ARS]
                        2) Peso argentino [ARS] ==> Dolar [USD]
                        3) Dolar [USD] ==> Real brasileño [BRL]
                        4) Real brasileño [BRL] ==> Dolar [USD]
                        5) Dolar [USD] ==> Peso colombiano [COP]
                        6) Peso colombiano [COP]] ==> Dolar [USD]
                        7) Salir
                        
                        Elije una opcion valida de la  lista anterior:
                                                                                  """);

                opcion = lectura.nextInt();

                switch (opcion){
                    case 1:
                        System.out.println("Introduce la cantidad de dolares [USD] que quieres convertir a pesos argentinos [ARS]");
                        cantidadConvertir = lectura.nextInt();
                        System.out.println("La cantidad de "+cantidadConvertir+" [USD] en pesos argentinos[ARS] es igual a: "+cantidadConvertir * tasaCambioUSD_ARS);
                        break;
                    case 2:
                        System.out.println("Introduce la cantidad de pesos argentinos [ARS] que quieres convertir a dolares [USD]");
                        cantidadConvertir = lectura.nextInt();
                        System.out.println("La cantidad de "+cantidadConvertir+" [ARG] en dolares[USD] es igual a: "+cantidadConvertir * tasaCambioARS_USD);
                        break;
                    case 3:
                        System.out.println("Introduce la cantidad de dolares [USD] que quieres convertir a real brasileño [BRL]");
                        cantidadConvertir = lectura.nextInt();
                        System.out.println("La cantidad de "+cantidadConvertir+" [USD] en real brasileño [BRL] es igual a: "+cantidadConvertir * tasaCambioUSD_BRL);
                        break;
                    case 4:
                        System.out.println("Introduce la cantidad de real brasileño [BRL] que quieres convertir a dolares [USD]");
                        cantidadConvertir = lectura.nextInt();
                        System.out.println("La cantidad de "+cantidadConvertir+" [BRL] en dolares[USD] es igual a: "+cantidadConvertir * tasaCambioBRL_USD);
                        break;
                    case 5:
                        System.out.println("Introduce la cantidad de dolares [USD] que quieres convertir a pesos colombianos[COP]");
                        cantidadConvertir = lectura.nextInt();
                        System.out.println("La cantidad de "+cantidadConvertir+" [USD] en pesos colombianos[COP] es igual a: "+cantidadConvertir * tasaCambioUSD_COP);
                        break;
                    case 6:
                        System.out.println("Introduce la cantidad de pesos colombianos[COP] que quieres convertir a dolares [USD]");
                        cantidadConvertir = lectura.nextInt();
                        System.out.println("La cantidad de "+cantidadConvertir+" [COP] en pesos colombianos[COP] es igual a: "+cantidadConvertir * tasaCambioCOP_USD);
                        break;
                    case 7:
                        System.out.println("Gracias por usar nuestro convertidor. Vuelve cuando desees!!!");
                        opcion=8;
                        break;
                }




            } catch (NumberFormatException e){
                System.out.println("Escoge un numero que se muestra en la lista");
            }
        catch ( RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando el conversor.");
            }
        }



    }
}
/* 8)En una industria se fabrican planchas regulares que se venden en lotes de 10 planchas. Una plancha se considera defectuosa si su superficie (ancho* largo) es inferior a 4.4 mts cuadrados, y se considera buena si es superior. Un lote se considera defectuoso si tiene una o más planchas defectuosas, y bueno si todas sus planchas son buenas. Se dispone de los datos sobre el ancho y el largo de 500 planchas correspondientes a 50 lotes. Escribe un diagrama que lea dichos datos (ancho y largo de las planchas) y escriba:
 El número de los lotes buenos 
 La superficie media de todas las planchas de lotes buenos 
Sacchetti Maria Giselle C2*/

public class Main {
  public static void main(String[] args) {
   
    int ancho, largo, superficie, contador, contador2;
    contador = 0;
    contador2 = 0;
    for (int i = 1; i <= 50; i++) {
      System.out.println("Ingrese el ancho de la plancha: ");
      ancho = Integer.parseInt(System.console().readLine());
      System.out.println("Ingrese el largo de la plancha: ");
      largo = Integer.parseInt(System.console().readLine());
      superficie = ancho * largo;
      if (superficie < 44) {
        contador = contador + 1;
      } else {
        contador2 = contador2 + 1;
      }
    }
    System.out.println("El numero de lotes buenos es: " + contador2);
    System.out.println("La superficie media de los lotes buenos es: " + contador2 / 50);

  }

}
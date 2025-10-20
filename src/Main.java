import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    double rentbook= 1.5;

    double rentgame= 3.5;

    double rentalbum= 1.75;

    double rentfilm= 2;
    public static void main(String[] args) {

        //ejercicio 1
        System.out.println("Bien venido al ejercicio 1");
        //Variables string
        String Book="El Sirmarillion";

        String Game="Elden Ring";

        String Album="Thriller";

        String Film="Harry Potter: Y el prisionero de Azkaban";

        //Variables fechas
        int Fechabook= 1977;

        int Fechagame= 2022;

        int Fechaalmbum= 1982;

        int Fechafilm=2004;

        //Variables alquiler
        double rentbook= 1.5;

        double rentgame= 3.5;

        double rentalbum= 1.75;

        double rentfilm= 2;

        // Respuesta segun lo que respondan.
        String answer1 = "Entoces te llevas el "+ Book + " que salió en " +Fechabook+ " y su precio por dia de alquiler es " + rentbook + "€/dia";

        String answer2 = "Entoces te llevas el "+ Game + " que salió en " +Fechagame+ " y su precio por dia de alquiler es " + rentgame + "€/dia";

        String answer3 = "Entoces te llevas el "+ Album + " que salió en " +Fechaalmbum+ " y su precio por dia de alquiler es " + rentalbum + "€/dia";

        String answer4 = "Entoces te llevas el "+ Film + " que salió en " +Fechafilm+ " y su precio por dia de alquiler es " + rentfilm + "€/dia";


        //scanner y pedida por escaner al cliente
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola Buenas Tardes.");
        System.out.println("En nuestro catalogo tenermos el album 'Thriller', la pelicula 'Harry Potter y el prisionero de Azkaban' el juego 'Elden Ring' o el libro 'El Sirmarillion'.");
        System.out.println("¿Que quieres alquilar el juego, la pelicula, el libro o el album?.");
        //Recogida de respuesta del usuario en terminal
        String Respuesta = sc.nextLine();
        //Condiciones para responderle según lo que pida
        switch (Respuesta) {
            case "Libro", "libro", "El libro", "EL LIBRO", "el libro" -> System.out.println(answer1);
            case "Juego", "El juego", "juego", "EL JUEGO", "el juego" -> System.out.println(answer2);
            case "Album", "El album", "album", "EL ALBUM", "el album" -> System.out.println(answer3);
            case "Pelicula", "La pelicula", "pelicula", "LA PELICULA", "Peli", "La peli", "peli", "LA PELI",
                 "la peli" -> System.out.println(answer4);
            default -> System.out.println("No tenemos esos articulos aqui");
        }

        // Ejercicio 2
        System.out.println("Bienvenido al ejercicio 2");
        // Pregunta y recogida de que cantidad de articulos se ha alquilado de cada tipo

        System.out.println("¿Cuantos libros se han alquilado?");
        int canbook= sc.nextInt();
        System.out.println("¿Cuantos juegos se han alquilado?");
        int cangame= sc.nextInt();
        System.out.println("¿Cuantos albumes se han alquilado?");
        int canalbum= sc.nextInt();
        System.out.println("¿Cuantas peliculas se han alquilado?");
        int canfilm= sc.nextInt();
        //Serie de condiciones para qeu digas palabras plurales o singulares segun la respuesta del usuario
        if(canbook==1){
            System.out.println("Se ha comprado 1 libro"+"\n");

        }
        else System.out.println("Se ha comprado "+ canbook+"Libros"+"\n");
        if (cangame==1){
        System.out.println(cangame + " juego"+"\n");
        }else System.out.println(cangame+" juegos"+"\n");
        if (canalbum==1){
        System.out.println(canalbum + " album"+"\n");
        }else System.out.println(canalbum + "  albumes"+"\n");
        System.out.println("Y "+canfilm+"  peliculas"+"\n");
        //Calculo de las ganancias del día
        double total= ((canbook*rentbook) + (cangame*rentgame) + (canalbum*rentalbum) + (canfilm*rentfilm));
        System.out.println("La cantidad total de ganancias de hoy es de " + total+"\n");


        //Ejercicio 3
        System.out.println("Bienvenido al ejercicio 3");
        //declarar variables a ver cuantos productos quiere el cliente
        System.out.println("Hola, hoy es un dia donde tenemos descuento especiales"+"\n");
        System.out.println("Los descuentos son de 10% en libros, 15% en juegos, 25% en albumes y 5% en peliculas"+"\n");
        String catalogo="Juego: Elden Ring, Libro: El Sirmarillion, Album: Thriller, y pelicla: Harry Potter y el prisionero de Azkaban"+"\n";
        System.out.println("Esto son los articulos que tenemos en nuestro catalogo querrias");
        System.out.println(catalogo);
        System.out.println("¿Cuantos libros se han alquilado?");
        int canbook2= sc.nextInt();
        System.out.println("¿Cuantos juegos se han alquilado?");
        int cangame2= sc.nextInt();
        System.out.println("¿Cuantos albumes se han alquilado?");
        int canalbum2= sc.nextInt();
        System.out.println("¿Cuantas peliculas se han alquilado?");
        int canfilm2= sc.nextInt();

        //Declarar las variables de descuento
        double descbook= 10;
        double descgame=15;
        double descalbum=25;
        double descfilm=5;
        //Declarao las variables donde calculare el precio de los articulos que se lleva, y el precio aplicando los descuentos
        double totalbook= rentbook*canbook2;
        double destotalbook= totalbook-totalbook*(descbook/100);
        System.out.println("\n"+"Has comprado un total de "+canbook2+" libros por lo que el precio total es " +totalbook+ " y el precio con descuento es "+destotalbook);
        double totalgame= rentgame*cangame2;
        double destotalgame= totalgame-totalgame*(descgame/100);
        System.out.println("\n"+"Has comprado un total de "+cangame2+" juegos por lo que el precio total es " +totalgame+ " y el precio con descuento es "+destotalgame);
        double totalalbum= rentalbum*canalbum2;
        double destotalalbum= totalalbum-totalalbum*(descalbum/100);
        System.out.println("\n"+"Has comprado un total de "+canalbum2+" albumes por lo que el precio total es " +totalalbum+ " y el precio con descuento es "+destotalalbum);
        double totalfilm= rentfilm*canfilm2;
        double destotalfilm= totalfilm-totalfilm*(descfilm/100);
        System.out.println("\n"+"Has comprado un total de "+canfilm2+" peliculas por lo que el precio total es " +totalfilm+ " y el precio con descuento es "+destotalfilm);
        //Aqui hago el calculo total de lo que se ha comprado, con y sin descuento y lo muestro
        double preciototal= totalbook+totalfilm+totalalbum+totalgame;
        double despreciototal= destotalbook+destotalfilm+destotalalbum+destotalgame;
        System.out.println("\n"+"El total de todo lo comprado es " + preciototal+"€");
        System.out.println("\n"+"El precio aplicando descuentos es "+ despreciototal+"€");

        //Ejercicio 4
        System.out.println("\n"+"Bienvenido al ejercicio 4");
        //Hacemos la media de los precios con una operacion sencilla y la mostramos
        double mediaprice= (rentbook+rentgame+rentalbum+rentfilm)/4;
        System.out.println("Vasmos a enseñarte la media de los precios que tenemos");
        System.out.println("Los precios son, de libros "+rentbook+"€ de juegos "+rentgame+"€ el de las peliculas es "+rentfilm+ "€ y el de los albumes es "+rentalbum+"€");
        System.out.println("La media de los precios de la tienda es "+mediaprice+"€"+"\n");

        //Ejercicio 5
        System.out.println("Bienvenido al ejercicio 5");
        //Vamos a coger los articulos para el ejercicio 2
        System.out.println("\n"+"Vamos a utilizar la cantidad de articulos del ejercicio 2");
        //Declarar total de articulos
        double totalart= canbook+canalbum+canfilm+cangame;
        System.out.println("Total Articulos: "+totalart);
        //Calcularemos el porcentaje de cada articulo con regla de 3 basica
        double porcbook= (canbook*100)/totalart;
        System.out.println("Libros: "+porcbook+"%");
        double porcalbum= (canalbum*100)/totalart;
        System.out.println("Albumes: "+porcalbum+"%");
        double porfilm= (canfilm*100)/totalart;
        System.out.println("Peliculas: "+porfilm+"%");
        double porfgame= (cangame*100)/totalart;
        System.out.println("Juegos: "+porfgame+"%");
    }
}


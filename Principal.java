public class Principal {
    public static void main(String[] args) {
        pelicula miPelicula = new pelicula(); //Nueva Película
        miPelicula.nombre = "Interestelar";
        miPelicula.fechaDeLanzamiento = 2014;
        miPelicula.duracionEnMinutos = 169;
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.totalEvaluaciones);
        System.out.println(miPelicula.calculaMedia());
        System.out.println();

        pelicula otraPelicula = new pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1999;
        otraPelicula.duracionEnMinutos = 150;
        //otraPelicula.muestraFichaTecnica();

    }
}

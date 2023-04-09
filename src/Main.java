public class Main {
    public static void main(String[] args) {
        int suma = sumar(2,1,3);
        System.out.println(suma);

        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.getNumPuertas());

    }

    public static int sumar (int a, int b, int c) {
        return a + b + c;
    }


}
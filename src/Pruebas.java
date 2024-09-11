public class Pruebas {
    public static void main(String[] args) {
        MapaEstatico <Integer,Integer> dicc = new MapaEstatico<>();
        System.out.println("Cantidad de claves = " + dicc.largo());
        System.out.println(dicc.toString());
        dicc.agregar(10,10);
        System.out.println("Cantidad de claves = " + dicc.largo());
        System.out.println(dicc.toString());
        dicc.agregar(10,-10);
        System.out.println("Cantidad de claves = " + dicc.largo());
        System.out.println(dicc.toString());
        for(int i=11; i<21;i++)
            dicc.agregar(i,0);
        
        System.out.println("Cantidad de claves = " + dicc.largo());
        System.out.println(dicc.toString());
        System.out.println("Está definida la clave 20? " + dicc.contieneClave(20));

        System.out.println("Está definida la clave -111? " + dicc.contieneClave(-111));
        System.out.println("El valor de la clave 14 es: " + dicc.obtener(14));
        System.out.println("El valor 90 está en el diccionario? " + dicc.contieneValor(0));
        
        System.out.println(dicc.remover(16));
        System.out.println("Cantidad de claves = " + dicc.largo());
        System.out.println(dicc.toString());
        
        System.out.println(dicc.remover(20));
        System.out.println("Cantidad de claves = " + dicc.largo());
        System.out.println(dicc.toString());

        System.out.println(dicc.remover(10));
        System.out.println("Cantidad de claves = " + dicc.largo());
        System.out.println(dicc.toString());
        
        for(int i=11;i <= 15;i++){
            System.out.println(dicc.remover(i));
            System.out.println("Cantidad de claves = " + dicc.largo());
            System.out.println(dicc.toString());
        }
        
    }
}

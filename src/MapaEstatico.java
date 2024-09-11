import java.util.Arrays;

public class MapaEstatico<K, V> implements Mapa<K,V> {
    private static final int LONG_DEFAULT = 10;
    private static final int LONGITUD_AUMENTO = 2;
    private K[] claves;
    private V[]  significados;
    private Integer cantElems;
    
    MapaEstatico (){
       claves = (K[]) new Object[LONG_DEFAULT];
       significados = (V[]) new Object[LONG_DEFAULT];
       cantElems = 0;  
    }

    @Override
    public void agregar(K clave, V valor){
        int ubicacion = obtenerUbicacion(clave);
        // la clave está en el dicc
        if (ubicacion < cantElems){
            significados[ubicacion] = valor;
        }else{
            // la clave no está en el dicc
            if (ubicacion == cantElems){
                // se llenó el dicc
                if (cantElems == claves.length){
                    claves = Arrays.copyOf(claves, cantElems + LONGITUD_AUMENTO);
                    significados = Arrays.copyOf(significados, cantElems + LONGITUD_AUMENTO);
                }
                claves[cantElems] = clave;
                significados[cantElems] = valor;
                cantElems++;
            }
        }       
    }

    private int obtenerUbicacion(K clave){
        int i = 0;
        while(i < cantElems && claves[i] != clave)
            i++;
        return i;    
    }

    @Override
    public V obtener(K clave){
        int ubicacion = obtenerUbicacion(clave);
        if (ubicacion == cantElems){
            throw new RuntimeException("La clave no está en el diccionario");
        }
        return significados[ubicacion];
    }

    @Override
    public boolean contieneClave(K clave){
        return obtenerUbicacion(clave) < cantElems;
    }

    
    @Override
    public boolean contieneValor(V valor){
        int i = 0;
        while(i < cantElems && significados[i] != valor)
            i++;
        return i < cantElems;
    }
    
    @Override
    public Integer largo(){
        return cantElems;
    }
    
    @Override
    public V remover(K clave){
        int ubicacion = obtenerUbicacion(clave);
        
        if (ubicacion == cantElems){
            throw new RuntimeException("La clave no está en el diccionario");
        }
        V aBorrar = significados[ubicacion];

        for (int i = ubicacion; i < cantElems -1; i++){
            claves[i] = claves[i+1];
            significados[i] = significados[i+1];
        }
        cantElems--;

        return aBorrar;
    }

    @Override
    public String toString() {
        String retorno = "[";
        String actual = "";
        for(int i = 0; i < cantElems; i++) {
            actual = "("+claves[i]+", "+significados[i]+")";
            retorno += actual + " ";
        }
        retorno += "]";
        return retorno;
    }
}

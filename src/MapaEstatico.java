public class MapaEstatico<K, V> implements Mapa<K,V> {
    private static final int LONG_DEFAULT = 10;
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
        
    }

    @Override
    public V obtener(K clave){

    }

    @Override
    public boolean contieneClave(K clave){

    }
    
    @Override
    public boolean contieneValor(V valor){


    }
    
    @Override
    public Integer largo(){
        return cantElems;
    }
    
    @Override
    public V remover(K clave){

    }
}

import java.util.Map;
import java.util.HashMap;

public class MapaDinamico<K, V> implements Mapa<K,V> {
    private Map<K,V> dicc = new HashMap<>();

    public MapaDinamico(){
        dicc = new HashMap<>();
    }

    @Override
    public void agregar(K clave, V valor){
        dicc.put(clave, valor);

    }
    @Override
    public V obtener(K clave){
        if(!contieneClave(clave)){
            throw new RuntimeException("La clave no pertence al diccionario");
        }
        return dicc.get(clave);

    }

    @Override
    public boolean contieneClave(K clave){
        return dicc.containsKey(clave);
    }
    
    @Override
    public boolean contieneValor(V valor){
        return dicc.containsValue(valor);
    }
    
    @Override
    public Integer largo(){
        return  dicc.size();
    }
    
    @Override
    public V remover(K clave){
        if(!contieneClave(clave)){
            throw new RuntimeException("La clave no pertence al diccionario");
        }
        V valorABorrar = obtener(clave);
        dicc.remove(clave);
        return valorABorrar;
    }

    @Override
    public String toString() {
        String retorno = "[";
        String actual = "";
        for(K clave : dicc.keySet()) {
            actual = "("+clave+", "+dicc.get(clave)+")";
            retorno += actual + " ";
        }
        retorno += "]";
        return retorno;
    }
}

public interface Mapa<K,V> {
    void agregar(K clave, V valor);
    V obtener(K clave);
    boolean contieneClave(K clave);
    boolean contieneValor(V valor);
    Integer largo();
    V remover(K clave);
}
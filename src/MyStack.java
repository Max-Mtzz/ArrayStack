//Contrato --> para implementar los métodos en la interfaz
public interface MyStack<T> {

    //En una interfaz no tiene cuerpo solo el método
    void push(T value);
    T pop();
    T peek();
    boolean isEmpty();
    //Atributo para conocer el tamaño
    int size();
    //para limpiar
    void clear();
    void printStack();
}

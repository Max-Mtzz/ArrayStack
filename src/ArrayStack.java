import java.util.Arrays;

public class ArrayStack<T> implements MyStack<T> {
//Al iniciar nos pedira implementar los metodos que no estan implementados usamos el quick fix para eso

    //Representación del arreglo
    private Object[] data;
    //Indicador de posición
    private int top;
    //Constructor
    public ArrayStack(){//Invoca al constructor 2 pasandole 10
        this(10);
    }
    //Constructor arreglo de objetos
    public ArrayStack(int initiaCapacity){//Inicializa el arreglo con el tamaño que le paso el primero

        this.data = new Object[initiaCapacity];
    }
    @Override
    public void push(T value) {
        //En la posición 0 le pasamos el valor que recibimos, para que posteriormente lo cambie a 1 y no quede en 0
       this.data[top++] = value;//Top vale 0, despues top+1

    }

    @Override
    public T pop() {
        //Ver si no esta vacia la pila
        if(isEmpty()){
            System.out.println("No hay elementos en el Stack");
            return null;
        }
        T value = (T) data[--top];//Obteniendo el ultimo elemento del Stack
        data[top] = null;

        return value;
    }

    @Override
    public T peek() {
       if(isEmpty()){
        System.out.println("No hay elementos en el Stack");
        return null;
       }

       return (T) data[top];
    }

    @Override
    public boolean isEmpty() {
        return top==0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    //Método para saber cuando esta lleno el arreglo y agregarle mas capacidad
    public void addCapacity(){
        if(top==data.length){//Si el arreglo esta lleno aumentamos su capacidad
            int newCapacity = data.length*2;
            //Vamos a crear un nuevo arreglo y pasarle los datos anteriores
            data = Arrays.copyOf(data, newCapacity);//Crea un nuevo arreglo con el doble de tamaño y los datos anteriores
        }
    }

    @Override
    public void printStack() {
        //Si esta vacío avisamos
        if(isEmpty()){
            System.out.println("No hay elementos en el Stack");
            return;
        }
        //Con un for recorre cada elemento y lo imprime
        for (int i = top; i >=0; i--) {
            System.out.println(data[i]);
        }
    }
    
}

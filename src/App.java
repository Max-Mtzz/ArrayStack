public class App {
    public static void main(String[] args) throws Exception {
        ArrayStack<String> myStack = new ArrayStack<>();

        myStack.push("Samuel rivera robles");
        myStack.push("Jorgito");
        myStack.push("Max");
        myStack.push("chanin");
        myStack.printStack();
        myStack.pop();
        System.out.println("-------------------------------");
        myStack.printStack();
    }
}

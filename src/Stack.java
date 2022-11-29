public class Stack {
    int stck[] = new int[10];
    int tos;

    Stack () {
        tos = -1;
    }

    void push (int item) {

        if (tos==9){
            System.out.println("Букет собран");
        } else {
            stck[++tos] = item;
        }
    }
}

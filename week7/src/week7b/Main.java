package week7b;
public class Main {
    public static void main(String[] args) {
            Queue s=new Queue();
            s.enqueue(10);
            s.enqueue(20);
            s.enqueue(30);
            s.enqueue(40);
            s.enqueue(50);
            s.enqueue(60);
            s.dequeue();
            s.dequeue();
            s.enqueue(70);
            s.display();
        }

 

}
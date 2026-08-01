public class sll {
    class node {
        int data;
        node next;
        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public node head = null;
    public node tail = null;
    
    public void addnode(int data) {
        node newNode = new node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public void display() {
        node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int listlength() {
        node current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        sll s1 = new sll();

        s1.addnode(5);
        s1.addnode(7);
        s1.addnode(8);

        s1.display();

        s1.listlength();
    }
}
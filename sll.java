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

    public int maxelement() {
        node current = head;
        int max = current.data;

        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public int minelement() {
        node current = head;
        int min = current.data;

        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    public void search(int data) {
        node current = head;
        while (current != null) {
            if (current.data == data) {
                System.out.println("Element found");
                return;
            }
            current = current.next;
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        sll s1 = new sll();

        s1.addnode(5);
        s1.addnode(7);
        s1.addnode(8);

        s1.display();

        System.out.println("The length of the list is: " + s1.listlength());

        System.out.println("The maximum element in the list is: " + s1.maxelement());
        System.out.println("The minimum element in the list is: " + s1.minelement());

        s1.search(5);
        s1.search(10);
    }
}
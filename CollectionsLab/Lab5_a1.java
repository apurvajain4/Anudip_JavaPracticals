class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Lab5_a1 {
    Node head;
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    
    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next; 
            current.next = prev; 
            prev = current;
            current = next;
        }
        head = prev;
    }

  
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lab5_a1 list = new Lab5_a1();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        System.out.println("Original List:");
        list.printList();
        
        list.reverse();
        
        System.out.println("Reversed List:");
        list.printList();
    }
}

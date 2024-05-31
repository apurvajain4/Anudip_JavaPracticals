class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Lab5_a2 {
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

       void appendList(SinglyLinkedList list2) {
        if (head == null) {
            head = list2.head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = list2.head;
        }
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
        Lab5_a2 list1 = new Lab5_a2();
        list1.add(22);
        list1.add(33);
        list1.add(44);
        list1.add(55);
        
        Lab5_a2 list2 = new Lab5_a2();
        list2.add(66);
        list2.add(77);
        list2.add(88);
        list2.add(99);
        
        System.out.println("List 1:");
        list1.printList();
        
        System.out.println("List 2:");
        list2.printList();
        
        list1.appendList(list2);
        
        System.out.println("Appended List:");
        list1.printList();
    }
}

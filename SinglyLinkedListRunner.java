class SinglyLinkedListRunner{
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.firstIn(5);
        sll.firstIn(4);
        sll.firstIn(2);
        sll.firstIn(1);
        sll.insertAtPosition(3,3);
        sll.traverseFront();

    }
}

class SinglyLinkedList{
    Node head;

    public SinglyLinkedList(){
        head = null;
    }

    public void lastIn(int data){
        Node temp = new Node(data);
        Node travNode = head;
        if (travNode == null){
            travNode = temp;
            head = travNode;
            return;
        }
        else {
            while(travNode.next != null){
                travNode = travNode.next;
            }
            travNode.next = temp;
        }
    }
    public void firstIn(int data){
        Node temp = new Node(data);
        if (head == null){
            head = temp;
            return;
        }
        else {
            temp.next = head;
            head = temp;
        }
    }
    public void firstOut(){
        //deleting the first element 
        if (head == null){
            System.out.println("Nothing to Delete!");
            return;
        }
        else {
            head = head.next;
        }
    }
    public void lastOut(){
        //delete the last element
        Node travNode = head;
        if (travNode == null){
            System.out.println("NO DATA AVAILABLE");
            return;
        }
        else {
            Node lastNode = head;
                while (travNode.next != null){
                    lastNode = travNode;
                    travNode = travNode.next;
                }
                lastNode.next = null;
        }
    }
    public void searchNode(int data){
        if (head == null){
            System.out.println("NO DATA");
            return;
        }
        else {
            Node travNode = head;
            while (travNode != null){
             if (travNode.data == data){
                    System.out.println("I found it");
                    return;
                }
                else travNode = travNode.next;
            }

        }
    }
    public void findPosition(int data){
        int position = 1;
        if (head == null){
            System.out.println("NO DATA");
            return;
        }
        else {
            Node trNode = head;
            while (trNode != null){
                if (trNode.data == data){
                    System.out.println("AT POSITION "+position);
                    return;
                }
                else{
                    ++position;
                    trNode = trNode.next;
                }
            }
            System.out.println("NO POSITION ");
        }
    }
    public void insertAtPosition(int data,int position){
        //N.B I assumed the position started at position 1
        Node temp = new Node(data);
        Node trNode = head;
        Node leftNode = head;
        int initialPosition = 1;
        while (initialPosition < position) {
            leftNode = trNode;
            trNode = trNode.next;
            ++initialPosition;

        }
        leftNode.next = temp;
        temp.next = trNode;
    }
    public void traverseFront(){
        Node travNode = head;
        if (travNode == null){
            System.out.println("NO DATA");
            return;
        }
        else {
            while (travNode != null){
                System.out.println(travNode.data);
                travNode = travNode.next;
            }
        }
    }

}

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
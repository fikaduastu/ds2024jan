class SinglyLinkedListRunner{
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.firstIn(5);
        sll.firstIn(4);
        sll.firstIn(3);
        sll.firstIn(2);
        sll.firstIn(1);
        sll.firstIn(0);
        sll.firstOut();
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
    public void lastOut(){}
    public void searchNode(int data){}
    public void findPosition(int data){}
    public void insertAtPosition(int data,int position){}
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
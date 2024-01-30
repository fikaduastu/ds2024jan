class SinglyLinkedListRunner{
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.lastIn(5);
        sll.lastIn(4);
        sll.lastIn(3);
        sll.lastIn(2);
        sll.lastIn(1);
        sll.lastIn(0);
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
    public void firstIn(int data){}
    public void firstOut(){}
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
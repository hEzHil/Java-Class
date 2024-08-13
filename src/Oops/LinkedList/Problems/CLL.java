package Oops.LinkedList.Problems;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }
    public void insert(int val){
        Node node = new Node(val);
        if( head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
      }

      public void delete(int val){
            Node node = head;
            if(head == null ){
                return;
            }
            if(node.value == val){
                head = head.next;
                tail.next = head;
                return;
            }

            do{
                Node temp = node.next;
                if(temp.value == val){
                    node.next = temp.next;
                    break;
                }
                node = node.next;
            }while(node != head);
      }

    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.value + " -> ");
                node = node.next;
            }while(node != head);
        }
        System.out.println("Head");
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }


}

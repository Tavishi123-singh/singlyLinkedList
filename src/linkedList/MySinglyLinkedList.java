package linkedList;

import node.Node;

public class MySinglyLinkedList {

    Node head;
    public MySinglyLinkedList(){
        head=null;
    }

    public Node getHead() {
        return head;
    }

    public void insert(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(node);
        }
    }
    public void insertFromBeginning(int data){
        Node node=new Node(data);
        node.setNext(head);
        head=node;
    }
    public int delete(){
        int response=0;
        if(head!=null){
            Node temp=head;
            Node previous=null;
            while (temp.getNext()!=null){
                previous=temp;
                temp=temp.getNext();
            }
            response=temp.getData();
            if(previous!=null){
                previous.setNext(null);
            }
            else {
                head=null;
            }
        }
        return response;
    }
    public int deleteFromBeginning(){
        int response=0;
        if(head!=null){
            response=head.getData();
            head=head.getNext();
        }
        return response;
    }
    public boolean search(int data){
        boolean response=false;
        Node temp=head;
        while (temp!=null){
            if(temp.getData()==data){
                response=true;
                break;
            }
            temp=temp.getNext();
        }
        return response;
    }
    public void printList(){
        System.out.println("Printing List....");
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.getData());
            temp=temp.getNext();
            if(temp!=null){
                System.out.print("--->");
            }
        }
        System.out.println();
    }
}

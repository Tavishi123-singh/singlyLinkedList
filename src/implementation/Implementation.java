package implementation;

import linkedList.MySinglyLinkedList;

import java.util.Scanner;

public class Implementation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MySinglyLinkedList list=new MySinglyLinkedList();
        System.out.println("Enter 5 integers:");
        for (int i = 0; i <5 ; i++) {
            int data=sc.nextInt();
            list.insert(data);
        }
        list.printList();
        System.out.println("Deleting last node...");
        int delNode=list.delete();
        System.out.println(delNode);
        list.printList();
    }
}

package com.bridgelab;

public class DeleteNode {
	
	// Link list node /
    static class Node {
        int data;
        Node next;
    };
 
    // Function to remove the first node
    // of the linked list /
    static Node removeFirstNode(Node head)
    {
        if (head == null)
            return null;
 
        // Move the head pointer to the next node
        Node temp = head;
        head = head.next;
 
        return head;
    }
 
    // Function to push node at head
    static Node push(Node head_ref, int new_data)
    {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }
 
    // Driver code
    public static void main(String args[])
    {
        // Start with the empty list /
        Node head = null;
 
        // Use push() function to 
        head = push(head, 70);
        head = push(head, 30);
        head = push(head, 56);
      ;
 
        head = removeFirstNode(head);
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
    }

}

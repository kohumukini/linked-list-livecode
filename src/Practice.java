public class Practice {
    public static void main(String[] args) {
        ListNode myNode = new ListNode(); 
        myNode.data = 'x';

        ListNode anotherNode = new ListNode(); 
        anotherNode.data = 't';
        myNode.next = anotherNode;

        ListNode moreNode = new ListNode(); 
        moreNode.data = 'r'; 
        anotherNode.next = moreNode; 

        ListNode coolNode = new ListNode(); 
        coolNode.data = 'w'; 

        coolNode.next = myNode; 

        ListNode extra = moreNode;
        moreNode.data = 'e'; 

        ListNode hello = new ListNode(); 
        hello.data = 'x'; 
        extra.next = hello;

        printList(coolNode);
    }

    public static void printList(ListNode head) {
        // Starting from head
        // print all data in list in order

        ListNode current = head; 

        while (current != null) {
            System.out.println(current.data);
            current = current.next;  
        }
    }

    public static int countX(ListNode head) {
        ListNode current = head; 
        int counter = 0;

        while (current != null) {
            if (current.data == 'x') counter++; 
            current = current.next; 
        }

        return counter;
    }
    
    // Remove the node at removeIndex, and return the head of the list
    // Example: 
    // e -> t -> k -> y
    // removeIndex 2
    // e @ index 0
    // t
    public static ListNode removeAt(ListNode head, int removeIndex) {
        if (removeIndex == 0) {
            return head.next;
        }

        ListNode current = head; 

        for (int i = 0; i < removeIndex - 1; i++) {
            current = current.next; 
        }

        current = current.next.next; 

        return head; 
    }
}

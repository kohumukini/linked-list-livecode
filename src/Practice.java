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
}

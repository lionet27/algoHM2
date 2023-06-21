package src;



public class Main {
    
    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(20);
        linkedList.addFirst(11);
        linkedList.addFirst(34);
        linkedList.printList();

        linkedList.addLast(55);
        linkedList.addLast(31);
        linkedList.addLast(39);
        linkedList.printList();

        System.out.println("linkedList.contains(55) = " + linkedList.contains(55));
        System.out.println("linkedList.contains(156) = " + linkedList.contains(156));

        linkedList.removeLast();
        linkedList.printList();
        linkedList.remove();
        linkedList.printList();
        linkedList.revert();;
        linkedList.printList();

    }
}
    


package Paragraph1;

public class MainApp21 {

    public static void main(String[] args) throws MyException {

        SinglyLinkedList<String> slList = new SinglyLinkedList<>();

        slList.insertHead("Moscow");
        slList.insertEnd("London");
        slList.insertEnd("Washington");
        slList.insertEnd("Tokyo");

        displaySinglyLinkedList(slList);

        slList.insertHead("Beijing");

        displaySinglyLinkedList(slList);

        slList.insert("Paris", 2);

        displaySinglyLinkedList(slList);

        slList.deleteEnd();

        displaySinglyLinkedList(slList);

        slList.deleteHead();

        displaySinglyLinkedList(slList);

        Node delNode = slList.search("London");

        slList.delete(delNode);

        displaySinglyLinkedList(slList);

    }

    private static void displaySinglyLinkedList(SinglyLinkedList slList) throws MyException {

        slList.display();
        System.out.println(slList.getSize());
        System.out.println();

    }

}

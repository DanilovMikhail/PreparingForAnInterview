package Paragraph1;

public class SinglyLinkedList<T> {

    private Node nodeHead;
    private int size;

    public SinglyLinkedList(){
        nodeHead = null;
        size = 0;
    }

    public SinglyLinkedList(T data){
        Node newNode = new Node<>(data);
        nodeHead = newNode;
        size = 1;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){

        if (nodeHead == null){
            return true;
        }

        return false;
    }

    public void insertHead(T data) {

        Node newNode = new Node<>(data);

        newNode.nodeNext = nodeHead;

        nodeHead = newNode;

        size++;
    }

    public void insertEnd(T data){

        Node newNode = new Node<>(data);

        Node endNode = nodeHead;

        while (endNode.nodeNext != null){
            endNode = endNode.nodeNext;
        }

        endNode.nodeNext = newNode;

        size++;

    }

    public void insert(T data, int pos) throws MyException {

        int index = 0;

        if (pos >= 0 && pos <= (size - 1)){

            Node newNode = new Node<>(data);

            Node previousNode = null;
            Node currentNode = nodeHead;

            while (pos != index){

                previousNode = currentNode;
                currentNode = currentNode.nodeNext;
                index++;
            }

            if (previousNode == null) {

                newNode.nodeNext = nodeHead;
                nodeHead = newNode;

            }else{

                previousNode.nodeNext = newNode;
                newNode.nodeNext = currentNode;

            }

            size++;

        }else {
            throw new MyException("Позация больше индекса односвязного списка!");
        }

    }

    public void delete(Node delNode) throws MyException {

        if (delNode == null || delNode.isEmpty()){
            throw new MyException("Узел для удаления пустой!");
        }

        if(this.isEmpty()){
            throw new MyException("Односвязанный список пустой!");
        }

        Node previousNode = null;
        Node currentNode = nodeHead;

        while (currentNode != delNode) {
            previousNode = currentNode;
            currentNode = currentNode.nodeNext;
        }

        if (previousNode != null) {
            previousNode.nodeNext = currentNode.nodeNext;
        }

        currentNode = null;

        size--;
    }

    public void deleteHead() throws MyException {

        if (this.isEmpty()){
            throw new MyException("Связанный список пустой!");
        }

        Node oldNodeHead = nodeHead;

        nodeHead = nodeHead.nodeNext;

        oldNodeHead = null;

        size--;

    }

    public void deleteEnd() throws MyException {

        if (this.isEmpty()){
            throw new MyException("Связанный список пустой!");
        }

        Node previousNode = null;
        Node endNode = nodeHead;

        while (endNode.nodeNext != null){
            previousNode = endNode;
            endNode = endNode.nodeNext;
        }

        if (previousNode != null){
            previousNode.nodeNext = null;
        }

        endNode = null;

        size--;

    }

    public void display() throws MyException {

        if (this.isEmpty()){
            throw new MyException("Связанный список пустой!");
        }

        Node endNode = nodeHead;

        while (endNode != null){

            endNode.display();

            endNode = endNode.nodeNext;

        }

    }

    public Node search(T data) throws MyException {

        if (this.isEmpty()){
            throw new MyException("Связанный список пустой!");
        }

        Node current = nodeHead;

        while (current != null){

            if (current.nodeData.equals(data)){
                return current;
            }

            current = current.nodeNext;

        }

        return null;

    }
}

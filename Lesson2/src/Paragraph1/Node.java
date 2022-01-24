package Paragraph1;

public class Node<T> {

    public T nodeData;
    public Node nodeNext;

    public Node(){
        nodeData = null;
        nodeNext = null;
    }

    public Node(T data){
        this.nodeData = data;
    }

    public void display(){
        System.out.println(nodeData);
    }

    public boolean isEmpty(){

        if (nodeData == null){
            return true;
        }

        return false;
    }
}

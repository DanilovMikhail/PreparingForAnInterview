package Paragraph2;

public class MainApp22 {

    public static void main(String[] args){

        MyArrayList<String> array = new MyArrayList<>();

        array.add("Moscow");
        array.add("London");
        array.add("Washington");
        array.add("Tokyo");
        array.add("Beijing");
        array.add("Paris");
        array.add("Amsterdam");
        array.add("Athens");
        array.add("Berlin");
        array.add("Budapest");

        array.display();
        System.out.println(array.size());
        System.out.println();

        array.add("Roma");
        array.display();
        System.out.println(array.size());
        System.out.println();

        array.remove(4);//Beijing
        array.display();
        System.out.println(array.size());
        System.out.println();

    }
}

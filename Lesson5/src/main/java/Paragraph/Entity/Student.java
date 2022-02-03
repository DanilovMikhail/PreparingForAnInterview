package Paragraph.Entity;


import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "mark", nullable = false)
    private boolean mark;

    public Student(){
    }

    public Student(String name, boolean mark){
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public boolean isMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    public void display(){
        System.out.println(id + " " + name);
    }
}

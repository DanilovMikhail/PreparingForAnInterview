package Paragraph1;

public class MainApp11 {

    public static void main(String[] args){
        Person person = new Person.Builder()
                .addFirstName("Petrov")
                .addLastName("Peter")
                .addMiddleName("Ivans")
                .addCountry("Russian Federation")
                .addAddress("Moscow")
                .addPhone("+7(999)999-99-99")
                .addAge(50)
                .addGender("Male")
                .build();

    }
}

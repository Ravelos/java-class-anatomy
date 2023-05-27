package edu.oswaldo.firstweek;

public class MyClass {
    public static void main(String[] args) {
        String name = "Oswaldo";
        String lastname = "Ravelo";
        String fullName = fullName(name,lastname);

        System.out.println(fullName);

    }

    public static String fullName(String firstname, String lastname){
        return "Your fullname is " + firstname.concat(" ").concat(lastname);
    }
}

package designPattern.creational.builder;

public class Main {
    public static void main(String[] args) {
       /*
       *
       * notes
       *    builder design patter is preferred when u want to make ur class immutable
       *
       * */
        User user = new User.UserBuilder("Amr", "Elbaz").build();
        System.out.println(user);
        System.out.println(new User.UserBuilder("mohammed", "Elbaz")
                .address("zagazig")
                .age(27)
                .phone("123456")
                .build());
    }
}

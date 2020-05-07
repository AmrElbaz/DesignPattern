package designPattern.creational.builder;

public class User {
    private final String firstName;
    private final String lastName;
    private final String phone;
    private final String address;
    private final int age;
    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.address = userBuilder.address;
        this.phone = userBuilder.phone;
        this.age = userBuilder.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private String phone;
        private String address;
        private int age;

        public UserBuilder(String firstName , String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone (String phone) {
            this.phone = phone;
            return this;
        }
        public UserBuilder address (String address) {
            this.address = address;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }

    }
}

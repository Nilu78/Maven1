import com.github.javafaker.Faker;

public class DEmoFaker {


        public static void main(String[] args) {


                Faker faker = new Faker();

                String firstName = faker.name().firstName();
                String lastName = faker.name().lastName();
                String fullName = faker.name().fullName();
                String streetAddress = faker.address().streetAddress();
                String city = faker.address().city();
                String state = faker.address().state();
                String zipCode = faker.address().zipCode();
                String country = faker.address().country();
                String phoneNumber = faker.phoneNumber().cellPhone();
                String email = faker.internet().emailAddress();
                String password = faker.internet().password();

                System.out.println("firstName = " + firstName);
                System.out.println("lastName = " + lastName);
                System.out.println("fullName = " + fullName);
                System.out.println("streetAddress = " + streetAddress);
                System.out.println("city = " + city);
                System.out.println("state = " + state);
                System.out.println("zipCode = " + zipCode);
                System.out.println("country = " + country);
                System.out.println("phoneNumber = " + phoneNumber);
                System.out.println("email = " + email);
                System.out.println("password = " + password);


        }
}









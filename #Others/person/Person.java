
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = (age > 100 || age < 0) ? 0 : age;
    }

    public boolean isTeen() {
        return (this.age < 20 && this.age > 12);
    }

    public String getFullName() {
        if (!this.firstName.isEmpty() && !this.lastName.isEmpty()) {
            return this.firstName + " " + this.lastName;
        }
        return (!this.firstName.isEmpty()) ? this.firstName : this.lastName;
    }
}

public class Customer {
    String name;
    int age;
    String phone;
    Gender gender;

    public Customer(String name, int age, String phone, Gender gender) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone +
                "', gender='" + gender.getValue() + "'}";
    }

    public static class Employee {
        private String firstName;
        private String lastName;
        private String phone;
        private Gender gender;
        public Employee(String firstName, String lastName, String phone, Gender gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phone = phone;
            this.gender = gender;
        }
        //region геттеры/сеттеры
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }
        //endregion
    }

    public Gender getGender(){
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
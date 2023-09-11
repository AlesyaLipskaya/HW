package w6.Person;

public class Person {

        private String fullName;
        private int age;

        public Person() {
            System.out.println("Creating a Person object");
        }

        public Person(String fullName, int age) {
            this.fullName = fullName;
            this.age = age;
            System.out.println("Creating a Person object with name: " + fullName + " and age: " + age);
        }

        public void talk(String text) {
            System.out.println(fullName + " talk " + text);
        }

        public void move() {
            System.out.println(fullName + " walk");
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }



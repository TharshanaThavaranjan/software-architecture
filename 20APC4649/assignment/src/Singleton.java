//creational pattern

//Singleton pattern

public class Singleton {

    private static Singleton instance;

    private String value;

    private Singleton (String value) {

        this.value = value;

    }

    public static Singleton getInstance(String value) {

        if (instance == null) {

            instance = new Singleton(value);
        }
            return instance;

        }

        public String getValue() {

            return value;

        }

        public void setValue(String value) {

            this.value = value;

        }


        public static void main(String[] args) {

            Singleton singleton1 = Singleton.getInstance("First Instance");

            System.out.println(singleton1.getValue());
            // Output: First Instance

            Singleton singleton2 = Singleton.getInstance("Second Instance");

            System.out.println(singleton2.getValue());
            // Output: First Instance

            singleton2.setValue("Updated Instance");

            System.out.println(singleton1.getValue());
            // Output: Updated Instance
            }

        }






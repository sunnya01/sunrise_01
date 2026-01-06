package proxyTest;

import java.io.*;

public class SerialTest {


    public static void main(String[] args) {

        SerialTest serialTest = new SerialTest();

        File file = new File("class.bat");

//        serialTest.output(file);
        serialTest.input(file);

    }

    public void input(File file) {

        FileInputStream fis = null;

        ObjectInputStream ois = null;

        try {

            fis = new FileInputStream(file);

            ois = new ObjectInputStream(fis);

            try {
                final Object person = ois.readObject();
                if (person != null)
                {
                    Person person1 = (Person) person;
                    System.out.println(person1.getAge());
//                    System.out.println(person1.getName());
                    System.out.println(person1.taken());
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public void output(File file) {

        FileOutputStream fos = null;

        ObjectOutputStream oos = null;

        Person person = new Person("孙超威", 28);

        try {

            fos = new FileOutputStream(file);

            oos = new ObjectOutputStream(fos);

            oos.writeObject(person);

            oos.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

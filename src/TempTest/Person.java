package TempTest;

import java.io.Serializable;

public class Person implements Serializable {

    static final long serialVersionUID = 12375874391L;

//    private String name;

    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
//        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String taken() {
//        String str = "oldversion";
        String str = "newversion";
        return str;

    }
}

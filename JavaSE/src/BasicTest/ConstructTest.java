package BasicTest;

public class ConstructTest {

    public static void main(String[] args) {
        Contructor cc = new Contructor(1,"456");
        System.out.println(cc.i+cc.str);
    }

}

class Contructor{
    public int i;
    public  String str;
    Contructor(){
        i = 1;
        str = "123";
    }
    Contructor(int lv_i,String lv_str){
        this();
        if (this.i == 0)
        this.i = lv_i;
        if (this.str == "")
        this.str = lv_str;
    }
}
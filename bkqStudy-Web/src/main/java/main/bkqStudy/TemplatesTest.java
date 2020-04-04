package main.bkqStudy;

import main.bkqStudy.entity.Person;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author bkq
 * @date 2020/4/4 20:57
 **/
@Deprecated
public class TemplatesTest {
    //prsf  可生成 private static final
    private static final Person person=new Person();
    //psf
    public static final int Num=1;
    //psfi
    public static final int Num2=2;
    //psfs
    public static final String NATION="China";

    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println();
        //soutp
        System.out.println("args = " + Arrays.deepToString(args));
        //soutm
        System.out.println("StudyApplication.main");
        int num1=10;
        int num2=20;
        //soutv
        System.out.println("num2 = " + num2);
        //xxx.soutv
        System.out.println("num2 = " + num2);
        //fori
        String[] arr =new String[]{"Tom","Hanmeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println("s = " + s);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s = " + s);
        }
        //list.for
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Object o : list) {
            System.out.println("o = " + o);
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i = " + i);
        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("i = " + i);
        }
    }

    public  void method(){
        System.out.println("TemplatesTest.method");

        ArrayList list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        //xxx.null
        if (list == null) {

        }
       //xx.nn
        if (list != null) {

        }
    }
}

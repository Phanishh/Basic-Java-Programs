import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class list {
    public static void main(String[] args)
    {
        Set<student>set=new HashSet<>();
        set.add(new student("hi",10));
        set.add(new student("sss",20));
        set.add(new student("hqqq",30));
        set.add(new student("hwwew",10));
        System.out.println(set);

    }
}
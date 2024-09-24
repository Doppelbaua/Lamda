import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HalloJavamitForEach
{

    List<String> list = Arrays.asList("Hallo", "wie", "gehts");

    public void showlistnormal ()
    {
        System.out.println("1");
        for (String s : list)
        {
            System.out.println(s);
        }
    }
    public void showlistlambda()
    {
        System.out.println("2");
        list.forEach(item -> System.out.println(item));
        System.out.println("3");
        list.forEach(System.out::println);
    }




}

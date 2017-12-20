import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wengchuqin on 2017/12/20.
 */
public class Service {
    public void hello() throws FileNotFoundException {
        System.out.println("hello");

        List<Integer> list = new ArrayList<Integer>();

        FileInputStream stream = new FileInputStream("222");
        list.add(1);
        list.add(2);
    }

    public void hello2(){
        System.out.println("online hello");
    }
}

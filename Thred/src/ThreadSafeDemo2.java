import java.util.List;


public class ThreadSafeDemo2 implements Runnable{

    private List<String> list;

    public ThreadSafeDemo2(List<String> list){
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
        	while(true){
                list.add("xxxxxx");
               // System.out.println("添加一个后的尺寸："+list.size());
        }
    }
}
}
import java.util.List;


public class ThreadSafeDemo3 implements Runnable{

    private List<String> list;

    public ThreadSafeDemo3(List<String> list){
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
            if(list.size()>0){
                list.remove(0);
                System.out.println("删除一个后的尺寸："+list.size());
            }
        }
    }
}
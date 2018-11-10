package structural.proxy.proxy;

/**
 * Created by User on 5/28/2018.
 */
public class RealProject implements Project{

    String url;

    public RealProject(String url) {
        this.url = url;
        loading();
    }

    public void loading(){
        System.out.println("Loading project " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("Project " + url + " is running...");
    }
}

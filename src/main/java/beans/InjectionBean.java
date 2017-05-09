package beans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Created by cw on 04.05.2017.
 */
@Named
@RequestScoped
public class InjectionBean {
    private String text = "Hi Injection!";

    @PostConstruct
    public void initialize(){
       // System.out.println(InjectionBean.class.getSimpleName() + " was created!");
    }

    public String getText(){
        return text;
    }
}

package beans;

import java.util.ResourceBundle;

import javax.faces.bean.ManagedBean;

/**
 * Created by cw on 04.05.2017.
 */
@ManagedBean(name = "welcome")
public class WelcomeBean {

    public String getMessage() {
      try {
          String baseName = "verfahren";
          ResourceBundle bundle = ResourceBundle.getBundle(baseName);
         return bundle.getString("bean");
      } catch (Exception e) {
         e.printStackTrace();
         return "Leider ist etwas schief gelaufen.";
      }
   }

}

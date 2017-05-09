package beans;

/**
 * Created by cw on 05.05.2017.
 */
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
public class ButtonView {

   public void save(ActionEvent actionEvent) {
      addMessage("Data saved");
   }

   public void update(ActionEvent actionEvent) {
      addMessage("Data updated");
   }

   public void delete(ActionEvent actionEvent) {
      String summary = "Data deleted";
      addMessage(summary);
   }

   private void addMessage(String summary) {
      FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
      FacesContext.getCurrentInstance().addMessage(null, message);
   }
}

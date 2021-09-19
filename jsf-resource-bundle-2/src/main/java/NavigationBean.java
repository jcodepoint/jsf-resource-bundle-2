
import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named(value = "navigationBean")
@ViewScoped
public class NavigationBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer value;
	
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}

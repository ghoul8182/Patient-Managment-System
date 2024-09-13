
package project_sign_in;

import java.io.Serializable;
import java.util.ArrayList;

public class doctor implements Serializable{
private String name;
private String selectedMajor;
    public doctor(String name, String selectedMajor) {
        this.name = name;
        this.selectedMajor = selectedMajor;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSelectedMajor() {
        return selectedMajor;
    }

    public void setSelectedMajor(String selectedMajor) {
        this.selectedMajor = selectedMajor;
    }
}
    


   

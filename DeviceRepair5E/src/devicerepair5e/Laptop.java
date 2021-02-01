
package devicerepair5e;
import java.util.ArrayList;

public class Laptop extends Device { 

    private ArrayList<Component> Components = new ArrayList<>();

    public ArrayList<Component> getComponents() {
        return Components;
    }

    public void setComponents(ArrayList<Component> Components) {
        this.Components = Components;
    }
    public Laptop(String IdentificationCode, String MakeAndModel, String Owner, String ProblemDescription, String RepairNotes, int prioity) {
        super(IdentificationCode, MakeAndModel, Owner, ProblemDescription, RepairNotes, prioity);
    }
    
    public void addComponent(Component component){
        Components.add(component);
    }
    public void deleteComponent(int index){
        if(index >=0 && index <Components.size()){
            Components.remove(index);
        }
        
    }
    

  

    
}

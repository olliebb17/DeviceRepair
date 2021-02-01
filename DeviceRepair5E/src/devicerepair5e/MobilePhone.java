
package devicerepair5e;


public class MobilePhone extends Device {
private int priority;
public int priorityRank;
public boolean isChargeable;

    

    public MobilePhone(int priority, int priorityRank, boolean isChargeable, String IdentificationCode, String MakeAndModel, String Owner, String ProblemDescription, String RepairNotes, int prioityRank) {
        super(IdentificationCode, MakeAndModel, Owner, ProblemDescription, RepairNotes, prioityRank);
        this.priority = priority;
        this.priorityRank = priorityRank;
        this.isChargeable = isChargeable;
    }

    


    

  
}

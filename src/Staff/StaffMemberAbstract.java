package Staff;

/**
 * @author Tiago Guerreiro
 * @author Bernardo Borda d'Agua
 *
 */

public abstract class StaffMemberAbstract implements StaffMember {

    private int moneyPerHour;
    private String Name;

    protected StaffMemberAbstract(String Name, int moneyPerHour){
        this.moneyPerHour = moneyPerHour;
        this.Name = Name;
    }

    public int getMoneyPerHour() {
        return moneyPerHour;
    }

    public String getName() {
        return Name;
    }
}


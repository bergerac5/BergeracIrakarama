package Q24873;

public class Personnel {
    private String personnelId;
    private String personnelName;
    private String personnelRole;
    private Mission assignedMission;

    // Constructor, getters, setters
    public Personnel(String personnelId, String personnelName, String personnelRole) {
        this.personnelId = personnelId;
        this.personnelName = personnelName;
        this.personnelRole = personnelRole;
    }

    public String getPersonnelRole() {
        return personnelRole;
    }

    public void assignMission(Mission mission) {
        this.assignedMission = mission;
    }

    // equals and hashCode for duplicate checks
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Personnel)) return false;
        Personnel p = (Personnel) obj;
        return this.personnelId.equals(p.personnelId);
    }

    @Override
    public int hashCode() {
        return personnelId.hashCode();
    }
}

package Q24873;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Mission {
    protected String missionId;
    protected String missionName;
    protected Date missionStartDate;
    protected Date missionEndDate;
    protected String status;
    protected List<Personnel> assignedPersonnel = new ArrayList<>();
    protected List<Resource> resources = new ArrayList<>();

    public Mission(String missionId, String missionName, Date start, Date end) {
        if (start.after(end)) {
            throw new IllegalArgumentException("Start date must be before end date.");
        }
        this.missionId = missionId;
        this.missionName = missionName;
        this.missionStartDate = start;
        this.missionEndDate = end;
        this.status = "PLANNED";
    }

    public void assignPersonnel(Personnel p) {
        if (!assignedPersonnel.contains(p)) {
            assignedPersonnel.add(p);
            p.assignMission(this);
        }
    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    protected Resource findResource(String name) {
        for (Resource r : resources) {
            if (r.getResourceName().equalsIgnoreCase(name)) return r;
        }
        return null;
    }

    public abstract void assignTask();

    public abstract void allocateResources();

    public abstract void trackMissionProgress();

    public abstract void generateMissionReport();
}


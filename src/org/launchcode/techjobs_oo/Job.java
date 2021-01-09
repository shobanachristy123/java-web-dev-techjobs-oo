package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name,Employer employer,Location location,PositionType positionType,CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        if(this.id > 0
                && this.name == null
                && this.employer== null
                && this.location == null
                && this.positionType == null
                && this.coreCompetency == null      ){
            return "OOPS! This job does not seem to exist.";
        }
        return "\n" +
                "ID:"+ this.id + "\n" +
                "Name:"+ (this.name == null ||  this.name == "" ? "Data not available" : this.name) + "\n" +
                "Employer:" + (this.employer == null || this.employer.getValue() == null ||  this.employer.getValue() == "" ? "Data not available" : this.employer.getValue()) + "\n" +
                "Location:" + (this.location == null || this.location.getValue() == null || this.location.getValue() == "" ? "Data not available" : this.location.getValue()) + "\n" +
                "Position Type:" + (this.positionType == null || this.positionType.getValue() == null || this.positionType.getValue() == "" ? "Data not available" : this.positionType.getValue())+ "\n" +
                "Core Competency:" + (this.coreCompetency == null || this.coreCompetency.getValue() == null || this.coreCompetency.getValue() == "" ? "Data not available" : this.coreCompetency.getValue() + "\n");
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}

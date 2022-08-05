package apple;

import java.util.*;

public class Module {
    private String name;
    private String moduleCode;
    private String description;
    private int creditUnits;
    private ArrayList<Assessment> assessments = new ArrayList<Assessment>();

    public Module() {

    }

    public Module(String name, String moduleCode, String description, int creditUnits) {
        this.name = name;
        this.moduleCode = moduleCode;
        this.description = description;
        this.creditUnits = creditUnits;

    }

    // GET
    public String getModuleName() {
        return this.name;
    }

    public String getModuleCode() {
        return this.moduleCode;
    }

    public String getDescription() {
        return this.description;
    }

    public int getCreditUnits() {
        return this.creditUnits;
    }

    public ArrayList<Assessment> getAssessments() {
        return this.assessments;
    }

    // SET
    public void setModuleName(String name) {
        this.name = name;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreditUnits(int creditUnits) {
        this.creditUnits = creditUnits;
    }

    public void setAssessments(Assessment assessments) {
        this.assessments.add(assessments);
    }

    @Override
    public String toString() {
        return "{" +
                "name=\"" + name + "\"" + "," +
                "id=\"" + moduleCode + '\"' +
                '}';
    }
}

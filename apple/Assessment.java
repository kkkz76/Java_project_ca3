package apple;

import java.util.*;

public class Assessment {
    private String name;
    private String description;
    private Module module;
    private double totalMarks;
    private double weightage;

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                "name=\"" + name + "\"" + "," +
                "id=\"" + description + "\"" +
                "}";
    }

}

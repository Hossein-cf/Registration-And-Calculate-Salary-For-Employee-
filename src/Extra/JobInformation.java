package Extra;

public class JobInformation {
    private String Certification;
    private int experience;
    private String skills;
    private String employeeType;

    public String getCertification() {
        return Certification;
    }

    public void setCertification(String certification) {
        Certification = certification;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public String toString() {
        return "JobInformation{" +
                "Certification='" + Certification + '\'' +
                ", experience=" + experience +
                ", skills='" + skills + '\'' +
                ", employeeType='" + employeeType + '\'' +
                '}';
    }
}

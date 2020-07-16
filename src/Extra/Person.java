package Extra;

import javafx.scene.image.Image;

import java.time.LocalDate;

public class Person {
    private String name;
    private String lastName;
    private String fatherName;
    private String birthPlace;
    private String address;
    private String gender;
    private long nationalNumber;
    private String phoneNumber;
    private String homePhoneNumber;
    private LocalDate birthTime;
    private String postalCode;
    private Image ProfileImage;
    private boolean marriage;
    private int numberOfChild;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(long nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public LocalDate getBirthTime() {
        return birthTime;
    }

    public void setBirthTime(LocalDate birthTime) {
        this.birthTime = birthTime;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Image getProfileImage() {
        return ProfileImage;
    }

    public void setProfileImage(Image profileImage) {
        ProfileImage = profileImage;
    }

    public boolean isMarriage() {
        return marriage;
    }

    public void setMarriage(boolean marriage) {
        this.marriage = marriage;
    }

    public int getNumberOfChild() {
        return numberOfChild;
    }

    public void setNumberOfChild(int numberOfChild) {
        this.numberOfChild = numberOfChild;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", nationalNumber=" + nationalNumber +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", homePhoneNumber='" + homePhoneNumber + '\'' +
                ", birthTime=" + birthTime +
                ", postalCode='" + postalCode + '\'' +
                ", ProfileImage=" + ProfileImage +
                ", marriage=" + marriage +
                ", numberOfChild=" + numberOfChild +
                '}';
    }
}

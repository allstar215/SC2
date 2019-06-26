package com.example.daron.sc2.models;

public class igfavcontacts {

    private String name;
    private String address;
    private String category;
    private String profileImage;

    public igfavcontacts(String name, String phonenumber, String device, String email, String profileImage) {
        this.name = name;
        this.address = address;
        this.category = category;
        this.profileImage = profileImage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return address;
    }

    public void setPhonenumber(String phonenumber) {
        this.address = phonenumber;
    }

    public String getDevice() {
        return category;
    }

    public void setDevice(String device) {
        this.category = device;
    }


    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", category='" + category + '\'' +
                ", profileImage='" + profileImage + '\'' +
                '}';
    }
}

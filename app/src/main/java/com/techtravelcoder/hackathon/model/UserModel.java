package com.techtravelcoder.hackathon.model;

public class UserModel {

    String userName,userPassword,userEmail,userPhoneNumber,userUniversity,userBloodGroup,userDept,userHall,userRoom;

    public UserModel(String userName, String userPassword, String userEmail, String userPhoneNumber, String userUniversity, String userBloodGroup, String userDept, String userHall, String userRoom) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
        this.userUniversity = userUniversity;
        this.userBloodGroup = userBloodGroup;
        this.userDept = userDept;
        this.userHall = userHall;
        this.userRoom = userRoom;
    }

    public UserModel(String userName, String userPassword, String userEmail, String userPhoneNumber, String userUniversity, String userBloodGroup) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
        this.userUniversity = userUniversity;
        this.userBloodGroup = userBloodGroup;
    }

    public UserModel(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserUniversity() {
        return userUniversity;
    }

    public void setUserUniversity(String userUniversity) {
        this.userUniversity = userUniversity;
    }

    public String getUserBloodGroup() {
        return userBloodGroup;
    }

    public void setUserBloodGroup(String userBloodGroup) {
        this.userBloodGroup = userBloodGroup;
    }

    public String getUserDept() {
        return userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept;
    }

    public String getUserHall() {
        return userHall;
    }

    public void setUserHall(String userHall) {
        this.userHall = userHall;
    }

    public String getUserRoom() {
        return userRoom;
    }

    public void setUserRoom(String userRoom) {
        this.userRoom = userRoom;
    }
}

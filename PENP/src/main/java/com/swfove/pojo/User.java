package com.swfove.pojo;

public class User {
    private int userId;
    private String userName;
    private String userPassword;
    private int userJobNumber;
    private Integer userGender;
    private  int userPhoneNumber;
    private String userEmail;
    private String userWechatNumber;
    private int userQQn;
    private String userDepartment;
    private String userPosition;
    private String userRegion;
    private String userContactAddress;
    private String userProductGroup;

    public User() {
    }

    public User(int userId, String userName, String uerPassword, int userJobNumber, Integer userGender, int userPhoneNumber, String userEmail, String userWechatNumber, int userQQn, String userDepartment, String userPosition, String userRegion, String userContactAddress, String userProductGroup) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = uerPassword;
        this.userJobNumber = userJobNumber;
        this.userGender = userGender;
        this.userPhoneNumber = userPhoneNumber;
        this.userEmail = userEmail;
        this.userWechatNumber = userWechatNumber;
        this.userQQn = userQQn;
        this.userDepartment = userDepartment;
        this.userPosition = userPosition;
        this.userRegion = userRegion;
        this.userContactAddress = userContactAddress;
        this.userProductGroup = userProductGroup;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUerPassword() {
        return userPassword;
    }

    public void setUerPassword(String uerPassword) {
        this.userPassword = uerPassword;
    }

    public int getUserJobNumber() {
        return userJobNumber;
    }

    public void setUserJobNumber(int userJobNumber) {
        this.userJobNumber = userJobNumber;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public int getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(int userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserWechatNumber() {
        return userWechatNumber;
    }

    public void setUserWechatNumber(String userWechatNumber) {
        this.userWechatNumber = userWechatNumber;
    }

    public int getUserQQn() {
        return userQQn;
    }

    public void setUserQQn(int userQQn) {
        this.userQQn = userQQn;
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    public String getUserRegion() {
        return userRegion;
    }

    public void setUserRegion(String userRegion) {
        this.userRegion = userRegion;
    }

    public String getUserContactAddress() {
        return userContactAddress;
    }

    public void setUserContactAddress(String userContactAddress) {
        this.userContactAddress = userContactAddress;
    }

    public String getUserProductGroup() {
        return userProductGroup;
    }

    public void setUserProductGroup(String userProductGroup) {
        this.userProductGroup = userProductGroup;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", uerPassword='" + userPassword + '\'' +
                ", userJobNumber=" + userJobNumber +
                ", userGender=" + userGender +
                ", userPhoneNumber=" + userPhoneNumber +
                ", userEmail='" + userEmail + '\'' +
                ", userWechatNumber='" + userWechatNumber + '\'' +
                ", userQQn=" + userQQn +
                ", userDepartment='" + userDepartment + '\'' +
                ", userPosition='" + userPosition + '\'' +
                ", userRegion='" + userRegion + '\'' +
                ", userContactAddress='" + userContactAddress + '\'' +
                ", userProductGroup='" + userProductGroup + '\'' +
                '}';
    }
}

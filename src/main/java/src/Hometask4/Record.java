package src.Hometask4;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Objects;

/**
    Here we are getting all needed data to fulfill the correct method
 Created by Kyrylo Khliebnykov on 05.07.2021.
 */
public class Record {
    private String surname;
    private String name;
    private String fathersName;
    private String nickname;
    private String Comment;
    private Group group;
    private String phoneNumberHome;
    private String phoneNumberMobile;
    private String phoneNumberMobile2;
    private String email;
    private String skype;
    private String adress;
    private int zipCode;
    private String city;
    private String street;
    private int buildingNumber;
    private int apartmentsNumber;
    private Calendar recordInsertDate;
    private Calendar recordEditDate;
    private HashSet<Record> recordsBook = new HashSet<>();
    public Record(){}

    public Record(String surname, String name, String nickname) {
        this.surname = surname;
        this.name = name;
        this.nickname = nickname;
    }

    public String processName(String surname, String name){
        return surname + name.substring(0,1) + ".";
    }
    public String getAdress(int zipCode, String city, String street, int buildingNumber, int apartmentsNumber){
        adress = zipCode + ", "+  city + ", "+  street +", "+   buildingNumber + "// "+   apartmentsNumber;
        return adress;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getPhoneNumberHome() {
        return phoneNumberHome;
    }

    public void setPhoneNumberHome(String phoneNumberHome) {
        this.phoneNumberHome = phoneNumberHome;
    }

    public String getPhoneNumberMobile() {
        return phoneNumberMobile;
    }

    public void setPhoneNumberMobile(String phoneNumberMobile) {
        this.phoneNumberMobile = phoneNumberMobile;
    }

    public String getPhoneNumberMobile2() {
        return phoneNumberMobile2;
    }

    public void setPhoneNumberMobile2(String phoneNumberMobile2) {
        this.phoneNumberMobile2 = phoneNumberMobile2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public int getApartmentsNumber() {
        return apartmentsNumber;
    }

    public void setApartmentsNumber(int apartmentsNumber) {
        this.apartmentsNumber = apartmentsNumber;
    }

    public Calendar getRecordInsertDate() {
        return recordInsertDate;
    }

    public void setRecordInsertDate(Calendar recordInsertDate) {
        this.recordInsertDate = recordInsertDate;
    }

    public Calendar getRecordEditDate() {
        return recordEditDate;
    }

    public void setRecordEditDate(Calendar recordEditDate) {
        this.recordEditDate = recordEditDate;
    }

    public HashSet<Record> getRecordsBook() {
        return recordsBook;
    }

    /*
    The equals, hashcode and toString are not finished yet and require a rework after clarifying the task
     */
    @Override
    public String toString() {
        return surname + " " + name.substring(0,1) + ". " + "nickname: " + nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return surname.equals(record.surname) &&
                name.equals(record.name) &&
                nickname.equals(record.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, nickname);
    }
}

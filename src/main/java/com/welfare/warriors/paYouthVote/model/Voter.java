package com.welfare.warriors.paYouthVote.model;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "voters")
public class Voter {
    @Id
    public String id;

    private int contactId;
    private String email;
    private String zipCode;
    private Date dob;
    private boolean isAdult;
    private boolean isCitizen;
    private String title;
    private String suffix;
    private String firstName;
    private String middleName;
    private String lastName;
    private boolean isNameChanged;
    private String hmeAddLine1;
    private String hmeAddLine2;
    private String hmeAddUnitType;
    private String hmeAddUnitNumber;
    private String hmeAddCity;
    private String hmeAddState;
    private String hmeAddZipCode;
    private boolean isAddressChanged;
    private boolean isMailAddDifferent;
    private String mailAddLine1;
    private String mailAddLine2;
    private String mailAddUnitType;
    private String mailAddUnitNumber;
    private String mailAddCity;
    private String mailAddState;
    private String mailAddZipCode;
    private boolean isPartyChanged;
    private String politicalParty;
    private String race;
    private Integer phone;
    private String phoneType;
    private boolean isPhoneConsent;
    private boolean isEmailConsent;
    private String schoolName;
    private boolean isVolunteer;
    private Integer pennDOTNum;
    private boolean isDotNum;
    private String ssnNum;
    private boolean isSsnNum;
    private boolean isSomeHelped;
    private String sign;
    private String isAckTerms;

    @CreatedDate
    private LocalDateTime createdAt;

    public String getId() {
        return id;
    }

    public int getContactId() {
        return contactId;
    }

    public String getEmail() {
        return email;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Date getDob() {
        return dob;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public boolean isCitizen() {
        return isCitizen;
    }

    public String getTitle() {
        return title;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isNameChanged() {
        return isNameChanged;
    }

    public String getHmeAddLine1() {
        return hmeAddLine1;
    }

    public String getHmeAddLine2() {
        return hmeAddLine2;
    }

    public String getHmeAddUnitType() {
        return hmeAddUnitType;
    }

    public String getHmeAddUnitNumber() {
        return hmeAddUnitNumber;
    }

    public String getHmeAddCity() {
        return hmeAddCity;
    }

    public String getHmeAddState() {
        return hmeAddState;
    }

    public String getHmeAddZipCode() {
        return hmeAddZipCode;
    }

    public boolean isAddressChanged() {
        return isAddressChanged;
    }

    public boolean isMailAddDifferent() {
        return isMailAddDifferent;
    }

    public String getMailAddLine1() {
        return mailAddLine1;
    }

    public String getMailAddLine2() {
        return mailAddLine2;
    }

    public String getMailAddUnitType() {
        return mailAddUnitType;
    }

    public String getMailAddUnitNumber() {
        return mailAddUnitNumber;
    }

    public String getMailAddCity() {
        return mailAddCity;
    }

    public String getMailAddState() {
        return mailAddState;
    }

    public String getMailAddZipCode() {
        return mailAddZipCode;
    }

    public boolean isPartyChanged() {
        return isPartyChanged;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public String getRace() {
        return race;
    }

    public Integer getPhone() {
        return phone;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public boolean isPhoneConsent() {
        return isPhoneConsent;
    }

    public boolean isEmailConsent() {
        return isEmailConsent;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public boolean isVolunteer() {
        return isVolunteer;
    }

    public Integer getPennDOTNum() {
        return pennDOTNum;
    }

    public boolean isDotNum() {
        return isDotNum;
    }

    public String getSsnNum() {
        return ssnNum;
    }

    public boolean isSsnNum() {
        return isSsnNum;
    }

    public boolean isSomeHelped() {
        return isSomeHelped;
    }

    public String getSign() {
        return sign;
    }

    public String getIsAckTerms() {
        return isAckTerms;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Voter(String id, int contactId, String email, String zipCode, Date dob, boolean isAdult, boolean isCitizen, String title, String suffix, String firstName, String middleName, String lastName, boolean isNameChanged, String hmeAddLine1, String hmeAddLine2, String hmeAddUnitType, String hmeAddUnitNumber, String hmeAddCity, String hmeAddState, String hmeAddZipCode, boolean isAddressChanged, boolean isMailAddDifferent, String mailAddLine1, String mailAddLine2, String mailAddUnitType, String mailAddUnitNumber, String mailAddCity, String mailAddState, String mailAddZipCode, boolean isPartyChanged, String politicalParty, String race, Integer phone, String phoneType, boolean isPhoneConsent, boolean isEmailConsent, String schoolName, boolean isVolunteer, Integer pennDOTNum, boolean isDotNum, String ssnNum, boolean isSsnNum, boolean isSomeHelped, String sign, String isAckTerms, LocalDateTime createdAt) {
        this.id = id;
        this.contactId = contactId;
        this.email = email;
        this.zipCode = zipCode;
        this.dob = dob;
        this.isAdult = isAdult;
        this.isCitizen = isCitizen;
        this.title = title;
        this.suffix = suffix;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.isNameChanged = isNameChanged;
        this.hmeAddLine1 = hmeAddLine1;
        this.hmeAddLine2 = hmeAddLine2;
        this.hmeAddUnitType = hmeAddUnitType;
        this.hmeAddUnitNumber = hmeAddUnitNumber;
        this.hmeAddCity = hmeAddCity;
        this.hmeAddState = hmeAddState;
        this.hmeAddZipCode = hmeAddZipCode;
        this.isAddressChanged = isAddressChanged;
        this.isMailAddDifferent = isMailAddDifferent;
        this.mailAddLine1 = mailAddLine1;
        this.mailAddLine2 = mailAddLine2;
        this.mailAddUnitType = mailAddUnitType;
        this.mailAddUnitNumber = mailAddUnitNumber;
        this.mailAddCity = mailAddCity;
        this.mailAddState = mailAddState;
        this.mailAddZipCode = mailAddZipCode;
        this.isPartyChanged = isPartyChanged;
        this.politicalParty = politicalParty;
        this.race = race;
        this.phone = phone;
        this.phoneType = phoneType;
        this.isPhoneConsent = isPhoneConsent;
        this.isEmailConsent = isEmailConsent;
        this.schoolName = schoolName;
        this.isVolunteer = isVolunteer;
        this.pennDOTNum = pennDOTNum;
        this.isDotNum = isDotNum;
        this.ssnNum = ssnNum;
        this.isSsnNum = isSsnNum;
        this.isSomeHelped = isSomeHelped;
        this.sign = sign;
        this.isAckTerms = isAckTerms;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "id='" + id + '\'' +
                ", contactId=" + contactId +
                ", email='" + email + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", dob=" + dob +
                ", isAdult=" + isAdult +
                ", isCitizen=" + isCitizen +
                ", title='" + title + '\'' +
                ", suffix='" + suffix + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isNameChanged=" + isNameChanged +
                ", hmeAddLine1='" + hmeAddLine1 + '\'' +
                ", hmeAddLine2='" + hmeAddLine2 + '\'' +
                ", hmeAddUnitType='" + hmeAddUnitType + '\'' +
                ", hmeAddUnitNumber='" + hmeAddUnitNumber + '\'' +
                ", hmeAddCity='" + hmeAddCity + '\'' +
                ", hmeAddState='" + hmeAddState + '\'' +
                ", hmeAddZipCode='" + hmeAddZipCode + '\'' +
                ", isAddressChanged=" + isAddressChanged +
                ", isMailAddDifferent=" + isMailAddDifferent +
                ", mailAddLine1='" + mailAddLine1 + '\'' +
                ", mailAddLine2='" + mailAddLine2 + '\'' +
                ", mailAddUnitType='" + mailAddUnitType + '\'' +
                ", mailAddUnitNumber='" + mailAddUnitNumber + '\'' +
                ", mailAddCity='" + mailAddCity + '\'' +
                ", mailAddState='" + mailAddState + '\'' +
                ", mailAddZipCode='" + mailAddZipCode + '\'' +
                ", isPartyChanged=" + isPartyChanged +
                ", politicalParty='" + politicalParty + '\'' +
                ", race='" + race + '\'' +
                ", phone=" + phone +
                ", phoneType='" + phoneType + '\'' +
                ", isPhoneConsent=" + isPhoneConsent +
                ", isEmailConsent=" + isEmailConsent +
                ", schoolName='" + schoolName + '\'' +
                ", isVolunteer=" + isVolunteer +
                ", pennDOTNum=" + pennDOTNum +
                ", isDotNum=" + isDotNum +
                ", ssnNum='" + ssnNum + '\'' +
                ", isSsnNum=" + isSsnNum +
                ", isSomeHelped=" + isSomeHelped +
                ", sign='" + sign + '\'' +
                ", isAckTerms='" + isAckTerms + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

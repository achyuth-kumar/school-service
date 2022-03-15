package com.example.Administration;
public class School {
    private final int id;
    private final String schoolName;
    private final String branchName;
    private final String location;
    private final String pincode;
    private final String fee; 

    public School(final int id, final String schoolName, final String branchName,final String location,final String pincode,final String fee) {
        this.id = id;
        this.schoolName = schoolName;
        this.branchName=branchName;
        this.location=location;
        this.pincode=pincode;
        this.fee=fee;

    }

    public int getId() {
        return id;
    }

    public String getSchoolName() {
        return schoolName;
    }
    public String getBranchName() {
        return branchName;
    }
    public String getLocation() {
        return location;
    }
    public String getPincode() {
        return pincode;
    }
    public String getFee() {
        return fee;
    }


}
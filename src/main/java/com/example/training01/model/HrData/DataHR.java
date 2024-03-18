package com.example.training01.model.HrData;

import lombok.Data;

import java.util.ArrayList;

@Data
public class DataHR {
    private String login_type;
    private String employeeid;
    private String engsalutation;
    private String engfirstname;
    private String englastname;
    private String salutation;
    private String thaifirstname;
    private String thailastname;
    private String thaipositionname;
    private String engpositionname;
    private String dept;
    private String company;
    private String directline;
    private String ext1;
    private String ext2;
    private String fax;
    private String mobile;
    private String bldgname;
    private String floor;
    private String areazone;
    private String costcenter;
    private String organizationcode;
    private String deptcode;
    private String hire;
    private String seqi;
    private String email;
    private String loginname;
    private String emplid;
    private String identificationno;
    private String postlevel;
    private String etype;
    private String mobile2;
    private String sbu;
    private String bu;
    private String cost_center_owner;
    private String deptid;
    private String report_to_deptid;
    private String track;
    private String psid;
    private String depcode_sub5;
    private String token;
    private String manager;
    private String mobile_token;
    private String image;
    private String pwdlastset;
    private String lastlogon;
    private String pwdexpire;
    private ArrayList<Chief> chief;
    private ArrayList<Hrp> hrp;
    private ArrayList<Costcenterowner> costcenterowner;
    private String eligible;
    private String eligible_iphone;
    private ArrayList<BizPhone> biz_phone;
}

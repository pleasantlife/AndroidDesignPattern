package com.gandan.android.androiddesignpattern.builder;

public class ConstructorPattern {

    private final String memberName;
    private final String memberGender;
    private final String memberAddress;

    public ConstructorPattern(String memberName){
        this(memberName, "UnKnown", "UnKnown");
    }

    public ConstructorPattern(String memberName, String memberGender){
        this(memberName, memberGender, "UnKnown");
    }

    public ConstructorPattern(String memberName, String memberGender, String memberAddress){
        this.memberName = memberName;
        this.memberGender = memberGender;
        this.memberAddress = memberAddress;
    }


    public String getMemberName() {
        return memberName;
    }

    public String getMemberGender() {
        return memberGender;
    }

    public String getMemberAddress() {
        return memberAddress;
    }
}

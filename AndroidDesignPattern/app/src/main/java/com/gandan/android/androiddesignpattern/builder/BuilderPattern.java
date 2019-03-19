package com.gandan.android.androiddesignpattern.builder;

public class BuilderPattern {

    private final String memberName;
    private final int memberAge;
    private final String memberGender;
    private final String memberNationality;
    private final String memberHobby;


    public static class Builder {
        private final String memberName;
        private final int memberAge;

        //선택인자는 기본값을 넣어준다!
        private String memberGender = "Unknown";
        private String memberNationality = "Unknown";
        private String memberHobby = "Unknown";

        public Builder(String memberName, int memberAge){
            this.memberName = memberName;
            this.memberAge = memberAge;
        }

        public Builder memberGender(String gender){
            memberGender = gender;
            return this;
        }

        public Builder memberNationality(String nationality){
            memberNationality = nationality;
            return this;
        }

        public Builder memberHobby(String hobby){
            memberHobby = hobby;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }

    private BuilderPattern(Builder builder){
        memberName = builder.memberName;
        memberAge = builder.memberAge;
        memberGender = builder.memberGender;
        memberNationality = builder.memberNationality;
        memberHobby = builder.memberHobby;
    }




}

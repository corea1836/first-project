package com.flab.sns.user.domain;

import java.util.Date;
//도메인 로직은 도메인 엔티티의 상태를 바꾸는 행위


public class Account extends AccountState{

    private Account(String Id, String password, String firstName, String lastName, String phone, String email, Date birth, Gender gender, String location) {
        super(Id, password, firstName, lastName, phone, email, birth, gender, location);
    }

    public static Account buildNewAccount(String Id,
                              String password,
                              String firstName,
                              String lastName,
                              String phone,
                              String email,
                              Date birth,
                              Gender gender,
                              String location) {
        return new Account(Id, password, firstName, lastName, phone, email, birth, gender, location);
    }



    //    public boolean updateUserInfo(String firstName,
//                                  String  phone,
//                                  String email,
//                                  String location) {
//        return false;
//    }
//
//    public boolean updatePassword(String newPassword) {
//        return false;
//    }

//    public Optional<String> getId() {
//        return Optional.ofNullable(this.Id);
//    }
//
//
//    public Optional<String> getPassword() {
//        return Optional.ofNullable(this.password);
//    }

//    public Account buildSignInInfo(String Id, String password) {
//        buildAccount(Id, password, null, null, null, null, null, null, null);
//        return (Account) this;
//    }


}

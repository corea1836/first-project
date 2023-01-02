package com.flab.sns.user.application.port.in;

import com.flab.sns.user.domain.Account;
import com.flab.sns.user.domain.AccountState;

import java.util.Date;


public class WebAccountEntity extends AccountState {

    private WebAccountEntity() {
    }

    public String getId() {
        return Id;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirth() {
        return birth;
    }

    public Gender getGender() {
        return gender;
    }

    public String getLocation() {
        return location;
    }

    public static WebAccountEntity buildWebAccountModel(String Id,
                                                        String password,
                                                        String firstName,
                                                        String lastName,
                                                        String phone,
                                                        String email,
                                                        Date birth,
                                                        Account.Gender gender,
                                                        String location) {
        AccountState<Account> model = new WebAccountEntity().buildAccount(Id, password, firstName, lastName, phone, email, birth, gender, location);
        return (WebAccountEntity) model;
    }

    public static WebAccountEntity buildSignInModel(String Id, String password) {
        AccountState<WebAccountEntity> model = new WebAccountEntity().buildAccount(Id, password, null, null, null, null, null, null, null);
        return (WebAccountEntity) model;
    }
}

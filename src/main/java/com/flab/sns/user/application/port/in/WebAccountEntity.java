package com.flab.sns.user.application.port.in;

import com.flab.sns.user.domain.Account;
import com.flab.sns.user.domain.AccountState;

import java.util.Date;


public class WebAccountEntity extends AccountState {

    private WebAccountEntity(String Id, String password, String firstName, String lastName, String phone, String email, Date birth, Gender gender, String location) {
        super(Id, password, firstName, lastName, phone, email, birth, gender, location);
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
       return new WebAccountEntity(Id, password, firstName, lastName, phone, email, birth, gender, location);
    }

    public static WebAccountEntity buildSignInModel(String Id, String password) {
        return new WebAccountEntity(Id, password, null, null, null, null, null, null, null);
    }
}

package com.flab.sns.user.application.port.in;

import com.flab.sns.common.SelfValidating;
import com.flab.sns.user.domain.Account;
import lombok.Value;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Value
public class AccountCommand extends SelfValidating<AccountCommand> {

    @NotNull private final String Id;
    @NotNull private final String password;
    @NotNull private final String firstName;
    @NotNull private final String lastName;
    private final String phone;
    private final String email;
    @NotNull private final Date birth;
    private final Account.Gender gender;
    private final String location ;


    public AccountCommand(WebAccountEntity model) {
        this.Id = model.getId();
        this.password = model.getPassword();
        this.firstName = model.getFirstName();
        this.lastName = model.getLastName();
        this.phone = model.getPhone();
        this.email = model.getEmail();
        this.birth = model.getBirth();
        this.gender = model.getGender();
        this.location = model.getLocation();
    }



}

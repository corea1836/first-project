package com.flab.sns.user.application.port.in;

import com.flab.sns.common.SelfValidating;
import lombok.Value;
import javax.validation.constraints.NotNull;

@Value
public class SignInOutCommand extends SelfValidating<SignInOutCommand> {

    @NotNull private final String Id;
    @NotNull private final String password;

    public SignInOutCommand(WebAccountEntity model) {
        this.Id = model.getId();
        this.password = model.getPassword();
    }



}

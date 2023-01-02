package com.flab.sns.user.application.service;


import com.flab.sns.user.application.port.in.SignInOutCommand;
import com.flab.sns.user.application.port.in.SignInOutUseCase;
import com.flab.sns.user.application.port.out.LoadAccountPort;
import com.flab.sns.user.domain.Account;
import lombok.RequiredArgsConstructor;
import java.util.Optional;

@RequiredArgsConstructor
public class SignInOutService implements SignInOutUseCase {
    private final LoadAccountPort loadAccountPort;

    @Override
    public boolean SignIn(SignInOutCommand command) {
        checkSignInRule(command);
        return true;
    }

    @Override
    public boolean SignOut() {
        return false;
    }

    public Account loadAccount(String Id) {
        return loadAccountPort.loadAccount(Id);
    }

    private void checkSignInRule(SignInOutCommand command) {
        Account account = loadAccount(command.getId());

        String AccountId = Optional.ofNullable(account.getId())
                .orElseThrow(() -> new IllegalStateException("This Id is not exist. Please check an Id"));

        if(!account.getPassword().equals(command.getPassword()))
            throw new IllegalStateException("This password is not correct in this Id. Please check a password");

    }


}

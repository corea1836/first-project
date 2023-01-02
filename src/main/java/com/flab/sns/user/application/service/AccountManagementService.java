package com.flab.sns.user.application.service;

import com.flab.sns.user.application.port.in.AccountCommand;
import com.flab.sns.user.application.port.in.AccountManagementUseCase;

import com.flab.sns.user.application.port.out.AccountManagePort;
import com.flab.sns.user.application.port.out.LoadAccountPort;
import com.flab.sns.user.domain.Account;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class AccountManagementService implements AccountManagementUseCase {

    private final LoadAccountPort loadAccountPort;
    private final AccountManagePort accountManagePort;

    @Override
    public boolean createAccount(AccountCommand command) {
        checkCreateAccountRule(command);
        Account newAccount = Account.buildNewAccount(command.getId(),
                                                    command.getPassword(),
                                                    command.getFirstName(),
                                                    command.getLastName(),
                                                    command.getPhone(),
                                                    command.getEmail(),
                                                    command.getBirth(),
                                                    command.getGender(),
                                                    command.getLocation());
        accountManagePort.createAccount(newAccount);
        return true;
    }


    @Override
    public boolean updateAccount() {
        return false;
    }

    @Override
    public boolean deleteAccount() {
        return false;
    }


    private void checkCreateAccountRule(AccountCommand command) {
        Optional.ofNullable(loadAccountPort.loadId(command.getId()))
                .ifPresent(action -> {throw new IllegalStateException("This Id is already Exist");});

        Optional.ofNullable(loadAccountPort.loadEmail(command.getEmail()))
                .ifPresent(action -> {throw new IllegalStateException("This email is already Exist");});

        //비밀번호 비지니스 로직 넣어야 하나?

        //지역이 존재하지 않음은 어디서 검색?

    }

}

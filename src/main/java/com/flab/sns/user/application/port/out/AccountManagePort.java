package com.flab.sns.user.application.port.out;

import com.flab.sns.user.domain.Account;

public interface AccountManagePort {

    void createAccount(Account account);
}

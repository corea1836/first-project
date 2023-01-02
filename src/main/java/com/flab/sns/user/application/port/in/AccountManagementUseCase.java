package com.flab.sns.user.application.port.in;

public interface AccountManagementUseCase {

    boolean createAccount(AccountCommand command);
    boolean updateAccount();
    boolean deleteAccount();
}

package com.flab.sns.user.application.port.out;

import com.flab.sns.user.domain.Account;

public interface LoadAccountPort {

    Account loadAccount(String Id);

    String loadId(String Id);

    String loadEmail(String email);

}

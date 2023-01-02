package com.flab.sns.user.application.port.in;

public interface SignInOutUseCase {

    boolean SignIn(SignInOutCommand command);
    boolean SignOut();

}

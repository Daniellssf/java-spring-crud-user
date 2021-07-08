package com.tp3.session;

import com.tp3.model.User;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserSession {

    User user;

    public void addLoggedUser(User user) {
        this.user = user;
    }

    public User getLoggedUser() {
        return user;
    }

    public void removeLoggedUser() {
        this.user = null;
    }
}

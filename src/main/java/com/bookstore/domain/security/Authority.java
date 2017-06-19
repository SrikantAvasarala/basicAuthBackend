package com.bookstore.domain.security;


import java.io.Serializable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import org.springframework.security.core.GrantedAuthority;


@AllArgsConstructor
public class Authority implements GrantedAuthority, Serializable {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private static final long serialVersionUID = 123123L;

    private final String autority;

    @Override
    public String getAuthority() {
        return autority;
    }
}

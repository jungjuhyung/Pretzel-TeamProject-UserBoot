package com.ict.pretzel.vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringJoiner;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class UserVO implements UserDetails{
    private String user_idx, user_id, pwd, name, email, subs, regdate,  
                last_login, status, admin_id, subs_date, subs_update;

    private List<GrantedAuthority> authorities = new ArrayList<>();
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {       return authorities;    }
    @Override
    public String getPassword() {          return pwd;    }
    @Override
    public String getUsername() {        return user_idx;    }
    @Override
    public boolean isAccountNonExpired() {        return true;    }
    @Override
    public boolean isAccountNonLocked() {        return true;    }
    @Override
    public boolean isCredentialsNonExpired() {        return true;    }
    @Override
    public boolean isEnabled() {        return true;    }
}

package org.penitence.spring.oauth2.services;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * class using
 * create by 2017/5/25
 *
 * @version 1.0.0
 * @auther Penitence
 */
@Configurable
@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = new User("penitence","penitence1992",
                AuthorityUtils.createAuthorityList("ROLE_USER"));
        return user;
    }
}

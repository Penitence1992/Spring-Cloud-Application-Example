package org.penitence.spring.oauth2.services;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
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
public class ClientDetailServiceImpl implements ClientDetailsService {
    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        BaseClientDetails clientDetails = new BaseClientDetails("oauth2Resource","oauth2Res","all",
                "authorization_code","ROLE_USER");
        clientDetails.setClientSecret("oauth2");
        return clientDetails;
    }
}

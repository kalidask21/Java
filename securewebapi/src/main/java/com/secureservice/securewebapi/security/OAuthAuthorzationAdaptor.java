package com.secureservice.securewebapi.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;


//@Configuration
//@EnableAutoConfiguration
public class OAuthAuthorzationAdaptor extends AuthorizationServerConfigurerAdapter{

	private int accessTokenValiditySeconds = 10000;
    private int refreshTokenValiditySeconds = 30000;

    @Value("${security.oauth2.resource.id}")
    private String resourceId;

    @Autowired
    private AuthenticationManager authenticationManager;

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		// TODO Auto-generated method stub
		endpoints.authenticationManager(authenticationManager);
	}

	@Override
	public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
		// TODO Auto-generated method stub
		oauthServer.checkTokenAccess("isAuthenticated()"); 
	}

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory()
        .withClient("trusted-app")
            .authorizedGrantTypes("client_credentials", "password", "refresh_token")
            .authorities("ROLE_TRUSTED_CLIENT")
            .scopes("read", "write")
            .resourceIds(resourceId)
            .accessTokenValiditySeconds(accessTokenValiditySeconds)
            .refreshTokenValiditySeconds(refreshTokenValiditySeconds)
            .secret("secret");
	}
    
    

}

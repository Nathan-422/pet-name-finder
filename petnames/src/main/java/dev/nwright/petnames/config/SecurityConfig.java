package dev.nwright.petnames.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class SecurityConfig {
    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
					.csrf().disable()
					.authorizeRequests()
					.antMatchers("/**/auth/**")
						.permitAll()
						.anyRequest()
						.authenticated()
					.and()
						.cors(Customizer.withDefaults())
						.sessionManagement()
						.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
					.and()
						.authenticationProvider(authenticationProvider())
						.addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);
//            .cors(Customizer.withDefaults())

		return http.build();
	
	}

}

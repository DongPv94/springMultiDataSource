package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.example.demo.jwt.JwtUsernameAndPasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

	private final PasswordEncoder passwordEncoder;

	@Autowired
	public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable()
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
				.and()
				.addFilter(new JwtUsernameAndPasswordAuthenticationFilter(authenticationManager()))
				// .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()).and()
				.authorizeRequests().antMatchers("/", "index", "/css/*", "/js/*").permitAll()
				.antMatchers("/agent/api/v1/**").hasRole(ApplicationUserRole.ADMIN.name())
				// .antMatchers(HttpMethod.POST,
				// "/agent/api/v1/tollcollection/**").hasAuthority(COURSE_WRITE.getPermission())

				.anyRequest().authenticated()
				//.and().httpBasic()
				;
	}

	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		UserDetails userView = User.builder().username("user_view").password(passwordEncoder.encode("user_view"))
				// .roles(ApplicationUserRole.USER_VIEW.name())
				.authorities(ApplicationUserRole.USER_VIEW.getGrantedAuthorities()).build();
		UserDetails admin = User.builder().username("admin").password(passwordEncoder.encode("admin"))
				// .roles(ApplicationUserRole.ADMIN.name())
				.authorities(ApplicationUserRole.ADMIN.getGrantedAuthorities()).build();
		return new InMemoryUserDetailsManager(admin, userView);
	}

}

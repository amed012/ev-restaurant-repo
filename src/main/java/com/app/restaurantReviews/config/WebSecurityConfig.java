package com.app.restaurantReviews.config;


import javax.servlet.Filter;


public class WebSecurityConfig  {
   /* @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/user").hasRole("USER")
                .anyRequest().authenticated()
                .and()
                .formLogin();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
      auth.inMemoryAuthentication()
              .withUser("springuser").password(passwordEncoder().encode("spring123")).roles("USER")
         .and()
         .withUser("springadmin").password(passwordEncoder().encode("admin123")).roles("ADMIN", "USER");
}
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
*/
}
//package com.billow.gateway.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
//@Configuration
////@EnableResourceServer
////@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableWebFluxSecurity
//public class ResourceServerConfiguration {
//
////    @Autowired
////    private AppSecurityExpressionHandler appSecurityExpressionHandler;
//    @Autowired
//    private AuthService authService;
//
//    @Bean
//    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
//        http.csrf().disable();
//        http.authorizeExchange()
//                .pathMatchers("/**/*Api/**", "/*Api/**")
//                .authenticated()
//                .anyExchange()
//                .access(authService);
//        return http.build();
//    }
//
////        @Override
////    public void configure(HttpSecurity http) throws Exception {
////        http.csrf().disable()
////                // 由于我们希望在用户界面中访问受保护的资源，因此我们需要允许创建会话
//////                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
//////                .and()
////                .requestMatchers().anyRequest()
////                .and()
////                //启用匿名登录，不可访问受保护资源
////                .anonymous()
////                .and()
////                .authorizeRequests()
////                //配置protected访问控制，必须认证过后才可以访问
////                .antMatchers("/**/*Api/**", "/*Api/**")
//////                .access("@authService.hasPermission(request,authentication)");
////                .access("@authService.hasPermission(request,authentication)");
//////                .authenticated();
////    }
////
////    // 和鉴权服务有关,springboot2.0新加入部分
////    @Override
////    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
////        resources.expressionHandler(appSecurityExpressionHandler);
////    }
//}

//package com.billow.gateway.api;
//
//import com.billow.gateway.component.SwaggerProvider;
//import com.billow.gateway.config.Swagger2Config;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Mono;
//import springfox.documentation.swagger.web.SecurityConfiguration;
//import springfox.documentation.swagger.web.SecurityConfigurationBuilder;
//import springfox.documentation.swagger.web.UiConfiguration;
//import springfox.documentation.swagger.web.UiConfigurationBuilder;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/swagger-resources")
//public class SwaggerController {
//
//    @Autowired(required = false)
//    private SecurityConfiguration securityConfiguration;
//    @Autowired(required = false)
//    private UiConfiguration uiConfiguration;
//    @Autowired
//    private SwaggerProvider swaggerResources;
//
//    @Autowired
//    public SwaggerController(SwaggerProvider swaggerResources) {
//        this.swaggerResources = swaggerResources;
//    }
//
//
//    @GetMapping("/configuration/security")
//    public Mono<ResponseEntity<SecurityConfiguration>> securityConfiguration() {
//        return Mono.just(new ResponseEntity<>(
//                Optional.ofNullable(securityConfiguration).orElse(SecurityConfigurationBuilder.builder().build()), HttpStatus.OK));
//    }
//
//    @GetMapping("/configuration/ui")
//    public Mono<ResponseEntity<UiConfiguration>> uiConfiguration() {
//        return Mono.just(new ResponseEntity<>(
//                Optional.ofNullable(uiConfiguration).orElse(UiConfigurationBuilder.builder().build()), HttpStatus.OK));
//    }
//
//    @GetMapping
//    public Mono<ResponseEntity> swaggerResources() {
//        return Mono.just((new ResponseEntity<>(swaggerResources.get(), HttpStatus.OK)));
//    }
//
////    @GetMapping("/")
////    public Mono<ResponseEntity> swaggerResourcesN() {
////        return Mono.just((new ResponseEntity<>(swaggerResources.get(), HttpStatus.OK)));
////    }
////
////    @GetMapping("/csrf")
////    public Mono<ResponseEntity> swaggerResourcesCsrf() {
////        return Mono.just((new ResponseEntity<>(swaggerResources.get(), HttpStatus.OK)));
////    }
//
//
//}

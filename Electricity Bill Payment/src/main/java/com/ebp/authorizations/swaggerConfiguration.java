package com.ebp.authorizations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author rohit.parihar 9/20/2022
 * @Class swaggerConfiguration
 * @Project Electricity Bill Payment
 */

@Configuration
public class swaggerConfiguration {

        public static final String AUTHORIZATION_HEADER = "Authorization";

        private ApiKey apiKeys() {
            return new ApiKey("JWT", AUTHORIZATION_HEADER, "header");
        }

        private List<SecurityContext> securityContexts() {
            return Arrays.asList(SecurityContext.builder().securityReferences(sf()).build());
        }

        private List<SecurityReference> sf() {

            AuthorizationScope scope = new AuthorizationScope("global", "accessEverything");

            return Arrays.asList(new SecurityReference("JWT", new AuthorizationScope[] { scope }));
        }

        @Bean
        public Docket api() {

            return new Docket(DocumentationType.SWAGGER_2).apiInfo(getInfo()).securityContexts(securityContexts())
                    .securitySchemes(List.of(apiKeys())).select().apis(RequestHandlerSelectors.any())
                    .paths(PathSelectors.any()).build();
        }

        private ApiInfo getInfo() {
            return new ApiInfo("Electricity Bill Payment (EBP) : REST (API)",
                    "This API is developed by Team 3", "1.0", "Terms of Service",
                    new Contact("Team 3", "", "rohitparih@gmail.com"),
                    "License of APIS", "API license URL", Collections.emptyList());
        };
}

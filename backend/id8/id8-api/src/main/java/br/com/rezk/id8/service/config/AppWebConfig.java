package br.com.rezk.id8.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import br.com.rezk.id8.service.resource.LoginResource;

@EnableWebMvc
@ComponentScan(basePackageClasses={LoginResource.class})
public class AppWebConfig {
}

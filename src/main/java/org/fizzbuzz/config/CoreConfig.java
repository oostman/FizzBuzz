package org.fizzbuzz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.fizzbuzz.domain"})
public class CoreConfig {
}

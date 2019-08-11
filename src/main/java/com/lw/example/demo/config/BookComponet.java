package com.lw.example.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author wander
 * @version 1.0
 * @date 2019/8/11-14:05
 */
@Component
@Validated
@ConfigurationProperties(prefix = "demo.books")
@Data
public class BookComponet {

    @NotNull
    private String name;
    @NotEmpty
    private String author;
    @NotNull
    private double price;
}

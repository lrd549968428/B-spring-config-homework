package com.thoughtworks.capability.gtb.demospringconfig;

import lombok.Data;
import lombok.ToString;

/**
 * @ description:
 * @ Author: Ezio Liu
 * @ Date: 2021/3/7 3:29 下午
 */
@Data
@ToString
public class Credentials {
    private String username;
    private String password;
    private String authMethod;
}

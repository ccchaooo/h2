package com.admin.h2.entity;

import lombok.*;

/**
 * @author dengchao
 * @date 2020/2/7 10:03
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@ToString
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
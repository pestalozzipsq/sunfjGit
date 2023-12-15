package com.sunfj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Blogger {
    private Long id;
    private String name;
    private String pass;

}

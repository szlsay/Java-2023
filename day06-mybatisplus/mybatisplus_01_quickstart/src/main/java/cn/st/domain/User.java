package cn.st.domain;

import lombok.*;

//lombok

@Data
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;
}

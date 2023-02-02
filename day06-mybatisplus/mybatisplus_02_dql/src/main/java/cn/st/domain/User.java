package cn.st.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

//lombok
@Data
@TableName("tbl_user")
public class User {
    private Long id;
    private String name;
    @TableField(value = "pwd",select = true)
//    @TableField(value = "pwd")
    private String password;
    private Integer age;
    private String tel;
    @TableField(exist = false)
    private Integer online;
}

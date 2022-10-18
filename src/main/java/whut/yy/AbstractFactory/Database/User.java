package whut.yy.AbstractFactory.Database;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//用户表
@Getter
@Setter
@AllArgsConstructor
public class User {
    private int id;
    private String name;
}

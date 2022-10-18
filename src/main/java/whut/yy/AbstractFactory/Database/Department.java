package whut.yy.AbstractFactory.Database;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//数据库表，部门表
@Getter
@Setter
@AllArgsConstructor
public class Department {
    private int id;
    private String deptName;
}

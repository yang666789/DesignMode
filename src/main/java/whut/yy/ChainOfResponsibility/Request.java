package whut.yy.ChainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request {
    private String requestType;//请求类型
    private String requestContent;//请求内容
    private int number;//请求数量
}

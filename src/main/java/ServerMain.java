import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.RMISocketFactory;

/**
 * 服务端RMI服务启动
 * @author flytoyou
 * @version 1.0.0
 */
public class ServerMain {

    public static void main(String[] args) throws Exception{
        //注册服务
        LocateRegistry.createRegistry(8080);
        //指定通信接口，防止被防火墙拦截
        RMISocketFactory.setSocketFactory(new CustomerSocketFactory());
        //创建服务
        HelloService helloService = new HelloServiceImpl();
        Naming.bind("rmi://localhost:8080/HelloService",helloService);
        System.out.println("ServerMain provide RPC service now");
    }

}

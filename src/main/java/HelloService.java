import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * RMI接口方法定义必须显式声明抛出RemoteException异常
 * @author flytoyou
 * @1.0.0
 */
public interface HelloService extends Remote {

    String sayHello(String someOne) throws RemoteException;

}

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 服务端方法实现必须继承UnicastRemoteObject类，该类定义了服务调用方法与服务提供方对象实例，并建立一对一连接。
 * @author flytoyou
 * @version 1.0.0
 */
public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {

    private static final long serialVersionUID = -6190513770400890033L;

    protected HelloServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String someOne) throws RemoteException {
        return "Hello -flytoyou," + someOne;
    }
}

import dao.UserDAO;
import dao.impl.UserDAOImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        //创建代理对象
        Class[] objs = {UserDAO.class};

        UserDAOImpl userDAO = new UserDAOImpl();

        //这里创建的是 UserDAOImpl （接口实现类）的代理对象，所以 new Handler() 传入userDAO
        //强转
        UserDAO dao = (UserDAO) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), objs, new Handler(userDAO));

        //通过代理对象dao调用UserDAO中的方法，传入参数后直接进入Handler中的invoke方法中
        int add = dao.add(1, 2);
        System.out.println("===========");
        dao.update("dawd");
    }
}

//创建代理对象代码
class Handler implements InvocationHandler {

    //创建的是谁的代理对象，就把谁传过来
    //通过有参构造传递
    private Object obj;

    public Handler(Object obj) {
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("方法之前执行...." + method.getName() + " ；传递的参数..." + Arrays.toString(args));

        //被增强的方法执行，此处的obj是UserDAOImpl userDAO
        Object res = method.invoke(obj, args);
        //方法之后
        System.out.println("方法之后执行...." + obj);
        return res;

    }
}



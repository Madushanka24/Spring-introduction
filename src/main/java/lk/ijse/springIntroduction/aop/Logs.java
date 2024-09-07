package lk.ijse.springIntroduction.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Logs {

    @After("execution(public void startTransaction())")
    public static void startTransLog() {
        System.out.println("Start TransLog");
    }

    @After("execution(public void endTransaction())")
    public static void endTransLog() {
        System.out.println("End TransLog");
    }
}

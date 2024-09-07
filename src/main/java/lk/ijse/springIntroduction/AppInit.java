package lk.ijse.springIntroduction;

import lk.ijse.springIntroduction.aop.Transaction;
import lk.ijse.springIntroduction.config.AppConfig;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        Transaction transaction = (Transaction) ctx.getBean("transaction");
        transaction.startTransaction();
        transaction.endTransaction();

       /* var myObj = ctx.getBean("myObj");
        System.out.println(myObj);

        ConfigurableListableBeanFactory beanFactory = ctx.getBeanFactory();
        System.out.println("Is Bean Singleton : " + beanFactory.isSingleton("myObj"));*/
        ctx.registerShutdownHook();

    }
}

package lk.ijse.springIntroduction.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.springIntroduction.contract.GoodGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*@Component*/
public class Nasa {

    /*DEPENDENCY INJECTION WITH FIELD INJECTION*/
    /*@Autowired
    GoodGirl goodGirl;

    public Nasa() {
        System.out.println(goodGirl);
    }

    @PostConstruct
    public void init() {
        System.out.println(goodGirl);
        goodGirl.love();
    }*/

    /*DEPENDENCY INJECTION WITH CONSTRUCTOR INJECTION*/
    private final GoodGirl goodGirl;

    /*@Autowired*/
    public Nasa(GoodGirl goodGirl) {
        this.goodGirl = goodGirl;
    }

    @PostConstruct
    public void init() {
        System.out.println(goodGirl);
        goodGirl.love();
    }


    /*DEPENDENCY INJECTION WITH SETTER INJECTION*/
    /*private final GoodGirl goodGirl;

    @Autowired
    public void setGoodGirl(GoodGirl goodGirl) {
        this.goodGirl = goodGirl;
    }

    @PostConstruct
    public void init() {
        System.out.println(goodGirl);
        goodGirl.love();
    }*/

}

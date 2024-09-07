package lk.ijse.springIntroduction.beans;

import lk.ijse.springIntroduction.contract.GoodGirl;
import org.springframework.stereotype.Component;

/*@Component*/
public class Alexa implements GoodGirl {
    @Override
    public void love() {
        System.out.println("Goes to Mars");
    }
}

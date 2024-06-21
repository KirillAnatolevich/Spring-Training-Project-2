package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dog")
//@Primary
public class Dog extends Animal{
    public Dog() {
        System.out.println("Пес готов\n");
    }
}

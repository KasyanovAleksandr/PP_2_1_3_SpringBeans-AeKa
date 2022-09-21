package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer time;
    public Timer getTimer() { //без этого метода тесты не проходят, непонятно зачем городить?
        return time;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(time.getTime());// теперь то нужен бин, иначе в итерации так и будут создаваться разные объекты.
        System.out.println("________________________");
    }
}

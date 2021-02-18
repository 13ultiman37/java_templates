package pr2;

import java.util.Comparator;

public class First_compare implements Comparator<Human> {
    public int compare(Human o1, Human o2) {
        return o1.getAge() + o1.getWeight() - o2.getAge() - o2.getWeight();
    }
}

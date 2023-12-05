import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

        PharmacyComponent azitronit = new Zitrinit("Azitronit","10mg,",50);
        PharmacyComponent pinicil = new Water("Pinicil","10mg,",50);
        PharmacyComponent water = new Pinicilin("Water","10mg,",50);

        Pharmacy pharmacy1 = new Pharmacy().addComponent(azitronit).addComponent(water);
        Pharmacy pharmacy2 = new Pharmacy().addComponent(pinicil).addComponent(water);
        Pharmacy pharmacy3 = new Pharmacy().addComponent(pinicil).addComponent(water).addComponent(azitronit);
        Pharmacy pharmacy4 = new Pharmacy().addComponent(pinicil).addComponent(water).addComponent(azitronit);
        Pharmacy pharmacy5 = new Pharmacy().addComponent(pinicil).addComponent(water).addComponent(azitronit);
        Iterator<PharmacyComponent> iterator = pharmacy1;
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);
        result.add(pharmacy5);
        System.out.println(pharmacy2.compareTo(pharmacy3));
        System.out.println(result.size());


       



    }
}

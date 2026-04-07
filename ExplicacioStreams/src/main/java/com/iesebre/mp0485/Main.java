package com.iesebre.mp0485;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<Pojo> llista= new ArrayList<>();
        llista.add(new Pojo(10));
        llista.add(new Pojo(15));
        llista.add(new Pojo(20));

        Stream<Integer> stream1=llista.stream().map(p-> p.getEdat());

        List<Integer> llistaEdats=stream1.collect(Collectors.toList());

        long comptador=stream1.filter(p->p>10 && p<20).count();



        System.out.println(comptador);

        Optional<Integer> maxim=llista.
                stream().
                map(p->p.getEdat()).
                filter(e-> e>50).
                max(Integer::compare);

        System.out.println(maxim.orElse(0));
        System.out.println(maxim.get());
    }
}

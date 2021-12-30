package com.pinocchiovirus.demomicrorestapi.coffee;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class CoffeeService {
    public List<Cofee> getCoffees(){
        return List.of(
                new Cofee(
                        1L,
                        "Abdulrazak A. Osman",
                        LocalDate.of(2021, Month.DECEMBER, 29),
                        "0547079680"
                )
        );
    }
}
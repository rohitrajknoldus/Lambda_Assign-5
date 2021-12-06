package com.Lambda_Assign;

import java.util.*;
import java.util.stream.Collectors;

public class DistinctElement {
    public static void main(String args[])
    {
        test obj= (str) -> { str=new ArrayList<>();str.add("java");str.add("scala");str.add("java");str.add("clojure");str.add("clojure"); str.add("scala");
            List<String> list=str.stream().distinct().collect(Collectors.toList());

            return String.valueOf(list);
        };
        System.out.println(obj.show(Arrays.asList()));
    }
}
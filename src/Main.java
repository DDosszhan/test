import HashSet.HashSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Doszhan");
        list.add("Orlan");
        list.add("Danil");

         list = list.stream().filter(val -> val.length()>5).collect(Collectors.toList());

        System.out.println(list);



    }

}
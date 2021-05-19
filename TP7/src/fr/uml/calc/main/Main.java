package fr.uml.calc.main;

import fr.uml.calc.Expr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("-");
        list.add("+");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(Expr.parse(list.iterator()).eval());

        Scanner scanner = new Scanner(System.in);
        System.out.println(Expr.parse(list.iterator()));

    }
}

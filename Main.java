package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    System.out.println("Wybierz rozmiar choinki:");

    int i,c = 5;
    for (i = 1; i<=c; i++){
      for (c = 0; c<i-1; c++)
        System.out.print("*");
      
    }
  }
}
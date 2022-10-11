package by.epam.java_introduction.basic_of_oop.task5;

import by.epam.java_introduction.basic_of_oop.task5.action.Client;

/**
  Создать консольное приложение, удовлетворяющее следующим требованиям:
  •  Корректно спроектируйте и реализуйте предметную область задачи.
  •  Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
  проектирования.
  •  Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
  •  для проверки корректности переданных данных можно применить регулярные выражения.
  •  Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
  •  Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
 Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
 (объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.
 Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
  подарок). Составляющими целого подарка являются сладости и упаковка.
 */
public class Main {


    public static void main(String[] args) {
        Client client = new Client();
        //client.chooseFlower();
       // client.test();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = client.removeDuplicates(nums);
        System.out.println(result);
        for (int i = 0; i <= result; i++) {
            System.out.print(nums[i] + ",");
        }
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class Solution {
    public void deleteNode(ListNode node) {
        if(node.next != null){
            node.val = node.next.val;
            node.next = node.next.next;
        }else{
            node = null;
        }
    }
}

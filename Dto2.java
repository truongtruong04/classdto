package Dto;

public class Dto2 {

        public static void main(String[] args) {
            Dto1 a = new Dto1("Chau", 21, 1.7f);
            System.out.println(a.getAge());
            a.setAge(22);
            System.out.println(a.getAge());
            a.setAge(-5);
            System.out.println(a.getAge());
        }
    }


package Array;

import java.util.Scanner;

public class Array {

    public void searchArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] numbers   = new int[size];
        System.out.println("Enter the elements of the array");

        for( int i=0; i < size;i++){
            numbers[i] = scanner.nextInt();
        }


        System.out.println("Enter the number to search");
        int searchElement = scanner.nextInt();
        Integer searchIndex =null;
        for(int i = 0; 1< numbers.length; i++){
            if(numbers[i] == searchElement){
                searchIndex = 1;
                break;

            }

        }
        if (null != searchIndex) {
            System.out.println("Element found at index " + searchIndex);
        } else {
                System.out.println("Element not found");
            }

        }

    }


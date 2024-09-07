package day3;

import java.util.Scanner;

public class ArrayMerge {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array1: ");
        int size1 = scanner.nextInt();
        System.out.print("Enter the size of array2: ");
        int size2 = scanner.nextInt();

        int[] array1 = new int[size1];
        System.out.print("Enter the elements of array1 : ");
        for (int i = 0; i < size1; i++)
            array1[i] = scanner.nextInt();

        int[] array2 = new int[size2];
        System.out.print("Enter the elements of array2 : ");
        for (int i = 0; i < size2; i++)
            array2[i] = scanner.nextInt();

        int[] array3 = new int[size1 + size2];
        int i = 0, j = 0, k = 0;
        while(i < size1 && j < size2) {
            if (array1[i] <= array2[j]) {
                array3[k] = array1[i];
                i++;
            }
            else
            {
                array3[k] = array2[j];
                j++;
            }
            k++;
        }

        while(j < size2)
        {
            array3[k] = array2[j];
            k++; j++;
        }

        while(i < size1)
        {
            array3[k] = array1[i];
            k++; i++;
        }
        System.out.println("Merged array : ");
        for(int l = 0; l < size1 + size2; l++)
        {
            System.out.print(array3[l] + "  ");
        }
    }
}

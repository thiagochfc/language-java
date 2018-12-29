package application;

import entities.People;
import entities.Services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        System.out.print("Enter salary: ");
        Double salary = sc.nextDouble();
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<People> listPeople = new ArrayList<>();
            String line = br.readLine();
            
            while(line != null) {
                String[] fields = line.split(",");
                listPeople.add(new People(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
            
            List<String> listEmail = listPeople.stream()
                    .filter(e -> e.getSalary() >= salary)
                    .map(e -> e.getEmail())
                    .sorted()
                    .collect(Collectors.toList());
            
            Services sv = new Services();
            
            Double listSalary = sv.filteredSum(listPeople, s -> s.getName().charAt(0) == 'M');
            
            listEmail.forEach(System.out::println);
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", listSalary));
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}

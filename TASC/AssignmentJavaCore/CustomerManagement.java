package AssignmentJavaCore;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerManagement {
    private static final String FILE_NAME = "customers.txt";
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");
    private List<Customer> customers;
    private Scanner scanner;

    public CustomerManagement() {
        customers = new ArrayList<>();
        scanner = new Scanner(System.in);
        loadCustomers();
    }

    public static void main(String[] args) {
        CustomerManagement cm = new CustomerManagement();
        cm.showMenu();
    }

    private void showMenu() {
        while (true) {
            System.out.println("\n--- Customer Management System ---");
            System.out.println("1. View customers");
            System.out.println("2. Add customers");
            System.out.println("3. Search customer by phone number");
            System.out.println("4. Edit customer information");
            System.out.println("5. Delete customer");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (option) {
                case 1: viewCustomers(); break;
                case 2: addCustomers(); break;
                case 3: searchCustomer(); break;
                case 4: editCustomer(); break;
                case 5: deleteCustomer(); break;
                case 6: System.exit(0);
                default: System.out.println("Invalid option! Please try again.");
            }
        }
    }

    private void viewCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            System.out.println("Customer List:");
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
    }

    private void addCustomers() {
        System.out.print("Enter number of customers to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        for (int i = 0; i < n; i++) {
            String name = prompt("Enter name: ");
            String email = prompt("Enter email: ");
            String phoneNumber = prompt("Enter phone number: ");

            if (validateCustomer(name, email, phoneNumber)) {
                customers.add(new Customer(name, email, phoneNumber));
            } else {
                System.out.println("Failed to add customer due to validation errors.");
            }
        }
        saveCustomers();
    }

    private void searchCustomer() {
        String phoneNumber = prompt("Enter phone number to search: ");
        for (Customer customer : customers) {
            if (customer.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Customer found: " + customer);
                return;
            }
        }
        System.out.println("Customer not found.");
    }

    private void editCustomer() {
        String phoneNumber = prompt("Enter phone number of the customer to edit: ");
        for (Customer customer : customers) {
            if (customer.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Editing customer: " + customer);
                String name = prompt("Enter new name (leave empty to keep current): ");
                String email = prompt("Enter new email (leave empty to keep current): ");
                String newPhoneNumber = prompt("Enter new phone number (leave empty to keep current): ");

                if (!name.isEmpty()) {
                    customer.setName(name);
                }
                if (!email.isEmpty()) {
                    customer.setEmail(email);
                }
                if (!newPhoneNumber.isEmpty()) {
                    customer.setPhoneNumber(newPhoneNumber);
                }

                saveCustomers();
                return;
            }
        }
        System.out.println("Customer not found.");
    }

    private void deleteCustomer() {
        String phoneNumber = prompt("Enter phone number of the customer to delete: ");
        customers.removeIf(customer -> customer.getPhoneNumber().equals(phoneNumber));
        saveCustomers();
    }

    private String prompt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    private boolean validateCustomer(String name, String email, String phoneNumber) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name cannot be empty.");
            return false;
        }
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            System.out.println("Invalid email format.");
            return false;
        }
        if (phoneNumber == null || !PHONE_PATTERN.matcher(phoneNumber).matches()) {
            System.out.println("Phone number must be 10 digits.");
            return false;
        }
        if (customers.stream().anyMatch(c -> c.getPhoneNumber().equals(phoneNumber))) {
            System.out.println("Phone number already exists.");
            return false;
        }
        return true;
    }

    private void loadCustomers() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    customers.add(new Customer(parts[0], parts[1], parts[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading customers: " + e.getMessage());
        }
    }

    private void saveCustomers() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Customer customer : customers) {
                bw.write(customer.getName() + "," + customer.getEmail() + "," + customer.getPhoneNumber());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving customers: " + e.getMessage());
        }
    }
}
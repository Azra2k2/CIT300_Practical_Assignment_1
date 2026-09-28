import java.util.Scanner;

public class Main {
    static StudentLinkedList list = new StudentLinkedList();
    static ActionStack history = new ActionStack(50);
    static ServiceQueue queue = new ServiceQueue(50);
    static StudentBST bst = new StudentBST();
    static StudentHashTable hashTable = new StudentHashTable(50);
    static CampusGraph graph = new CampusGraph();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            choice = getIntInput("Enter your choice: ");
            handleChoice(choice);
        } while (choice != 16);

        System.out.println("Exiting system. Goodbye!");
        sc.close();
    }

    static void printMenu() {
        System.out.println("\n===== University Student Record & Campus Route Management System =====");
        System.out.println("1. Add Student Record");
        System.out.println("2. Update Student Record");
        System.out.println("3. Delete Student Record");
        System.out.println("4. Display All Records using Linked List");
        System.out.println("5. Add Service Request to Queue");
        System.out.println("6. Process Next Service Request");
        System.out.println("7. Display Recent Actions using Stack");
        System.out.println("8. Display Students using BST/AVL");
        System.out.println("9. Search Student using Hashing");
        System.out.println("10. Add Campus Location");
        System.out.println("11. Remove Campus Location");
        System.out.println("12. Add Campus Connection/Road");
        System.out.println("13. Remove Campus Connection/Road");
        System.out.println("14. Display Campus Connections");
        System.out.println("15. Traverse Campus Locations using BFS or DFS");
        System.out.println("16. Exit");
    }

    static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter a number: ");
            sc.next();
        }
        int value = sc.nextInt();
        sc.nextLine();
        return value;
    }
       static void handleChoice(int choice) {
        switch (choice) {
            case 1: {
                int id = getIntInput("Enter Student ID: ");
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Programme: ");
                String prog = sc.nextLine();
                System.out.print("Enter Marks: ");
                double marks = sc.nextDouble();
                sc.nextLine();
                Student s = new Student(id, name, prog, marks);
                list.addStudent(s);
                bst.insert(s);
                hashTable.insert(s);
                history.push("Added student " + id);
                break;
            }
            case 2: {
                int id = getIntInput("Enter Student ID to update: ");
                System.out.print("Enter new Name: ");
                String name = sc.nextLine();
                System.out.print("Enter new Programme: ");
                String prog = sc.nextLine();
                System.out.print("Enter new Marks: ");
                double marks = sc.nextDouble();
                sc.nextLine();
                boolean updated = list.updateStudent(id, name, prog, marks);
                if (updated) {
                    history.push("Updated student " + id);
                    System.out.println("Student updated successfully.");
                } else {
                    System.out.println("Student ID not found.");
                }
                break;
            }
            case 3: {
                int id = getIntInput("Enter Student ID to delete: ");
                boolean deleted = list.deleteStudent(id);
                if (deleted) {
                    history.push("Deleted student " + id);
                    System.out.println("Student deleted successfully.");
                } else {
                    System.out.println("Student ID not found.");
                }
                break;
            }
            case 4:
                list.displayAll();
                break;
            case 5: {
                System.out.print("Enter service request description: ");
                String req = sc.nextLine();
                queue.addRequest(req);
                break;
            }
            case 6:
                queue.processNextRequest();
                break;
            case 7:
                history.displayActions();
                break;
            case 8:
                bst.displayInOrder();
                break;
            case 9: {
                int id = getIntInput("Enter Student ID to search: ");
                Student found = hashTable.search(id);
                if (found != null) {
                    found.display();
                } else {
                    System.out.println("Student not found.");
                }
                break;
            }
                        case 10: {
                System.out.print("Enter new location name: ");
                String loc = sc.nextLine();
                graph.addLocation(loc);
                break;
            }
            case 11: {
                System.out.print("Enter location name to remove: ");
                String loc = sc.nextLine();
                graph.removeLocation(loc);
                break;
            }
            case 12: {
                System.out.print("Enter first location: ");
                String loc1 = sc.nextLine();
                System.out.print("Enter second location: ");
                String loc2 = sc.nextLine();
                graph.addConnection(loc1, loc2);
                break;
            }
            case 13: {
                System.out.print("Enter first location: ");
                String loc1 = sc.nextLine();
                System.out.print("Enter second location: ");
                String loc2 = sc.nextLine();
                graph.removeConnection(loc1, loc2);
                break;
            }
            case 14:
                graph.displayConnections();
                break;
            case 15: {
                System.out.print("Enter starting location: ");
                String start = sc.nextLine();
                System.out.print("Choose (1) BFS or (2) DFS: ");
                int t = getIntInput("");
                if (t == 1) graph.bfsTraversal(start);
                else graph.dfsTraversal(start);
                break;
            }
            case 16:
                // Handled by main loop exit condition
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }    
}
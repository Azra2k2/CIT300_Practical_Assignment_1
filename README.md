# CIT300 Practical Assignment 1 — University Student & Campus Route Management System

**Course:** CIT300 — Data Structures and Algorithms
**Assignment:** Practical Assignment 1
**Language:** Java (JDK 8+)
**Repository:** CIT300_Practical_Assignment_1

## Project Overview

This project is a console-based Data Structures and Algorithms application written in Java. It integrates core custom data structures including Singly Linked Lists, Stacks, Queues, Binary Search Trees (BST), Hash Tables, and Graphs (Adjacency List) to manage student records, administrative service requests, action history, and campus navigation.

## Group Members & Responsibilities

| Member | Name | ID | Responsibility |
|---|---|---|---|
| Member 1 | J. Afrosha | 23DA2-0761 | Linked List & Student Management |
| Member 2 | S. Azra Banu | 23DA2-0704 | Stack & Queue Implementation |
| Member 3 | AM. Fathima Naseeha | 23DA2-0726 | BST Tree & Hashing |
| Member 4 | AM. Saula Noor | 23DA2-0985 | Graph & Campus Traversal |

## Data Structures & Key Features

### Student Management (Custom Singly Linked List)
Add, update, delete, and display student records (ID, Name, Programme, Marks).

### Action History (Stack)
Track recent administrative operations and maintain undo/history logs.

### Service Requests (Queue)
Manage student service requests on a First-In-First-Out (FIFO) basis.

### Sorted Student Records (Binary Search Tree)
Store student data in a BST and display sorted records using In-Order Traversal.

### Fast Lookup (Hash Table)
Provide O(1) average-case time complexity lookup for student records by ID.

### Campus Navigation (Graph — Adjacency List)
Represent campus locations and paths. Add/remove locations and path connections. Traverse campus routes using Breadth-First Search (BFS) and Depth-First Search (DFS).

## Time Complexity Summary

| Data Structure | Operation | Time Complexity |
|---|---|---|
| Linked List | Insert / Delete / Search | O(n) |
| Stack | Push / Pop / Peek | O(1) |
| Queue | Enqueue / Dequeue | O(1) |
| Binary Search Tree | Insert / Search / Delete (avg) | O(log n) |
| Binary Search Tree | Insert / Search / Delete (worst) | O(n) |
| Binary Search Tree | In-Order Traversal | O(n) |
| Hash Table | Insert / Search / Delete (avg) | O(1) |
| Graph | BFS / DFS | O(V + E) |

## How to Run the Application

**Clone the Repository:**
```
git clone https://github.com/Azra2k2/CIT300_Practical_Assignment_1.git
cd CIT300_Practical_Assignment_1
```

**Compile the Java Source Files:**
```
javac *.java
```

**Execute the Application:**
```
java Main
```

## Sample Menu Output

```
=================================================
 UNIVERSITY STUDENT & CAMPUS ROUTE MANAGEMENT SYSTEM
=================================================
 1.  Add Student
 2.  Update Student
 3.  Delete Student
 4.  Display All Students
 5.  Search Student (Hash Table)
 6.  Display Sorted Students (BST In-Order)
 7.  Add Service Request
 8.  Process Next Service Request
 9.  View Service Request Queue
10.  View Action History (Stack)
11.  Add Campus Location
12.  Add Path Between Locations
13.  BFS Traversal from Location
14.  DFS Traversal from Location
15.  Display Campus Graph
16.  Exit
-------------------------------------------------
Enter your choice:
```

## Project Structure

```
CIT300_Practical_Assignment_1/
├── ActionStack.java          # Custom Stack implementation
├── CampusGraph.java          # Custom Graph implementation with BFS/DFS
├── Main.java                 # Menu-driven main driver program (Options 1–16)
├── Node.java                 # Node structure for data structures
├── ServiceQueue.java         # Custom Queue implementation
├── Student.java              # Student data model
├── StudentBST.java           # Binary Search Tree implementation
├── StudentHashTable.java     # Hash Table implementation for O(1) lookup
├── StudentLinkedList.java    # Singly Linked List implementation
└── README.md                 # Project documentation
```


CIT300 Practical Assignment 1 - University Student & Campus Route Management System
Project Overview
This project is a console-based Data Structures and Algorithms application written in Java. It integrates core custom data structures including Singly Linked Lists, Stacks, Queues, Binary Search Trees (BST), Hash Tables, and Graphs (Adjacency List) to manage student records, administrative service requests, action history, and campus navigation.

Group Members & Responsibilities
Member 1 (Linked List & Student Management): J. Afrosha - 23DA2-0761

Member 2 (Stack & Queue Implementation): S. Azra Banu - 23DA2-0704

Member 3 (BST Tree & Hashing): AM. Fathima Naseeha - 23DA2-0726

Member 4 (Graph & Campus Traversal): AM. Saula Noor - 23DA2-0985

Data Structures & Key Features
Student Management (Custom Singly Linked List)

Add, update, delete, and display student records (ID, Name, Programme, Marks).

Action History (Stack)

Track recent administrative operations and maintain undo/history logs.

Service Requests (Queue)

Manage student service requests on a First-In-First-Out (FIFO) basis.

Sorted Student Records (Binary Search Tree)

Store student data in a BST and display sorted records using In-Order Traversal.

Fast Lookup (Hash Table)

Provide O(1) constant time complexity lookup for student records by ID.

Campus Navigation (Graph - Adjacency List)

Represent campus locations and paths.

Add/remove locations and path connections.

Traverse campus routes using Breadth-First Search (BFS) and Depth-First Search (DFS).

How to Run the Application
Clone the Repository:
git clone https://github.com/Azra2k2/CIT300_Practical_Assignment_1.git
cd CIT300_Practical_Assignment_1

Compile the Java Source Files:
javac *.java

Execute the Application:
java Main

Project Structure
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

public class StudentHashTable {
    private Student[] table;
    private int capacity;

    public StudentHashTable(int capacity) {
        this.capacity = capacity;
        this.table = new Student[capacity];
    }

    // Simple hash function based on Student ID
    private int hash(int id) {
        return id % capacity;
    }

    // Insert student using hashing with linear probing for collisions
    public void insert(Student s) {
        int index = hash(s.studentId);
        int originalIndex = index;

        while (table[index] != null) {
            if (table[index].studentId == s.studentId) {
                // Already exists, don't insert duplicate
                return;
            }
            index = (index + 1) % capacity;
            if (index == originalIndex) {
                System.out.println("Hash table is full. Cannot insert.");
                return;
            }
        }
        table[index] = s;
    }

    // Search student by ID - O(1) average case
    public Student search(int id) {
        int index = hash(id);
        int originalIndex = index;

        while (table[index] != null) {
            if (table[index].studentId == id) {
                return table[index];
            }
            index = (index + 1) % capacity;
            if (index == originalIndex) {
                break;
            }
        }
        return null;
    }

    // Display all entries in the hash table (for debugging/demo)
    public void displayTable() {
        System.out.println("--- Hash Table Contents ---");
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                System.out.print("Index " + i + ": ");
                table[i].display();
            }
        }
    }
}

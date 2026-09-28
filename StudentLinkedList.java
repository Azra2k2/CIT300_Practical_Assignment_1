public class StudentLinkedList {
    Node head;
    public Student searchStudent(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.studentId == id) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }
    public void addStudent(Student s) {
               if (searchStudent(s.studentId) != null) {
            System.out.println("Error: Student ID " + s.studentId + " already exists.");
            return;
        }
         Node newNode = new Node(s);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
        System.out.println("Student added successfully.");
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("No records found.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            temp.data.display();
            temp = temp.next;
        }
    }

    public boolean updateStudent(int id, String name, String programme, double marks) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.studentId == id) {
                temp.data.name = name;
                temp.data.programme = programme;
                temp.data.marks = marks;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public boolean deleteStudent(int id) {
        if (head == null) return false;
        if (head.data.studentId == id) {
            head = head.next;
            return true;
        }
        Node prev = head, curr = head.next;
        while (curr != null) {
            if (curr.data.studentId == id) {
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }
}

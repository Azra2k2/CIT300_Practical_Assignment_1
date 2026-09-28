public class StudentBST {
    private BSTNode root;

    // Insert a student into the BST by Student ID
    public void insert(Student s) {
        root = insertRec(root, s);
    }

    private BSTNode insertRec(BSTNode node, Student s) {
        if (node == null) {
            return new BSTNode(s);
        }
        if (s.studentId < node.data.studentId) {
            node.left = insertRec(node.left, s);
        } else if (s.studentId > node.data.studentId) {
            node.right = insertRec(node.right, s);
        }
        // Duplicate ID - do nothing (already handled at LinkedList level)
        return node;
    }

    // Search a student by ID
    public Student search(int id) {
        return searchRec(root, id);
    }

    private Student searchRec(BSTNode node, int id) {
        if (node == null) return null;
        if (id == node.data.studentId) return node.data;
        if (id < node.data.studentId) return searchRec(node.left, id);
        return searchRec(node.right, id);
    }

    // In-order traversal - displays students sorted by Student ID
    public void displayInOrder() {
        if (root == null) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("--- Students sorted by ID (BST In-Order) ---");
        inOrderRec(root);
    }

    private void inOrderRec(BSTNode node) {
        if (node != null) {
            inOrderRec(node.left);
            node.data.display();
            inOrderRec(node.right);
        }
    }
}

class BSTNode {
    Student data;
    BSTNode left, right;

    public BSTNode(Student data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

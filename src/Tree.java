public class Tree {
        Node root = new Node(-1);
        boolean addToLeft = true;

        public void add(int value) {
            addRecursive(root, value);
        }

        private void addRecursive(Node node, int value) {
            if (node.left == null) {
                node.left = new Node(value);
                return;
            }
            if (node.right == null) {
                node.right = new Node(value);
                return;
            }
            if (addToLeft) {
                addToLeft = false;
                addRecursive(node.left, value);
            } else {
                addToLeft = true;
                addRecursive(node.right, value);
            }
        }

        public void print() {
            printRecursive(root);
        }

        private void printRecursive(Node node) {
            System.out.println(node.value);
            if (node.left != null) {
                printRecursive(node.left);
            }
            if (node.right != null) {
                printRecursive(node.right);
            }
        }
    }

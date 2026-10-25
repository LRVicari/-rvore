public class Tree {
    private Node root;

    public Tree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int valor) {
        root = insert(root, valor);
    }

    private Node insert(Node atual, int valor) {
        if (atual == null) {
            return new Node(valor);
        }
        if (valor < atual.valor) {
            atual.esquerda = insert(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = insert(atual.direita, valor);
        }
        return atual;
    }

    public int countLeaves() {
        return countLeaves(root);
    }

    private int countLeaves(Node atual) {
        if (atual == null) {
            return 0;
        }
        if (atual.isLeaf()) {
            return 1;
        }
        return countLeaves(atual.esquerda) + countLeaves(atual.direita);
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node atual) {
        if (atual == null) {
            return;
        }
        inOrder(atual.esquerda);
        System.out.print(atual.valor + " ");
        inOrder(atual.direita);
    }
}

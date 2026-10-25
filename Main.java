public class Main {
    public static void main(String[] args) {
        System.out.println("Teste 1: arvore vazia");
        Tree t1 = new Tree();
        System.out.println("Folhas: " + t1.countLeaves());
        System.out.println();

        System.out.println("Teste 2: apenas a raiz");
        Tree t2 = new Tree();
        t2.insert(10);
        t2.inOrder();
        System.out.println("Folhas: " + t2.countLeaves());
        System.out.println();

        System.out.println("Teste 3: arvore balanceada");
        Tree t3 = new Tree();
        int[] valores3 = {50, 30, 70, 20, 40, 60, 80};
        for (int i = 0; i < valores3.length; i++) {
            t3.insert(valores3[i]);
        }
        t3.inOrder();
        System.out.println("Folhas: " + t3.countLeaves());
        System.out.println();

        System.out.println("Teste 4: arvore desbalanceada");
        Tree t4 = new Tree();
        int[] valores4 = {10, 5, 15, 3, 7, 12, 18, 1};
        for (int i = 0; i < valores4.length; i++) {
            t4.insert(valores4[i]);
        }
        t4.inOrder();
        System.out.println("Folhas: " + t4.countLeaves());
        System.out.println();

        System.out.println("Teste 5: valores em ordem crescente (arvore degenerada)");
        Tree t5 = new Tree();
        for (int i = 1; i <= 5; i++) {
            t5.insert(i);
        }
        t5.inOrder();
        System.out.println("Folhas: " + t5.countLeaves());
        System.out.println();

        System.out.println("Teste 6: valores duplicados");
        Tree t6 = new Tree();
        int[] valores6 = {8, 4, 12, 4, 8, 12};
        for (int i = 0; i < valores6.length; i++) {
            t6.insert(valores6[i]);
        }
        t6.inOrder();
        System.out.println("Folhas: " + t6.countLeaves());
        System.out.println();

        System.out.println("Teste 7: folhas apos novas insercoes");
        t3.insert(35);
        t3.insert(65);
        t3.inOrder();
        System.out.println("Folhas: " + t3.countLeaves());
    }
}

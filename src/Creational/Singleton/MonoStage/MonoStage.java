package Creational.Singleton.MonoStage;
//"""
//Monostate (ou Borg) - É uma variação do Singleton proposto
//por Alex Martelli que tem a intenção de garantir que o
//estado do objeto seja igual para todas as instâncias.
//"""
class Monostatege {
    private static int valorCompartilhado;

    public void setValor(int novoValor) {
        valorCompartilhado = novoValor;
    }

    public int getValor() {
        return valorCompartilhado;
    }
}

// Uso da classe Monostate
class  Main {
    public static void main(String[] args) {
        Monostatege instancia1 = new Monostatege();
        Monostatege instancia2 = new Monostatege();

        instancia1.setValor(10);

        System.out.println(instancia2.getValor()); // Saída será 10
    }
}


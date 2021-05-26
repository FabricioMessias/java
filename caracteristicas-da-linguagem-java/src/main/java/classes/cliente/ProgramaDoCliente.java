package classes.cliente;

public class ProgramaDoCliente {

    public static void main(String[] args) {
        final var cliente = new Cliente(30, 68.5F);

        cliente.getIdade();
        cliente.getPeso();

       // System.out.println(cliente.relatorio());
        System.out.println(cliente.relatorioPublico());
    }

}

public class Main {
    public static void main(String[] args) {
        Fila fila = Fila.getInstance();

        fila.adicionarDocumento("Documento A");
        fila.adicionarDocumento("Documento B");
        fila.adicionarDocumento("Documento C");

        fila.exibirFila();

        String documentoRemovido = fila.removerDocumento();
        System.out.println("Documento removido: " + documentoRemovido);

        fila.exibirFila();

        fila.removerTodosDocumentos();
        System.out.println("Fila após remover todos os documentos:");
        fila.exibirFila();
    }
}

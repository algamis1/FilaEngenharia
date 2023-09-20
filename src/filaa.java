import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private static Fila instanciaUnica;
    private Queue<String> documentos;

    private Fila() {
        documentos = new LinkedList<>();
    }

    public static synchronized Fila getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new Fila();
        }
        return instanciaUnica;
    }

    public void adicionarDocumento(String documento) {
        documentos.offer(documento);
    }

    public String removerDocumento() {
        if (!documentos.isEmpty()) {
            return documentos.poll();
        } else {
            return "Fila vazia";
        }
    }

    public void
        documentos.clear();
    }

    public void exibirFila() {
        System.out.println("Documentos na fila: " + documentos);
    }
}

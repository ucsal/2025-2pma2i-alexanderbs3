import br.com.mariojp.solid.isp.*;

public class Main {
    public static void main(String[] args) {
        // Agora funciona - SimplePrinter implementa apenas Printer
        OfficeService svc = new OfficeService(new SimplePrinter());
        svc.printReport("Relatório do Dia"); // Não lança mais exceção

        // Exemplo com dispositivo multifuncional
        OfficeService svcMulti = new OfficeService(new AllInOnePrinter());
        svcMulti.printReport("Outro Relatório");

        // Exemplo usando scanner separadamente
        SimpleScanner scanner = new SimpleScanner();  // Corrigido: usa SimpleScanner em vez de java.util.Scanner
        scanner.scan("documento.pdf");
    }
}
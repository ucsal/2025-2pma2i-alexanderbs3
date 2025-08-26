package br.com.mariojp.solid.isp;

public class AllInOnePrinter implements MultiFunctionDevice {
    @Override
    public void print(String content) {
        System.out.println("AllInOne imprimindo: " + content);
    }

    @Override
    public void scan(String targetFile) {
        System.out.println("AllInOne digitalizando para: " + targetFile);
    }
}
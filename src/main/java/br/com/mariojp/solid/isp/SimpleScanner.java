package br.com.mariojp.solid.isp;

public class SimpleScanner implements Scanner {
    @Override
    public void scan(String targetFile) {
        System.out.println("Digitalizando para: " + targetFile);
    }
}
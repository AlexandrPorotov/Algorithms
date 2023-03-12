package Patterns.Adapter.adpter;

import Patterns.Adapter.object.Printer;

import java.util.List;

public class PrinterAdapter implements PageListPrinter{

    private Printer printer = new Printer();

    @Override
    public void print(List<String> list) {
        for(String text: list){
            printer.print(text);
        }
    }
}

package com.ruoyi;

import com.spire.doc.Document;
import com.spire.pdf.FileFormat;
import com.spire.pdf.PdfDocument;

public class TestPdf {
    public static void main(String[] args) {

        doc2pdf();
        //pdf2ofd();
    }
    static void doc2pdf(){

        //实例化Document类的对象
        Document doc = new Document();

        //加载Word
        doc.loadFromFile("/Users/lixuedan/Downloads/d1.docx");

        //保存为PDF格式
        doc.saveToFile("/Users/lixuedan/Downloads/d2.pdf", com.spire.doc.FileFormat.PDF);
    }
    static void pdf2ofd(){

        //实例化PdfDocument类的对象
        PdfDocument pdf = new PdfDocument();

        //加载PDF文档
        pdf.loadFromFile("/Users/lixuedan/Downloads/demo.pdf");

        //保存为OFD格式
        pdf.saveToFile("/Users/lixuedan/Downloads/de.ofd", FileFormat.OFD);

    }
}

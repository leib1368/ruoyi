package com.ruoyi;

import com.spire.doc.Document;

public class TestDoc {
    public static void main(String[] args) {
        //实例化Document类的对象
        Document doc = new Document();

        //加载Word
        doc.loadFromFile("/Users/lixuedan/Downloads/demo.docx");

        //保存为PDF格式
        doc.saveToFile("/Users/lixuedan/Downloads/d2.pdf", com.spire.doc.FileFormat.PDF);
    }
}

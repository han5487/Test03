package com.ubot.lis.function.test;

import java.io.FileNotFoundException;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;

public class Test2 {

	public static void main(String[] args) throws Exception {

		PdfWriter writer = new PdfWriter("D:\\test\\新增資料夾 (2)\\test2.pdf");
		PdfDocument pdf = new PdfDocument(writer);

		PdfFont baseFont = PdfFontFactory.createFont("C:/LIS_PDFFONT/UBOT_KAI.TTF", PdfEncodings.IDENTITY_H, false);

		Document document = new Document(pdf);
		
		document.add(new Paragraph("1213132131"));

		List list = new List().setFont(baseFont);

		list.add("第一行").setListSymbol("");

		list.add(new ListItem("item 1itemitemitemitemitemitemitemitemitemitemitemitemitemitemitemitemitemitemitemitemitemitemitemitemitemitemitemitemitem").setListSymbol("一、"));
		list.add(new ListItem("item 2").setListSymbol("二、"));
		list.add(new ListItem("item 3").setListSymbol("三、"));
		list.add(new ListItem("item 4").setListSymbol("四、"));

		document.add(list.setMarginLeft(20));
		
		List list1 = new List().setFont(baseFont);

		list1.add("123355");

		list1.add(new ListItem("item").setListSymbol("(一)、"));
		list1.add(new ListItem("item").setListSymbol("(二)、"));

		document.add(list1);

		document.close();
	}

}

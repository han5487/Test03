package com.ubot.lis.function.test;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.ListNumberingType;
import com.itextpdf.layout.property.TextAlignment;

public class Test {

	public static void main(String[] args) throws Exception {

		PdfWriter writer = new PdfWriter("F:\\司資料\\Test\\Test1009-01.pdf");
		PdfDocument pdf = new PdfDocument(writer);

		PdfFont baseFont = PdfFontFactory.createFont("C:/LIS_PDFFONT/UBOT_KAI.TTF", PdfEncodings.IDENTITY_H, false);
		// 設定字形.字體大小26.粗體.本文置中

		Style title26 = new Style().setFont(baseFont).setFontSize(26).setBold().setTextAlignment(TextAlignment.CENTER);

		Style normal15 = new Style().setFont(baseFont).setFontSize(15);

		Document document = new Document(pdf);

		document.add(new Paragraph("聯邦商業銀行").addStyle(title26));

		List list = new List().setFont(baseFont).setListSymbol(ListNumberingType.DECIMAL);

		list.add(new ListItem("口口口"));
		list.add(new ListItem("口口口"));
		list.add(new ListItem("口口口"));
		list.add(new ListItem("口口口"));
		list.add(new ListItem("口口口"));
		list.add(new ListItem("口口口"));
		list.add(new ListItem("口口口"));
		list.add(new ListItem("口口口"));
		list.add(new ListItem("口口口"));
		list.add(new ListItem("口口口"));
		list.add(new ListItem("口口口"));

		// list.add(new ListItem("口口口").setListSymbol("一、"));
		// list.add(new ListItem("口口口").setListSymbol("二、"));
		//
		// document.add(list);
		//
		// list = new List().setFont(baseFont);

		// list.add(new ListItem("本契約所稱均利型指數利率及基準利率，說明如下：").setListSymbol("九、"));
		// list.add(new ListItem("口口口").setListSymbol("十、"));
		// list.add(new ListItem("、口口口").setListSymbol("十一"));

		document.add(list);

		document.close();
	}
}

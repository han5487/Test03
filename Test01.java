package com.ubot.lis.function.test;

import java.io.IOException;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;
import com.itextpdf.layout.property.VerticalAlignment;

import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;

import com.itextpdf.layout.element.Table;

import java.io.File;
import java.net.MalformedURLException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		// logo.png
		PdfWriter writer = new PdfWriter("F:\\司資料\\Test\\Test01-1018-01.pdf");
		PdfDocument pdf = new PdfDocument(writer);

		PdfFont baseFont = PdfFontFactory.createFont("C:/LIS_PDFFONT/UBOT_KAI.TTF", PdfEncodings.IDENTITY_H, false);

		Document document = new Document(pdf);

		Table table = new Table(UnitValue.createPercentArray(new float[] { 1, 2 }));
		table.addCell(createImageCell("F:\\司資料\\Test\\logo.png"));
		table.addCell(
				createTextCell("This picture was taken at Java One.\nIt shows the iText crew at Java One in 2013."));

		document.add(table);

		document.close();
	}

	private static Cell createImageCell(String path) throws MalformedURLException {
		Image img = new Image(ImageDataFactory.create(path));
		img.setWidth(UnitValue.createPercentValue(100));
		Cell cell = new Cell().add(img);
		cell.setBorder(Border.NO_BORDER);
		return cell;
	}

	private static Cell createTextCell(String text) {
		Cell cell = new Cell();
		Paragraph p = new Paragraph(text);
		p.setTextAlignment(TextAlignment.RIGHT);
		cell.add(p).setVerticalAlignment(VerticalAlignment.MIDDLE);
		cell.setBorder(Border.NO_BORDER);
		return cell;
	}

}

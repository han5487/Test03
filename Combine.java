package com.ubot.lis.function.test;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.utils.PdfMerger;

public class Combine {

	public static void main(String[] args) {

		String FILE_NAME1 = "D:\\Test\\新增資料夾 (3)\\綜合授信契約書目錄.pdf";
		String FILE_NAME2 = "D:\\Test\\新增資料夾 (3)\\綜合授信契約書內容.pdf";
		String DEST = "D:\\Test\\新增資料夾 (3)\\綜合授信契約書1012-01.pdf";

		combinePDF(FILE_NAME2, FILE_NAME1, DEST);
	}

	private static void combinePDF(String fileName1, String fileName2, String desFileName) {

		try {

			PdfDocument pdf = new PdfDocument(new PdfWriter(desFileName));

			// 定义合并文档
			PdfMerger merger = new PdfMerger(pdf);

			PdfDocument firstSourcePdf = new PdfDocument(new PdfReader(fileName1));

			merger.merge(firstSourcePdf, 1, firstSourcePdf.getNumberOfPages());

			PdfDocument secondSourcePdf = new PdfDocument(new PdfReader(fileName2));

			merger.merge(secondSourcePdf, 1, secondSourcePdf.getNumberOfPages());

			// 合并并关闭
			merger.close();
			firstSourcePdf.close();
			secondSourcePdf.close();
			pdf.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}

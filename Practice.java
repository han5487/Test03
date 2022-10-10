package com.ubot.lis.function.test;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.draw.DashedLine;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Tab;
import com.itextpdf.layout.element.TabStop;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TabAlignment;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;
import com.itextpdf.layout.property.VerticalAlignment;

public class Practice {

	public static void main(String[] args) throws Exception {

		PdfWriter writer = new PdfWriter("F:\\司資料\\Test\\綜合授信契約書1009-01.pdf");
		PdfDocument pdf = new PdfDocument(writer);

		PdfFont baseFont = PdfFontFactory.createFont("C:/LIS_PDFFONT/UBOT_KAI.TTF", PdfEncodings.IDENTITY_H, false);
		// 設定字形.字體大小26.粗體.本文置中

		Style title26 = new Style().setFont(baseFont).setFontSize(26).setBold().setTextAlignment(TextAlignment.CENTER);

		Style title22 = new Style().setFont(baseFont).setFontSize(22).setBold().setTextAlignment(TextAlignment.CENTER);
		Style title20 = new Style().setFont(baseFont).setFontSize(20);

		Style normal15 = new Style().setFont(baseFont).setFontSize(15);
		Style normal11 = new Style().setFont(baseFont).setFontSize(11);

		Document document = new Document(pdf);

		// Image image = new Image(ImageDataFactory.create("D:\\test\\1007-01.png"));

		// document.add(image);

		// document.add(new
		// Paragraph("聯邦商業銀行").add(image).setHorizontalAlignment(HorizontalAlignment.LEFT)
		// .setVerticalAlignment(VerticalAlignment.MIDDLE).addStyle(title22));

		document.add(new Paragraph("聯邦商業銀行").addStyle(title26));

		document.add(new Paragraph("綜 合 授 信 契 約 書").addStyle(title26));

		document.add(new Paragraph("客戶名稱：XXXX股份有限公司").addStyle(title20));
		document.add(new Paragraph("授信帳號：002660001234").addStyle(title20));
		document.add(new Paragraph("額    度：新臺幣10,000,000元").addStyle(title20));
		document.add(new Paragraph("訂約日期：2022/10/06").addStyle(title20));

		document.add(new Paragraph("AO(助理)：        經辦：        核定：").addStyle(normal15));
		document.add(new Paragraph("02233(110.12修訂)").addStyle(normal15));

		document.add(new Paragraph("第壹章、授信共同條款").add(new Tab())
				.addTabStops(new TabStop(550, TabAlignment.RIGHT, new DashedLine())).add(String.valueOf("" + 1))
				.addStyle(normal11));

		document.add(new Paragraph("第貳章、個別授信約定條款").add(new Tab())
				.addTabStops(new TabStop(550, TabAlignment.RIGHT, new DashedLine())).add(String.valueOf("" + 1))
				.addStyle(normal11));

		document.add(new Paragraph("第一節、營運週轉借款(一般週轉金)").setFirstLineIndent(45).add(new Tab())
				.addTabStops(new TabStop(550, TabAlignment.RIGHT, new DashedLine())).add(String.valueOf("" + 1))
				.addStyle(normal11));
		document.add(new Paragraph("第二節、透支、存摺存款融資(非證券公司)").setFirstLineIndent(45).add(new Tab())
				.addTabStops(new TabStop(550, TabAlignment.RIGHT, new DashedLine())).add(String.valueOf("" + 1))
				.addStyle(normal11));
		document.add(new Paragraph("第三節、有價證券(集保、優質股票)融資").setFirstLineIndent(45).add(new Tab())
				.addTabStops(new TabStop(550, TabAlignment.RIGHT, new DashedLine())).add(String.valueOf("" + 1))
				.addStyle(normal11));
		document.add(new Paragraph("第四節、委任保證").setFirstLineIndent(45).add(new Tab())
				.addTabStops(new TabStop(550, TabAlignment.RIGHT, new DashedLine())).add(String.valueOf("" + 1))
				.addStyle(normal11));
		document.add(new Paragraph("第五節、墊付國內票款、貼現").setFirstLineIndent(45).add(new Tab())
				.addTabStops(new TabStop(550, TabAlignment.RIGHT, new DashedLine())).add(String.valueOf("" + 1))
				.addStyle(normal11));
		document.add(new Paragraph("第六節、票據承兌/保證").setFirstLineIndent(45).add(new Tab())
				.addTabStops(new TabStop(550, TabAlignment.RIGHT, new DashedLine())).add(String.valueOf("" + 1))
				.addStyle(normal11));
		document.add(new Paragraph("第七節、開發國內即期/遠期信用狀").setFirstLineIndent(45).add(new Tab())
				.addTabStops(new TabStop(550, TabAlignment.RIGHT, new DashedLine())).add(String.valueOf("" + 1))
				.addStyle(normal11));
		document.add(new Paragraph("第九節、外銷貸款").setFirstLineIndent(45).add(new Tab())
				.addTabStops(new TabStop(550, TabAlignment.RIGHT, new DashedLine())).add(String.valueOf("" + 1))
				.addStyle(normal11));
		document.add(new Paragraph("第參章、連帶保證條款").add(new Tab())
				.addTabStops(new TabStop(550, TabAlignment.RIGHT, new DashedLine())).add(String.valueOf("" + 1))
				.addStyle(normal11));
		document.add(new Paragraph("第肆章、個別商議條款").add(new Tab())
				.addTabStops(new TabStop(550, TabAlignment.RIGHT, new DashedLine())).add(String.valueOf("" + 1))
				.addStyle(normal11));
		document.add(
				new Paragraph("附件").add(new Tab()).addTabStops(new TabStop(550, TabAlignment.RIGHT, new DashedLine()))
						.add(String.valueOf("" + 1)).addStyle(normal11));
		document.add(new Paragraph("附件一：核貸通知書").setFirstLineIndent(25).add(new Tab())
				.addTabStops(new TabStop(550, TabAlignment.RIGHT, new DashedLine())).add(String.valueOf("" + 1))
				.addStyle(normal11));
		document.add(new Paragraph("附件二：企業金融部金融服務各項費用收取標準").setFirstLineIndent(25).add(new Tab())
				.addTabStops(new TabStop(550, TabAlignment.RIGHT, new DashedLine())).add(String.valueOf("" + 1))
				.addStyle(normal11));

		document.add(new Paragraph("綜 合 授 信 契 約 書").addStyle(title22));

		document.add(new Paragraph(
				"立綜合授信契約書人(以下簡稱立約人)為向聯邦商業銀行(包括總行及所屬各分支機構，以下簡稱貴行)申請辦理授信業務，茲邀同連帶保證人(以下簡稱保證人)及擔保物提供人與貴行約定，凡立約人與貴行現在(包括過去已發生而現在尚未清償者)及未來基於一定法律關係所生之一切債務，除另訂授信約據及其他約定外，茲同意按本契約各條款履行：")
						.setFirstLineIndent(20).addStyle(normal11));

		document.add(new Paragraph("第壹章、授信共同條款").addStyle(title22));

		List list = new List().setFont(baseFont);

		list.add(new ListItem(
				"本綜合授信契約書(以下簡稱本契約)所稱一切債務，係指立約人對貴行所負之借款、透支、貼現、買入光票、墊款、承兌、委任保證、開發信用狀、進出口押匯、保證、票據、信用卡契約、應收帳款承購契約、衍生性金融商品交易契約及特約商店契約等其他各種債務，並包括其利息、遲延利息、違約金、損害賠償及其他有關費用。")
						.setListSymbol("一、"));
		list.add(new ListItem("本契約之授信總額度包含：\r\n" + "新臺幣                                     元\r\n"
				+ "，個別授信單項額度悉依附件一之核貸通知書。\r\n" + "(幣別)                                      元\r\n"
				+ "所稱授信總額度，係指立約人基於本契約合計得動用之最高金額。\r\n" + "所稱個別授信單項額度，係指立約人依本契約第貳章個別授信得動用之單項最高金額。\r\n"
				+ "立約人依據原有綜合授信契約動用而尚未清償之債務，該未清償餘額，應合併計入前二項所稱之授信總額度及個別授信單項額度內。\r\n"
				+ "立約人同意與保證人共同簽發一張免除作成拒絕證書且未記載到期日，但授權貴行於立約人不依約履行債務時，貴行得逕行填載到期日取償之本票交付存執，並以本項約定作為授權證明。另同意貴行得將依本契約所簽訂之本票或契約權利，全部或一部轉讓他人，立約人及保證人對於該受讓人仍應繼續依本契約履行各條款約定。\r\n"
				+ "").setListSymbol("二、"));
		list.add(new ListItem("授信有效期間及授信期間\r\n" + "個別授信得申請動用之有效期間，悉依附件一「核貸通知書」之「核准有效期間」所載為準。\r\n"
				+ "各筆授信期間(即借款期間)，悉依立約人申請動用每筆授信所出具「授信額度動用申請書」之「授信動用期間」所戴，或依各單項授信契約、另徵提文件約定之期間為準。\r\n"
				+ "立約人於符合雙方所訂約定條件時，得於本契約之授信有效期間內，憑另行出具之「授信額度動用申請書」、「開發國內即期/遠期不可撤銷信用狀申請書」、「APPLICATION FOR IRREVOCABLE DOCUMENTARY CREDIT(以下稱開發信用狀申請書)」等約定方式及文件，向貴行申請動用。縱該次申請動用之單筆授信到期日在本條約定之有效期間後，立約人及保證人仍願依本契約約定，負清償及保證責任。\r\n"
				+ "凡立約人基於本契約所負之一切債務，保證人均願負連帶保證責任，並同意本契約授信餘額之認定、期限及內容，均依據立約人基於本契約所出具文件或貴行有關傳票、帳簿上記載為準，絕不因上開書據或立約人基於本契約所簽發之本票或背書之票據，或其他借款憑證未經保證人簽署或其他原因有所異議，並願拋棄先訴抗辯權。\r\n"
				+ "").setListSymbol("三、"));
		list.add(new ListItem(
				"本契約項下之各筆授信條件(包括但不限於授信期間、償還方式、利、費率等)，應依授信額度動用申請書、開發國內即期/遠期不可撤銷信用狀申請書、開發信用狀申請書等單筆授信文件之個別約定優先適用，前述文件未約定時，則依核貸通知書為準。\r\n"
						+ "如蒙貴行同意暫時改按較低利率優惠計息者，貴行得視情形隨時減少或中止優惠，恢復依原約定利率計息。\r\n" + "授信款項一經貴行撥入立約人之存款帳戶，即視為已收受款項。\r\n"
						+ "").setListSymbol("四、"));
		list.add(new ListItem("立約人茲委託並授權貴行免憑存摺、取款憑條、本票、支票或其他支付憑證等，就立約人開立於貴行之\r\n"
				+ "☐支票存款第                          號，或☐活期性存款第                             號，或☐外匯活期存款第                        號帳戶內，按每期應償付之本金、利息、手續費及其他費用（包括但不限於開辦費、帳戶管理費、徵信費、保險費、開狀手續費、保證手續費、信保基金保證手續費、進出口及匯兌手續費、郵電費等）或遲延利息、違約金等，得逕行轉帳繳付，絕無異議，若因而發生與第三人間之糾紛，均與貴行無涉，立約人願負一切責任。\r\n"
				+ "前項以支票存款帳戶委託繳付者，無法繳付非與貴行業務往來所生之費用，如保險費、信保基金保證手續費等，如有繳付該等費用之需求，立約人願依貴行要求，另行開立取款憑據。\r\n"
				+ "基於本契約所動用之授信如有到期，對於立約人應依貴行要求配合辦理之ㄧ切手續仍當照辦，絕不藉詞已委託轉帳繳納本息而不到行辦理，否則願由立約人自負責任。\r\n"
				+ "若貴行認有需要、可能衍生糾紛、借款手續不全或因存款不足等情事，得不代為轉帳繳納上開款項，立約人一經貴行通知，當即到行辦理相關手續。\r\n"
				+ "貴行因合併、被合併、業務調整或立約人申請遷移帳戶往來單位，以致於前揭約定帳戶號碼需作必要轉換時，立約人同意前開委託事項仍適用於轉換後之新帳戶。\r\n" + "")
						.setListSymbol("五、"));
		list.add(new ListItem(
				"立約人及保證人因名稱、組織、章程內容、印鑑、代表人、代表人權限範圍、董事、監察人或其他有代表權之人或其他足以影響貴行權益之情事發生時，應即以書面將變更情事通知貴行，並辦妥變更或註銷留存印鑑之手續。\r\n"
						+ "立約人及保證人同意，於未為前項通知及變更，或註銷留存印鑑手續前，以留存印鑑與貴行所為之交易，除貴行有未盡善良管理人之注意義務，或明知或可得而知該等交易非立約人及保證人所為、或非立約人及保證人授權所為之情形外，立約人及保證人均願負其責任，如因而造成貴行損害，願負賠償責任。\r\n"
						+ "保證人若係基於立約人董事、監察人或其他有代表權之人之身分，而擔任本契約之保證人者，倘嗣後發生解(辭)任情事，立約人及保證人應於解(辭)任生效前以書面通知貴行，若怠於通知致貴行受有損害者，願負賠償責任。\r\n"
						+ "立約人同意，如保證人因擔任立約人董事、監察人或具有代表權之人之身分變更，未與貴行另行議定條件或取得貴行書面同意前述變更時，貴行有權拒絕立約人動用授信額度之申請。\r\n" + "")
								.setListSymbol("六、"));
		list.add(new ListItem("立約人及保證人之住所如有變更，應即以書面通知貴行。如未為通知，經貴行將有關文書於向本契約所載或最後通知貴行之住所發出後，經通常之郵遞期間，即視為到達。")
				.setListSymbol("七、"));

		list.add(new ListItem("本契約有關利息、手續費、外幣匯率、遲延利息、違約金之計算方式，除與貴行另訂之授信相關約據別有約定外，悉依下列方式計算：").setListSymbol("八、"));

		list.add(new ListItem("本契約所稱均利型指數利率及基準利率，說明如下：").setListSymbol("九、"));
		list.add(new ListItem("立約人對貴行所負之一切債務，如有下列情形之一時，無須由貴行事先通知或催告，貴行得減少對立約人之授信額度或縮短授信期間，或視為全部到期：")
				.setListSymbol("十、"));

		document.add(list);

		list = new List().setFont(baseFont);

		list.add(new ListItem("立約人若擬依公司法進行公司分割時，除應於董事會作成分割計畫書之日起三日內通知貴行外，貴行並得於得知立約人擬議分割後，減少立約人之授信額度或縮短授信期間或視為全部到期。")
				.setListSymbol("十一、"));
		list.add(new ListItem(
				"在本契約授信期間內，立約人及保證人如有發生第十條以外情形以致於履債能力變差，且非貴行核准當時所得預料時，貴行得視業務需要，對授信額度及條件予以必要之調整或變更，並保留是否授貸之決定權。")
						.setListSymbol("十二、"));
		list.add(new ListItem("立約人及保證人同意寄存貴行之各種存款及對貴行之一切債權，除有下列情形之一者外，縱其清償期尚未屆至，貴行得以之行使抵銷權：").setListSymbol("十三、"));
		list.add(new ListItem("立約人對貴行負擔數宗債務時，如清償人所提出之給付不足清償全部債務，而清償人未為指定抵充債務時，除有其他約定外，由貴行指定應抵充之債務。\r\n"
				+ "前項債務性質相異者，清償人所提出之給付，得由貴行決定其抵充之方法及順序。\r\n" + "").setListSymbol("十四、"));
		list.add(new ListItem(
				"立約人願隨時接受貴行對授信用途之監督、業務財務之稽核、擔保品之檢查、監管及有關帳簿、報表(包括關係企業之綜合財務報表)、單據、文件之查閱。貴行認為必要時，並得要求立約人按期填送上開徵信資料，或提供經貴行認可會計師簽證之會計財務報表，及洽請該簽證會計師提供工作底稿，如貴行認為立約人送交貴行之財務報表及其他文件有虛偽不實之處，一經貴行通知，即視為違約，但貴行並無監督、稽核、檢查、監管及查閱之義務。貴行認為立約人之財務結構應行改善時，得限制立約人以現金分配盈餘及要求立約人增資或為其他改善財務結構之行為，立約人當即照辦。立約人願隨時接受財團法人金融聯合徵信中心(以下簡稱聯徵中心)查閱有關之帳簿、報表及單據文件，如聯徵中心認為必要時，並得要求立約人按期填送此等徵信資料，或提供經其認可會計師簽證之會計財務報表，及洽請該簽證會計師提供工作底稿，但聯徵中心並無查閱之義務。")
						.setListSymbol("十五、"));
		list.add(new ListItem(
				"立約人對貴行所負之各宗債務，其債權憑證如有遺失、滅失或毀損等情事，立約人願依貴行通知再立債權憑證，提供貴行收執，或依據貴行帳簿、傳票、電腦製作之單據、債權憑證、往來文件之影印、縮影本等所載金額履行債務。保證人亦願配合辦理。")
						.setListSymbol("十六、"));
		list.add(new ListItem(
				"凡持有貴行發給之擔保物收據或保管證或留存印鑑，前往貴行請求返還或更換擔保物及其有關文件者，除貴行明知或可得而知其無代理權外，均視為立約人、保證人或擔保物提供人之代理人，貴行得准予返還或更換之。")
						.setListSymbol("十七、"));
		list.add(new ListItem("保證人對於立約人基於本契約所動用之授信，均願負連帶保證責任。如立約人(即主債務人)依本契約對貴行所負之一切責任未依約履行，保證人當即負責如數清償，並同意下列事項：")
				.setListSymbol("十八、"));
		list.add(new ListItem(
				"立約人、保證人及擔保物提供人依本契約所提供之擔保財產，應擔保本契約項下之全部債務(包括保證債務)，並同意作為立約人、保證人及擔保物提供人現在(包括過去所負現在尚未清償)及將來對貴行所負一切債務之擔保。")
						.setListSymbol("十九、"));
		list.add(new ListItem("立約人倘不依約履行清償債務時，如立約人及保證人有他項財產存於貴行或如將來貴行代立約人收到款項，貴行均得有權留置或抵償。").setListSymbol("二十、"));

		document.add(list);

		list = new List().setFont(baseFont);

		list.add(new ListItem(
				"立約人不依約履行責任而致發生訴訟時，立約人及保證人同意貴行為取償或保全本契約債權而支出之徵信費、倉儲費、運輸費、律師費、訴訟費用、強制執行費用等必要費用，均由立約人及保證人負擔，並授權貴行得由立約人及保證人名下存款帳戶內，免存款存摺及取款憑條予以扣抵取償。但經法院判決貴行對立約人或保證人並無債權存在時，不在此限。")
						.setListSymbol("二十一、"));
		list.add(new ListItem("立約人及保證人同意貴行為金融資產證券化目的而為債權讓與時，得以公告方式取代通知。").setListSymbol("二十二、"));
		list.add(new ListItem(
				"約人及保證人同意貴行因債權讓與、第三人代償或承擔債務需要之特定目的，得於為達成前述特定目的之必要範圍內，將立約人之基本資料及債務相關資料(包括但不限於授信餘額、利率、利息、違約金、清償日、訖息日及授信帳戶之歷史交易紀錄等)提供予前述債權受讓人、債權鑑價查核人及第三人，惟請貴行應於債權讓與契約約定或以其他方式告知該資料利用人應遵照銀行法、個人資料保護法及其他相關法令之保密規定，不得將該等有關資料洩漏予其他無關之第三人。")
						.setListSymbol("二十三、"));
		list.add(new ListItem(
				"立約人及保證人同意授信後如未按時依約繳款，貴行將依主管機關規定報送登錄聯合徵信中心信用不良紀錄，而可能影響立約人及保證人現有卡片之使用及未來申辦其他貸款(含現金卡)或信用卡之權益。上述信用不良紀錄之揭露期間請上聯合徵信中心網站「社會大眾專區」之「資料揭露期限」查詢。")
						.setListSymbol("二十四、"));
		list.add(new ListItem("貴行撥款時，倘經再次查詢聯合徵信中心後，發現立約人有其他新增核准應計入DBR22倍規範之授信額度，立約人同意貴行保留核貸與否之權利。")
				.setListSymbol("二十五、"));
		list.add(new ListItem("本契約之簽名、蓋章，均係立約人、保證人及擔保物提供人之本人或代理人親為。嗣後如與貴行有授信往來，悉憑本契約「留存印鑑處」約定之簽名或蓋章式樣，即生效力。")
				.setListSymbol("二十六、"));
		list.add(new ListItem(
				"立約人、保證人及擔保物提供人基於本契約而發生之一切債務、本契約之解釋、效力及其他有關之未盡事宜，均適用中華民國法律；立約人、保證人及擔保物提供人對貴行所負之各宗債務，或因本契約所生之爭議，合意以__________地方法院或臺灣臺北地方法院為第一審管轄法院。")
						.setListSymbol("二十七、"));
		list.add(new ListItem("除本契約所定之各條款外，其他未盡事宜，悉依立約人與貴行簽訂之其他契約、相關法令規定及國際商會最新修訂之信用狀統一慣例辦理。").setListSymbol("二十八、"));
		list.add(new ListItem("立約人、保證人及擔保物提供人如對本契約有疑義，可逕與貴行下列服務專線聯絡：\r\n"
				+ "服務專線電話：______________________ 傳真：_________________________ 其他：申訴專線0800-089-888\r\n"
				+ "若立約人日後拒絕接受貴行行銷時，得撥打貴行免付費服務專線：0800-089-888\r\n" + "上開資訊如有變更，依貴行營業據點或網站公告為準。\r\n" + "")
						.setListSymbol("二十九、"));

		document.add(list);

		document.add(new Paragraph("第貳章、個別授信約定條款").addStyle(title22));

		document.add(new Paragraph("第一節、營運週轉借款(一般週轉金)").addStyle(title22));

		document.add(new Paragraph("本節授信額度、授信期間、利率及償還方式，悉依立約人另出具之授信額度動用申請書或借據所載為準。").setFirstLineIndent(20)
				.addStyle(normal11));

		document.add(new Paragraph("第二節、透支、存摺存款融資(非證券公司)").addStyle(title22));

		list = new List().setFont(baseFont);

		list.add(new ListItem("本節授信額度、授信期間、利率及償還方式，悉依貴行之核貸通知書所載為準。").setListSymbol("一、"));
		list.add(new ListItem(
				"立約人得向貴行申請以簽發支票、其他經貴行認可憑證，或以本節第四條約定等方式，指示貴行動用約定帳戶內存款並予付款，約定帳戶內原有存款不足以支付者，得在本節授信額度內，循環動用授信額度。\r\n"
						+ "前項得申請動用之約定帳戶，應以本契約第肆章第一條約定者為限。\r\n" + "立約人動支數目不得超逾本節約定之授信額度，如有超逾時，立約人應將超過之金額立即全數償還。\r\n"
						+ "").setListSymbol("二、"));
		list.add(new ListItem(
				"本節授信利息，悉依貴行之核貸通知書，按「動用當日中最高透支(或存摺存款融資)餘額與前日最終透支(或存摺存款融資)餘額比較孰高者」或「動用當日最終透支(或存摺存款融資)餘額」計息，每月結息一次，並於每月二十一日(當日如為例假日時，則順延至次一營業日)計付。\r\n"
						+ "立約人同意貴行得免憑立約人之存摺、取款憑條或支票、其他經貴行認可憑證等，逕由立約人約定帳戶扣取利息(包含約定帳戶內原有存款及嗣後另行存入之款項)；授信到期應一次清償本息時，亦授權貴行得逕予扣款，償付本息。\r\n"
						+ "倘約定帳戶內無存款或存款不足以償付立約人每月應付利息時，貴行得在授信額度及授信期間內，動用授信額度扣取每月應付利息，即滾入本金，倘因此而超過本節授信額度時，立約人應立即償還超過之數額。立約人原有透支(或存摺存款融資)授信屆期應清償本息時，倘約定帳戶內無存款或存款不足抵償應付本息，亦得就不足抵償部分，動用本節授信額度、滾入本金，並依本契約繼續履行。\r\n"
						+ "").setListSymbol("三、"));

		list.add(new ListItem("存摺存款融資約定：").setListSymbol("四、"));

		document.add(list);

		List list1 = new List().setFont(baseFont);

		list1.add(new ListItem(
				"自簽立契約日起，立約人得依據本契約，憑存摺、取款憑條或金融卡向貴行或其他參加金融資訊系統行庫之自動化服務機器(即ATM)取款，或透過貴行之電話銀行、網路銀行、行動銀行服務系統轉帳取款，或另訂契約文件委請貴行逕由約定之存款帳戶扣償借款本息或支付款項。因而致立約人存款不足以支付時，貴行在本節授信額度內，得就其存款不足金額，由電腦自動辦理撥貸，惟貴行電腦斷線時，得暫停受理取款與撥貸。立約人並同意以貴行電腦自動辦理撥貸之紀錄為其借款本金之認定。")
						.setListSymbol("(一)"));
		list1.add(new ListItem(
				"立約人應妥善保管存摺、印鑑、金融卡，及電話銀行、網路銀行、行動銀行系統之使用者帳號、密碼、網路金鑰等。凡取款憑條上之印鑑或簽名，經貴行以善良管理人之注意義務辨識認為與立約人留存之印鑑或簽名相符而動用貸款，或經由貴行或其他參加金融資訊系統行庫依自動化服務機器(即ATM)，認為與原鍵入之密碼相符而動用貸款，或電話銀行之語音取款密碼及帳號，經貴行電話銀行服務系統電腦中心主機或諮詢專員認為與原設定之密碼及帳號相符而動用貸款，或使用網路銀行系統以密碼取款，經貴行網路銀行、行動銀行系統辨識認為數位簽章及密碼相符而辦理貸款者，除貴行有未盡善良管理人注意義務或有其他可歸責事由外，縱令該立約人存摺、印鑑、金融卡或密碼及帳號、金鑰等有被盜用、偽造或變造等情事以致發生損失時，立約人仍願負擔一切責任。")
						.setListSymbol("(二)"));

		document.add(list1.setMarginLeft(25));

		document.add(new Paragraph("第三節、有價證券(集保、優質股票)融資").addStyle(title22));

		list = new List().setFont(baseFont);

		list.add(new ListItem(
				"立約人得在本節授信額度內，由立約人、保證人或擔保物提供人(以下均稱為出質人)提供其所有，經貴行認可之有價證券(以下簡稱擔保物；如屬於優質股票，另依貴行「優質股票融資貸款要點」認定其定義及範圍)，設定最高限額質權予貴行，以作為向貴行現在(包括過去已發生而現在尚未清償者)及未來基於一定法律關係(即第壹章第一條約定)所生債務之擔保。其授信額度、授信期間、利率及償還方式，悉依貴行之核貸通知書或立約人另出具之授信額度動用申請書所載為準。")
						.setListSymbol("一、"));
		list.add(new ListItem(
				"立約人茲切實聲明，一切擔保物均為出質人完全所有，他人並無任何權利，如日後發生糾葛或瑕疵時，除應由立約人另行提供貴行認可之其他相同或較高價值之擔保物或將債務本息立即清償外，立約人願賠償貴行因此所受之一切損失。")
						.setListSymbol("二、"));
		list.add(new ListItem(
				"出質人所提供之擔保物，悉於臺灣集中保管結算所股份有限公司(以下簡稱集保)辦理質權設定，並依集保規定辦理有價證券設質交付帳簿劃撥作業相關事宜，擔保物明細填載於集保之有價證券質權設定帳簿劃撥申請書，並以該申請書第二聯、第三聯作為本契約之附件(第二聯由出質人留存，第三聯由貴行留存)。擔保物如有增減變更，並依貴行之參加人保管劃撥帳戶設質帳登載為準。爾後如遇擔保物時價跌落、擔保物發行公司之信用評等遭台灣經濟新報調降或其他財務營運發生不利之變化時，不問借款已否到期，立約人願負責於貴行通知之期限內補足或更換擔保物或償還借款，否則立約人對貴行所負之債務即喪失期限利益，視同全部到期，出質人同意貴行得逕行處分或變賣擔保物抵償立約人所欠本息，至於擔保物處分之方法及其價格概委託貴行全權處理，絕無異議，並以本契約為授權之證明，在債務未全部清償以前絕不撤銷委託。")
						.setListSymbol("三、"));
		list.add(new ListItem("出質人所提供之擔保物於授信期間價值波動時，立約人願依貴行之核貸通知書約定維持擔保物之價值，並依下列方式辦理：").setListSymbol("四、"));
		list.add(new ListItem(
				"凡貴行持有出質人所簽發實行質權取得質物之契約書(集保制定格式)、同意書(集保制定格式，同意由貴行處分擔保物)，出質人授權貴行對於該契約書及同意書得視實際債務情況填載日期，絕無異議。")
						.setListSymbol("五、"));
		list.add(new ListItem(
				"出質人之姓名、身分證統一編號、住居所、通訊處所及連絡電話等，悉以本契約填載之資料為準，倘有變更，出質人未即以書面通知，致貴行無法送達一切書類文件時，出質人願視同已收達，若因而影響出質人權益時，出質人願自行負責。")
						.setListSymbol("六、"));
		list.add(new ListItem("立約人同意因設定、實行、解除質權及變更擔保品所發生之費用，概由其自行負擔。").setListSymbol("七、"));
		list.add(new ListItem("保證人茲此同意本契約之擔保物設質事項，並確認其保證責任不因擔保物之增減變更而受影響，均完全繼續有效，且無民法第751條之適用。").setListSymbol("八、"));

		document.add(list);

		document.add(new Paragraph("第四節、委任保證").addStyle(title22));

		list = new List().setFont(baseFont);

		list.add(new ListItem(
				"立約人茲委請貴行簽發保證書或擔保信用狀，各筆保證金額、期限及保證事項範圍，悉依各筆貴行出具之保證文件內容所載為準；其授信額度、授信期間、保證手續費及其給付方式均依照貴行之核貸通知書或立約人另出具之授信額度動用申請書所載為準，並得辦理分批動用。立約人動用時，應另出具授信額度動用申請書或開發信用狀申請書。")
						.setListSymbol("一、"));
		list.add(new ListItem("立約人應依照所簽訂契約履行義務，如發生遲延或未克履行而由貴行墊付款項時，立約人願立即如數償還，並願自墊款之日起加計遲延利息及違約金。\r\n"
				+ "保證手續費倘有逾期情事，除仍按原訂費率計算至清償日外，並另按日計付違約金。立約人並同意，如未能繳付保證手續費時，任憑貴行處分擔保物抵償。\r\n" + "").setListSymbol("二、"));
		list.add(new ListItem("貴行如認有必要或立約人有不能履約之虞時，貴行得立即終止本契約。終止後，貴行即不再接受立約人簽發保證書或擔保信用狀之申請。").setListSymbol("三、"));
		list.add(new ListItem("貴行得要求立約人提供適當之擔保物，關於此等擔保物權利之設定、變更或處分等有關事項，均應依照貴行規定辦理，立約人絕無異議。").setListSymbol("四、"));
		list.add(new ListItem(
				"立約人及保證人茲同意並授權：貴行依本契約簽發保證書或擔保信用狀後，如立約人有未能依本契約(包含其他與貴行簽訂之契約)履行義務時，縱貴行尚未履行保證責任，貴行仍得逕將立約人及保證人存於貴行之存款轉列「其他預收款」(如為定期存款並同意辦理中途解約)，以備清償將來對貴行所負之債務。惟嗣後保證期滿，如經貴行確認毋須履行保證責任時，該筆款項仍應返還原存款人。")
						.setListSymbol("五、"));

		document.add(list);

		document.add(new Paragraph("第五節、墊付國內票款、貼現").addStyle(title22));

		list = new List().setFont(baseFont);

		list.add(new ListItem(
				"立約人得持本票、商業承兌匯票向貴行申請貼現，或以經認可之票據(包含匯票、本票及支票)向貴行申請墊付國內票款融資；其授信額度、授信期間、利率及償還方式，悉依貴行之核貸通知書或立約人另出具之授信額度動用申請書所載為準。額度動用時，立約人應出具授信額度動用申請書，並檢附貴行認可之票據，撥貸之金額，則由貴行核定。")
						.setListSymbol("一、"));
		list.add(new ListItem("立約人聲明，所提供票據皆為立約人基於商品之銷售、出租或提供服務等合法交易行為取得，並由立約人將票據權利背書轉讓予貴行。").setListSymbol("二、"));
		list.add(new ListItem(
				"貴行如認為必要，或立約人所提供之票據到期不獲付款，或票據無從為承兌或付款之提示，或票據付款義務人有不能支付之虞時，立約人應於接獲貴行通知三日內以同額現金將該票據贖回，或立即清償已貼現或墊付票款，逾期未辦理者，本節授信視為全部到期，貴行得不再接受立約人墊付票款或貼現之申請，已貼現或墊付票款部分，雖所提供之票據尚未到期，貴行亦得限期請立約人清償全部債務。貴行可免為拒絕證書之作成，並可免為票據債權保全上之法定手續及通知等。")
						.setListSymbol("三、"));
		list.add(new ListItem("貴行得要求立約人提供適當之擔保物，關於此等擔保物權利之設定、變更或處分等有關事項，均應依照貴行規定辦理，立約人絕無異議。").setListSymbol("四、"));
		list.add(new ListItem(
				"立約人持向貴行辦理貼現或墊付票款之票據，如因傳遞或其他意外情事而致喪失、滅失，或被偽造、變更等致喪失其效力時，除因可歸責於貴行之事由所致者外，立約人均願悉數承受，並依貴行帳簿所載之債務數額，立即清償之。")
						.setListSymbol("五、"));
		list.add(new ListItem("墊付國內票款約定：立約人同意所提供之票據及到期兌收款項均存入第肆章第三條所約定之備償專戶。").setListSymbol("六、"));
		list.add(new ListItem("貼現約定：貼現利息自貼現款中預先一次扣繳。貼現票據到期不獲付款時，立約人應立即清償貼現款。").setListSymbol("七、"));

		document.add(list);

		document.add(new Paragraph("第六節、票據承兌/保證").addStyle(title22));

		list = new List().setFont(baseFont);

		list.add(new ListItem(
				"立約人得委請貴行就符合票據法規定之匯票或本票辦理承兌或保證；其授信額度、授信期間、票據承兌或保證手續費及償還方式，悉依貴行之核貸通知書或立約人另出具之授信額度動用申請書所載為準。本節授信額度得自立約日起分批動用，每次動用時，應填具授信額度動用申請書。")
						.setListSymbol("一、"));
		list.add(new ListItem("貴行如認為立約人未能切實履行，或發生未經貴行同意或未繳存同額保證款項以備清償票款，卻於本票到期提示前擅自撤銷付款委託，或不遵守本契約各條款時，貴行得終止辦理票據承兌或保證。")
				.setListSymbol("二、"));
		list.add(new ListItem(
				"立約人依本契約向貴行申請承兌之匯票，應以貴行為付款人，並以貴行所在地為付款地。立約人依本契約向貴行申請保證之融資性商業本票，應以臺灣集中保管結算所股份有限公司為擔當付款人，並以合作金庫商業銀行自強分行所在地為付款地。")
						.setListSymbol("三、"));
		list.add(new ListItem(
				"立約人委請貴行承兌或保證票據，應於其票載到期日(登記形式商業本票則為登錄到期日)前將應付之票款繳存貴行以備兌付。如有遲延而由貴行墊款兌付時，於接到貴行通知後，不問何種情形，立約人願立即清償墊付之票款，並願自墊款之日起加計遲延利息、違約金。")
						.setListSymbol("四、"));
		list.add(new ListItem(
				"票據承兌或保證手續費應於貴行承兌或保證時一次給付。如貴行調整費率時，一經通知，應即改按新費率計付。所保證票據如另委請貴行辦理承銷者，貴行得選擇逕自承銷所得款項中扣償承兌或保證手續費。")
						.setListSymbol("五、"));
		list.add(new ListItem("立約人之責任自立約日起發生，並至立約人清償貴行因承兌或保證票據應付之一切款項之日以前，絕不消滅。").setListSymbol("六、"));
		list.add(new ListItem(
				"立約人茲聲明，依本契約委託貴行承兌或保證票據，如有因而致貴行墊款或(及)受損害時，無論立約人有無過失，立約人應立即清償票款、遲延利息、各項費用及賠償貴行所受之損害，絕不以任何事由為抗辯而拒絕清償。")
						.setListSymbol("七、"));
		list.add(new ListItem("如貴行認為必要時，得要求立約人提供或增加相當之擔保物，關於此等擔保物權利之設定，變更或處分等應辦一切手續，立約人均願依照貴行規定辦理。")
				.setListSymbol("八、"));

		document.add(list);

		document.add(new Paragraph("第七節、開發國內即期/遠期信用狀").addStyle(title22));

		list = new List().setFont(baseFont);

		list.add(new ListItem(
				"立約人為向國內採購物資需要，得委請貴行在本節授信額度內開發國內即期/遠期信用狀(以下簡稱信用狀)，及就信用狀指定之受益人依各筆信用狀之規定所簽發以貴行為付款人之匯票予以承兌、付款；其授信額度、授信期間、利率及償還方式，悉依貴行之核貸通知書或立約人另出具之開發國內即期/遠期不可撤銷信用狀申請書、授信額度動用申請書所載為準。")
						.setListSymbol("一、"));
		list.add(new ListItem("期限內開發之信用狀，匯票到期日縱在授信期限之後，仍委請貴行逕予承兌、付款，立約人仍願依本契約之約定，負清償責任。").setListSymbol("二、"));
		list.add(new ListItem("立約人申請動用時，應出具開發國內即期/遠期不可撤銷信用狀申請書或授信額度動用申請書。").setListSymbol("三、"));
		list.add(new ListItem("如為開發國內即期信用狀時，立約人應自貴行付款日起算於約定天數內清償貴行墊付款，並自貴行墊款日起計付利息、遲延利息，並加計違約金。\r\n"
				+ "如為開發國內遠期信用狀時，立約人得於接獲貴行辦理承兌之通知時，按承兌匯票金額簽具備付本票交貴行存執，以備匯票到期前一日提示；未簽具備付本票時，則由立約人自行備款，清償立約人依本契約對貴行所負之債務。如未按期償付前述所簽具備付本票之票款，或未自行備款清償匯票票款時，應自貴行墊付日起計付利息、遲延利息，並加計違約金。\r\n"
				+ "").setListSymbol("四、"));
		list.add(new ListItem(
				"本節授信各筆信用狀項下經貴行墊付之款項，立約人得另於開發國內即期/遠期不可撤銷信用狀申請書或授信額度動用申請書約定，委請貴行另行貸放短期性放款以清償信用狀墊款，並以本契約、開發國內即期/遠期不可撤銷信用狀申請書或授信額度動用申請書作為借款之證明，授信期間及利率，悉依前揭申請書或貴行之核貸通知書所載為準，撥貸日縱在授信期間後或(及)逾信用狀有效期限，仍得辦理。")
						.setListSymbol("五、"));
		list.add(new ListItem(
				"立約人承認本契約信用狀下所提示之匯票及附屬單證，如經貴行(包括開狀單位及承兌付款單位)審查認為在表面上與信用狀條件尚屬符合而承兌或付款後，立約人願即依期照付，上開匯票單證等縱或在事後證實其為非真實或屬偽、變造或有其他瑕疵(包括貨物品質或數量與單證不符等情事)，概與貴行無涉，立約人絕不以任何理由為抗辯而拒付之。")
						.setListSymbol("六、"));
		list.add(new ListItem(
				"本契約信用狀因傳遞錯誤或延遲或解釋上之錯誤，及單證或單證所載貨品之品質、數量或價值等，有全部或一部滅失或遲遞或未抵達交貨地，以及貨物無論在運輸中或運抵後因未經保險或保額不足，或因任何第三者之阻滯或扣留及其他因素等情事以致喪失或損害時，均與貴行無涉，立約人均應就該信用狀款項全額照付。每筆信用狀項下所購之貨品，如因信用狀受益人不履行契約，交貨遲延，或其他不可抗力事變，致發生任何損失時，均由立約人負擔。")
						.setListSymbol("七、"));
		list.add(new ListItem(
				"立約人願提供本契約項下各筆信用狀所載貨運單據、採購貨物與另行提供之擔保物，作為各筆信用狀項下匯票債務之擔保，並以本契約作為提供擔保之證明。貨物或擔保物如有敗壞或價值貶落之虞時，一經貴行通知，立約人願立即補足，貴行認有必要並得逕行處分，以抵償每筆貸款及(或)墊款之本息，及因處分而支出之一切費用。")
						.setListSymbol("八、"));

		document.add(list);

		document.add(new Paragraph("第八節、開發進口即期/遠期信用狀").addStyle(title22));

		list = new List().setFont(baseFont);

		list.add(new ListItem(
				"立約人為便於現在及將來在貴行辦理結匯向國外採購物資，得委請貴行於本節授信額度內申請開發信用狀及墊付外幣貨款(於本節簡稱墊款)或承兌，暨向貴行借用新臺幣及(或)外幣貸款(於本節簡稱貸款)，貴行得僅同意外幣墊款，或於到單時以新臺幣貸款償還上述墊款；其授信額度、授信期間、利率，悉依貴行之核貸通知書或立約人另出具之開發信用狀申請書所載為準。")
						.setListSymbol("一、"));
		list.add(new ListItem("期限內開發之信用狀，匯票到期日縱在授信期限之後，仍委請貴行逕予承兌、付款，立約人仍願依本契約之約定，負清償責任。").setListSymbol("二、"));
		list.add(new ListItem("立約人向貴行申請開發信用狀時，應出具開發信用狀申請書，並依本契約及前揭申請書所列條款約定，償還每筆債務及相關費用。").setListSymbol("三、"));
		list.add(new ListItem(
				"立約人願由貴行依有關法令之規定及慣行之方法墊付或(及)承兌其所申請開發之信用狀。立約人除應提供輸入許可證或估價單交由貴行存執外，願以各信用狀項下貨運單據及貨品等，作為各該信用狀項下墊款及貸款之擔保，並以本契約為提供擔保及墊款或貸款之證明。")
						.setListSymbol("四、"));
		list.add(new ListItem("清償期限及方法：").setListSymbol("五、"));
		list.add(new ListItem("本節授信種類項下之每筆墊款其在前條所訂應清償之期限內還款者，外幣墊款應自國外押匯日起至清償日止，按貴行之核貸通知書所載利率，未記載者則依各該幣別貴行掛牌利率，計付利息。\r\n"
				+ "立約人延遲清償每筆墊款、貸款本息時，並自遲延日起計付遲延利息、違約金。\r\n" + "").setListSymbol("六、"));
		list.add(new ListItem(
				"立約人倘不依約定期限及方法償還墊款、貸款時，貴行有權選擇自遲延日起折算為新臺幣求償，且貴行為保全債權，得代向海關報關提貨，並得拍賣或自由處分(包括處分方法、時間及價格等)所進口之貨物及其他擔保物以抵償貴行墊款、貸款本息及因處分而支出之一切費用及損失(包括報關提貨所支之稅捐、運輸費等)，如有不足抵償時，立約人及保證人願負責補足清償。貴行如認為有必要時，亦得拒絕本節授信項下之墊款、貸款，或減少本節授信額度或終止本契約或對立約人委任開發信用狀及承兌之申請不予受理。")
						.setListSymbol("七、"));
		list.add(new ListItem(
				"立約人聲明每筆開發信用狀申請書與有關當局所發給之輸入許可證內所載各項條件及細則絕對相符，倘因立約人對於輸入許可證各項條件及細則之疏忽而致信用狀未能如期開發，貴行概不負責；又對每筆開發信用狀申請書內容有不當、矛盾、謬誤者，貴行亦得逕予修改，以符實際。")
						.setListSymbol("八、"));
		list.add(new ListItem(
				"立約人向貴行申請開發之每筆信用狀下貨運單據及(或)匯票，如經貴行認為在表面上尚屬無訛，立約人應即接受。該項單據及(或)匯票，縱事後證實其非真實或屬偽造或有其他瑕疵，概與貴行及押匯行無涉，對於貴行或押匯行支付款項，立約人不得提出異議，並依本契約之規定清償。")
						.setListSymbol("九、"));
		list.add(new ListItem(
				"每筆信用狀之傳遞錯誤、遲延或解釋上之錯誤，及關於單據或單據項下所載貨物或貨物之品質、數量、價值等之有全部或一部滅失、遲延、未抵達交貨地，以及貨物無論在運輸中或抵達後或未經保險或保額不足，或因承辦商或任何第三者之阻滯、扣留及其他因素各等情事，以致喪失或損害或遲到時，均與貴行或押匯行無涉，在以上任何情形之下，對於貴行所墊付款項，立約人不得提出異議，概依本契約約定清償。")
						.setListSymbol("十一、"));
		list.add(new ListItem(
				"立約人不履行本契約所訂各條款，或貴行認為立約人有不能清償任何一筆墊款或貸款之虞時，貴行得收回每筆墊款或貸款，或對就每筆信用狀項下之貨運單據、貨物予以處分抵償或抵銷每筆墊款或貸款之本息，及因處分而支出之一切費用，立約人持有之各項單摺存證應即失效。")
						.setListSymbol("十一、"));
		list.add(new ListItem("每筆信用狀如經重開或修改任何條款，立約人及保證人對於本契約各條款仍願絕對遵守，不因重開或條款之修改而提出異議。").setListSymbol("十二、"));
		list.add(new ListItem(
				"立約人所提供之擔保物如有第三人主張權利而發生糾紛，致使貴行蒙受損失時，立約人及保證人願負責賠償。所提供之擔保物如須登記或過戶者，立約人願立即辦理登記或過戶手續，並將證件交由貴行收執，其因登記或過戶所需之費用，概由立約人負擔。")
						.setListSymbol("十三、"));
		list.add(new ListItem(
				"以每筆墊款或貸款採購之貨物(包括在途貨物)，如因售貨人(即信用狀受益人)不履行契約、交貨遲延、或其他不可抗力之事變，致發生損失時，仍應由立約人承擔；如信用狀逾有效期限，貴行得逕行註銷，俾就退匯之款抵償本契約項下貸款及(或)墊款。")
						.setListSymbol("十四、"));
		list.add(new ListItem(
				"每筆信用狀項下貨物依交貨條件如需立約人投保者，立約人願事先就保險公司、保險種類及保險條件，徵得貴行同意後，以貴行為受益人足額投保，投保所需一切費用，概由立約人負擔。立約人如遲不辦理投保或保險到期未辦續保手續，貴行有權代為辦理，但貴行並無代為投保之義務。如經貴行先行墊付相關費用，立約人願立即償還，若有遲延，貴行除得將其列入每筆貸款金額外，並由立約人按本節第六條約定計付利息、遲延利息及違約金。")
						.setListSymbol("十五、"));
		list.add(new ListItem("貨物或擔保物如有敗壞之虞或價值低落時，立約人願即補提，貴行認有必要並得逕行處分，以抵償每筆貸款及(或)墊款之本息，及因處分而支出之一切費用。")
				.setListSymbol("十六、"));

		document.add(list);

		document.add(new Paragraph("第九節、外銷貸款").addStyle(title22));

		list = new List().setFont(baseFont);

		list.add(new ListItem("本節授信額度內立約人得分批動用，其授信額度、授信期間、利率及償還方式，悉依貴行之核貸通知書或立約人另出具之授信額度動用申請書所載為準。")
				.setListSymbol("一、"));
		list.add(new ListItem(
				"本節授信用途以支應出口所必要之週轉金為限，不得流用於其他用途，貴行得隨時查核，立約人不得拒絕。如為外幣外銷貸款，立約人同意另行開立第肆章第三條之外幣帳戶，專為控管本節授信之資金流向，非經貴行同意，立約人不得動用該帳戶內之存款。")
						.setListSymbol("二、"));
		list.add(new ListItem(
				"每次動用時，立約人應填具授信額度動用申請書，或簽發本票交由貴行存執。各筆授信到期若無法以憑貸之出口貨款償還，一經貴行通知，立約人願立即備款償還，絕不拖延，否則全部授信視為立即到期，任憑貴行處理。")
						.setListSymbol("三、"));
		list.add(new ListItem("立約人所有出口押匯或託收手續，願經由貴行辦理，並以委經貴行辦理出口押匯或託收之外銷所得，優先償還本節授信本息。").setListSymbol("四、"));

		document.add(list);

		document.add(new Paragraph("第參章、連帶保證條款").addStyle(title22));

		list = new List().setFont(baseFont);

		list.add(new ListItem(
				"立約人未依約履行前揭法律關係所生債務，或應償付款項到期未清償者，無論該項借款或債務有無提供擔保物，或所提供之擔保物處分所得價款是否足以償還借款及債務，一經貴行通知，保證人願即將保證金額連同延滯期間應付利息、遲延利息、違約金、損害賠償、各項費用、代付款項等一切負擔一併代為清償，絕不藉口推諉。")
						.setListSymbol("一、"));
		list.add(new ListItem("立約人未全數清償前，保證人不得自行退保。").setListSymbol("二、"));
		list.add(new ListItem("立約人未能全數清償債務時，貴行毋須先就擔保物求償，得逕向保證人請求清償保證債務。保證人知悉連帶保證並無先訴抗辯權。").setListSymbol("三、"));
		list.add(new ListItem("保證人同意以貴行辦理本契約授信之營業單位所在地為保證債務履行地。").setListSymbol("四、"));
		list.add(new ListItem("本保證條款自簽立本契約之日起生效。").setListSymbol("五、"));
		list.add(new ListItem("保證人如約定為「未定期間保證」：").setListSymbol("六、"));

		document.add(list);

		document.add(new Paragraph("第肆章、個別商議條款").addStyle(title22));

		document.add(new Paragraph("附件一：核貸通知書").addStyle(title22));

		float[] colWidths = new float[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		Table table = new Table(UnitValue.createPercentArray(colWidths)).useAllAvailableWidth();
		Cell cell = new Cell();

		cell = new Cell(1, 50).add(new Paragraph("核准日期：    年   月   日").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("核准號碼：                ").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 10).add(new Paragraph("授信項目").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 10).add(new Paragraph("額 度").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 30).add(new Paragraph("授 信 條 件").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(6, 10).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(6, 10).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 8).add(new Paragraph("核准有效期間").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 8).add(new Paragraph("動用方式/期間").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("利率/手續費率").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("償還方式").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("開辦費").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("擔保/動撥條件").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(6, 10).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(6, 10).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 8).add(new Paragraph("核准有效期間").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 8).add(new Paragraph("動用方式/期間").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("利率/手續費率").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("償還方式").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("開辦費").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("擔保/動撥條件").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(6, 10).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(6, 10).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 8).add(new Paragraph("核准有效期間").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 8).add(new Paragraph("動用方式/期間").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("利率/手續費率").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("償還方式").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("開辦費").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("擔保/動撥條件").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(6, 10).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(6, 10).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 8).add(new Paragraph("核准有效期間").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 8).add(new Paragraph("動用方式/期間").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("利率/手續費率").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("償還方式").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("開辦費").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("擔保/動撥條件").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(6, 10).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(6, 10).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 8).add(new Paragraph("核准有效期間").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 8).add(new Paragraph("動用方式/期間").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("利率/手續費率").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("償還方式").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("開辦費").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("擔保/動撥條件").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(6, 10).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(6, 10).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 8).add(new Paragraph("核准有效期間").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 8).add(new Paragraph("動用方式/期間").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("利率/手續費率").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("償還方式").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("開辦費").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("擔保/動撥條件").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(6, 10).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(6, 10).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 8).add(new Paragraph("核准有效期間").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 8).add(new Paragraph("動用方式/期間").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("利率/手續費率").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("償還方式").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("開辦費").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);
		cell = new Cell(1, 8).add(new Paragraph("擔保/動撥條件").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 22).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("").addStyle(normal11));
		cell.setMinHeight(15);
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("其他條件").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("").addStyle(normal11));
		cell.setMinHeight(50);
		table.addCell(cell);

		document.add(table);

		document.add(new Paragraph("附件二：企業金融部金融服務各項費用收取標準").addStyle(title22));

		table = new Table(UnitValue.createPercentArray(colWidths)).useAllAvailableWidth();
		cell = new Cell();

		cell = new Cell(1, 25).add(new Paragraph("收費項目").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("收費金額").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("一、一般企金授信案件開辦費或帳戶管理費(不含個人信用貸款及第三項案件)★").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("依核准額度0.1%以上計收或依動撥金額0.1%以上逐次計收。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("二、個人信用貸款★").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("總收費：最高新臺幣9,000元。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("三、其他企金授信案件").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(2, 25).add(new Paragraph("1.中小企業簡便貸款及企業家小額貸款★").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("徵信費：每一案件最高一次計收新臺幣1,000元。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("開辦費：依核准額度1%以上計收。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(2, 25).add(new Paragraph("2.薪轉企業週轉貸款★").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("徵信費：每一案件最低以新臺幣500元計收。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("開辦費：依核准額度0.2%以上計收").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("3.國內應收票據簡易融資★").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("帳戶管理費：每筆融資新臺幣300元。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("4.法拍或標售案代墊款★").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("開辦費：依核准額度1%以上計收。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("5.應收帳款收買★").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("管理費：依每筆收買應收帳款金額0.75%以上計收。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("四、申請授信條件變更手續費").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("新臺幣5,000元。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("五、提前清償違約金").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 25).add(new Paragraph("依提前清償金額1%以上計收。").addStyle(normal11));
		table.addCell(cell);

		document.add(table);

		document.add(new Paragraph("註1：註記★之授信種類，係必須收取相關費用。").addStyle(normal11));
		document.add(
				new Paragraph("註2：各項貸款手續費收費標準及收費方式調整時，於生效日60日前公告於聯邦銀行營業場所及網站(網址：www.ubot.com.tw)。").addStyle(normal11));
		document.add(new Paragraph("註3：上開收費金額均以新臺幣計收。").addStyle(normal11));

		document.add(new Paragraph(""));

		table = new Table(UnitValue.createPercentArray(colWidths)).useAllAvailableWidth();
		cell = new Cell();

		cell = new Cell(1, 50).add(new Paragraph("立 約 人(即借款人)：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("地址：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("營利事業統一編號/國民身分證統一編號：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("立約人與  貴行授信往來之印鑑以下列共☐壹式☐貳式☐     式，憑任壹式有效。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 1).add(new Paragraph("留存印鑑處").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 49).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 1).add(new Paragraph("對保簽名").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 49).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 30).add(new Paragraph("對保地點：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 20).add(new Paragraph("對保時間：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 15).add(new Paragraph("對保人：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 15).add(new Paragraph("核定：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 20).add(new Paragraph("查驗人：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("審閱及個資商議條款：\r\n" + "一、立約人確認本契約條款內容業經合理時間審閱並同意，且各收執契約影本乙份，並簽章如上。\r\n"
				+ "二、立約人知悉，貴行得提供個人資料予關係企業，並於其營業目的或貴行蒐集、處理、利用個人資料之告知說明所列相同特定目的範圍內，蒐集、處理、利用立約人之個人資料，並得提供予該等關係企業所委任處理營業相關事務之人。立約人亦暸解，如不同意上開事項，貴行及貴行之關係企業將可能無法主動提供除本授信以外其他之服務或優惠活動。\r\n"
				+ "立約人 ☐同意☐不同意 貴行得提供個人資料予關係企業。(未勾選視為「不同意」；法人戶免填)\r\n" + "").addStyle(normal11));
		table.addCell(cell);

		document.add(table);

		document.add(new Paragraph(""));

		table = new Table(UnitValue.createPercentArray(colWidths)).useAllAvailableWidth();
		cell = new Cell();

		cell = new Cell(1, 50).add(new Paragraph("保 證 人1：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("地址：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("營利事業統一編號/國民身分證統一編號：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("保證人與  貴行授信往來之印鑑以下列共☐壹式☐貳式☐     式，憑任壹式有效。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 1).add(new Paragraph("留存印鑑處").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 49).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 1).add(new Paragraph("對保簽名").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 49).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 30).add(new Paragraph("對保地點：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 20).add(new Paragraph("對保時間：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 15).add(new Paragraph("對保人：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 15).add(new Paragraph("核定：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 20).add(new Paragraph("查驗人：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("審閱及個資商議條款：\r\n" + "一、保證人確認本契約條款內容業經合理時間審閱並同意，且各收執契約影本乙份，並簽章如上。\r\n"
				+ "二、保證人知悉，貴行得提供個人資料予關係企業，並於其營業目的或貴行蒐集、處理、利用個人資料之告知說明所列相同特定目的範圍內，蒐集、處理、利用保證人之個人資料，並得提供予該等關係企業所委任處理營業相關事務之人。保證人亦暸解，如不同意上開事項，貴行及貴行之關係企業將可能無法主動提供除本授信以外其他之服務或優惠活動。\r\n"
				+ "保證人 ☐同意☐不同意 貴行得提供個人資料予關係企業。(未勾選視為「不同意」；法人戶免填)\r\n"
				+ "三、保證人願以本金新臺幣                                   元及其利息、遲延利息、違約金及其他從屬主債務之負擔為限額，與立約人負連帶清償責任。\r\n"
				+ "保證人 ☐願意☐不願意 接收貴行每年一次以書面通知當月基準日所負保證債務金額。(限第參章之連帶保證條款選擇「未定期間保證」者，本項未勾選者，視為「願意」。選擇「定有期間保證」者，免勾選。)\r\n"
				+ "").addStyle(normal11));
		table.addCell(cell);

		document.add(table);

		document.add(new Paragraph(""));

		table = new Table(UnitValue.createPercentArray(colWidths)).useAllAvailableWidth();
		cell = new Cell();

		cell = new Cell(1, 50).add(new Paragraph("保 證 人2：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("地址：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("營利事業統一編號/國民身分證統一編號：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("保證人與  貴行授信往來之印鑑以下列共☐壹式☐貳式☐     式，憑任壹式有效。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 1).add(new Paragraph("留存印鑑處").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 49).add(new Paragraph("131231").addStyle(normal11));
		cell.setMinHeight(150);
		table.addCell(cell);

		cell = new Cell(1, 1).add(new Paragraph("對保簽名").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 49).add(new Paragraph("1313").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 30).add(new Paragraph("對保地點：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 20).add(new Paragraph("對保時間：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 15).add(new Paragraph("對保人：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 15).add(new Paragraph("核定：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 20).add(new Paragraph("查驗人：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("審閱及個資商議條款：\r\n" + "一、保證人確認本契約條款內容業經合理時間審閱並同意，且各收執契約影本乙份，並簽章如上。\r\n"
				+ "二、保證人知悉，貴行得提供個人資料予關係企業，並於其營業目的或貴行蒐集、處理、利用個人資料之告知說明所列相同特定目的範圍內，蒐集、處理、利用保證人之個人資料，並得提供予該等關係企業所委任處理營業相關事務之人。保證人亦暸解，如不同意上開事項，貴行及貴行之關係企業將可能無法主動提供除本授信以外其他之服務或優惠活動。\r\n"
				+ "保證人 ☐同意☐不同意 貴行得提供個人資料予關係企業。(未勾選視為「不同意」；法人戶免填)\r\n"
				+ "三、保證人願以本金新臺幣                                   元及其利息、遲延利息、違約金及其他從屬主債務之負擔為限額，與立約人負連帶清償責任。\r\n"
				+ "保證人 ☐願意☐不願意 接收貴行每年一次以書面通知當月基準日所負保證債務金額。(限第參章之連帶保證條款選擇「未定期間保證」者，本項未勾選者，視為「願意」。選擇「定有期間保證」者，免勾選。)\r\n"
				+ "").addStyle(normal11));
		table.addCell(cell);

		document.add(table);

		document.add(new Paragraph(""));

		table = new Table(UnitValue.createPercentArray(colWidths)).useAllAvailableWidth();
		cell = new Cell();

		cell = new Cell(1, 50).add(new Paragraph("保 證 人3：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("地址：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("營利事業統一編號/國民身分證統一編號：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("保證人與  貴行授信往來之印鑑以下列共☐壹式☐貳式☐     式，憑任壹式有效。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 1).add(new Paragraph("留存印鑑處").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 49).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 1).add(new Paragraph("對保簽名").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 49).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 30).add(new Paragraph("對保地點：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 20).add(new Paragraph("對保時間：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 15).add(new Paragraph("對保人：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 15).add(new Paragraph("核定：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 20).add(new Paragraph("查驗人：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("審閱及個資商議條款：\r\n" + "一、保證人確認本契約條款內容業經合理時間審閱並同意，且各收執契約影本乙份，並簽章如上。\r\n"
				+ "二、保證人知悉，貴行得提供個人資料予關係企業，並於其營業目的或貴行蒐集、處理、利用個人資料之告知說明所列相同特定目的範圍內，蒐集、處理、利用保證人之個人資料，並得提供予該等關係企業所委任處理營業相關事務之人。保證人亦暸解，如不同意上開事項，貴行及貴行之關係企業將可能無法主動提供除本授信以外其他之服務或優惠活動。\r\n"
				+ "保證人 ☐同意☐不同意 貴行得提供個人資料予關係企業。(未勾選視為「不同意」；法人戶免填)\r\n"
				+ "三、保證人願以本金新臺幣                                   元及其利息、遲延利息、違約金及其他從屬主債務之負擔為限額，與立約人負連帶清償責任。\r\n"
				+ "保證人 ☐願意☐不願意 接收貴行每年一次以書面通知當月基準日所負保證債務金額。(限第參章之連帶保證條款選擇「未定期間保證」者，本項未勾選者，視為「願意」。選擇「定有期間保證」者，免勾選。)\r\n"
				+ "").addStyle(normal11));
		table.addCell(cell);

		document.add(table);

		document.add(new Paragraph(""));

		table = new Table(UnitValue.createPercentArray(colWidths)).useAllAvailableWidth();
		cell = new Cell();

		cell = new Cell(1, 50).add(new Paragraph("保 證 人4：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("地址：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("營利事業統一編號/國民身分證統一編號：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("保證人與  貴行授信往來之印鑑以下列共☐壹式☐貳式☐     式，憑任壹式有效。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 1).add(new Paragraph("留存印鑑處").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 49).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 1).add(new Paragraph("對保簽名").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 49).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 30).add(new Paragraph("對保地點：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 20).add(new Paragraph("對保時間：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 15).add(new Paragraph("對保人：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 15).add(new Paragraph("核定：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 20).add(new Paragraph("查驗人：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("審閱及個資商議條款：\r\n" + "一、保證人確認本契約條款內容業經合理時間審閱並同意，且各收執契約影本乙份，並簽章如上。\r\n"
				+ "二、保證人知悉，貴行得提供個人資料予關係企業，並於其營業目的或貴行蒐集、處理、利用個人資料之告知說明所列相同特定目的範圍內，蒐集、處理、利用保證人之個人資料，並得提供予該等關係企業所委任處理營業相關事務之人。保證人亦暸解，如不同意上開事項，貴行及貴行之關係企業將可能無法主動提供除本授信以外其他之服務或優惠活動。\r\n"
				+ "保證人 ☐同意☐不同意 貴行得提供個人資料予關係企業。(未勾選視為「不同意」；法人戶免填)\r\n"
				+ "三、保證人願以本金新臺幣                                   元及其利息、遲延利息、違約金及其他從屬主債務之負擔為限額，與立約人負連帶清償責任。\r\n"
				+ "保證人 ☐願意☐不願意 接收貴行每年一次以書面通知當月基準日所負保證債務金額。(限第參章之連帶保證條款選擇「未定期間保證」者，本項未勾選者，視為「願意」。選擇「定有期間保證」者，免勾選。)\r\n"
				+ "").addStyle(normal11));
		table.addCell(cell);

		document.add(table);

		document.add(new Paragraph(""));

		table = new Table(UnitValue.createPercentArray(colWidths)).useAllAvailableWidth();
		cell = new Cell();

		cell = new Cell(1, 50).add(new Paragraph("擔 保 物 提 供 人1：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("地址：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("營利事業統一編號/國民身分證統一編號：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("擔保物為集保股票時，應留存集保帳戶印鑑；為現股時，應留存股務印鑑。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 1).add(new Paragraph("留存印鑑處").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 49).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 1).add(new Paragraph("對保簽名").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 49).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 30).add(new Paragraph("對保地點：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 20).add(new Paragraph("對保時間：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 15).add(new Paragraph("對保人：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 15).add(new Paragraph("核定：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 20).add(new Paragraph("查驗人：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("審閱及個資商議條款：\r\n" + "一、擔保物提供人確認本契約條款內容業經合理時間審閱並同意，且各收執契約影本乙份，並簽章如上。\r\n"
				+ "二、擔保物提供人知悉，貴行得提供個人資料予關係企業，並於其營業目的或貴行蒐集、處理、利用個人資料之告知說明所列相同特定目的範圍內，蒐集、處理、利用擔保物提供人之個人資料，並得提供予該等關係企業所委任處理營業相關事務之人。擔保物提供人亦暸解，如不同意上開事項，貴行及貴行之關係企業將可能無法主動提供除本授信以外其他之服務或優惠活動。\r\n"
				+ "擔保物提供人 ☐同意☐不同意 貴行得提供個人資料予關係企業。(未勾選視為「不同意」；法人戶免填)\r\n" + "").addStyle(normal11));
		table.addCell(cell);

		document.add(table);

		document.add(new Paragraph(""));

		table = new Table(UnitValue.createPercentArray(colWidths)).useAllAvailableWidth();
		cell = new Cell();

		cell = new Cell(1, 50).add(new Paragraph("擔 保 物 提 供 人2：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("地址：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("營利事業統一編號/國民身分證統一編號：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("擔保物為集保股票時，應留存集保帳戶印鑑；為現股時，應留存股務印鑑。").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 1).add(new Paragraph("留存印鑑處").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 49).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 1).add(new Paragraph("對保簽名").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 49).add(new Paragraph("").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 30).add(new Paragraph("對保地點：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 20).add(new Paragraph("對保時間：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 15).add(new Paragraph("對保人：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 15).add(new Paragraph("核定：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 20).add(new Paragraph("查驗人：").addStyle(normal11));
		table.addCell(cell);

		cell = new Cell(1, 50).add(new Paragraph("審閱及個資商議條款：\r\n" + "一、擔保物提供人確認本契約條款內容業經合理時間審閱並同意，且各收執契約影本乙份，並簽章如上。\r\n"
				+ "二、擔保物提供人知悉，貴行得提供個人資料予關係企業，並於其營業目的或貴行蒐集、處理、利用個人資料之告知說明所列相同特定目的範圍內，蒐集、處理、利用擔保物提供人之個人資料，並得提供予該等關係企業所委任處理營業相關事務之人。擔保物提供人亦暸解，如不同意上開事項，貴行及貴行之關係企業將可能無法主動提供除本授信以外其他之服務或優惠活動。\r\n"
				+ "擔保物提供人 ☐同意☐不同意 貴行得提供個人資料予關係企業。(未勾選視為「不同意」；法人戶免填)\r\n" + "").addStyle(normal11));
		table.addCell(cell);

		document.add(table);

		document.close();
	}
}

package com.facade;

public class ReportFacade {
	
	
	private PdfReport pdfReport;
	private ExcelReport excelReport;

	public ReportFacade() {
		pdfReport = new PdfReportImpl();
		excelReport = new ExcelReportImpl();
	}

	public void generatePdfReport() {
		pdfReport.generatePdfReport();
	}

	public void generateExcelReport() {
		excelReport.generateExcelReport();
	}

}

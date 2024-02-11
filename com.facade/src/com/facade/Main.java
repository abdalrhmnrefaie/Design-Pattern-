package com.facade;

public class Main {

	public static void main(String[] args) {

		
		//Without Using Facade Pattern
		PdfReport pdfReport = new PdfReportImpl();
		pdfReport.generatePdfReport();
			
		ExcelReport excelReport = new ExcelReportImpl();
		excelReport.generateExcelReport();
		
		
		
		//With Using Facade Pattern
		ReportFacade reportFacade = new ReportFacade();
		reportFacade.generatePdfReport();
		reportFacade.generateExcelReport();
	}
}

public class Application {
    public static void main(String[] args) {
        ReportFactory reportFactory = new ReportFactory();

        //Create a PDF report
        Report pdfReport = reportFactory.createReport("pdf");
        pdfReport.generate();

        //Create an Excel report
        Report excelReport = reportFactory.createReport("Excel");
        excelReport.generate();
    }
}

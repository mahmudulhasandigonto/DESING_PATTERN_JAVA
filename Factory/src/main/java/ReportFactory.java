public class ReportFactory {

    public Report createReport(String type){
        if(type.equalsIgnoreCase("pdf")){
            return new PDFReport();
        }else if(type.equalsIgnoreCase("excel")){
            return new ExcelReport();
        }else{
            throw new IllegalArgumentException("Invalid report type"+type);
        }
    }
}

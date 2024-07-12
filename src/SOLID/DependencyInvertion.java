package SOLID;


//Abstract
interface Report {
    void generate();
}

class PDFReport implements Report {
    @Override
    public void generate() {
        System.out.println("Generating PDF report");
    }
}

class ExcelReport implements Report {
    @Override
    public void generate() {
        System.out.println("Generating Excel report");
    }
}

class DependencyInvertion {
    private Report report;

    public DependencyInvertion(Report report) {
        this.report = report;
    }

    public void generateReport() {
        report.generate();
    }

    public static void main(String[] args) {
        Report pdfReport = new PDFReport();
        DependencyInvertion pdfGenerator = new DependencyInvertion(pdfReport);
        pdfGenerator.generateReport();

        Report excelReport = new ExcelReport();
        DependencyInvertion excelGenerator = new DependencyInvertion(excelReport);
        excelGenerator.generateReport();
    }
}

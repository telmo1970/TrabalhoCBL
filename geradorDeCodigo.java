public class geradorDeCodigo {

    public String generateDashboardHtml() {
        StringBuilder htmlBuilder = new StringBuilder();

        htmlBuilder.append("<!DOCTYPE html>\n");
        htmlBuilder.append("<html lang='pt'>\n");
        htmlBuilder.append("<head>\n");
        htmlBuilder.append("<meta charset='UTF-8'>\n");
        htmlBuilder.append("<meta name='viewport' content='width=device-width, initial-scale=1.0'>\n");
        htmlBuilder.append("<title>Dashboard</title>\n");
        htmlBuilder.append("<link rel='stylesheet' href='styles.css'>\n");
        htmlBuilder.append("</head>\n");
        htmlBuilder.append("<body>\n");
        htmlBuilder.append("<h1>Meu Dashboard gerado por java </h1>\n");
        // Adicione aqui os elementos do seu dashboard, como gráficos, tabelas, etc.
        htmlBuilder.append("</body>\n");
        htmlBuilder.append("</html>");

        return htmlBuilder.toString();
    }

    public static void main(String[] args) {
        geradorDeCodigo generator = new geradorDeCodigo();
        String htmlDashboard = generator.generateDashboardHtml();
        System.out.println(htmlDashboard);
    }
}

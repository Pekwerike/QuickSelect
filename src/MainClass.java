public class MainClass {
    public static void main(String[] args){
        QuickSelect<String> quickSelect = new QuickSelect<>();
        String[] names = {"Prosper", "Ekwerike", "Olamilesi", "Adeola", "Deola"};
         System.out.println(quickSelect.select(names, 3));
    }
}

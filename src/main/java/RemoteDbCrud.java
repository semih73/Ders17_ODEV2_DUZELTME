public class RemoteDbCrud {
    public static void main(String[] args) {
        CreateTableMethod tabloYarat = new CreateTableMethod();
        tabloYarat.tabloYarat();
        UpdateTableMethod guncelle = new UpdateTableMethod();
        guncelle.degistir();
        DeleteDataMethod verisil = new DeleteDataMethod();
        verisil.VeriSil();
    }
}

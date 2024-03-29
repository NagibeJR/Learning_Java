package telefone;

public class appFone extends Telefone {
    public appFone(String string) {
        super(string);
    }

    public static void main(String[] args) {
        Telefone t1 = new Telefone("79 9876-5432");
        t1.ligar();
        t1.aumentarVolume();
        t1.efetuarChamada("798876-5432");

        Smartphone s1 = new Smartphone("799199-6543");
        s1.ligar();
        System.out.println(s1.verificarEspacoLivre());
        App app1 = new App (" Whatsapp ", 2.3);
        s1.instalarApp(app1);
        s1.desligar();
    }
}
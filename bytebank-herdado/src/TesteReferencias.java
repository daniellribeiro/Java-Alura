public class TesteReferencias {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        Desenvolvedor d = new Desenvolvedor();
        d.setSalario(2500.0);

        Limpeza l = new Limpeza();
        l.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(d);
        controle.registra(l);

        System.out.println(controle.getSoma());

    }

}
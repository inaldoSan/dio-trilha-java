package interfaceEmJava.estabalecimento;

import interfaceEmJava.equipamentos.copiadora.Copiadora;
import interfaceEmJava.equipamentos.digitalizadora.Digitalizadora;
import interfaceEmJava.equipamentos.impressora.Impressora;
import interfaceEmJava.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Loja {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        Impressora impressora = em;

        impressora.imprimindo();

        digitalizadora.digitalizar();

        copiadora.copiar();
    }

}

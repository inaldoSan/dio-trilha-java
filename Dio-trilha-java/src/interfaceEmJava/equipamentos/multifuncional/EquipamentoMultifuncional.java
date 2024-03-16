package interfaceEmJava.equipamentos.multifuncional;

import interfaceEmJava.equipamentos.copiadora.Copiadora;
import interfaceEmJava.equipamentos.impressora.Impressora;
import interfaceEmJava.equipamentos.digitalizadora.Digitalizadora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {


    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    public void imprimindo() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

}

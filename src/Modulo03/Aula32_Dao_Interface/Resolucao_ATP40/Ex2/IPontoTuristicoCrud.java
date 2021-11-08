package Modulo03.Aula32_Dao_Interface.Resolucao_ATP40.Ex2;

import java.util.ArrayList;

public interface IPontoTuristicoCrud {
    public String save(PontoTuristico model);
    public ArrayList<PontoTuristico> read();
}

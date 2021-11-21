package Modulo03.Aula32_Dao_Interface.P1.controller;

import Modulo03.Aula32_Dao_Interface.P1.dao.PessoaDao;
import Modulo03.Aula32_Dao_Interface.P1.model.Pessoa;

public class PessoaController extends BaseController<Pessoa>{
    public PessoaController() {
        super(new PessoaDao());
    }
}

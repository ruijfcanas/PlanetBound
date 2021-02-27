/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetbound.logica.dados.Setores;

import planetbound.logica.dados.Setores.Planetas.Planeta;

/**
 *
 * @author Rui
 */
public class SetorVermelho extends Setor {
    
    public SetorVermelho(Planeta planeta) {
        super(planeta);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Planeta de cor ");
        sb.append(super.getPlanetaCor());
        sb.append(" e um setor vermelho.");
        return sb.toString();
    }
}

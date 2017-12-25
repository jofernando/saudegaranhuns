/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.sg.recursos;

import br.edu.ifpe.garanhuns.sg.model.dao.hibernate.ConsultaHibernate;
import br.edu.ifpe.garanhuns.sg.model.PostoSaude;
import br.edu.ifpe.garanhuns.sg.model.dao.hibernate.PostoSaudeHibernate;
import br.edu.ifpe.garanhuns.sg.model.enumarador.Especialidade;
import com.google.gson.Gson;
import java.time.LocalDate;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Web Service
 *
 * @author Jose Junio
 */
@RestController
public class AgendamentoResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ConsultasResource
     */
    public AgendamentoResource() {
    }

    /**
     * Retrieves representation of an instance of recursos.ConsultasResource
     *
     * @param id
     * @param emum
     * @return an instance of java.lang.String
     */
    @RequestMapping(value = "/agendamentos/{id}/{enum}", method = RequestMethod.GET)
    public ResponseEntity<String> recuperarDatasDisponiveisParaConsulta(@RequestParam("id") int id, @RequestParam("enum") int emum) {

        PostoSaude posto = new PostoSaudeHibernate().recuperar(id);

        List<LocalDate> datasDisponiveis = new ConsultaHibernate().agendamentoAutomaticoConsulta(posto,
                Especialidade.valueOf("DENTISTA"));

        return ResponseEntity.status(HttpStatus.OK).body(new Gson().toJson(datasDisponiveis));

    }

}

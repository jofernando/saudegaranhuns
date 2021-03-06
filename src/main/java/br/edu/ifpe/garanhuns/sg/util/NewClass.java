/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.sg.util;

import br.edu.ifpe.garanhuns.sg.model.Atendimento;
import br.edu.ifpe.garanhuns.sg.model.Bairro;
import br.edu.ifpe.garanhuns.sg.model.Consulta;
import br.edu.ifpe.garanhuns.sg.model.Endereco;
import br.edu.ifpe.garanhuns.sg.model.HorarioAtendimento;
import br.edu.ifpe.garanhuns.sg.model.Paciente;
import br.edu.ifpe.garanhuns.sg.model.PostoSaude;
import br.edu.ifpe.garanhuns.sg.model.Usuario;
import br.edu.ifpe.garanhuns.sg.model.dao.hibernate.BairroHibernate;
import br.edu.ifpe.garanhuns.sg.model.dao.hibernate.ConsultaHibernate;
import br.edu.ifpe.garanhuns.sg.model.dao.hibernate.HorarioAtendimentoHibernate;
import br.edu.ifpe.garanhuns.sg.model.dao.hibernate.PostoSaudeHibernate;
import br.edu.ifpe.garanhuns.sg.model.enumarador.DiasSemana;
import br.edu.ifpe.garanhuns.sg.model.enumarador.Especialidade;
import br.edu.ifpe.garanhuns.sg.model.enumarador.PerfilUsuario;
import br.edu.ifpe.garanhuns.sg.model.enumarador.Prioridade;
import br.edu.ifpe.garanhuns.sg.model.enumarador.Status;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author nosso
 */
public class NewClass {

    public static void main(String[] args) {
        HorarioAtendimentoHibernate hH = new HorarioAtendimentoHibernate();
        ConsultaHibernate cH = new ConsultaHibernate();

        hH.inserir(new HorarioAtendimento(DiasSemana.SEGUNDA, "08:00", "12:00", 10, new Atendimento(Especialidade.DENTISTA, new PostoSaude("Casa de deus", new Endereco("0", "Rua do cão 2", new Bairro("COHAB 6"))))));
        hH.inserir(new HorarioAtendimento(DiasSemana.TERÇA, "08:00", "12:00", 10, new Atendimento(Especialidade.GERAL, new PostoSaude("Casa de deus2", new Endereco("0", "Rua do cão 3", new Bairro("COHAB 5"))))));
        hH.inserir(new HorarioAtendimento(DiasSemana.SEXTA, "01:00", "12:00", 10, new Atendimento(Especialidade.GERAL, new PostoSaude("Casa de deus", new Endereco("0", "Rua do cão 2", new Bairro("COHAB 6"))))));
        hH.inserir(new HorarioAtendimento(DiasSemana.SEGUNDA, "03:00", "12:00", 10, new Atendimento(Especialidade.GERAL, new PostoSaude("Casa de deus2", new Endereco("0", "Rua do cão 3", new Bairro("COHAB 5"))))));
        hH.inserir(new HorarioAtendimento(DiasSemana.SEXTA, "07:00", "13:00", 10, new Atendimento(Especialidade.GERAL, new PostoSaude("Casa de deus", new Endereco("0", "Rua do cão 2", new Bairro("COHAB 6"))))));
        hH.inserir(new HorarioAtendimento(DiasSemana.TERÇA, "18:00", "19:00", 10, new Atendimento(Especialidade.GERAL, new PostoSaude("Casa de deus2", new Endereco("0", "Rua do cão 3", new Bairro("COHAB 5"))))));

        //LocalDate ld = LocalDate.now();
        /*LocalDate ld1 = LocalDate.of(2017, 12, 25);
        Period periodo = Period.between(ld , ld1);
        System.out.println(ld.getDayOfWeek());
        System.out.println(ld1.getDayOfWeek());
        System.out.println(ld1.getDayOfYear());
        System.out.println(ld1.plusDays(2));*/
 /*       
        cH.inserir(new Consulta(Especialidade.GERAL, Prioridade.IDOSO, Status.FILA, ld, null, new Paciente("lala", "123456", LocalDate.of(1995, 06, 1), new PostoSaude("Casa de deus2", new Endereco("0", "Rua do cão 3", new Bairro("COHAB 5"))), new Usuario("1231", "123", PerfilUsuario.ADMINISTRADOR))));
        cH.inserir(new Consulta(Especialidade.DENTISTA, Prioridade.BEBEDECOLO, Status.FILA, ld, null, new Paciente("lala1", "1234w56", LocalDate.of(1995, 06, 1), new PostoSaude("Casa de deus2", new Endereco("0", "Rua do cão 3", new Bairro("COHAB 5"))), new Usuario("1232", "123", PerfilUsuario.ADMINISTRADOR))));
        cH.inserir(new Consulta(Especialidade.GERAL, Prioridade.DEFICIENTEFISICO, Status.FILA, ld, null, new Paciente("lalwa", "12w3456", LocalDate.of(1995, 06, 1), new PostoSaude("Casa de deus2", new Endereco("0", "Rua do cão 3", new Bairro("COHAB 5"))), new Usuario("1233", "123", PerfilUsuario.ADMINISTRADOR))));
        cH.inserir(new Consulta(Especialidade.GERAL, Prioridade.NENHUMA, Status.FILA, ld, null, new Paciente("lawela", "123wwwww456", LocalDate.of(1995, 06, 1), new PostoSaude("Casa de deus2", new Endereco("0", "Rua do cão 3", new Bairro("COHAB 5"))), new Usuario("123", "1234", PerfilUsuario.ADMINISTRADOR))));
        cH.inserir(new Consulta(Especialidade.DENTISTA, Prioridade.GESTANTE, Status.FILA, ld, null, new Paciente("lalweqwea", "1234wwewe56", LocalDate.of(1995, 06, 1), new PostoSaude("Casa de deus2", new Endereco("0", "Rua do cão 3", new Bairro("COHAB 5"))), new Usuario("1235", "123", PerfilUsuario.ADMINISTRADOR))));
        cH.inserir(new Consulta(Especialidade.GERAL, Prioridade.IDOSO, Status.FILA, ld, null, new Paciente("lala", "123456", LocalDate.of(1995, 06, 1), new PostoSaude("Casa de deus2", new Endereco("0", "Rua do cão 3", new Bairro("COHAB 5"))), new Usuario("1231", "123", PerfilUsuario.ADMINISTRADOR))));
        cH.inserir(new Consulta(Especialidade.DENTISTA, Prioridade.BEBEDECOLO, Status.FILA, ld, null, new Paciente("lala1", "1234w56", LocalDate.of(1995, 06, 1), new PostoSaude("Casa de deus2", new Endereco("0", "Rua do cão 3", new Bairro("COHAB 5"))), new Usuario("1232", "123", PerfilUsuario.ADMINISTRADOR))));
        cH.inserir(new Consulta(Especialidade.GERAL, Prioridade.DEFICIENTEFISICO, Status.FILA, ld, null, new Paciente("lalwa", "12w3456", LocalDate.of(1995, 06, 1), new PostoSaude("Casa de deus2", new Endereco("0", "Rua do cão 3", new Bairro("COHAB 5"))), new Usuario("1233", "123", PerfilUsuario.ADMINISTRADOR))));
        cH.inserir(new Consulta(Especialidade.GERAL, Prioridade.NENHUMA, Status.FILA, ld, null, new Paciente("lawela", "123wwwww456", LocalDate.of(1995, 06, 1), new PostoSaude("Casa de deus2", new Endereco("0", "Rua do cão 3", new Bairro("COHAB 5"))), new Usuario("123", "1234", PerfilUsuario.ADMINISTRADOR))));
        cH.inserir(new Consulta(Especialidade.DENTISTA, Prioridade.GESTANTE, Status.FILA, ld, null, new Paciente("lalweqwea", "1234wwewe56", LocalDate.of(1995, 06, 1), new PostoSaude("Casa de deus2", new Endereco("0", "Rua do cão 3", new Bairro("COHAB 5"))), new Usuario("1235", "123", PerfilUsuario.ADMINISTRADOR))));
         */
        //cH.deletar(cH.recuperar(1));
        cH.inserir(new Consulta(Especialidade.GERAL, Prioridade.IDOSO, Status.AGENDADO, LocalDate.now(), LocalDate.now().plusDays(0), new Paciente("João", "123", LocalDate.of(1995, 01, 01), new PostoSaude("Casa de deus", new Endereco("1", "rua rua", new Bairro("não sei"))), new Usuario("a123", "123", PerfilUsuario.PACIENTE))));
        cH.inserir(new Consulta(Especialidade.DENTISTA, Prioridade.BEBEDECOLO, Status.AGENDADO, LocalDate.now(), LocalDate.now().plusDays(0), new Paciente("João", "123", LocalDate.of(1995, 01, 01), new PostoSaude("Casa de deus", new Endereco("1", "rua rua", new Bairro("não sei"))), new Usuario("a123", "123", PerfilUsuario.PACIENTE))));
        cH.inserir(new Consulta(Especialidade.GERAL, Prioridade.DEFICIENTEFISICO, Status.AGENDADO, LocalDate.now(), LocalDate.now().plusDays(1), new Paciente("João", "123", LocalDate.of(1995, 01, 01), new PostoSaude("Casa de deus", new Endereco("1", "rua rua", new Bairro("não sei"))), new Usuario("a123", "123", PerfilUsuario.PACIENTE))));
        cH.inserir(new Consulta(Especialidade.DENTISTA, Prioridade.GESTANTE, Status.AGENDADO, LocalDate.now(), LocalDate.now().plusDays(1), new Paciente("João", "123", LocalDate.of(1995, 01, 01), new PostoSaude("Casa de deus", new Endereco("1", "rua rua", new Bairro("não sei"))), new Usuario("a123", "123", PerfilUsuario.PACIENTE))));
        cH.inserir(new Consulta(Especialidade.GERAL, Prioridade.NENHUMA, Status.AGENDADO, LocalDate.now(), LocalDate.now().plusDays(2), new Paciente("João", "123", LocalDate.of(1995, 01, 01), new PostoSaude("Casa de deus", new Endereco("1", "rua rua", new Bairro("não sei"))), new Usuario("a123", "123", PerfilUsuario.PACIENTE))));
        cH.inserir(new Consulta(Especialidade.DENTISTA, Prioridade.IDOSO, Status.AGENDADO, LocalDate.now(), LocalDate.now().plusDays(2), new Paciente("João", "123", LocalDate.of(1995, 01, 01), new PostoSaude("Casa de deus", new Endereco("1", "rua rua", new Bairro("não sei"))), new Usuario("a123", "123", PerfilUsuario.PACIENTE))));
        cH.inserir(new Consulta(Especialidade.GERAL, Prioridade.BEBEDECOLO, Status.AGENDADO, LocalDate.now(), LocalDate.now().plusDays(3), new Paciente("João", "123", LocalDate.of(1995, 01, 01), new PostoSaude("Casa de deus", new Endereco("1", "rua rua", new Bairro("não sei"))), new Usuario("a123", "123", PerfilUsuario.PACIENTE))));
        cH.inserir(new Consulta(Especialidade.DENTISTA, Prioridade.DEFICIENTEFISICO, Status.AGENDADO, LocalDate.now(), LocalDate.now().plusDays(3), new Paciente("João", "123", LocalDate.of(1995, 01, 01), new PostoSaude("Casa de deus", new Endereco("1", "rua rua", new Bairro("não sei"))), new Usuario("a123", "123", PerfilUsuario.PACIENTE))));
        cH.inserir(new Consulta(Especialidade.GERAL, Prioridade.GESTANTE, Status.AGENDADO, LocalDate.now(), LocalDate.now().plusDays(4), new Paciente("João", "123", LocalDate.of(1995, 01, 01), new PostoSaude("Casa de deus", new Endereco("1", "rua rua", new Bairro("não sei"))), new Usuario("a123", "123", PerfilUsuario.PACIENTE))));
        cH.inserir(new Consulta(Especialidade.DENTISTA, Prioridade.NENHUMA, Status.AGENDADO, LocalDate.now(), LocalDate.now().plusDays(4), new Paciente("João", "123", LocalDate.of(1995, 01, 01), new PostoSaude("Casa de deus", new Endereco("1", "rua rua", new Bairro("não sei"))), new Usuario("a123", "123", PerfilUsuario.PACIENTE))));
        cH.inserir(new Consulta(Especialidade.DENTISTA, Prioridade.BEBEDECOLO, Status.AGENDADO, LocalDate.now(), LocalDate.now().plusDays(5), new Paciente("João", "123", LocalDate.of(1995, 01, 01), new PostoSaude("Casa de deus", new Endereco("1", "rua rua", new Bairro("não sei"))), new Usuario("a123", "123", PerfilUsuario.PACIENTE))));
        cH.inserir(new Consulta(Especialidade.GERAL, Prioridade.DEFICIENTEFISICO, Status.AGENDADO, LocalDate.now(), LocalDate.now().plusDays(5), new Paciente("João", "123", LocalDate.of(1995, 01, 01), new PostoSaude("Casa de deus", new Endereco("1", "rua rua", new Bairro("não sei"))), new Usuario("a123", "123", PerfilUsuario.PACIENTE))));
        cH.inserir(new Consulta(Especialidade.DENTISTA, Prioridade.IDOSO, Status.AGENDADO, LocalDate.now(), LocalDate.now().plusDays(6), new Paciente("João", "123", LocalDate.of(1995, 01, 01), new PostoSaude("Casa de deus", new Endereco("1", "rua rua", new Bairro("não sei"))), new Usuario("a123", "123", PerfilUsuario.PACIENTE))));

        System.out.println(new PostoSaudeHibernate().recuperarPorNome("Casa de deus"));
        System.out.println(new BairroHibernate().recuperarPorNome("COHAB 6") + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");

        PostoSaude ps = new PostoSaudeHibernate().recuperarPorNome("Casa de deus");
        //System.out.println("###4######################" + ps);
        //System.out.println(hH.recuperarHorarioAtendimentoPorPostoSaude(ps));
        //System.out.println(new AtendimentoHibernate().recuperarAtendimentoPorPostoEspecialidade(ps, Especialidade.GERAL));
        // System.out.println(hH.recuperarHorarioAtendimentoPorPostoSaudeEspecialidade(ps, Especialidade.DENTISTA));
        // 
        // System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&" + cH.recuperarTodasConsultasDoPosto(ps));
        // 
        //List<Consulta> cs = cH.recuperarConsultasDoPostoPorDia(ps, LocalDate.of(2017, 12, 28));
        //List<Consulta> cs = cH.recuperarConsultasDoPostoPorDiaEspecialidade(ps, LocalDate.of(2017, 12, 28),Especialidade.DENTISTA);
        //List<Consulta> cs = cH.recuperarConsultasDoPostoPorDiaEspecialidadeStatus(ps, LocalDate.of(2017, 12, 28),Especialidade.DENTISTA, Status.FILA);
        List<LocalDate> cs = cH.agendamentoAutomaticoConsulta(ps, Especialidade.DENTISTA);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        for (LocalDate c : cs) {
            //for (int i = 0; i < 10; i++) {

            //  System.out.println(LocalDate.now().plusDays(i)+" - "+LocalDate.now().plusDays(i).getDayOfWeek().getValue());
            System.out.println(c);
        }

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jedias
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Estudante objEstudante01 = new Estudante("EST1", "12345", "14-99999-8888");
       Estudante objEstudante02 = new Estudante("EST2", "54321", "14-99999-7777");
       
       objEstudante01.addDisciplinasNotas("P.O.O.", 6);
       objEstudante01.addDisciplinasNotas("ENG. SOFT.", 6);
       objEstudante01.addDisciplinasNotas("S.O.", 6);
       objEstudante01.addDisciplinasNotas("ESTRUTURA", 6);
       objEstudante01.addDisciplinasNotas("ESTATÍSTICA", 6);
       
       objEstudante02.addDisciplinasNotas("P.O.O.", 7);
       objEstudante02.addDisciplinasNotas("ENG. SOFT.", 7);
       objEstudante02.addDisciplinasNotas("S.O.", 7);
       objEstudante02.addDisciplinasNotas("ESTRUTURA", 7);
       objEstudante02.addDisciplinasNotas("ESTATÍSTICA", 7);
       
       objEstudante01.listarNotasDisciplinas();
       objEstudante02.listarNotasDisciplinas();
       
       System.out.println("Média Notas " + objEstudante01.getNome() + ": " + objEstudante01.calcularMediaNotas());
       System.out.println("Média Notas " + objEstudante02.getNome() + ": " + objEstudante02.calcularMediaNotas());
       
       
       
       objEstudante01.addEstudante(objEstudante02);
       objEstudante01.listarMonitorados();
    }
    
}

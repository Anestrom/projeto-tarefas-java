/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Tarefa;

/**
 *
 * @author toazz
 */
public class TarefasController {
    public List<Tarefa> addTarefa(Tarefa t, List<Tarefa> listaTarefas){
        listaTarefas.add(t);
        return listaTarefas;
    }
}

package com.carona.exceptions;

public class ProcedureException extends RuntimeException {
    
    public ProcedureException(String procedure, Throwable ex) {
        super("Ocorreu um erro ao executar procedure: " + procedure, ex);
    }
}
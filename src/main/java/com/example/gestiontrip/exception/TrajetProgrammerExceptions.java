package com.example.gestiontrip.exception;

public class TrajetProgrammerExceptions extends RuntimeException {
    public TrajetProgrammerExceptions(String s) {
        super("Trajet Programmer Exceptions: "+s);
    }
}

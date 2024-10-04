package io.github.kuihtares.projetoAngular.rest.exception;

import lombok.Getter;

import java.util.List;

public class ApiErrors {

    @Getter
    private List<String> errors;

    public ApiErrors(List<String> errors) {
        this.errors = errors;
    }

    public ApiErrors(String message) {
        this.errors = List.of(message);
    }
}

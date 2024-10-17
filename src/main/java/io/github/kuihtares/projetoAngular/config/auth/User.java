package io.github.kuihtares.projetoAngular.config.auth;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @NotEmpty
    private String username;

    @NotNull
    @NotEmpty

    private String password;

    @NotNull
    @NotEmpty
    @Column(name = "dateCreation", updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateCreation;

    @PrePersist
    public void prePersist(){
        setDateCreation(new Date());
    }
}

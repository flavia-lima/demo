package br.com.sudv.enfermeiros.crud.data.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_ala")
@Data
@Getter
@Setter
public class Ala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false, length = 80)
    public String nome;

    @Column(nullable = false, length = 10)
    public String andar;


}

package org.vem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "tblauth")
public class Auth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}

package org.vem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.vem.entity.enums.EStatus;

import java.time.LocalDateTime;

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

    String accountNo;

    String identityNo;

    String password;

    @Builder.Default
    EStatus status = EStatus.ACTIVE;

    @Builder.Default
    LocalDateTime createdDate = LocalDateTime.now();
}

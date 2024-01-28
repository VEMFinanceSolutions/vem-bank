package org.vem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.vem.entity.enums.EAccountType;
import org.vem.entity.enums.ECurrency;
import org.vem.entity.enums.EStatus;
import org.vem.utility.Generate;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "tblaccount")
public class Account {

    @Id
    String accountNo;

    String iban;

    @Enumerated(EnumType.STRING)
    EAccountType accountType;

    @Enumerated(EnumType.STRING)
    ECurrency currency;

    @Builder.Default
    Double balance = 0.00;

    @Builder.Default
    EStatus status = EStatus.ACTIVE;

    @Builder.Default
    LocalDateTime openingDate = LocalDateTime.now();

    LocalDateTime lastTransactionDate;

    @Builder.Default
    Double dailyTransactionLimit = 5000.00;
}

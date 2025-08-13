package br.com.knightware.knightware_backend.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_SERVICE_ORDER_STATUS")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iD_STATUS", nullable = false)
    private Long statusId;
    @Column(name = "TX_STATUS_DESCRIPTION", nullable = false)
    private String description;
}

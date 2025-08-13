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
@Table(name = "TB_CLIENTS")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENT", nullable = false)
    private Long clientId;
    @Column(name = "NM_NAME", nullable = false)
    private String name;
    @Column(name = "CD_PHONE", nullable = false)
    private String phone;
    @Column(name = "TX_ADDRESS", nullable = false)
    private String address;
    @Column(name = "TX_EMAIL", nullable = false)
    private String email;
}

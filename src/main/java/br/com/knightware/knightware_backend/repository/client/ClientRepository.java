package br.com.knightware.knightware_backend.repository.client;

import br.com.knightware.knightware_backend.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByEmail(String email);
    Client findByPhone(String phone);
}

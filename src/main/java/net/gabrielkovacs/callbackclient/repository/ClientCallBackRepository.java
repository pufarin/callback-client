package net.gabrielkovacs.callbackclient.repository;


import net.gabrielkovacs.callbackclient.entities.ClientCallBackWithDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientCallBackRepository extends JpaRepository<ClientCallBackWithDate,String> {
}

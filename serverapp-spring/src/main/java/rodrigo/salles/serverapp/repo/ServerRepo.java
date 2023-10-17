package rodrigo.salles.serverapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import rodrigo.salles.serverapp.model.Server;

public interface ServerRepo extends JpaRepository <Server, Long> {

    Server findByIpAddress(String ipAddress);
    Server findByName(String name);


}

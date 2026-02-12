package zignanimotors.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zignanimotors.api.model.Carro;

public interface CarroRepository extends JpaRepository <Carro, Long> {
}

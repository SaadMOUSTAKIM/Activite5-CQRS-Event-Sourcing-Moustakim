package queries.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import queries.entities.BankAccount;

public interface AccountRepository extends JpaRepository<BankAccount,String> {
}

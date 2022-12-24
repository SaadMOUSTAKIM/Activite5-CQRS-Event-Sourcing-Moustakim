package queries.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import queries.entities.AccountOperation;

import java.util.List;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
    List<AccountOperation> findByBankAccountId(String accountId);
}

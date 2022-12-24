package mappers;



import org.mapstruct.Mapper;
import queries.dto.AccountOperationResponseDTO;
import queries.dto.BankAccountResponseDTO;
import queries.entities.AccountOperation;
import queries.entities.BankAccount;

@Mapper(componentModel = "spring")
public interface BankAccountMapper {
    BankAccountResponseDTO bankAccountToBankAccountDTO(BankAccount bankAccount);
    AccountOperationResponseDTO accountOperationToAccountOperationDTO(AccountOperation accountOperation);
}

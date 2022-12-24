package commands.services;



import commands.dto.CreateAccountRequestDTO;
import commands.dto.CreditAccountRequestDTO;
import commands.dto.DebitAccountRequestDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {
    CompletableFuture<String> createAccount(CreateAccountRequestDTO accountRequestDTO);
    CompletableFuture<String> debitAccount(DebitAccountRequestDTO debitAccountRequestDTO);
    CompletableFuture<String> creditAccount(CreditAccountRequestDTO creditAccountRequestDTO);
}

package proj.service;

import proj.exception.InvalidFileFormatException;
import proj.model.Account;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileParser {
    public static List<Account> parseFile(String filePath) throws IOException, InvalidFileFormatException {
        List<Account> accounts = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length == 3) {
                    Account account = new Account();
                    account.setFromAccount(parts[0]);
                    account.setToAccount(parts[1]);
                    account.setTransferAmount(Integer.parseInt(parts[2]));

                    accounts.add(account);
                } else {
                    throw new InvalidFileFormatException("Invalid file format in " + filePath);
                }
            }
        }

        return accounts;
    }
}
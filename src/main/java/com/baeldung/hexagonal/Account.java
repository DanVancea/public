package com.baeldung.hexagonal;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.UUID;

public class Account {
			
		private String accountHolderName;
		private Long accountNumber;
		private String bankName;
		
		public Account(String accountHolderName, Long accountNumber, String bankName) {
			super();
			this.accountHolderName = accountHolderName;
			this.accountNumber = accountNumber;
			this.bankName = bankName;
		}

		public String getAccountHolderName() {
			return accountHolderName;
		}

		public void setAccountHolderName(String accountHolderName) {
			this.accountHolderName = accountHolderName;
		}

		public Long getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(Long accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getBankName() {
			return bankName;
		}

		public void setBankName(String bankName) {
			this.bankName = bankName;
		}

		@Override
		public String toString() {
			return "Account [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber
					+ ", bankName=" + bankName + "]";
		}

				
}




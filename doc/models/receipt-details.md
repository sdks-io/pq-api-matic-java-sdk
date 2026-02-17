
# Receipt Details

## Structure

`ReceiptDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BankAccountId` | `String` | Optional | Bank account ID for the bank account | String getBankAccountId() | setBankAccountId(String bankAccountId) |
| `BankAccountIdType` | [`BankAccountFields`](../../doc/models/bank-account-fields.md) | Optional | Classifies bank account [field types](#/rest/models/structures/bank-account-fields) | BankAccountFields getBankAccountIdType() | setBankAccountIdType(BankAccountFields bankAccountIdType) |
| `BankName` | `String` | Optional | Name of the bank the account is registered to | String getBankName() | setBankName(String bankName) |
| `BankId` | `String` | Optional | The bank id | String getBankId() | setBankId(String bankId) |
| `BankIdType` | [`BankAccountFields`](../../doc/models/bank-account-fields.md) | Optional | Classifies bank account [field types](#/rest/models/structures/bank-account-fields) | BankAccountFields getBankIdType() | setBankIdType(BankAccountFields bankIdType) |
| `BranchAddress` | `String` | Optional | The bank branch address | String getBranchAddress() | setBranchAddress(String branchAddress) |
| `BranchCity` | `String` | Optional | The bank branch city | String getBranchCity() | setBranchCity(String branchCity) |
| `BranchId` | `String` | Optional | The bank branch id | String getBranchId() | setBranchId(String branchId) |
| `BranchName` | `String` | Optional | The bank branch name | String getBranchName() | setBranchName(String branchName) |
| `BranchPostalCode` | `String` | Optional | The bank branch postal code | String getBranchPostalCode() | setBranchPostalCode(String branchPostalCode) |
| `BranchPhoneNumber` | `String` | Optional | The bank branch phone number | String getBranchPhoneNumber() | setBranchPhoneNumber(String branchPhoneNumber) |
| `BranchRegion` | `String` | Optional | The bank branch region | String getBranchRegion() | setBranchRegion(String branchRegion) |
| `BeneficaryTaxId` | `String` | Optional | The beneficiary's tax id | String getBeneficaryTaxId() | setBeneficaryTaxId(String beneficaryTaxId) |
| `BeneficaryTaxIdType` | [`BankAccountFields`](../../doc/models/bank-account-fields.md) | Optional | Classifies bank account [field types](#/rest/models/structures/bank-account-fields) | BankAccountFields getBeneficaryTaxIdType() | setBeneficaryTaxIdType(BankAccountFields beneficaryTaxIdType) |
| `BeneficaryName` | `String` | Optional | The name of the person chosen to inherit your account | String getBeneficaryName() | setBeneficaryName(String beneficaryName) |
| `Memo` | `String` | Optional | Optional internal [memo](#/rest/models/structures/memo) not visible to the user | String getMemo() | setMemo(String memo) |
| `Note` | `String` | Optional | [Optional comments](#/rest/models/structures/notes) visible to the user | String getNote() | setNote(String note) |
| `CorrelationToken` | `String` | Optional | [Token](#/rest/models/structures/token) representing the resource | String getCorrelationToken() | setCorrelationToken(String correlationToken) |
| `CardExpiryDate` | `String` | Optional | Date that the card will expire | String getCardExpiryDate() | setCardExpiryDate(String cardExpiryDate) |
| `CardHolderName` | `String` | Optional | Name of the card's owner | String getCardHolderName() | setCardHolderName(String cardHolderName) |
| `CardNumber` | `String` | Optional | Unique number on the prepaid card | String getCardNumber() | setCardNumber(String cardNumber) |
| `ElectronicWalletAccountNumber` | `String` | Optional | Account number for the electronic wallet | String getElectronicWalletAccountNumber() | setElectronicWalletAccountNumber(String electronicWalletAccountNumber) |
| `ElectronicWalletAccountNumberType` | [`ElectronicWalletFields`](../../doc/models/electronic-wallet-fields.md) | Optional | Classifies electronic wallet [field types](#/rest/models/structures/electronic-wallet-fields) | ElectronicWalletFields getElectronicWalletAccountNumberType() | setElectronicWalletAccountNumberType(ElectronicWalletFields electronicWalletAccountNumberType) |
| `ElectronicWalletGovernmentId` | `String` | Optional | Government ID for the electronic wallet | String getElectronicWalletGovernmentId() | setElectronicWalletGovernmentId(String electronicWalletGovernmentId) |
| `ElectronicWalletGovernmentIdType` | [`ElectronicWalletFields`](../../doc/models/electronic-wallet-fields.md) | Optional | Classifies electronic wallet [field types](#/rest/models/structures/electronic-wallet-fields) | ElectronicWalletFields getElectronicWalletGovernmentIdType() | setElectronicWalletGovernmentIdType(ElectronicWalletFields electronicWalletGovernmentIdType) |
| `ElectronicWalletType` | [`ElectronicWalletTypes`](../../doc/models/electronic-wallet-types.md) | Optional | Name of the electronic wallet | ElectronicWalletTypes getElectronicWalletType() | setElectronicWalletType(ElectronicWalletTypes electronicWalletType) |
| `MobilePhoneNumber` | `String` | Optional | - | String getMobilePhoneNumber() | setMobilePhoneNumber(String mobilePhoneNumber) |
| `ElectronicFundsTransferType` | [`ElectronicFundsTransferTypes`](../../doc/models/electronic-funds-transfer-types.md) | Optional | The type of transfer performed | ElectronicFundsTransferTypes getElectronicFundsTransferType() | setElectronicFundsTransferType(ElectronicFundsTransferTypes electronicFundsTransferType) |
| `ElectronicFundsTransferFailureType` | [`ElectronicTransferFailureTypes`](../../doc/models/electronic-transfer-failure-types.md) | Optional | The type of failure for a bank transfer | ElectronicTransferFailureTypes getElectronicFundsTransferFailureType() | setElectronicFundsTransferFailureType(ElectronicTransferFailureTypes electronicFundsTransferFailureType) |
| `ElectronicTransferStatusType` | [`ElectronicTransferStatusTypes`](../../doc/models/electronic-transfer-status-types.md) | Optional | The status of a bank transfer | ElectronicTransferStatusTypes getElectronicTransferStatusType() | setElectronicTransferStatusType(ElectronicTransferStatusTypes electronicTransferStatusType) |

## Example (as JSON)

```json
{
  "bankAccountId": "string",
  "bankAccountIdType": "BANK_ACH_ABA",
  "bankName": "string",
  "bankId": "string",
  "bankIdType": "BANK_ACH_ABA",
  "branchAddress": "string",
  "branchCity": "string",
  "branchId": "string",
  "branchName": "string",
  "branchPostalCode": "string",
  "branchPhoneNumber": "string",
  "branchRegion": "string",
  "beneficaryTaxId": "string",
  "beneficaryTaxIdType": "BANK_ACH_ABA",
  "beneficaryName": "string",
  "memo": "string",
  "note": "string",
  "correlationToken": "string",
  "cardExpiryDate": "string",
  "cardHolderName": "string",
  "cardNumber": "483318******4628",
  "electronicWalletAccountNumber": "string",
  "electronicWalletAccountNumberType": "UNDEFINED",
  "electronicWalletGovernmentId": "string",
  "electronicWalletGovernmentIdType": "UNDEFINED",
  "electronicWalletType": "AIRTEL_MONEY",
  "mobilePhoneNumber": "string",
  "electronicFundsTransferType": "MANUAL",
  "electronicFundsTransferFailureType": "INCORRECT_ACCOUNT_NUMBER",
  "electronicTransferStatusType": "IN_PROGRESS"
}
```


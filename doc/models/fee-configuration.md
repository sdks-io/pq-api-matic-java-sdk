
# Fee Configuration

## Structure

`FeeConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Category` | [`CategoryTypes`](../../doc/models/category-types.md) | Optional | Category types | CategoryTypes getCategory() | setCategory(CategoryTypes category) |
| `Distribution` | [`List<FeeDistribution>`](../../doc/models/fee-distribution.md) | Optional | - | List<FeeDistribution> getDistribution() | setDistribution(List<FeeDistribution> distribution) |
| `Source` | [`FeeSources`](../../doc/models/fee-sources.md) | Optional | Fee source types | FeeSources getSource() | setSource(FeeSources source) |
| `TotalAmount` | `Double` | Optional | Total amount of money for all transactions | Double getTotalAmount() | setTotalAmount(Double totalAmount) |
| `TransactionAmount` | `Double` | Optional | Total amount of money for the transaction | Double getTransactionAmount() | setTransactionAmount(Double transactionAmount) |
| `Type` | [`Fees`](../../doc/models/fees.md) | Optional | Fee types | Fees getType() | setType(Fees type) |
| `ValueAmount` | `String` | Optional | Value of the target resource | String getValueAmount() | setValueAmount(String valueAmount) |
| `ValueType` | [`FeeValues`](../../doc/models/fee-values.md) | Optional | Fee value types | FeeValues getValueType() | setValueType(FeeValues valueType) |

## Example (as JSON)

```json
{
  "category": "COMPANY",
  "distribution": [
    {
      "amount": 1.02,
      "currency": "USD",
      "description": [
        {
          "language": "en-US",
          "translation": "string"
        }
      ],
      "formattedAmount": "$0.05 USD",
      "percentage": 50.0,
      "responsibility": "COMPANY",
      "responsibilitySource": "CREDIT",
      "sourceToken": "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860"
    }
  ],
  "source": "TRANSACTION",
  "totalAmount": 50.0,
  "transactionAmount": 50.0,
  "type": "BANK_TRANSFER_REVERSAL_STOP_NOC",
  "valueAmount": "string",
  "valueType": "PERCENTAGE"
}
```




# CounterpartyDocumentPropertyAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Object** |  |  [optional] |
|**routingNumber** | **String** |  |  |
|**accountNumber** | **String** |  |  |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**name** | **String** |  |  |
|**bank** | **String** |  |  [optional] |
|**permissions** | [**PermissionsEnum**](#PermissionsEnum) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| CHECKING | &quot;Checking&quot; |
| SAVINGS | &quot;Savings&quot; |
| LOAN | &quot;Loan&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BUSINESS | &quot;Business&quot; |
| PERSON | &quot;Person&quot; |
| UNKNOWN | &quot;Unknown&quot; |



## Enum: PermissionsEnum

| Name | Value |
|---- | -----|
| CREDITONLY | &quot;CreditOnly&quot; |
| DEBITONLY | &quot;DebitOnly&quot; |
| CREDITANDDEBIT | &quot;CreditAndDebit&quot; |




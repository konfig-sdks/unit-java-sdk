

# CloseAccountRequestPropertyAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reason** | [**ReasonEnum**](#ReasonEnum) |  |  [optional] |
|**fraudReason** | [**FraudReasonEnum**](#FraudReasonEnum) |  |  [optional] |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| BYCUSTOMER | &quot;ByCustomer&quot; |
| FRAUD | &quot;Fraud&quot; |



## Enum: FraudReasonEnum

| Name | Value |
|---- | -----|
| ACHACTIVITY | &quot;ACHActivity&quot; |
| CARDACTIVITY | &quot;CardActivity&quot; |
| CHECKACTIVITY | &quot;CheckActivity&quot; |
| APPLICATIONHISTORY | &quot;ApplicationHistory&quot; |
| ACCOUNTACTIVITY | &quot;AccountActivity&quot; |
| CLIENTIDENTIFIED | &quot;ClientIdentified&quot; |
| IDENTITYTHEFT | &quot;IdentityTheft&quot; |
| LINKEDTOFRAUDULENTCUSTOMER | &quot;LinkedToFraudulentCustomer&quot; |




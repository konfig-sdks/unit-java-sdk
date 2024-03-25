

# GetListPaymentsFromApiFilterParameter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** |  |  [optional] |
|**accountId** | **String** |  |  [optional] |
|**customerId** | **String** |  |  [optional] |
|**counterpartyAccountId** | **String** |  |  [optional] |
|**status** | [**List&lt;StatusEnum&gt;**](#List&lt;StatusEnum&gt;) |  |  [optional] |
|**type** | [**List&lt;TypeEnum&gt;**](#List&lt;TypeEnum&gt;) |  |  [optional] |
|**direction** | [**List&lt;DirectionEnum&gt;**](#List&lt;DirectionEnum&gt;) |  |  [optional] |
|**since** | **String** |  |  [optional] |
|**until** | **String** |  |  [optional] |
|**fromAmount** | **Integer** |  |  [optional] |
|**toAmount** | **Integer** |  |  [optional] |
|**recurringPaymentId** | **Integer** |  |  [optional] |
|**feature** | [**List&lt;FeatureEnum&gt;**](#List&lt;FeatureEnum&gt;) |  |  [optional] |



## Enum: List&lt;StatusEnum&gt;

| Name | Value |
|---- | -----|
| REJECTED | &quot;Rejected&quot; |
| PENDING | &quot;Pending&quot; |
| CANCELED | &quot;Canceled&quot; |
| PENDING_REVIEW | &quot;Pending Review&quot; |
| CLEARING | &quot;Clearing&quot; |
| SENT | &quot;Sent&quot; |
| RETURNED | &quot;Returned&quot; |



## Enum: List&lt;TypeEnum&gt;

| Name | Value |
|---- | -----|
| ACHPAYMENT | &quot;AchPayment&quot; |
| BOOKPAYMENT | &quot;BookPayment&quot; |
| WIREPAYMENT | &quot;WirePayment&quot; |



## Enum: List&lt;DirectionEnum&gt;

| Name | Value |
|---- | -----|
| DEBIT | &quot;Debit&quot; |
| CREDIT | &quot;Credit&quot; |



## Enum: List&lt;FeatureEnum&gt;

| Name | Value |
|---- | -----|
| SAMEDAY | &quot;SameDay&quot; |
| RECURRINGPAYMENT | &quot;RecurringPayment&quot; |




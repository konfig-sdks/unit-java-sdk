

# ReceivedPaymentResourcePropertyAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Object** |  |  [optional] |
|**description** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**amount** | **Integer** |  |  |
|**completionDate** | **String** |  |  |
|**direction** | [**DirectionEnum**](#DirectionEnum) |  |  |
|**wasAdvanced** | **Boolean** |  |  |
|**isAdvanceable** | **Boolean** |  |  [optional] |
|**isAdvaceable** | **Boolean** |  |  [optional] |
|**companyName** | **String** |  |  |
|**counterpartyRoutingNumber** | **String** |  |  |
|**addenda** | **String** |  |  [optional] |
|**traceNumber** | **String** |  |  |
|**secCode** | **String** |  |  |
|**returnReason** | **String** |  |  [optional] |
|**receivingEntityName** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;Pending&quot; |
| ADVANCED | &quot;Advanced&quot; |
| COMPLETED | &quot;Completed&quot; |
| RETURNED | &quot;Returned&quot; |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| DEBIT | &quot;Debit&quot; |
| CREDIT | &quot;Credit&quot; |






# CheckDepositPropertyAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Object** |  |  [optional] |
|**description** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**settlementDate** | **LocalDate** |  |  [optional] |
|**amount** | **Integer** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**reason** | **String** |  |  [optional] |
|**statusCreatedAt** | **OffsetDateTime** |  |  [optional] |
|**statusSetBy** | **String** |  |  [optional] |
|**statusHistory** | **List&lt;Object&gt;** |  |  [optional] |
|**reasonText** | **String** |  |  [optional] |
|**checkNumber** | **String** |  |  [optional] |
|**vendor** | **String** |  |  [optional] |
|**counterparty** | **Object** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| AWAITINGIMAGES | &quot;AwaitingImages&quot; |
| AWAITINGFRONTIMAGE | &quot;AwaitingFrontImage&quot; |
| AWAITINGBACKIMAGE | &quot;AwaitingBackImage&quot; |
| PENDING | &quot;Pending&quot; |
| PENDINGREVIEW | &quot;PendingReview&quot; |
| AWAITINGCUSTOMERCONFIRMATION | &quot;AwaitingCustomerConfirmation&quot; |
| REJECTED | &quot;Rejected&quot; |
| CLEARING | &quot;Clearing&quot; |
| SENT | &quot;Sent&quot; |
| CANCELED | &quot;Canceled&quot; |
| RETURNED | &quot;Returned&quot; |




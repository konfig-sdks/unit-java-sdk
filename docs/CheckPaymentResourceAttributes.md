

# CheckPaymentResourceAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Object** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**amount** | **Integer** |  |  |
|**returnCutoffTime** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**memo** | **String** |  |  [optional] |
|**deliveryStatus** | [**DeliveryStatusEnum**](#DeliveryStatusEnum) |  |  [optional] |
|**sendAt** | **OffsetDateTime** |  |  [optional] |
|**counterparty** | [**CheckPaymentResourceAttributesCounterparty**](CheckPaymentResourceAttributesCounterparty.md) |  |  [optional] |
|**trackedAt** | **OffsetDateTime** |  |  [optional] |
|**postalCode** | **String** |  |  [optional] |
|**expectedDelivery** | **LocalDate** |  |  [optional] |
|**originated** | **Boolean** |  |  |
|**expirationDate** | **LocalDate** |  |  [optional] |
|**rejectReason** | **String** |  |  [optional] |
|**returnReason** | **Object** |  |  [optional] |
|**pendingReviewReasons** | [**List&lt;PendingReviewReasonsEnum&gt;**](#List&lt;PendingReviewReasonsEnum&gt;) |  |  [optional] |
|**checkNumber** | **String** |  |  [optional] |
|**onUsAuxiliary** | **String** |  |  [optional] |
|**onUs** | **String** |  |  [optional] |
|**counterpartyRoutingNumber** | **String** |  |  [optional] |
|**additionalVerificationStatus** | [**AdditionalVerificationStatusEnum**](#AdditionalVerificationStatusEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| MARKEDFORRETURN | &quot;MarkedForReturn&quot; |
| RETURNED | &quot;Returned&quot; |
| PROCESSED | &quot;Processed&quot; |
| PENDINGREVIEW | &quot;PendingReview&quot; |



## Enum: DeliveryStatusEnum

| Name | Value |
|---- | -----|
| MAILED | &quot;Mailed&quot; |
| INLOCALAREA | &quot;InLocalArea&quot; |
| DELIVERED | &quot;Delivered&quot; |
| REROUTED | &quot;Rerouted&quot; |
| RETURNEDTOSENDER | &quot;ReturnedToSender&quot; |



## Enum: List&lt;PendingReviewReasonsEnum&gt;

| Name | Value |
|---- | -----|
| NAMEMISSMATCH | &quot;NameMissMatch&quot; |
| SOFTLIMIT | &quot;SoftLimit&quot; |



## Enum: AdditionalVerificationStatusEnum

| Name | Value |
|---- | -----|
| REQUIRED | &quot;Required&quot; |
| NOTREQUIRED | &quot;NotRequired&quot; |
| APPROVED | &quot;Approved&quot; |




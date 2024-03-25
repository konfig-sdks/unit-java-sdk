

# GetListCheckPaymentsFromApiFilterParameter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** |  |  [optional] |
|**accountId** | **String** |  |  [optional] |
|**customerId** | **String** |  |  [optional] |
|**status** | [**List&lt;StatusEnum&gt;**](#List&lt;StatusEnum&gt;) |  |  [optional] |
|**since** | **String** |  |  [optional] |
|**until** | **String** |  |  [optional] |
|**fromAmount** | **Integer** |  |  [optional] |
|**toAmount** | **Integer** |  |  [optional] |
|**checkNumber** | **String** |  |  [optional] |



## Enum: List&lt;StatusEnum&gt;

| Name | Value |
|---- | -----|
| NEW | &quot;New&quot; |
| PENDING | &quot;Pending&quot; |
| CANCELED | &quot;Canceled&quot; |
| REJECTED | &quot;Rejected&quot; |
| INDELIVERY | &quot;InDelivery&quot; |
| INPRODUCTION | &quot;InProduction&quot; |
| DELIVERED | &quot;Delivered&quot; |
| RETURNEDTOSENDER | &quot;ReturnedToSender&quot; |
| PROCESSED | &quot;Processed&quot; |
| PENDINGREVIEW | &quot;PendingReview&quot; |
| MARKEDFORRETURN | &quot;MarkedForReturn&quot; |
| RETURNED | &quot;Returned&quot; |




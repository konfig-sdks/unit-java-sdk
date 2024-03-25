

# GetListRepaymentsFromApiFilterParameter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** |  |  [optional] |
|**creditAccountId** | **String** |  |  [optional] |
|**customerId** | **String** |  |  [optional] |
|**status** | [**List&lt;StatusEnum&gt;**](#List&lt;StatusEnum&gt;) |  |  [optional] |
|**type** | [**List&lt;TypeEnum&gt;**](#List&lt;TypeEnum&gt;) |  |  [optional] |



## Enum: List&lt;StatusEnum&gt;

| Name | Value |
|---- | -----|
| PENDING | &quot;Pending&quot; |
| PENDINGREVIEW | &quot;PendingReview&quot; |
| RETURNED | &quot;Returned&quot; |
| SENT | &quot;Sent&quot; |
| REJECTED | &quot;Rejected&quot; |



## Enum: List&lt;TypeEnum&gt;

| Name | Value |
|---- | -----|
| ACHREPAYMENT | &quot;AchRepayment&quot; |
| BOOKREPAYMENT | &quot;BookRepayment&quot; |




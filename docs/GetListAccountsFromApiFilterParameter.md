

# GetListAccountsFromApiFilterParameter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** |  |  [optional] |
|**customerId** | **String** |  |  [optional] |
|**status** | [**List&lt;StatusEnum&gt;**](#List&lt;StatusEnum&gt;) |  |  [optional] |
|**type** | [**List&lt;TypeEnum&gt;**](#List&lt;TypeEnum&gt;) |  |  [optional] |
|**fromBalance** | **Double** |  |  [optional] |
|**toBalance** | **Double** |  |  [optional] |



## Enum: List&lt;StatusEnum&gt;

| Name | Value |
|---- | -----|
| OPEN | &quot;Open&quot; |
| FROZEN | &quot;Frozen&quot; |
| CLOSED | &quot;Closed&quot; |



## Enum: List&lt;TypeEnum&gt;

| Name | Value |
|---- | -----|
| DEPOSIT | &quot;deposit&quot; |
| CREDIT | &quot;credit&quot; |




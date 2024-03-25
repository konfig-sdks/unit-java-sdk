

# GetListAuthorizationsFromApiFilterParameter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** |  |  [optional] |
|**accountType** | **String** |  |  [optional] |
|**customerId** | **String** |  |  [optional] |
|**cardId** | **String** |  |  [optional] |
|**includeNonAuthorized** | **Boolean** |  |  [optional] |
|**merchantCategoryCode** | **List&lt;String&gt;** |  |  [optional] |
|**since** | **String** |  |  [optional] |
|**until** | **String** |  |  [optional] |
|**fromAmount** | **Integer** |  |  [optional] |
|**toAmount** | **Integer** |  |  [optional] |
|**status** | [**List&lt;StatusEnum&gt;**](#List&lt;StatusEnum&gt;) |  |  [optional] |



## Enum: List&lt;StatusEnum&gt;

| Name | Value |
|---- | -----|
| AUTHORIZED | &quot;Authorized&quot; |
| COMPLETED | &quot;Completed&quot; |
| CANCELED | &quot;Canceled&quot; |
| DECLINED | &quot;Declined&quot; |




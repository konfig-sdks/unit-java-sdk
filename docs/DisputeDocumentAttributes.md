

# DisputeDocumentAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  |
|**source** | [**SourceEnum**](#SourceEnum) |  |  |
|**externalId** | **String** |  |  |
|**link** | **String** |  |  [optional] |
|**amount** | **Integer** |  |  |
|**status** | **String** |  |  |
|**statusHistory** | [**List&lt;DisputeDocumentAttributesStatusHistoryInner&gt;**](DisputeDocumentAttributesStatusHistoryInner.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**decisionReason** | **String** |  |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| DEBITCARD | &quot;DebitCard&quot; |
| ACH | &quot;ACH&quot; |




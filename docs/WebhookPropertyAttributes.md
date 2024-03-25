

# WebhookPropertyAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**label** | **String** |  |  [optional] |
|**url** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) |  |  [optional] |
|**deliveryMode** | [**DeliveryModeEnum**](#DeliveryModeEnum) |  |  [optional] |
|**token** | **String** |  |  [optional] |
|**subscriptionType** | **String** |  |  [optional] |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| JSON | &quot;Json&quot; |
| JSONAPI | &quot;JsonAPI&quot; |



## Enum: DeliveryModeEnum

| Name | Value |
|---- | -----|
| ATMOSTONCE | &quot;AtMostOnce&quot; |
| ATLEASTONCE | &quot;AtLeastOnce&quot; |




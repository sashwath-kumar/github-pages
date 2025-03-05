---
title: Connection-Manager v0.0.1
language_tabs:
  - shell: Shell
  - http: HTTP
  - javascript: JavaScript
  - ruby: Ruby
  - python: Python
  - php: PHP
  - java: Java
  - go: Go
toc_footers: []
includes: []
search: true
highlight_theme: darkula
headingLevel: 2

---

<!-- Generator: Widdershins v4.0.1 -->

<h1 id="connection-manager">Connection-Manager v0.0.1</h1>

> Scroll down for code samples, example requests and responses. Select a language for code samples from the tabs above or the mobile navigation menu.

API to getting the connection detail using connection Id.

Base URLs:

* <a href="https://sashwath-kumar.github.io">https://sashwath-kumar.github.io</a>

<h1 id="connection-manager-default">Default</h1>

## getConnection

<a id="opIdgetConnection"></a>

> Code samples

```shell
# You can also use wget
curl -X GET https://sashwath-kumar.github.io/connections/{connectionId}/overview \
  -H 'Accept: application/json'

```

```http
GET https://sashwath-kumar.github.io/connections/{connectionId}/overview HTTP/1.1
Host: sashwath-kumar.github.io
Accept: application/json

```

```javascript

const headers = {
  'Accept':'application/json'
};

fetch('https://sashwath-kumar.github.io/connections/{connectionId}/overview',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application/json'
}

result = RestClient.get 'https://sashwath-kumar.github.io/connections/{connectionId}/overview',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application/json'
}

r = requests.get('https://sashwath-kumar.github.io/connections/{connectionId}/overview', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','https://sashwath-kumar.github.io/connections/{connectionId}/overview', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("https://sashwath-kumar.github.io/connections/{connectionId}/overview");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "https://sashwath-kumar.github.io/connections/{connectionId}/overview", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /connections/{connectionId}/overview`

*Get Connection Overview*

Retrieve details about a specific connection using its ID.

<h3 id="getconnection-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|connectionId|path|string|true|Unique ID of the connection.|

> Example responses

> 200 Response

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "system1": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "url": "http://example.com"
  },
  "system2": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "url": "http://example.com"
  },
  "status": "ACTIVE"
}
```

<h3 id="getconnection-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Successfully retrieved connection details.|[Connection](#schemaconnection)|
|404|[Not Found](https://tools.ietf.org/html/rfc7231#section-6.5.4)|Connection not found.|[Error](#schemaerror)|
|500|[Internal Server Error](https://tools.ietf.org/html/rfc7231#section-6.6.1)|Internal server error.|[InternalServerError](#schemainternalservererror)|

<aside class="success">
This operation does not require authentication
</aside>

# Schemas

<h2 id="tocS_Connection">Connection</h2>
<!-- backwards compatibility -->
<a id="schemaconnection"></a>
<a id="schema_Connection"></a>
<a id="tocSconnection"></a>
<a id="tocsconnection"></a>

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "system1": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "url": "http://example.com"
  },
  "system2": {
    "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
    "url": "http://example.com"
  },
  "status": "ACTIVE"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|string(uuid)|false|none|none|
|system1|[System](#schemasystem)|false|none|none|
|system2|[System](#schemasystem)|false|none|none|
|status|string|false|none|none|

#### Enumerated Values

|Property|Value|
|---|---|
|status|ACTIVE|
|status|DEACTIVATED|

<h2 id="tocS_System">System</h2>
<!-- backwards compatibility -->
<a id="schemasystem"></a>
<a id="schema_System"></a>
<a id="tocSsystem"></a>
<a id="tocssystem"></a>

```json
{
  "id": "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  "url": "http://example.com"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|string(uuid)|false|none|none|
|url|string(uri)|false|none|none|

<h2 id="tocS_Error">Error</h2>
<!-- backwards compatibility -->
<a id="schemaerror"></a>
<a id="schema_Error"></a>
<a id="tocSerror"></a>
<a id="tocserror"></a>

```json
{
  "message": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|message|string|false|none|none|

<h2 id="tocS_InternalServerError">InternalServerError</h2>
<!-- backwards compatibility -->
<a id="schemainternalservererror"></a>
<a id="schema_InternalServerError"></a>
<a id="tocSinternalservererror"></a>
<a id="tocsinternalservererror"></a>

```json
{
  "message": "Connection ID is not parsable to UUID"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|message|string|false|none|none|


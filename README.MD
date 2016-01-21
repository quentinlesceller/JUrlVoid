# JUrlVoid

JUrlVoid is a simple Java API for UrlVoid.

## Features

- Get informations on any domain.

## Install

Download the latest version and type the following line in the JUrlVoid folder.

```bash
$ git clone https://github.com/quentinlesceller/JUrlVoid
$ mvn install
```

Or simply download the jar file in jar/JUrlVoid.jar.

### Usage
Import into your Java project. Here is an example with google.com.
```
JUrlVoid jUrlVoid = new JUrlVoid(apiKey);
JUrlVoidResult result = jUrlVoid.checkUrl("google.com");
```
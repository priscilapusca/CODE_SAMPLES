$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/login_feature.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Facebook",
  "description": "",
  "id": "login-to-facebook",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "User navigates to Facebook",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on Facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.goToFacebook()"
});
formatter.result({
  "duration": 4088139946,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "",
  "description": "",
  "id": "login-to-facebook;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I enter username as \"TOM\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter password as \"JERRY\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "login should fail",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TOM",
      "offset": 21
    }
  ],
  "location": "Login.enterUsername(String)"
});
formatter.result({
  "duration": 84927147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JERRY",
      "offset": 21
    }
  ],
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "duration": 98149262,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: #u_0_2\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027WS-CJ-U3-4239\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 65.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:geckodriverVersion: 0.24.0, moz:headless: false, moz:processID: 9428, moz:profile: C:\\Users\\priscila.pusca\\App..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: f2ba202b-2f38-47f5-bb77-720f264c1b93\n*** Element info: {Using\u003did, value\u003du_0_2}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.cucumber.selenium.Login.enterPassword(Login.java:35)\r\n\tat ✽.And I enter password as \"JERRY\"(features/login_feature.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login.checkFail()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "User navigates to Facebook",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on Facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.goToFacebook()"
});
formatter.result({
  "duration": 3717771377,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-to-facebook;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I enter username as \"TOM\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I enter password as \"JERRY\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "login should fail",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "relogin option should be available",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "TOM",
      "offset": 21
    }
  ],
  "location": "Login.enterUsername(String)"
});
formatter.result({
  "duration": 62277120,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JERRY",
      "offset": 21
    }
  ],
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "duration": 80343893,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: #u_0_2\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027WS-CJ-U3-4239\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 65.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:geckodriverVersion: 0.24.0, moz:headless: false, moz:processID: 8744, moz:profile: C:\\Users\\priscila.pusca\\App..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: fde510e8-206e-45aa-b167-e7bdb383da23\n*** Element info: {Using\u003did, value\u003du_0_2}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.cucumber.selenium.Login.enterPassword(Login.java:35)\r\n\tat ✽.And I enter password as \"JERRY\"(features/login_feature.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login.checkFail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.checkRelogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("features/search_feature.feature");
formatter.feature({
  "line": 1,
  "name": "search Wikipedia",
  "description": "",
  "id": "search-wikipedia",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "",
  "description": "",
  "id": "search-wikipedia;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "enter search term \u0027\u003csearchTerm\u003e\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "do search",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "multiple results are shown for \u0027\u003cresult\u003e\u0027",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "search-wikipedia;;",
  "rows": [
    {
      "cells": [
        "searchTerm",
        "result"
      ],
      "line": 12,
      "id": "search-wikipedia;;;1"
    },
    {
      "cells": [
        "mercury",
        "Mercury may refer to"
      ],
      "line": 13,
      "id": "search-wikipedia;;;2"
    },
    {
      "cells": [
        "max",
        "Max may refer to"
      ],
      "line": 14,
      "id": "search-wikipedia;;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "open wikipedia",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.openWikipedia()"
});
formatter.result({
  "duration": 258845,
  "error_message": "java.lang.NullPointerException\r\n\tat com.cucumber.selenium.Search.openWikipedia(Search.java:35)\r\n\tat ✽.Given open wikipedia(features/search_feature.feature:4)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "",
  "id": "search-wikipedia;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "enter search term \u0027mercury\u0027",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "do search",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "multiple results are shown for \u0027Mercury may refer to\u0027",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "mercury",
      "offset": 19
    }
  ],
  "location": "Search.searchFor(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Search.clickSearchButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Mercury may refer to",
      "offset": 32
    }
  ],
  "location": "Search.assertSingleResult(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "open wikipedia",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.openWikipedia()"
});
formatter.result({
  "duration": 222151,
  "error_message": "java.lang.NullPointerException\r\n\tat com.cucumber.selenium.Search.openWikipedia(Search.java:35)\r\n\tat ✽.Given open wikipedia(features/search_feature.feature:4)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 14,
  "name": "",
  "description": "",
  "id": "search-wikipedia;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "enter search term \u0027max\u0027",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "do search",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "multiple results are shown for \u0027Max may refer to\u0027",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "max",
      "offset": 19
    }
  ],
  "location": "Search.searchFor(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Search.clickSearchButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Max may refer to",
      "offset": 32
    }
  ],
  "location": "Search.assertSingleResult(String)"
});
formatter.result({
  "status": "skipped"
});
});
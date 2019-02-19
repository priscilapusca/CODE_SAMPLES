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
  "duration": 3969002098,
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
  "duration": 70820409,
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
  "duration": 5364457529,
  "status": "passed"
});
formatter.match({
  "location": "Login.checkFail()"
});
formatter.result({
  "duration": 744625493,
  "status": "passed"
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
  "duration": 3263809137,
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
  "duration": 77851307,
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
  "duration": 5394073884,
  "status": "passed"
});
formatter.match({
  "location": "Login.checkFail()"
});
formatter.result({
  "duration": 623005013,
  "status": "passed"
});
formatter.match({
  "location": "Login.checkRelogin()"
});
formatter.result({
  "duration": 10390186,
  "error_message": "org.openqa.selenium.NoSuchSessionException: Tried to run command without establishing a connection\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027WS-CJ-U3-4239\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 65.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:geckodriverVersion: 0.24.0, moz:headless: false, moz:processID: 10276, moz:profile: C:\\Users\\priscila.pusca\\App..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 3e3a1bb4-056a-41fd-b86d-1f1f8e2a8aa2\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getCurrentUrl(RemoteWebDriver.java:287)\r\n\tat com.cucumber.selenium.Login.checkRelogin(Login.java:54)\r\n\tat ✽.But relogin option should be available(features/login_feature.feature:15)\r\n",
  "status": "failed"
});
});
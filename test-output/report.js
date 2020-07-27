$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Feature/kayak.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Kayak Application",
  "description": "",
  "id": "kayak-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 23,
  "name": "check Reservation",
  "description": "",
  "id": "kayak-application;check-reservation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "launch browser and open site \"https://www.kayak.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "user clicks on flights",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "enter \u003corigin\u003e and \u003cdestination\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "enter \u003cdeptDate\u003e and \u003creturnDate\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "click on search",
  "keyword": "Then "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "kayak-application;check-reservation;",
  "rows": [
    {
      "cells": [
        "origin",
        "destination",
        "deptDate",
        "returnDate"
      ],
      "line": 32,
      "id": "kayak-application;check-reservation;;1"
    },
    {
      "cells": [
        "San Jose",
        "India",
        "/8/31",
        "9/25"
      ],
      "line": 33,
      "id": "kayak-application;check-reservation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 33,
  "name": "check Reservation",
  "description": "",
  "id": "kayak-application;check-reservation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 22,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "launch browser and open site \"https://www.kayak.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "user clicks on flights",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "enter San Jose and India",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "enter /8/31 and 9/25",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "click on search",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.kayak.com/",
      "offset": 30
    }
  ],
  "location": "stepsForPage.launch_browser_and_open_site(String)"
});
formatter.result({
  "duration": 4347309011,
  "status": "passed"
});
formatter.match({
  "location": "stepsForPage.user_clicks_on_flights()"
});
formatter.result({
  "duration": 1674876810,
  "status": "passed"
});
formatter.match({
  "location": "stepsForPage.enter_San_Jose_and_India()"
});
formatter.result({
  "duration": 14445665329,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 7
    },
    {
      "val": "31",
      "offset": 9
    },
    {
      "val": "9",
      "offset": 16
    },
    {
      "val": "25",
      "offset": 18
    }
  ],
  "location": "stepsForPage.enter_and(int,int,int,int)"
});
formatter.result({
  "duration": 12608717353,
  "status": "passed"
});
formatter.match({
  "location": "stepsForPage.click_on_search()"
});
formatter.result({
  "duration": 10552966466,
  "status": "passed"
});
});
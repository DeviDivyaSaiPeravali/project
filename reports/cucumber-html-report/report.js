$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Sauce/sauce.feature");
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
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 61,
  "name": "Navigating to Saucelabs",
  "description": "",
  "id": "title-of-your-feature;navigating-to-saucelabs",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 60,
      "name": "@TS_05"
    }
  ]
});
formatter.step({
  "line": 62,
  "name": "lAUNCHIng the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "lAUNCHIng the application",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "cLick on menu bar",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "click on About",
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "assert if the page is navigating to saucelabs",
  "keyword": "Then "
});
formatter.match({
  "location": "Saucenav.launching_the_browser()"
});
formatter.result({
  "duration": 38533365200,
  "status": "passed"
});
formatter.match({
  "location": "Saucenav.launching_the_application()"
});
formatter.result({
  "duration": 326877800,
  "status": "passed"
});
formatter.match({
  "location": "Saucenav.click_on_menu_bar()"
});
formatter.result({
  "duration": 1177259600,
  "status": "passed"
});
formatter.match({
  "location": "Saucenav.click_on_About()"
});
formatter.result({
  "duration": 10815780700,
  "status": "passed"
});
formatter.match({
  "location": "Saucenav.assert_if_the_page_is_navigating_to_saucelabs()"
});
formatter.result({
  "duration": 32612245600,
  "status": "passed"
});
});
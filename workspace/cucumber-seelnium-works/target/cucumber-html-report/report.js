$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("elarning.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "## this is my comment"
    },
    {
      "line": 2,
      "value": "#author : Naveen Kumar K S"
    }
  ],
  "line": 4,
  "name": "to login to the user",
  "description": "",
  "id": "to-login-to-the-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@login"
    }
  ]
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "the application is loaded",
  "keyword": "Given "
});
formatter.match({
  "location": "ElearningStep.the_application_is_loaded()"
});
formatter.result({
  "duration": 1675361332,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "validate for valid credentials",
  "description": "",
  "id": "to-login-to-the-user;validate-for-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "the user name and password is entered",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the user credentials are valid",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "take user to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "check the name of the user",
  "keyword": "And "
});
formatter.match({
  "location": "ElearningStep.the_user_name_and_password_is_entered()"
});
formatter.result({
  "duration": 3026103661,
  "status": "passed"
});
formatter.match({
  "location": "ElearningStep.the_user_credentials_are_valid()"
});
formatter.result({
  "duration": 1994846,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[hi]\u003e but was:\u003c[bye]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat com.ss.cucumber.step.ElearningStep.the_user_credentials_are_valid(ElearningStep.java:48)\n\tat ✽.When the user credentials are valid(elarning.feature:11)\n",
  "status": "failed"
});
formatter.match({
  "location": "ElearningStep.take_user_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElearningStep.check_the_name_of_the_user()"
});
formatter.result({
  "status": "skipped"
});
});
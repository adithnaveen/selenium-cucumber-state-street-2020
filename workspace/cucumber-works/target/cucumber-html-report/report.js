$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "login-feature;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the application is running",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the username and password is entered",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "mahesh",
        "hello12$34"
      ],
      "line": 8
    },
    {
      "cells": [
        "arun",
        "secret3344\u0026"
      ],
      "line": 9
    },
    {
      "cells": [
        "arpita",
        "8765testing$"
      ],
      "line": 10
    },
    {
      "cells": [
        "pooja",
        "testin5g$"
      ],
      "line": 11
    },
    {
      "cells": [
        "vivek",
        "hello123$"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "take user to home screen",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.the_application_is_running()"
});
formatter.result({
  "duration": 82430597,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_username_and_password_is_entered(DataTable)"
});
formatter.result({
  "duration": 3133022,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.take_user_to_home_screen()"
});
formatter.result({
  "duration": 50970,
  "status": "passed"
});
});
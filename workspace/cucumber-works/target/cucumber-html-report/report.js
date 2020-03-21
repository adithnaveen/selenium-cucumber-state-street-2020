$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WorkFromHome.feature");
formatter.feature({
  "line": 2,
  "name": "to work from home",
  "description": "",
  "id": "to-work-from-home",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    },
    {
      "line": 1,
      "name": "@workfromhome"
    }
  ]
});
formatter.before({
  "duration": 318241,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "work from home when office not working",
  "description": "",
  "id": "to-work-from-home;work-from-home-when-office-not-working",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the public transport is not available",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the office is not opened",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "work from home option is \"allowed\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the work is done",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "need to fill time sheet",
  "keyword": "But "
});
formatter.match({
  "location": "WorkFromHomeStep.the_public_transport_is_not_available()"
});
formatter.result({
  "duration": 68182785,
  "status": "passed"
});
formatter.match({
  "location": "WorkFromHomeStep.the_office_is_not_opened()"
});
formatter.result({
  "duration": 45499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "allowed",
      "offset": 26
    }
  ],
  "location": "WorkFromHomeStep.work_from_home_option_is_allowed(String)"
});
formatter.result({
  "duration": 1533238,
  "status": "passed"
});
formatter.match({
  "location": "WorkFromHomeStep.the_work_is_done()"
});
formatter.result({
  "duration": 54809,
  "status": "passed"
});
formatter.match({
  "location": "WorkFromHomeStep.need_to_fill_time_sheet()"
});
formatter.result({
  "duration": 35112,
  "status": "passed"
});
formatter.after({
  "duration": 51487,
  "status": "passed"
});
formatter.before({
  "duration": 57794,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "work from home when office not working and not allowed",
  "description": "",
  "id": "to-work-from-home;work-from-home-when-office-not-working-and-not-allowed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@wfh-notallowed"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "the public transport is not available",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "the office is not opened",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "work from home option is \"notallowed\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the work is done",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "need to fill time sheet",
  "keyword": "But "
});
formatter.step({
  "line": 18,
  "name": "need managers approval",
  "keyword": "And "
});
formatter.match({
  "location": "WorkFromHomeStep.the_public_transport_is_not_available()"
});
formatter.result({
  "duration": 41166,
  "status": "passed"
});
formatter.match({
  "location": "WorkFromHomeStep.the_office_is_not_opened()"
});
formatter.result({
  "duration": 45699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "notallowed",
      "offset": 26
    }
  ],
  "location": "WorkFromHomeStep.work_from_home_option_is_allowed(String)"
});
formatter.result({
  "duration": 54155,
  "status": "passed"
});
formatter.match({
  "location": "WorkFromHomeStep.the_work_is_done()"
});
formatter.result({
  "duration": 30171,
  "status": "passed"
});
formatter.match({
  "location": "WorkFromHomeStep.need_to_fill_time_sheet()"
});
formatter.result({
  "duration": 26201,
  "status": "passed"
});
formatter.match({
  "location": "WorkFromHomeStep.need_managers_approval()"
});
formatter.result({
  "duration": 30287,
  "status": "passed"
});
formatter.after({
  "duration": 60426,
  "status": "passed"
});
formatter.uri("loansanction.feature");
formatter.feature({
  "line": 3,
  "name": "loan sanction",
  "description": "",
  "id": "loan-sanction",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    },
    {
      "line": 1,
      "name": "@loansanction"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "sanctioning loan for startup",
  "description": "",
  "id": "loan-sanction;sanctioning-loan-for-startup",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "the company is registered in \"\u003cyear\u003e\" act",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "in india",
  "rows": [
    {
      "cells": [
        "state",
        "city"
      ],
      "line": 13
    },
    {
      "cells": [
        "karnataka",
        "bengaluru"
      ],
      "line": 14
    },
    {
      "cells": [
        "karnataka",
        "davanagere"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the company is formed with atleast \"\u003cnoofyears\u003e\" years",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "\"\u003cprocessingstatus\u003e\" to issuing authority",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "loan-sanction;sanctioning-loan-for-startup;",
  "rows": [
    {
      "cells": [
        "year",
        "noofyears",
        "processingstatus"
      ],
      "line": 20,
      "id": "loan-sanction;sanctioning-loan-for-startup;;1"
    },
    {
      "cells": [
        "2011",
        "3",
        "process"
      ],
      "line": 21,
      "id": "loan-sanction;sanctioning-loan-for-startup;;2"
    },
    {
      "cells": [
        "2011",
        "4",
        "process"
      ],
      "line": 22,
      "id": "loan-sanction;sanctioning-loan-for-startup;;3"
    },
    {
      "cells": [
        "2011",
        "5",
        "process"
      ],
      "line": 23,
      "id": "loan-sanction;sanctioning-loan-for-startup;;4"
    },
    {
      "cells": [
        "2011",
        "1",
        "nottoprocess"
      ],
      "line": 24,
      "id": "loan-sanction;sanctioning-loan-for-startup;;5"
    },
    {
      "cells": [
        "1956",
        "3",
        "process"
      ],
      "line": 25,
      "id": "loan-sanction;sanctioning-loan-for-startup;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 54038,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 5,
      "value": "# if you have the Background and this code will executed before"
    },
    {
      "line": 6,
      "value": "# each scenario in the .feature file"
    }
  ],
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "load the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoanSanctionStep.load_the_application()"
});
formatter.result({
  "duration": 119388,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "sanctioning loan for startup",
  "description": "",
  "id": "loan-sanction;sanctioning-loan-for-startup;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    },
    {
      "line": 1,
      "name": "@loansanction"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "the company is registered in \"2011\" act",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "in india",
  "rows": [
    {
      "cells": [
        "state",
        "city"
      ],
      "line": 13
    },
    {
      "cells": [
        "karnataka",
        "bengaluru"
      ],
      "line": 14
    },
    {
      "cells": [
        "karnataka",
        "davanagere"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the company is formed with atleast \"3\" years",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "\"process\" to issuing authority",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2011",
      "offset": 30
    }
  ],
  "location": "LoanSanctionStep.the_company_is_registered_in_act(String)"
});
formatter.result({
  "duration": 85768,
  "status": "passed"
});
formatter.match({
  "location": "LoanSanctionStep.in_india(DataTable)"
});
formatter.result({
  "duration": 1394964,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 36
    }
  ],
  "location": "LoanSanctionStep.the_company_is_formed_with_atleast_years(String)"
});
formatter.result({
  "duration": 115136,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "process",
      "offset": 1
    }
  ],
  "location": "LoanSanctionStep.to_issuing_authority(String)"
});
formatter.result({
  "duration": 83806,
  "status": "passed"
});
formatter.after({
  "duration": 108763,
  "status": "passed"
});
formatter.before({
  "duration": 66404,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 5,
      "value": "# if you have the Background and this code will executed before"
    },
    {
      "line": 6,
      "value": "# each scenario in the .feature file"
    }
  ],
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "load the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoanSanctionStep.load_the_application()"
});
formatter.result({
  "duration": 256364,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "sanctioning loan for startup",
  "description": "",
  "id": "loan-sanction;sanctioning-loan-for-startup;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    },
    {
      "line": 1,
      "name": "@loansanction"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "the company is registered in \"2011\" act",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "in india",
  "rows": [
    {
      "cells": [
        "state",
        "city"
      ],
      "line": 13
    },
    {
      "cells": [
        "karnataka",
        "bengaluru"
      ],
      "line": 14
    },
    {
      "cells": [
        "karnataka",
        "davanagere"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the company is formed with atleast \"4\" years",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "\"process\" to issuing authority",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2011",
      "offset": 30
    }
  ],
  "location": "LoanSanctionStep.the_company_is_registered_in_act(String)"
});
formatter.result({
  "duration": 83370,
  "status": "passed"
});
formatter.match({
  "location": "LoanSanctionStep.in_india(DataTable)"
});
formatter.result({
  "duration": 125151,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 36
    }
  ],
  "location": "LoanSanctionStep.the_company_is_formed_with_atleast_years(String)"
});
formatter.result({
  "duration": 55430,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "process",
      "offset": 1
    }
  ],
  "location": "LoanSanctionStep.to_issuing_authority(String)"
});
formatter.result({
  "duration": 87214,
  "status": "passed"
});
formatter.after({
  "duration": 57987,
  "status": "passed"
});
formatter.before({
  "duration": 50136,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 5,
      "value": "# if you have the Background and this code will executed before"
    },
    {
      "line": 6,
      "value": "# each scenario in the .feature file"
    }
  ],
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "load the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoanSanctionStep.load_the_application()"
});
formatter.result({
  "duration": 67401,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "sanctioning loan for startup",
  "description": "",
  "id": "loan-sanction;sanctioning-loan-for-startup;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    },
    {
      "line": 1,
      "name": "@loansanction"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "the company is registered in \"2011\" act",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "in india",
  "rows": [
    {
      "cells": [
        "state",
        "city"
      ],
      "line": 13
    },
    {
      "cells": [
        "karnataka",
        "bengaluru"
      ],
      "line": 14
    },
    {
      "cells": [
        "karnataka",
        "davanagere"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the company is formed with atleast \"5\" years",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "\"process\" to issuing authority",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2011",
      "offset": 30
    }
  ],
  "location": "LoanSanctionStep.the_company_is_registered_in_act(String)"
});
formatter.result({
  "duration": 79337,
  "status": "passed"
});
formatter.match({
  "location": "LoanSanctionStep.in_india(DataTable)"
});
formatter.result({
  "duration": 113088,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 36
    }
  ],
  "location": "LoanSanctionStep.the_company_is_formed_with_atleast_years(String)"
});
formatter.result({
  "duration": 96545,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "process",
      "offset": 1
    }
  ],
  "location": "LoanSanctionStep.to_issuing_authority(String)"
});
formatter.result({
  "duration": 78513,
  "status": "passed"
});
formatter.after({
  "duration": 48738,
  "status": "passed"
});
formatter.before({
  "duration": 58841,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 5,
      "value": "# if you have the Background and this code will executed before"
    },
    {
      "line": 6,
      "value": "# each scenario in the .feature file"
    }
  ],
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "load the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoanSanctionStep.load_the_application()"
});
formatter.result({
  "duration": 50624,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "sanctioning loan for startup",
  "description": "",
  "id": "loan-sanction;sanctioning-loan-for-startup;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    },
    {
      "line": 1,
      "name": "@loansanction"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "the company is registered in \"2011\" act",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "in india",
  "rows": [
    {
      "cells": [
        "state",
        "city"
      ],
      "line": 13
    },
    {
      "cells": [
        "karnataka",
        "bengaluru"
      ],
      "line": 14
    },
    {
      "cells": [
        "karnataka",
        "davanagere"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the company is formed with atleast \"1\" years",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "\"nottoprocess\" to issuing authority",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2011",
      "offset": 30
    }
  ],
  "location": "LoanSanctionStep.the_company_is_registered_in_act(String)"
});
formatter.result({
  "duration": 59288,
  "status": "passed"
});
formatter.match({
  "location": "LoanSanctionStep.in_india(DataTable)"
});
formatter.result({
  "duration": 150968,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 36
    }
  ],
  "location": "LoanSanctionStep.the_company_is_formed_with_atleast_years(String)"
});
formatter.result({
  "duration": 71116,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nottoprocess",
      "offset": 1
    }
  ],
  "location": "LoanSanctionStep.to_issuing_authority(String)"
});
formatter.result({
  "duration": 61632,
  "status": "passed"
});
formatter.after({
  "duration": 47948,
  "status": "passed"
});
formatter.before({
  "duration": 75518,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 5,
      "value": "# if you have the Background and this code will executed before"
    },
    {
      "line": 6,
      "value": "# each scenario in the .feature file"
    }
  ],
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "load the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoanSanctionStep.load_the_application()"
});
formatter.result({
  "duration": 70323,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "sanctioning loan for startup",
  "description": "",
  "id": "loan-sanction;sanctioning-loan-for-startup;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    },
    {
      "line": 1,
      "name": "@loansanction"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "the company is registered in \"1956\" act",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "in india",
  "rows": [
    {
      "cells": [
        "state",
        "city"
      ],
      "line": 13
    },
    {
      "cells": [
        "karnataka",
        "bengaluru"
      ],
      "line": 14
    },
    {
      "cells": [
        "karnataka",
        "davanagere"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the company is formed with atleast \"3\" years",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "\"process\" to issuing authority",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1956",
      "offset": 30
    }
  ],
  "location": "LoanSanctionStep.the_company_is_registered_in_act(String)"
});
formatter.result({
  "duration": 76688,
  "status": "passed"
});
formatter.match({
  "location": "LoanSanctionStep.in_india(DataTable)"
});
formatter.result({
  "duration": 97166,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 36
    }
  ],
  "location": "LoanSanctionStep.the_company_is_formed_with_atleast_years(String)"
});
formatter.result({
  "duration": 59607,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "process",
      "offset": 1
    }
  ],
  "location": "LoanSanctionStep.to_issuing_authority(String)"
});
formatter.result({
  "duration": 77017,
  "status": "passed"
});
formatter.after({
  "duration": 44263,
  "status": "passed"
});
});
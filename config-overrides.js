const paths = require("react-scripts/config/paths");
const path = require("path");

paths.appSrc = path.resolve(__dirname, "src/main/js");
paths.appIndexJs = path.resolve(__dirname, "src/main/js/index.js");
paths.appPublic = path.resolve(__dirname, "src/main/static");
paths.appHtml = path.resolve(__dirname, "src/main/static/index.html");
paths.appBuild = path.resolve(__dirname, "target/classes/public");
paths.testsSetup = path.resolve(__dirname, "src/test/js/setupTests.js");

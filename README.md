## Status Example

*NOTE:* Typically, you would want to ensure that users verify their email address if you have that workflow enabled.

This is an example of changing `Account` status from `AccountStatus.UNVERIFIED` to `AccountStatus.ENABLED`.

### Run

```
mvn clean package

STORMPATH_API_KEY_FILE=<full path to api key file> \
mvn exec:java -Dexec.mainClass="quickstart.Quickstart"
```
#Stormpath is Joining Okta
We are incredibly excited to announce that [Stormpath is joining forces with Okta](https://stormpath.com/blog/stormpaths-new-path?utm_source=github&utm_medium=readme&utm-campaign=okta-announcement). Please visit [the Migration FAQs](https://stormpath.com/oktaplusstormpath?utm_source=github&utm_medium=readme&utm-campaign=okta-announcement) for a detailed look at what this means for Stormpath users.

We're available to answer all questions at [support@stormpath.com](mailto:support@stormpath.com).


## Status Example

*NOTE:* Typically, you would want to ensure that users verify their email address if you have that workflow enabled.

This is an example of changing `Account` status from `AccountStatus.UNVERIFIED` to `AccountStatus.ENABLED`.

### Run

```
mvn clean package

STORMPATH_API_KEY_FILE=<full path to api key file> \
mvn exec:java -Dexec.mainClass="quickstart.Quickstart"
```
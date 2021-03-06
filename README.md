# Credit Card Number

*Credit Card Number* is a Java library that can provide details of a bank issued 
credit card number. 


## Resources

> **The goal of this project is to use publicly and freely available documentation 
to create a reliable Java library to provide information about credit card numbers.**

Some resources consulted are:
* [Bank card number](http://en.wikipedia.org/wiki/Bank_card_number)
* [How do you detect Credit card type based on number?](http://stackoverflow.com/questions/72768/how-do-you-detect-credit-card-type-based-on-number)  
* [Finding or Verifying Credit Card Numbers](http://www.regular-expressions.info/creditcard.html)
* [Major Industry Identifier](https://en.wikipedia.org/wiki/Bank_card_number#Major_Industry_Identifier_.28MII.29)
* [Luhn Algorithm](http://en.wikipedia.org/wiki/Luhn_algorithm)
* [Where can I find test credit card numbers?](https://www.paypal.com/us/smarthelp/article/where-can-i-find-test-credit-card-numbers-ts2157)
* [Expansion to 2-series Bank Identification Numbers (BINs)](https://www.mastercard.us/en-us/issuers/get-support/2-series-bin-expansion.html)
* [Java Cryptography Architecture (JCA) Reference Guide](http://docs.oracle.com/javase/6/docs/technotes/guides/security/crypto/CryptoSpec.html#PBEEx) 


## Design Principles

- All classes are immutable and thread-safe
- Secure data follows standards in the 
[Java Cryptography Architecture (JCA) Reference Guide](https://docs.oracle.com/javase/8/docs/technotes/guides/security/crypto/CryptoSpec.html#PBEEx)
- The standard `toString()` function formats data in a readable form
- Internationalization of card numbers is supported
- Validity is enforced by JUnit 5 tests
- Java 8 or newer is required



## Download and Use in Projects

You can [download the jar on the Maven Central Repository](https://search.maven.org/artifact/us.fatehi/credit_card_number). 
The [download page](https://search.maven.org/artifact/us.fatehi/credit_card_number) 
has instructions on how to use the library in your Maven or Gradle build.


## Examples

### How to Get Bank Card Information

To get bank card information, use code like:
```java
AccountNumber pan = new AccountNumber("5266-0922-0141-6174");
ExpirationDate expiration = new ExpirationDate(2015, 4);
Name name = new Name("Sualeh", "Fatehi");
BankCard card = new BankCard(pan, expiration, name);
System.out.println(card);
```
and you will get this output:
```
Bank Card Information: 
  Raw Account Number: 5266-0922-0141-6174
  Primary Account Number: 5266092201416174
    Major Industry Identifier: 5 - Banking and financial
    Issuer Identification Number: 526609
    Card Brand: MasterCard
    Last Four Digits: 6174
    Passes Luhn Check? Yes
    Is Primary Account Number Valid? Yes
  Expiration Date: 1504
    Is Expired? No
  Name: Sualeh Fatehi
```

### How to Secure the Credit Card Number

If you need the account number information, but want to be secure by not 
storing the actual primary account number in memory, you can use code like:
```java
AccountNumber pan = new AccountNumber("5266-0922-0141-6174");
pan.dispose();
System.out.println(pan);
```
and you will get this output:
```
MasterCard-6174
```

### Internationalization is Supported

You can use code like:
```java
AccountNumber pan = new AccountNumber("५२६६ ०९२२ ०१४१ ६१७४");
System.out.println(pan);
```
and you will get this output:
```
5266092201416174
```

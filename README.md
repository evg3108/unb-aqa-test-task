# unb-aqa-test-task

The project is an implementation of a tech test task for the following scenario:

1. Open https://www.unbiased.co.uk/
2. Click Financial adviser
3. Click Browse adviser directory
4. Select filters:
   I'm looking for: Financial adviser
   I need advice on: Financial planning
   Income / Asset value: £501,000+
   Find adviser near postcode / city: SE207AA
5. Click Find advisers
6. Result: check the number of found advisers = 20 and among them there is an advisor named "The Private Office"

**NOTE:**

In step 1 a test url was used to not mess with statistics collected on the production environment

Step 4 and 6 were slightly changed due to changes in the app UI:
- Step 4: "I'm looking for" filter was removed from UI, so it wasn't used in the test
- Step 6: as number of results per page was changed from 20 to 10, so pagination was used. Also included collecting search results from all pages and used different advisor name instead of "The Private Office" due to using different environment

**Tech stack:** Java + Selenide + Maven + JUnit
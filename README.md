# p

generated using Luminus version "2.9.10.74"

## Protecting API URLs seems not to be working

I changed the code so that */api/plus* is public but */private/minus* is not.

### How to test

To start a web server for the application, run:

    lein run

then this work (it does):

    curl http://localhost:3000/api/plus?x=3&y=4

this should fail with unauthorized (it does not):

     curl http://localhost:3000/private/minus?x=1&y=2
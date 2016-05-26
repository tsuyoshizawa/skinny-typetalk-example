# Skinny Framework with Typetalk authentication

This is a demo application to show you how to integrate [Skinny Framework](http://skinny-framework.org/) with [Typetalk](https://typetalk.in) OAuth 2.0 (Authorization Code Flow).

## Create your Typetalk account

https://typetalk.in/

## Setup a Typetalk OAuth 2.0 application

https://typetalk.in/my/develop/applications/register

<img width="1244" alt="screen shot 2016-05-26 at 23 28 26" src="https://cloud.githubusercontent.com/assets/19658/15578223/99cbdf60-239a-11e6-83ff-33eead03ec33.png">

<img width="1026" alt="screen shot 2016-05-26 at 23 29 29" src="https://cloud.githubusercontent.com/assets/19658/15578225/99ed72ba-239a-11e6-9b5f-bcd93f648211.png">

## Run the app

```

$ export SKINNY_OAUTH2_CLIENT_ID_TYPETALK=lp7dYQPRSoDgUwPH4tGcAPk5EFxL****
$ export SKINNY_OAUTH2_CLIENT_SECRET_TYPETALK=3RZ3qZPa74eKyiLuxbQQHqxW75RdJNb4jIY5AW22VGlgYzkkhUJ6iVmkalsL****

$ ./skinny run

2016-05-26 23:29:07.661:INFO:oejs.Server:pool-11-thread-1: jetty-9.2.17.v20160517
2016-05-26 23:29:08.152:INFO:oejw.StandardDescriptorProcessor:pool-11-thread-1: NO JSP Support for /, did not find org.eclipse.jetty.jsp.JettyJspServlet
2016-05-26 23:29:08.394  INFO   --- [ool-11-thread-1] skinny.micro.SkinnyListener              : The cycle class name from the config: Bootstrap
2016-05-26 23:29:08.501 DEBUG   --- [ool-11-thread-1] skinny.micro.SkinnyListener              : Loaded lifecycle class: class Bootstrap
2016-05-26 23:29:08.548  INFO   --- [ool-11-thread-1] skinny.micro.SkinnyListener              : Initializing life cycle class: Bootstrap
2016-05-26 23:29:08.928 DEBUG   --- [ool-11-thread-1] scalikejdbc.ConnectionPool$              : Registered connection pool : ConnectionPool(url:jdbc:h2:file:./db/development;MODE=PostgreSQL;AUTO_SERVER=TRUE, user:sa) using factory : <default>
2016-05-26 23:29:09.445:INFO:oejsh.ContextHandler:pool-11-thread-1: Started o.e.j.w.WebAppContext@d7f2be0{/,[file:/home/github/oss/skinny-typetalk-example/src/main/webapp/],AVAILABLE}
2016-05-26 23:29:09.468:INFO:oejs.ServerConnector:pool-11-thread-1: Started ServerConnector@13fd10fa{HTTP/1.1}{0.0.0.0:8080}
2016-05-26 23:29:09.468:INFO:oejs.Server:pool-11-thread-1: Started @8901ms
[success] Total time: 2 s, completed May 26, 2016 11:29:09 PM
1. Waiting for source changes... (press enter to interrupt)
2016-05-26 23:29:17.610 DEBUG   --- [qtp397471564-61] controller.Controllers$session$          : OAuth2 state parameter verification -> actual: Some(f627c445fbf3b0a15fa5dfe38e2d****), expected: f627c445fbf3b0a15fa5dfe38e2d****
2016-05-26 23:29:17.618 DEBUG   --- [qtp397471564-61] controller.Controllers$session$          : OAuth2 authorization code: xDyGEK5FU7kr7EGGhnJBbTiugtwBau33PULq41WY1XCw7TdSHZNOm3vPsiJk****
2016-05-26 23:29:19.224 DEBUG   --- [qtp397471564-61] controller.Controllers$session$          : OAuth2 access token: {
    "accessToken" : "jrrZs6zaJ3sICBC00u7Gg3qtriffZtLsSJ9nuD68QSncFvq7QwmhGIzpRZGP****",
      "expiresIn" : 3599,
        "refreshToken" : "PhQVlJvhZIJr1SNqamjVgYlTgqbVUJdY8rFzacYGsUkTWdF0WY6agmFWf5qa****",
          "scope" : "my"
}
2016-05-26 23:29:19.407 DEBUG   --- [qtp397471564-61] s.oauth2.client.typetalk.TypetalkAPI$    : Typetalk authorized user: {"account":{"id":1534,"name":"seratch","fullName":"seratch","suggestion":"seratch","imageUrl":"https://typetalk.in/accounts/1534/profile_image.png?t=1412923634617","isBot":false,"createdAt":"2014-02-04T05:57:12Z","updatedAt":"2016-05-26T14:23:39Z"}}
2016-05-26 23:29:22.688 DEBUG   --- [qtp397471564-62] skinny.I18n                              : i18n messages loaded for null

````

Access localhost:8080 from your browser.

```
open http://localhost:8080/
```

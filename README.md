Play-Smapi
==========

Implementation of the [SMAPI][smapi] with [Playframework][play], based on [play-guice-cxf][].

[smapi]: https://musicpartners.sonos.com/?q=node/71
[play]: https://www.playframework.com/
[play-guice-cxf]: https://github.com/margussipria/play-guice-cxf

## Generate Java source from Wsdl

> sbt
> wsdl2Java

## Run

> sbt
> run

You can test the service on your localhost http://localhost:9000/service/smapi, you can use [SoapUI][soap-ui].
The wsdl is available at http://localhost:9000/service/smapi?wsdl

[soap-ui]: https://www.soapui.org/downloads/latest-release.html

# Adding your service to a Sonos system

To add the Acme service provided by your running Content API server to an existing Sonos system, you can use the customSD mechanism as described on Sonos Labs article ["Add your service with customSD"](http://musicpartners.sonos.com/?q=node/134).

- Endpoint and Secure Endpoint URLs should be `http://<YOUR_SERVER_IP>:9000/service/smapi`
- Authentication SOAP header policy should be "Device Link".
- String table Uri should be `http://<YOUR_SERVER_IP>:9000/assets/strings.xml`
- Presentation Map Uri should be `http://<YOUR_SERVER_IP>:9000/assets/presentationmap.xml`
- Container Type should be "Music Service".
- The "Search" and "Extended Metadata" Capabilities checkboxes should be checked.

After configuring the custom service, you should see it listed, with the name you entered on the customsd.htm form, in "Add music service" in the Sonos controller. Select it and follow the Device Link authorization flow. The Content API Sample Server is not intended as a demonstration of user account management practices, so it only recognizes a single, hardcoded account, with username `acmeUser` and password `password`.


## Todo

Implement the `SmapiServiceImpl`, see this [example][content-sonos-app],
and see https://github.com/robertdj20/YouTubeSonos

[content-sonos-app]: https://musicpartners.sonos.com/?q=node/509
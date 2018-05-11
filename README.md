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

## Todo

Implement the `SmapiServiceImpl`, see this [example][content-sonon-app],
and see https://github.com/robertdj20/YouTubeSonos

[content-sonos-app]: https://musicpartners.sonos.com/?q=node/509
package services.com.sonos.smapi

import javax.jws.WebService
import javax.xml.datatype.XMLGregorianCalendar
import javax.xml.ws.Holder

@WebService(endpointInterface = "services.com.sonos.smapi.SonosSoap")
class SmapiServiceImpl extends SonosSoap {

  override def search(parameters: Search, credentials: Credentials, context: Context): SearchResponse = ???

  override def getMediaMetadata(parameters: GetMediaMetadata, credentials: Credentials, context: Context): GetMediaMetadataResponse = ???

  override def addToContainer(id: String, parentId: String, index: Int, updateId: String, credentials: Credentials, context: Context): AddToContainerResult = ???

  override def reportPlayStatus(id: String, status: String, contextId: String, offsetMillis: Integer, credentials: Credentials, context: Context): Unit = ???

  override def getContentKey(id: String, uri: String, deviceSessionToken: String, credentials: Credentials, context: Context): ContentKey = ???

  override def setPlayedSeconds(id: String, seconds: Int, contextId: String, privateData: String, offsetMillis: Integer, credentials: Credentials, context: Context): Unit = ???

  override def createContainer(containerType: String, title: String, parentId: String, seedId: String, credentials: Credentials, context: Context): CreateContainerResult = ???

  override def reorderContainer(id: String, from: String, to: Int, updateId: String, credentials: Credentials, context: Context): ReorderContainerResult = ???

  override def reportAccountAction(`type`: String, credentials: Credentials, context: Context): Unit = ???

  override def reportPlaySeconds(id: String, seconds: Int, contextId: String, privateData: String, offsetMillis: Integer, credentials: Credentials, context: Context): ReportPlaySecondsResult = ???

  override def getDeviceLinkCode(householdId: String, credentials: Credentials, context: Context): DeviceLinkCodeResult = ???

  override def getAppLink(householdId: String, hardware: String, osVersion: String, sonosAppName: String, callbackPath: String, credentials: Credentials, context: Context): AppLinkResult = ???

  override def rateItem(parameters: RateItem, credentials: Credentials, context: Context): RateItemResponse = ???

  override def deleteItem(favorite: String, credentials: Credentials, context: Context): Unit = ???

  override def getMediaURI(id: String, action: MediaUriAction, secondsSinceExplicit: Integer, deviceSessionToken: Holder[String], credentials: Credentials, context: Context, getMediaURIResult: Holder[String], deviceSessionKey: Holder[EncryptionContext], contentKey: Holder[EncryptionContext], httpHeaders: Holder[HttpHeaders], uriTimeout: Holder[Integer], positionInformation: Holder[PositionInformation], privateDataFieldName: Holder[String]): Unit = ???

  override def deleteContainer(id: String, credentials: Credentials, context: Context): DeleteContainerResult = ???

  override def createItem(favorite: String, credentials: Credentials, context: Context): String = ???

  override def getSessionId(parameters: GetSessionId, credentials: Credentials, context: Context): GetSessionIdResponse = ???

  override def getLastUpdate(credentials: Credentials, context: Context): LastUpdate = ???

  override def renameContainer(id: String, title: String, credentials: Credentials, context: Context): RenameContainerResult = ???

  override def getStreamingMetadata(id: String, startTime: XMLGregorianCalendar, duration: Int, credentials: Credentials, context: Context): SegmentMetadataList = ???

  override def getExtendedMetadataText(parameters: GetExtendedMetadataText, credentials: Credentials, context: Context): GetExtendedMetadataTextResponse = ???

  override def getMetadata(parameters: GetMetadata, credentials: Credentials, context: Context): GetMetadataResponse = {
    println(s"---- getMetadata $parameters, credentials $credentials, context $context")
    new GetMetadataResponse()
  }

  override def removeFromContainer(id: String, indices: String, updateId: String, credentials: Credentials, context: Context): RemoveFromContainerResult = ???

  override def getExtendedMetadata(parameters: GetExtendedMetadata, credentials: Credentials, context: Context): GetExtendedMetadataResponse = ???

  override def reportStatus(id: String, errorCode: Int, message: String, credentials: Credentials, context: Context): Unit = ???

  override def getDeviceAuthToken(householdId: String, linkCode: String, linkDeviceId: String, credentials: Credentials, context: Context): DeviceAuthTokenResult = ???

  override def getScrollIndices(id: String, credentials: Credentials, context: Context): String = ???
}

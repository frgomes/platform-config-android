package sri


import sri.universal.SriPlatForm

package object platform {
  
  implicit object SriPlatForm extends SriPlatForm {

  @inline def isIOS: Boolean = false
  @inline def isAndroid: Boolean = true
  @inline def isWeb: Boolean = false
}


}

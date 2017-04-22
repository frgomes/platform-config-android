package sri

import sri.universal.SriPlatform

package object platform {

  implicit object SriPlatform extends SriPlatform {

    @inline def isIOS: Boolean = false
    @inline def isAndroid: Boolean = true
    @inline def isWeb: Boolean = false
  }

}


/// interface com.apple.eawt.ScreenSleepListener ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class ScreenSleepListenerProxy implements com.apple.eawt.ScreenSleepListener {

    long __swiftObject;

    ScreenSleepListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.ScreenSleepListener.screenAwoke(com.apple.eawt.AppEvent$ScreenSleepEvent)

    public native void __screenAwoke( long __swiftObject, com.apple.eawt.AppEvent.ScreenSleepEvent arg0 );

    public void screenAwoke( com.apple.eawt.AppEvent.ScreenSleepEvent arg0 ) {
        __screenAwoke( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.ScreenSleepListener.screenAboutToSleep(com.apple.eawt.AppEvent$ScreenSleepEvent)

    public native void __screenAboutToSleep( long __swiftObject, com.apple.eawt.AppEvent.ScreenSleepEvent arg0 );

    public void screenAboutToSleep( com.apple.eawt.AppEvent.ScreenSleepEvent arg0 ) {
        __screenAboutToSleep( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
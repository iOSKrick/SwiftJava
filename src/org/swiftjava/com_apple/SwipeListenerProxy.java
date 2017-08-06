
/// interface com.apple.eawt.event.SwipeListener ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class SwipeListenerProxy implements com.apple.eawt.event.SwipeListener {

    long __swiftObject;

    SwipeListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.event.SwipeListener.swipedDown(com.apple.eawt.event.SwipeEvent)

    public native void __swipedDown( long __swiftObject, com.apple.eawt.event.SwipeEvent arg0 );

    public void swipedDown( com.apple.eawt.event.SwipeEvent arg0 ) {
        __swipedDown( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.event.SwipeListener.swipedLeft(com.apple.eawt.event.SwipeEvent)

    public native void __swipedLeft( long __swiftObject, com.apple.eawt.event.SwipeEvent arg0 );

    public void swipedLeft( com.apple.eawt.event.SwipeEvent arg0 ) {
        __swipedLeft( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.event.SwipeListener.swipedRight(com.apple.eawt.event.SwipeEvent)

    public native void __swipedRight( long __swiftObject, com.apple.eawt.event.SwipeEvent arg0 );

    public void swipedRight( com.apple.eawt.event.SwipeEvent arg0 ) {
        __swipedRight( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.event.SwipeListener.swipedUp(com.apple.eawt.event.SwipeEvent)

    public native void __swipedUp( long __swiftObject, com.apple.eawt.event.SwipeEvent arg0 );

    public void swipedUp( com.apple.eawt.event.SwipeEvent arg0 ) {
        __swipedUp( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
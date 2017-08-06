
/// interface java.awt.event.KeyListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class KeyListenerProxy implements java.awt.event.KeyListener {

    long __swiftObject;

    KeyListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.KeyListener.keyTyped(java.awt.event.KeyEvent)

    public native void __keyTyped( long __swiftObject, java.awt.event.KeyEvent e );

    public void keyTyped( java.awt.event.KeyEvent e ) {
        __keyTyped( __swiftObject, e );
    }

    /// public abstract void java.awt.event.KeyListener.keyPressed(java.awt.event.KeyEvent)

    public native void __keyPressed( long __swiftObject, java.awt.event.KeyEvent e );

    public void keyPressed( java.awt.event.KeyEvent e ) {
        __keyPressed( __swiftObject, e );
    }

    /// public abstract void java.awt.event.KeyListener.keyReleased(java.awt.event.KeyEvent)

    public native void __keyReleased( long __swiftObject, java.awt.event.KeyEvent e );

    public void keyReleased( java.awt.event.KeyEvent e ) {
        __keyReleased( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
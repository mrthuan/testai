package androidx.window.layout;

import android.app.Activity;

/* compiled from: ExtensionInterfaceCompat.kt */
/* loaded from: classes.dex */
public interface ExtensionInterfaceCompat {

    /* compiled from: ExtensionInterfaceCompat.kt */
    /* loaded from: classes.dex */
    public interface ExtensionCallbackInterface {
        void onWindowLayoutChanged(Activity activity, WindowLayoutInfo windowLayoutInfo);
    }

    void onWindowLayoutChangeListenerAdded(Activity activity);

    void onWindowLayoutChangeListenerRemoved(Activity activity);

    void setExtensionCallback(ExtensionCallbackInterface extensionCallbackInterface);

    boolean validateExtensionInterface();
}

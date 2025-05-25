package u;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: CustomTabsCallback.java */
/* loaded from: classes.dex */
public class b {
    public static final int NAVIGATION_ABORTED = 4;
    public static final int NAVIGATION_FAILED = 3;
    public static final int NAVIGATION_FINISHED = 2;
    public static final int NAVIGATION_STARTED = 1;
    public static final String ONLINE_EXTRAS_KEY = "online";
    public static final int TAB_HIDDEN = 6;
    public static final int TAB_SHOWN = 5;

    public Bundle extraCallbackWithResult(String str, Bundle bundle) {
        return null;
    }

    public void onMessageChannelReady(Bundle bundle) {
    }

    public void extraCallback(String str, Bundle bundle) {
    }

    public void onNavigationEvent(int i10, Bundle bundle) {
    }

    public void onPostMessage(String str, Bundle bundle) {
    }

    public void onActivityResized(int i10, int i11, Bundle bundle) {
    }

    public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
    }
}

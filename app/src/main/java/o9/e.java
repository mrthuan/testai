package o9;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class e extends p9.m {
    public e(Context context) {
        super(new p9.n("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }
}

package androidx.emoji2.text;

import android.app.Notification;
import android.media.MediaCodec;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.browser.trusted.TrustedWebActivityService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r {
    public static /* bridge */ /* synthetic */ Notification.Builder d(TrustedWebActivityService trustedWebActivityService, Notification notification) {
        return Notification.Builder.recoverBuilder(trustedWebActivityService, notification);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern e() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction g() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
    }
}

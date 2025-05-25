package bb;

import android.app.NotificationChannel;
import android.view.accessibility.AccessibilityNodeInfo;
import java.nio.file.attribute.DosFileAttributeView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g {
    public static /* synthetic */ NotificationChannel c(String str, String str2, int i10) {
        return new NotificationChannel(str, str2, i10);
    }

    public static /* bridge */ /* synthetic */ DosFileAttributeView g(Object obj) {
        return (DosFileAttributeView) obj;
    }

    public static /* synthetic */ void l() {
    }

    public static /* bridge */ /* synthetic */ void q(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setHintText(charSequence);
    }
}

package bb;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import java.nio.file.attribute.DosFileAttributeView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l {
    public static /* synthetic */ Notification.Builder c(Context context) {
        return new Notification.Builder(context, "playcore-assetpacks-service-notification-channel");
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return DosFileAttributeView.class;
    }

    public static /* synthetic */ void k() {
    }

    public static /* bridge */ /* synthetic */ boolean u(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}

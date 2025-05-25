package jb;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CommonNotificationBuilder.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f19123a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    @TargetApi(26)
    public static boolean a(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!bb.l.u(resources.getDrawable(i10, null))) {
                return true;
            }
            return false;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}

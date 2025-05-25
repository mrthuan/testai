package c6;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import java.util.Arrays;

/* compiled from: AppEventUtility.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f5607a = 0;

    static {
        new f();
    }

    public static final String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(bArr[i10])}, 1));
            kotlin.jvm.internal.g.d(format, "format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.g.d(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    public static final View b(Activity activity) {
        if (k6.a.b(f.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            k6.a.a(f.class, th2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (kotlin.text.j.M(r0, "generic", false) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            kotlin.jvm.internal.g.d(r0, r1)
            java.lang.String r2 = "generic"
            r3 = 0
            boolean r4 = kotlin.text.j.M(r0, r2, r3)
            if (r4 != 0) goto L71
            kotlin.jvm.internal.g.d(r0, r1)
            java.lang.String r1 = "unknown"
            boolean r0 = kotlin.text.j.M(r0, r1, r3)
            if (r0 != 0) goto L71
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.g.d(r0, r1)
            java.lang.String r4 = "google_sdk"
            boolean r5 = kotlin.text.k.O(r0, r4, r3)
            if (r5 != 0) goto L71
            kotlin.jvm.internal.g.d(r0, r1)
            java.lang.String r5 = "Emulator"
            boolean r5 = kotlin.text.k.O(r0, r5, r3)
            if (r5 != 0) goto L71
            kotlin.jvm.internal.g.d(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = kotlin.text.k.O(r0, r1, r3)
            if (r0 != 0) goto L71
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.g.d(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = kotlin.text.k.O(r0, r1, r3)
            if (r0 != 0) goto L71
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            kotlin.jvm.internal.g.d(r0, r1)
            boolean r0 = kotlin.text.j.M(r0, r2, r3)
            if (r0 == 0) goto L69
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "DEVICE"
            kotlin.jvm.internal.g.d(r0, r1)
            boolean r0 = kotlin.text.j.M(r0, r2, r3)
            if (r0 != 0) goto L71
        L69:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = kotlin.jvm.internal.g.a(r4, r0)
            if (r0 == 0) goto L72
        L71:
            r3 = 1
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.f.c():boolean");
    }
}

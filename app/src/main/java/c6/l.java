package c6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.appevents.AppEventsLogger$FlushBehavior;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.l;
import com.facebook.n;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: SessionLogger.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f5625a = new l();

    /* renamed from: b  reason: collision with root package name */
    public static final String f5626b = l.class.getCanonicalName();
    public static final long[] c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    public static final void b(String str, String str2, Context context) {
        if (k6.a.b(l.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            bundle.putString("fb_mobile_pckg_fp", f5625a.a(context));
            bundle.putString("fb_mobile_app_cert_hash", n6.a.a(context));
            com.facebook.appevents.l lVar = new com.facebook.appevents.l(str, str2);
            com.facebook.d dVar = com.facebook.d.f9685a;
            if (n.c()) {
                lVar.d(bundle, "fb_mobile_activate_app");
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = com.facebook.appevents.l.c;
            if (l.a.c() != AppEventsLogger$FlushBehavior.EXPLICIT_ONLY && !k6.a.b(lVar)) {
                com.facebook.appevents.i.c(FlushReason.EXPLICIT);
            }
        } catch (Throwable th2) {
            k6.a.a(l.class, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0067 A[Catch: all -> 0x0109, TRY_LEAVE, TryCatch #2 {all -> 0x0109, blocks: (B:7:0x000e, B:9:0x0014, B:11:0x001a, B:20:0x0035, B:28:0x004f, B:30:0x0053, B:33:0x0058, B:37:0x0067, B:45:0x0081, B:59:0x00b2, B:61:0x00cc, B:64:0x00d4, B:66:0x00df, B:68:0x00e6, B:70:0x0103, B:12:0x001f, B:14:0x0023, B:23:0x003f, B:40:0x0071, B:50:0x009f, B:52:0x00a4), top: B:75:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df A[Catch: all -> 0x0109, TryCatch #2 {all -> 0x0109, blocks: (B:7:0x000e, B:9:0x0014, B:11:0x001a, B:20:0x0035, B:28:0x004f, B:30:0x0053, B:33:0x0058, B:37:0x0067, B:45:0x0081, B:59:0x00b2, B:61:0x00cc, B:64:0x00d4, B:66:0x00df, B:68:0x00e6, B:70:0x0103, B:12:0x001f, B:14:0x0023, B:23:0x003f, B:40:0x0071, B:50:0x009f, B:52:0x00a4), top: B:75:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0103 A[Catch: all -> 0x0109, TRY_LEAVE, TryCatch #2 {all -> 0x0109, blocks: (B:7:0x000e, B:9:0x0014, B:11:0x001a, B:20:0x0035, B:28:0x004f, B:30:0x0053, B:33:0x0058, B:37:0x0067, B:45:0x0081, B:59:0x00b2, B:61:0x00cc, B:64:0x00d4, B:66:0x00df, B:68:0x00e6, B:70:0x0103, B:12:0x001f, B:14:0x0023, B:23:0x003f, B:40:0x0071, B:50:0x009f, B:52:0x00a4), top: B:75:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(java.lang.String r18, c6.k r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.l.c(java.lang.String, c6.k, java.lang.String):void");
    }

    public final String a(Context context) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(str, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String b10 = j.b(context);
            if (b10 == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                kotlin.jvm.internal.g.d(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                b10 = j.a(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(str, b10).apply();
            return b10;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }
}

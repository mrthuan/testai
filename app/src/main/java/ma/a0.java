package ma;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: DataCollectionArbiter.java */
/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f21871a;

    /* renamed from: b  reason: collision with root package name */
    public final z9.e f21872b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public TaskCompletionSource<Void> f21873d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21874e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21875f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f21876g;

    /* renamed from: h  reason: collision with root package name */
    public final TaskCompletionSource<Void> f21877h;

    public a0(z9.e eVar) {
        Boolean bool;
        Object obj = new Object();
        this.c = obj;
        this.f21873d = new TaskCompletionSource<>();
        this.f21874e = false;
        this.f21875f = false;
        this.f21877h = new TaskCompletionSource<>();
        eVar.a();
        Context context = eVar.f32308a;
        this.f21872b = eVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f21871a = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f21875f = false;
            bool = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            bool = null;
        }
        this.f21876g = bool == null ? a(context) : bool;
        synchronized (obj) {
            if (b()) {
                this.f21873d.d(null);
                this.f21874e = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "firebase_crashlytics_collection_enabled"
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r2 == 0) goto L2a
            java.lang.String r5 = r5.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r5 = r2.getApplicationInfo(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r5 == 0) goto L2a
            android.os.Bundle r2 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r2 == 0) goto L2a
            boolean r2 = r2.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r2 == 0) goto L2a
            android.os.Bundle r5 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            boolean r5 = r5.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            goto L2b
        L2a:
            r5 = r1
        L2b:
            if (r5 != 0) goto L31
            r5 = 0
            r4.f21875f = r5
            return r1
        L31:
            r0 = 1
            r4.f21875f = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r5 = r0.equals(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.a0.a(android.content.Context):java.lang.Boolean");
    }

    public final synchronized boolean b() {
        boolean g10;
        String str;
        String str2;
        Boolean bool = this.f21876g;
        if (bool != null) {
            g10 = bool.booleanValue();
        } else {
            g10 = this.f21872b.g();
        }
        if (g10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f21876g == null) {
            str2 = "global Firebase setting";
        } else if (this.f21875f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String.format("Crashlytics automatic data collection %s by %s.", str, str2);
        Log.isLoggable("FirebaseCrashlytics", 3);
        return g10;
    }
}

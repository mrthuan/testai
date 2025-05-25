package ja;

import android.content.Context;

/* compiled from: DevelopmentPlatformProvider.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f19074a;

    /* renamed from: b  reason: collision with root package name */
    public a f19075b = null;

    /* compiled from: DevelopmentPlatformProvider.java */
    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f19076a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19077b;

        /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(ja.d r5) {
            /*
                r4 = this;
                r4.<init>()
                android.content.Context r0 = r5.f19074a
                java.lang.String r1 = "com.google.firebase.crashlytics.unity_version"
                java.lang.String r2 = "string"
                int r0 = com.google.firebase.crashlytics.internal.common.CommonUtils.f(r0, r1, r2)
                java.lang.String r1 = "FirebaseCrashlytics"
                r2 = 2
                android.content.Context r5 = r5.f19074a
                if (r0 == 0) goto L26
                java.lang.String r3 = "Unity"
                r4.f19076a = r3
                android.content.res.Resources r5 = r5.getResources()
                java.lang.String r5 = r5.getString(r0)
                r4.f19077b = r5
                android.util.Log.isLoggable(r1, r2)
                goto L50
            L26:
                java.lang.String r0 = "flutter_assets/NOTICES.Z"
                android.content.res.AssetManager r3 = r5.getAssets()
                if (r3 != 0) goto L2f
                goto L3e
            L2f:
                android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.io.IOException -> L3e
                java.io.InputStream r5 = r5.open(r0)     // Catch: java.io.IOException -> L3e
                if (r5 == 0) goto L3c
                r5.close()     // Catch: java.io.IOException -> L3e
            L3c:
                r5 = 1
                goto L3f
            L3e:
                r5 = 0
            L3f:
                r0 = 0
                if (r5 == 0) goto L4c
                java.lang.String r5 = "Flutter"
                r4.f19076a = r5
                r4.f19077b = r0
                android.util.Log.isLoggable(r1, r2)
                goto L50
            L4c:
                r4.f19076a = r0
                r4.f19077b = r0
            L50:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ja.d.a.<init>(ja.d):void");
        }
    }

    public d(Context context) {
        this.f19074a = context;
    }
}

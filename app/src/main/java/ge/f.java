package ge;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: CoreEvent.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static String f17774a = "";

    /* renamed from: b  reason: collision with root package name */
    public static int f17775b = -1;
    public static long c = -1;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018 A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:13:0x0018, B:15:0x0026, B:24:0x0037, B:25:0x0039, B:27:0x003e, B:29:0x0042, B:31:0x0055, B:33:0x005b, B:34:0x005d, B:36:0x0061, B:39:0x0078), top: B:44:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037 A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:13:0x0018, B:15:0x0026, B:24:0x0037, B:25:0x0039, B:27:0x003e, B:29:0x0042, B:31:0x0055, B:33:0x005b, B:34:0x005d, B:36:0x0061, B:39:0x0078), top: B:44:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:13:0x0018, B:15:0x0026, B:24:0x0037, B:25:0x0039, B:27:0x003e, B:29:0x0042, B:31:0x0055, B:33:0x005b, B:34:0x005d, B:36:0x0061, B:39:0x0078), top: B:44:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061 A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:13:0x0018, B:15:0x0026, B:24:0x0037, B:25:0x0039, B:27:0x003e, B:29:0x0042, B:31:0x0055, B:33:0x005b, B:34:0x005d, B:36:0x0061, B:39:0x0078), top: B:44:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(android.content.Context r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "eventName:"
            java.lang.String r1 = ge.f.f17774a     // Catch: java.lang.Exception -> La5
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            int r1 = r1.length()     // Catch: java.lang.Exception -> La5
            if (r1 != 0) goto L10
            r1 = r3
            goto L11
        L10:
            r1 = r2
        L11:
            if (r1 != r3) goto L15
            r1 = r3
            goto L16
        L15:
            r1 = r2
        L16:
            if (r1 == 0) goto L39
            android.content.SharedPreferences r1 = de.e.i(r8)     // Catch: java.lang.Exception -> La5
            java.lang.String r4 = "core_event_tag"
            java.lang.String r5 = ""
            java.lang.String r1 = r1.getString(r4, r5)     // Catch: java.lang.Exception -> La5
            if (r1 == 0) goto L33
            int r4 = r1.length()     // Catch: java.lang.Exception -> La5
            if (r4 != 0) goto L2e
            r4 = r3
            goto L2f
        L2e:
            r4 = r2
        L2f:
            if (r4 != r3) goto L33
            r4 = r3
            goto L34
        L33:
            r4 = r2
        L34:
            if (r4 == 0) goto L37
            return
        L37:
            ge.f.f17774a = r1     // Catch: java.lang.Exception -> La5
        L39:
            int r1 = ge.f.f17775b     // Catch: java.lang.Exception -> La5
            r4 = -1
            if (r1 != r4) goto L5d
            java.lang.String r1 = ge.f.f17774a     // Catch: java.lang.Exception -> La5
            if (r1 == 0) goto L5a
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Exception -> La5
            java.lang.String r5 = "_"
            r3[r2] = r5     // Catch: java.lang.Exception -> La5
            r5 = 6
            java.util.List r1 = kotlin.text.k.h0(r1, r3, r2, r5)     // Catch: java.lang.Exception -> La5
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> La5
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> La5
            if (r1 == 0) goto L5a
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> La5
            goto L5b
        L5a:
            r1 = r4
        L5b:
            ge.f.f17775b = r1     // Catch: java.lang.Exception -> La5
        L5d:
            int r1 = ge.f.f17775b     // Catch: java.lang.Exception -> La5
            if (r1 == r4) goto L78
            int r3 = pdf.pdfreader.viewer.editor.free.utils.t0.Q()     // Catch: java.lang.Exception -> La5
            long r4 = pdf.pdfreader.viewer.editor.free.utils.t0.W(r1)     // Catch: java.lang.Exception -> La5
            long r6 = pdf.pdfreader.viewer.editor.free.utils.t0.W(r3)     // Catch: java.lang.Exception -> La5
            long r6 = r6 - r4
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r6 / r3
            int r1 = (int) r6     // Catch: java.lang.Exception -> La5
            r3 = 35
            if (r1 <= r3) goto L78
            return
        L78:
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Exception -> La5
            r1.<init>()     // Catch: java.lang.Exception -> La5
            java.lang.String r3 = ge.f.f17774a     // Catch: java.lang.Exception -> La5
            r1.putString(r9, r3)     // Catch: java.lang.Exception -> La5
            java.lang.String r3 = "core_event"
            ge.a.T(r8, r3, r1, r2)     // Catch: java.lang.Exception -> La5
            fe.a r8 = fe.a.a()     // Catch: java.lang.Exception -> La5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La5
            r1.<init>(r0)     // Catch: java.lang.Exception -> La5
            r1.append(r9)     // Catch: java.lang.Exception -> La5
            java.lang.String r9 = " tag:"
            r1.append(r9)     // Catch: java.lang.Exception -> La5
            java.lang.String r9 = ge.f.f17774a     // Catch: java.lang.Exception -> La5
            r1.append(r9)     // Catch: java.lang.Exception -> La5
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Exception -> La5
            r8.b(r9)     // Catch: java.lang.Exception -> La5
            goto La9
        La5:
            r8 = move-exception
            r8.printStackTrace()
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.f.a(android.content.Context, java.lang.String):void");
    }

    public static final void b(Context context) {
        long longVersionCode;
        try {
            SharedPreferences i10 = de.e.i(context);
            if (i10.contains("core_event_tag")) {
                return;
            }
            String valueOf = String.valueOf(t0.Q());
            int i11 = 0;
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (Build.VERSION.SDK_INT >= 28) {
                    longVersionCode = packageInfo.getLongVersionCode();
                    i11 = (int) longVersionCode;
                } else {
                    i11 = packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                e10.printStackTrace();
            }
            String valueOf2 = String.valueOf(i11);
            SharedPreferences.Editor edit = i10.edit();
            edit.putString("core_event_tag", valueOf + '_' + valueOf2).apply();
            a(context, "first_open");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}

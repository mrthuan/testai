package ma;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import oa.b0;
import oa.o;
import oa.s;

/* compiled from: CrashlyticsReportDataCapture.java */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f21955f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f21956g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21957a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f21958b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public final ua.b f21959d;

    /* renamed from: e  reason: collision with root package name */
    public final ta.f f21960e;

    static {
        HashMap hashMap = new HashMap();
        f21955f = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f21956g = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.3.6");
    }

    public y(Context context, f0 f0Var, a aVar, ua.a aVar2, com.google.firebase.crashlytics.internal.settings.a aVar3) {
        this.f21957a = context;
        this.f21958b = f0Var;
        this.c = aVar;
        this.f21959d = aVar2;
        this.f21960e = aVar3;
    }

    public static oa.p c(v2.g gVar, int i10) {
        String str = (String) gVar.f30498b;
        String str2 = (String) gVar.f30497a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) gVar.c;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        v2.g gVar2 = (v2.g) gVar.f30499d;
        if (i10 >= 8) {
            v2.g gVar3 = gVar2;
            while (gVar3 != null) {
                gVar3 = (v2.g) gVar3.f30499d;
                i11++;
            }
        }
        if (str != null) {
            oa.c0 c0Var = new oa.c0(d(stackTraceElementArr, 4));
            Integer valueOf = Integer.valueOf(i11);
            oa.p pVar = null;
            if (gVar2 != null && i11 == 0) {
                pVar = c(gVar2, i10 + 1);
            }
            String str3 = "";
            if (valueOf == null) {
                str3 = a6.h.c("", " overflowCount");
            }
            if (str3.isEmpty()) {
                return new oa.p(str, str2, c0Var, pVar, valueOf.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str3));
        }
        throw new NullPointerException("Null type");
    }

    public static oa.c0 d(StackTraceElement[] stackTraceElementArr, int i10) {
        long j10;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            s.a aVar = new s.a();
            aVar.f23018e = Integer.valueOf(i10);
            long j11 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j10 = Math.max(stackTraceElement.getLineNumber(), 0L);
            } else {
                j10 = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j11 = stackTraceElement.getLineNumber();
            }
            aVar.f23015a = Long.valueOf(j10);
            if (str != null) {
                aVar.f23016b = str;
                aVar.c = fileName;
                aVar.f23017d = Long.valueOf(j11);
                arrayList.add(aVar.a());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return new oa.c0(arrayList);
    }

    public static oa.r e(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        String name = thread.getName();
        if (name != null) {
            Integer valueOf = Integer.valueOf(i10);
            oa.c0 c0Var = new oa.c0(d(stackTraceElementArr, i10));
            String str = "";
            if (valueOf == null) {
                str = "".concat(" importance");
            }
            if (str.isEmpty()) {
                return new oa.r(name, valueOf.intValue(), c0Var);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null name");
    }

    public final oa.c0<b0.e.d.a.b.AbstractC0309a> a() {
        b0.e.d.a.b.AbstractC0309a[] abstractC0309aArr = new b0.e.d.a.b.AbstractC0309a[1];
        o.a aVar = new o.a();
        aVar.f23000a = 0L;
        aVar.f23001b = 0L;
        a aVar2 = this.c;
        String str = aVar2.f21867e;
        if (str != null) {
            aVar.c = str;
            aVar.f23002d = aVar2.f21865b;
            abstractC0309aArr[0] = aVar.a();
            return new oa.c0<>(Arrays.asList(abstractC0309aArr));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final oa.t b(int r14) {
        /*
            r13 = this;
            android.content.Context r0 = r13.f21957a
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 1
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch: java.lang.IllegalStateException -> L41
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r6)     // Catch: java.lang.IllegalStateException -> L41
            android.content.Intent r5 = r0.registerReceiver(r2, r5)     // Catch: java.lang.IllegalStateException -> L41
            if (r5 == 0) goto L41
            java.lang.String r6 = "status"
            r7 = -1
            int r6 = r5.getIntExtra(r6, r7)     // Catch: java.lang.IllegalStateException -> L41
            if (r6 != r7) goto L1d
            goto L23
        L1d:
            if (r6 == r1) goto L25
            r8 = 5
            if (r6 != r8) goto L23
            goto L25
        L23:
            r6 = r3
            goto L26
        L25:
            r6 = r4
        L26:
            java.lang.String r8 = "level"
            int r8 = r5.getIntExtra(r8, r7)     // Catch: java.lang.IllegalStateException -> L3f
            java.lang.String r9 = "scale"
            int r5 = r5.getIntExtra(r9, r7)     // Catch: java.lang.IllegalStateException -> L3f
            if (r8 == r7) goto L3f
            if (r5 != r7) goto L37
            goto L3f
        L37:
            float r7 = (float) r8     // Catch: java.lang.IllegalStateException -> L3f
            float r5 = (float) r5     // Catch: java.lang.IllegalStateException -> L3f
            float r7 = r7 / r5
            java.lang.Float r5 = java.lang.Float.valueOf(r7)     // Catch: java.lang.IllegalStateException -> L3f
            goto L43
        L3f:
            r5 = r2
            goto L43
        L41:
            r5 = r2
            r6 = r3
        L43:
            if (r5 == 0) goto L4d
            double r7 = r5.doubleValue()
            java.lang.Double r2 = java.lang.Double.valueOf(r7)
        L4d:
            if (r6 == 0) goto L63
            if (r5 != 0) goto L52
            goto L63
        L52:
            float r5 = r5.floatValue()
            double r5 = (double) r5
            r7 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L61
            goto L64
        L61:
            r1 = 3
            goto L64
        L63:
            r1 = r4
        L64:
            boolean r5 = com.google.firebase.crashlytics.internal.common.CommonUtils.i()
            if (r5 == 0) goto L6b
            goto L7c
        L6b:
            java.lang.String r5 = "sensor"
            java.lang.Object r5 = r0.getSystemService(r5)
            android.hardware.SensorManager r5 = (android.hardware.SensorManager) r5
            r6 = 8
            android.hardware.Sensor r5 = r5.getDefaultSensor(r6)
            if (r5 == 0) goto L7c
            r3 = r4
        L7c:
            long r4 = com.google.firebase.crashlytics.internal.common.CommonUtils.g()
            android.app.ActivityManager$MemoryInfo r6 = new android.app.ActivityManager$MemoryInfo
            r6.<init>()
            java.lang.String r7 = "activity"
            java.lang.Object r0 = r0.getSystemService(r7)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r0.getMemoryInfo(r6)
            long r6 = r6.availMem
            long r4 = r4 - r6
            java.io.File r0 = android.os.Environment.getDataDirectory()
            java.lang.String r0 = r0.getPath()
            android.os.StatFs r6 = new android.os.StatFs
            r6.<init>(r0)
            int r0 = r6.getBlockSize()
            long r7 = (long) r0
            int r0 = r6.getBlockCount()
            long r9 = (long) r0
            long r9 = r9 * r7
            int r0 = r6.getAvailableBlocks()
            long r11 = (long) r0
            long r7 = r7 * r11
            long r9 = r9 - r7
            oa.t$a r0 = new oa.t$a
            r0.<init>()
            r0.f23024a = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f23025b = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.c = r1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0.f23026d = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r4)
            r0.f23027e = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r9)
            r0.f23028f = r14
            oa.t r14 = r0.a()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.y.b(int):oa.t");
    }
}

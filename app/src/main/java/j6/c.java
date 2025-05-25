package j6;

import com.facebook.e;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.p;
import h6.d;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import org.json.JSONArray;

/* compiled from: CrashHandler.kt */
/* loaded from: classes.dex */
public final class c implements Thread.UncaughtExceptionHandler {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19044b = new a();
    public static c c;

    /* renamed from: a  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f19045a;

    /* compiled from: CrashHandler.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a() {
            File[] listFiles;
            if (p.t()) {
                return;
            }
            File b10 = d.b();
            if (b10 == null) {
                listFiles = new File[0];
            } else {
                listFiles = b10.listFiles(new h6.b(0));
                if (listFiles == null) {
                    listFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                g.e(file, "file");
                arrayList.add(new InstrumentData(file));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((InstrumentData) next).b()) {
                    arrayList2.add(next);
                }
            }
            final List A0 = m.A0(new j6.a(0), arrayList2);
            JSONArray jSONArray = new JSONArray();
            hg.b it2 = ge.a.f0(0, Math.min(A0.size(), 5)).iterator();
            while (it2.c) {
                jSONArray.put(A0.get(it2.a()));
            }
            d.f("crash_reports", jSONArray, new e.b() { // from class: j6.b
                /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[Catch: JSONException -> 0x0034, TryCatch #0 {JSONException -> 0x0034, blocks: (B:3:0x0007, B:5:0x000b, B:7:0x000f, B:12:0x001c, B:13:0x0022, B:15:0x0028), top: B:19:0x0007 }] */
                /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
                @Override // com.facebook.e.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void b(com.facebook.i r3) {
                    /*
                        r2 = this;
                        java.util.List r0 = r1
                        java.lang.String r1 = "$validReports"
                        kotlin.jvm.internal.g.e(r0, r1)
                        com.facebook.FacebookRequestError r1 = r3.c     // Catch: org.json.JSONException -> L34
                        if (r1 != 0) goto L34
                        org.json.JSONObject r3 = r3.f9729d     // Catch: org.json.JSONException -> L34
                        if (r3 == 0) goto L19
                        java.lang.String r1 = "success"
                        boolean r3 = r3.getBoolean(r1)     // Catch: org.json.JSONException -> L34
                        r1 = 1
                        if (r3 != r1) goto L19
                        goto L1a
                    L19:
                        r1 = 0
                    L1a:
                        if (r1 == 0) goto L34
                        java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: org.json.JSONException -> L34
                        java.util.Iterator r3 = r0.iterator()     // Catch: org.json.JSONException -> L34
                    L22:
                        boolean r0 = r3.hasNext()     // Catch: org.json.JSONException -> L34
                        if (r0 == 0) goto L34
                        java.lang.Object r0 = r3.next()     // Catch: org.json.JSONException -> L34
                        com.facebook.internal.instrument.InstrumentData r0 = (com.facebook.internal.instrument.InstrumentData) r0     // Catch: org.json.JSONException -> L34
                        java.lang.String r0 = r0.f9794a     // Catch: org.json.JSONException -> L34
                        h6.d.a(r0)     // Catch: org.json.JSONException -> L34
                        goto L22
                    L34:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: j6.b.b(com.facebook.i):void");
                }
            });
        }
    }

    public c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f19045a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t4, Throwable e10) {
        int i10;
        g.e(t4, "t");
        g.e(e10, "e");
        Throwable th2 = null;
        Throwable th3 = e10;
        loop0: while (true) {
            i10 = 0;
            if (th3 == null || th3 == th2) {
                break;
            }
            StackTraceElement[] stackTrace = th3.getStackTrace();
            g.d(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            while (i10 < length) {
                StackTraceElement element = stackTrace[i10];
                g.d(element, "element");
                if (d.c(element)) {
                    i10 = 1;
                    break loop0;
                }
                i10++;
            }
            th2 = th3;
            th3 = th3.getCause();
        }
        if (i10 != 0) {
            h6.a.a(e10);
            InstrumentData.Type t10 = InstrumentData.Type.CrashReport;
            g.e(t10, "t");
            new InstrumentData(e10, t10).c();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f19045a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t4, e10);
        }
    }
}

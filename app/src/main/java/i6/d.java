package i6;

import com.facebook.e;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.o;
import com.facebook.internal.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import org.json.JSONArray;

/* compiled from: ANRHandler.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f18471a;

    static {
        new d();
        f18471a = new AtomicBoolean(false);
    }

    public static final void a() {
        File[] listFiles;
        if (k6.a.b(d.class)) {
            return;
        }
        try {
            if (p.t()) {
                return;
            }
            File b10 = h6.d.b();
            if (b10 == null) {
                listFiles = new File[0];
            } else {
                listFiles = b10.listFiles(new o(1));
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
            final List A0 = m.A0(new b(), arrayList2);
            JSONArray jSONArray = new JSONArray();
            hg.b it2 = ge.a.f0(0, Math.min(A0.size(), 5)).iterator();
            while (it2.c) {
                jSONArray.put(A0.get(it2.a()));
            }
            h6.d.f("anr_reports", jSONArray, new e.b() { // from class: i6.c
                /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[Catch: all -> 0x003d, JSONException -> 0x0041, TryCatch #0 {JSONException -> 0x0041, blocks: (B:6:0x0010, B:8:0x0014, B:10:0x0018, B:15:0x0025, B:16:0x002b, B:18:0x0031), top: B:24:0x0010 }] */
                /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
                @Override // com.facebook.e.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void b(com.facebook.i r4) {
                    /*
                        r3 = this;
                        java.util.List r0 = r1
                        java.lang.Class<i6.d> r1 = i6.d.class
                        boolean r2 = k6.a.b(r1)
                        if (r2 == 0) goto Lb
                        goto L41
                    Lb:
                        java.lang.String r2 = "$validReports"
                        kotlin.jvm.internal.g.e(r0, r2)     // Catch: java.lang.Throwable -> L3d
                        com.facebook.FacebookRequestError r2 = r4.c     // Catch: java.lang.Throwable -> L3d org.json.JSONException -> L41
                        if (r2 != 0) goto L41
                        org.json.JSONObject r4 = r4.f9729d     // Catch: java.lang.Throwable -> L3d org.json.JSONException -> L41
                        if (r4 == 0) goto L22
                        java.lang.String r2 = "success"
                        boolean r4 = r4.getBoolean(r2)     // Catch: java.lang.Throwable -> L3d org.json.JSONException -> L41
                        r2 = 1
                        if (r4 != r2) goto L22
                        goto L23
                    L22:
                        r2 = 0
                    L23:
                        if (r2 == 0) goto L41
                        java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L3d org.json.JSONException -> L41
                        java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L3d org.json.JSONException -> L41
                    L2b:
                        boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L3d org.json.JSONException -> L41
                        if (r0 == 0) goto L41
                        java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L3d org.json.JSONException -> L41
                        com.facebook.internal.instrument.InstrumentData r0 = (com.facebook.internal.instrument.InstrumentData) r0     // Catch: java.lang.Throwable -> L3d org.json.JSONException -> L41
                        java.lang.String r0 = r0.f9794a     // Catch: java.lang.Throwable -> L3d org.json.JSONException -> L41
                        h6.d.a(r0)     // Catch: java.lang.Throwable -> L3d org.json.JSONException -> L41
                        goto L2b
                    L3d:
                        r4 = move-exception
                        k6.a.a(r1, r4)
                    L41:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: i6.c.b(com.facebook.i):void");
                }
            });
        } catch (Throwable th2) {
            k6.a.a(d.class, th2);
        }
    }
}

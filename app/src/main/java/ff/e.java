package ff;

import gf.h;
import gf.k;

/* compiled from: MouseCursorChannel.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public b f17279a;

    /* compiled from: MouseCursorChannel.java */
    /* loaded from: classes.dex */
    public class a implements h.b {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #0 {Exception -> 0x0056, blocks: (B:6:0x0010, B:15:0x0028, B:17:0x003b, B:19:0x0042, B:9:0x001a, B:16:0x0034), top: B:24:0x0010, inners: #1 }] */
        @Override // gf.h.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(wk.g r8, gf.g r9) {
            /*
                r7 = this;
                java.lang.String r0 = "error"
                java.lang.String r1 = "Error when setting cursors: "
                ff.e r2 = ff.e.this
                ff.e$b r3 = r2.f17279a
                if (r3 != 0) goto Lb
                return
            Lb:
                java.lang.Object r3 = r8.f31333a
                java.lang.String r3 = (java.lang.String) r3
                r4 = 0
                int r5 = r3.hashCode()     // Catch: java.lang.Exception -> L56
                r6 = -1307105544(0xffffffffb21726f8, float:-8.798217E-9)
                if (r5 == r6) goto L1a
                goto L24
            L1a:
                java.lang.String r5 = "activateSystemCursor"
                boolean r3 = r3.equals(r5)     // Catch: java.lang.Exception -> L56
                if (r3 == 0) goto L24
                r3 = 0
                goto L25
            L24:
                r3 = -1
            L25:
                if (r3 == 0) goto L28
                goto L6c
            L28:
                java.lang.Object r8 = r8.f31334b     // Catch: java.lang.Exception -> L56
                java.util.HashMap r8 = (java.util.HashMap) r8     // Catch: java.lang.Exception -> L56
                java.lang.String r3 = "kind"
                java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Exception -> L56
                java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L56
                ff.e$b r2 = r2.f17279a     // Catch: java.lang.Exception -> L41
                io.flutter.plugin.mouse.a$a r2 = (io.flutter.plugin.mouse.a.C0252a) r2     // Catch: java.lang.Exception -> L41
                r2.a(r8)     // Catch: java.lang.Exception -> L41
                java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L56
                r9.c(r8)     // Catch: java.lang.Exception -> L56
                goto L6c
            L41:
                r8 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L56
                r2.<init>(r1)     // Catch: java.lang.Exception -> L56
                java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Exception -> L56
                r2.append(r8)     // Catch: java.lang.Exception -> L56
                java.lang.String r8 = r2.toString()     // Catch: java.lang.Exception -> L56
                r9.a(r0, r8, r4)     // Catch: java.lang.Exception -> L56
                goto L6c
            L56:
                r8 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unhandled error: "
                r1.<init>(r2)
                java.lang.String r8 = r8.getMessage()
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r9.a(r0, r8, r4)
            L6c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ff.e.a.a(wk.g, gf.g):void");
        }
    }

    /* compiled from: MouseCursorChannel.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public e(we.a aVar) {
        new gf.h(aVar, "flutter/mousecursor", k.f17803b).b(new a());
    }
}

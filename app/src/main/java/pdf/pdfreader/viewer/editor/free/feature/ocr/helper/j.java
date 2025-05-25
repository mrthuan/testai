package pdf.pdfreader.viewer.editor.free.feature.ocr.helper;

import java.util.ArrayList;
import java.util.List;

/* compiled from: TransportMultiImage.kt */
/* loaded from: classes3.dex */
public class j implements l {

    /* renamed from: a  reason: collision with root package name */
    public final List<ul.b> f25088a;

    public j(ArrayList arrayList) {
        ea.a.p("PGVdZRp0fm07Z2U=", "A4EbPImU");
        this.f25088a = arrayList;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.l
    public ul.c a(int i10) {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
        if (r8.equals(ea.a.p("U3AGZw==", "pk9ckbvO")) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (r8.equals(ea.a.p("AG5n", "4jpENKj9")) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
        if (r8.equals(ea.a.p("AXBn", "xlkM7NEJ")) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
        if (r8.equals(ea.a.p("LW1w", "xov2R3ZM")) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        r7 = r7.getAbsoluteFile();
        r2 = java.io.File.separator;
        r3 = java.util.UUID.randomUUID();
        r4 = bg.b.A0(r0);
        r8 = new java.io.File(r7 + r2 + r3 + "." + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
        bg.b.y0(r0, r8, false, 8192);
        r7 = r8.getAbsolutePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c3, code lost:
        r7.printStackTrace();
     */
    @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(java.io.File r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r7.exists()
            java.lang.String r1 = ""
            if (r0 == 0) goto Lcd
            boolean r0 = r7.isDirectory()
            if (r0 != 0) goto L10
            goto Lcd
        L10:
            java.util.List<ul.b> r0 = r6.f25088a
            java.lang.Object r8 = kotlin.collections.m.t0(r8, r0)
            ul.b r8 = (ul.b) r8
            if (r8 == 0) goto Lc8
            java.io.File r0 = new java.io.File
            java.lang.String r8 = r8.f30404a
            r0.<init>(r8)
            java.lang.String r8 = bg.b.A0(r0)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r2)
            java.lang.String r2 = "PGhdc2dhPSAiYRBhGmw2bl8uAXQ7aVhnXS4Fbx1vNWU6Q1VzIigCbythCmUaUhhPbCk="
            java.lang.String r3 = "MdH4GNmb"
            java.lang.String r2 = ea.a.p(r2, r3)
            kotlin.jvm.internal.g.d(r8, r2)
            long r2 = r0.length()
            r4 = 524288000(0x1f400000, double:2.590326893E-315)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L43
            goto Lc6
        L43:
            int r2 = r8.hashCode()
            switch(r2) {
                case 97669: goto L7a;
                case 105441: goto L6a;
                case 111145: goto L5b;
                case 3268712: goto L4c;
                default: goto L4a;
            }
        L4a:
            goto Lc6
        L4c:
            java.lang.String r2 = "U3AGZw=="
            java.lang.String r3 = "pk9ckbvO"
            java.lang.String r2 = ea.a.p(r2, r3)
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto Lc6
            goto L8a
        L5b:
            java.lang.String r2 = "AG5n"
            java.lang.String r3 = "4jpENKj9"
            java.lang.String r2 = ea.a.p(r2, r3)
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L8a
            goto Lc6
        L6a:
            java.lang.String r2 = "AXBn"
            java.lang.String r3 = "xlkM7NEJ"
            java.lang.String r2 = ea.a.p(r2, r3)
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L8a
            goto Lc6
        L7a:
            java.lang.String r2 = "LW1w"
            java.lang.String r3 = "xov2R3ZM"
            java.lang.String r2 = ea.a.p(r2, r3)
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L8a
            goto Lc6
        L8a:
            java.io.File r8 = new java.io.File
            java.io.File r7 = r7.getAbsoluteFile()
            java.lang.String r2 = java.io.File.separator
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r4 = bg.b.A0(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r7 = "."
            r5.append(r7)
            r5.append(r4)
            java.lang.String r7 = r5.toString()
            r8.<init>(r7)
            r7 = 8192(0x2000, float:1.148E-41)
            r2 = 0
            bg.b.y0(r0, r8, r2, r7)     // Catch: java.lang.Exception -> Lc2
            java.lang.String r7 = r8.getAbsolutePath()     // Catch: java.lang.Exception -> Lc2
            goto Lc9
        Lc2:
            r7 = move-exception
            r7.printStackTrace()
        Lc6:
            r7 = r1
            goto Lc9
        Lc8:
            r7 = 0
        Lc9:
            if (r7 != 0) goto Lcc
            goto Lcd
        Lcc:
            r1 = r7
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ocr.helper.j.b(java.io.File, int):java.lang.String");
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.l
    public final long c() {
        long j10 = 0;
        for (ul.b bVar : this.f25088a) {
            j10 += bVar.f30406d;
        }
        return j10;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.l
    public final int size() {
        return this.f25088a.size();
    }
}

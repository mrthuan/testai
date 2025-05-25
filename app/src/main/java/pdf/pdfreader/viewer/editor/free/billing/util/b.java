package pdf.pdfreader.viewer.editor.free.billing.util;

import android.content.Context;
import androidx.activity.f;
import com.android.billingclient.api.h;
import java.util.Iterator;
import kotlin.Triple;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.billing.h;

/* compiled from: IapServerLogUtil.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f24064a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static pl.a f24065b;

    public static String a(Context context, int i10, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            g.d(str2, ea.a.p("F2EUay5nJkkmZgkuQmUlc1FvPE4obWU=", "MegwOCqq"));
        } catch (Exception e10) {
            h hVar = h.f24062a;
            String obj = e10.toString();
            hVar.getClass();
            h.a(obj);
            str2 = "";
        }
        String packageName = context.getPackageName();
        StringBuilder sb2 = new StringBuilder("modetype=");
        sb2.append(i10);
        sb2.append("&data=");
        sb2.append(str);
        sb2.append("&pkg=");
        return f.o(sb2, packageName, "&version=", str2);
    }

    public static Triple b(h.d offerDetails) {
        g.e(offerDetails, "offerDetails");
        Iterator it = offerDetails.f6253d.f6250a.iterator();
        String str = null;
        Long l10 = null;
        Long l11 = null;
        while (it.hasNext()) {
            h.b bVar = (h.b) it.next();
            if (l10 == null || bVar.f6249b < l10.longValue()) {
                l10 = Long.valueOf(bVar.f6249b);
                str = bVar.c;
            }
            if (l11 == null) {
                long j10 = bVar.f6249b;
                if (j10 != 0) {
                    l11 = Long.valueOf(j10);
                }
            }
        }
        return new Triple(str, l10, l11);
    }

    public static void c() {
        ea.a.p("emE7UxZyFGUATFtn", "7UciDW5I");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.app.Activity r17, java.lang.String r18, com.android.billingclient.api.Purchase r19, com.android.billingclient.api.h.d r20, kotlin.coroutines.c r21) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.billing.util.b.d(android.app.Activity, java.lang.String, com.android.billingclient.api.Purchase, com.android.billingclient.api.h$d, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(3:10|11|12)(2:23|24))(2:25|(1:(2:28|(1:30)(1:31))(2:32|33))(2:34|35))|13|(4:15|(1:17)|18|19)(2:21|22)))|39|6|7|(0)(0)|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
        r1 = pdf.pdfreader.viewer.editor.free.billing.h.f24062a;
        r0 = r0.toString();
        r1.getClass();
        pdf.pdfreader.viewer.editor.free.billing.h.a(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:12:0x0039, B:23:0x006c, B:25:0x0070, B:27:0x00b0, B:30:0x00d4, B:31:0x00db, B:19:0x004f, B:32:0x00dc, B:33:0x00e3, B:34:0x00e4, B:35:0x00eb), top: B:39:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4 A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:12:0x0039, B:23:0x006c, B:25:0x0070, B:27:0x00b0, B:30:0x00d4, B:31:0x00db, B:19:0x004f, B:32:0x00dc, B:33:0x00e3, B:34:0x00e4, B:35:0x00eb), top: B:39:0x002b }] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(android.app.Activity r16, int r17, java.lang.String r18, com.android.billingclient.api.Purchase r19, com.android.billingclient.api.h.d r20, kotlin.coroutines.c r21) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.billing.util.b.e(android.app.Activity, int, java.lang.String, com.android.billingclient.api.Purchase, com.android.billingclient.api.h$d, kotlin.coroutines.c):java.lang.Object");
    }
}

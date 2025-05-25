package pdf.pdfreader.viewer.editor.free.billing;

import androidx.activity.s;
import com.adjust.sdk.network.ErrorCodes;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import ol.f;
import pdf.pdfreader.viewer.editor.free.billing.exception.BillingException;

/* compiled from: BillingHelper.kt */
/* loaded from: classes3.dex */
public final class f implements z4.c {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<Boolean> f24060a = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.g<ol.g> f24061b;

    public f(kotlinx.coroutines.h hVar) {
        this.f24061b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cc, code lost:
        if (kotlin.text.k.O(r6, r2, false) == true) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // z4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.billing.f.c(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0042 A[EDGE_INSN: B:34:0x0042->B:21:0x0042 ?: BREAK  , SYNTHETIC] */
    @Override // z4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.util.List<com.android.billingclient.api.Purchase> r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r7.f24060a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.getAndSet(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L72
            r0 = 1
            r1 = 0
            r2 = 0
            if (r8 == 0) goto L45
            r3 = r8
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L1c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.android.billingclient.api.Purchase r5 = (com.android.billingclient.api.Purchase) r5
            if (r5 == 0) goto L3d
            org.json.JSONObject r5 = r5.c
            java.lang.String r6 = "purchaseState"
            int r5 = r5.optInt(r6, r0)
            r6 = 4
            if (r5 == r6) goto L38
            r5 = r0
            goto L39
        L38:
            r5 = 2
        L39:
            if (r5 != r0) goto L3d
            r5 = r0
            goto L3e
        L3d:
            r5 = r1
        L3e:
            if (r5 == 0) goto L1c
            goto L42
        L41:
            r4 = r2
        L42:
            com.android.billingclient.api.Purchase r4 = (com.android.billingclient.api.Purchase) r4
            goto L46
        L45:
            r4 = r2
        L46:
            if (r4 == 0) goto L49
            goto L4a
        L49:
            r0 = r1
        L4a:
            if (r8 == 0) goto L53
            java.lang.Object r8 = kotlin.collections.m.s0(r8)
            r2 = r8
            com.android.billingclient.api.Purchase r2 = (com.android.billingclient.api.Purchase) r2
        L53:
            ol.g r8 = new ol.g
            r8.<init>(r0, r2)
            kotlinx.coroutines.g<ol.g> r0 = r7.f24061b
            boolean r1 = r0.a()
            if (r1 == 0) goto L68
            java.lang.Object r8 = kotlin.Result.m13constructorimpl(r8)
            r0.resumeWith(r8)
            goto L72
        L68:
            pdf.pdfreader.viewer.editor.free.billing.BillingRepository r0 = pdf.pdfreader.viewer.editor.free.billing.BillingRepository.f24041a
            ol.f$b r0 = new ol.f$b
            r0.<init>(r8)
            pdf.pdfreader.viewer.editor.free.billing.BillingRepository.i(r0)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.billing.f.e(java.util.List):void");
    }

    @Override // z4.a
    public final void f(String str) {
        if (!this.f24060a.getAndSet(Boolean.TRUE).booleanValue()) {
            BillingException b10 = g.b(ErrorCodes.IO_EXCEPTION, str);
            kotlinx.coroutines.g<ol.g> gVar = this.f24061b;
            if (gVar.a()) {
                gVar.resumeWith(Result.m13constructorimpl(s.v(b10)));
                return;
            }
            BillingRepository billingRepository = BillingRepository.f24041a;
            BillingRepository.i(new f.a(b10));
        }
    }
}

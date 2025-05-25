package pdf.pdfreader.viewer.editor.free.billing;

import android.app.Activity;
import android.app.Application;
import androidx.activity.s;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.x;
import kotlinx.coroutines.y0;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: BillingRepository.kt */
/* loaded from: classes3.dex */
public final class BillingRepository {

    /* renamed from: b  reason: collision with root package name */
    public static i f24042b;
    public static Application c;

    /* renamed from: d  reason: collision with root package name */
    public static pl.c f24043d;

    /* renamed from: e  reason: collision with root package name */
    public static y0 f24044e;

    /* renamed from: g  reason: collision with root package name */
    public static final v f24046g;

    /* renamed from: h  reason: collision with root package name */
    public static final v f24047h;

    /* renamed from: i  reason: collision with root package name */
    public static ol.c f24048i;

    /* renamed from: a  reason: collision with root package name */
    public static final BillingRepository f24041a = new BillingRepository();

    /* renamed from: f  reason: collision with root package name */
    public static final ArrayList f24045f = new ArrayList();

    static {
        v d10 = ea.a.d(0, 7);
        f24046g = d10;
        f24047h = d10;
    }

    public static Object a(kotlin.coroutines.c cVar) {
        Object w02 = t0.w0(j0.f20207b, new BillingRepository$checkSubscribeState$2(null), cVar);
        if (w02 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return w02;
        }
        return tf.d.f30009a;
    }

    public static Object c(kotlin.coroutines.c cVar) {
        Object w02 = t0.w0(j0.f20207b, new BillingRepository$fetchSubscribeInfo$2(null), cVar);
        if (w02 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return w02;
        }
        return tf.d.f30009a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r0.a() == true) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e() {
        /*
            kotlinx.coroutines.y0 r0 = pdf.pdfreader.viewer.editor.free.billing.BillingRepository.f24044e
            if (r0 == 0) goto Lc
            boolean r0 = r0.a()
            r1 = 1
            if (r0 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L10
            return
        L10:
            lg.a r0 = kotlinx.coroutines.j0.f20207b
            kotlinx.coroutines.internal.d r0 = kotlinx.coroutines.x.a(r0)
            pdf.pdfreader.viewer.editor.free.billing.BillingRepository$fetchSubscribeInfoSync$1 r1 = new pdf.pdfreader.viewer.editor.free.billing.BillingRepository$fetchSubscribeInfoSync$1
            r2 = 0
            r1.<init>(r2)
            r3 = 3
            kotlinx.coroutines.l1 r0 = pdf.pdfreader.viewer.editor.free.utils.t0.d0(r0, r2, r2, r1, r3)
            pdf.pdfreader.viewer.editor.free.billing.BillingRepository.f24044e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.billing.BillingRepository.e():void");
    }

    public static void f(String str) {
        h.f24062a.getClass();
        h.a(str);
    }

    public static void h(Activity activity, ol.g result) {
        Object m13constructorimpl;
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(result, "result");
        ol.c cVar = f24048i;
        if (cVar != null) {
            try {
                k(activity, cVar.f23474a, result);
                Result.m13constructorimpl(tf.d.f30009a);
            } catch (Throwable th2) {
                Result.m13constructorimpl(s.v(th2));
            }
            try {
                t0.d0(x.a(j0.f20207b), null, null, new BillingRepository$uploadEvent$1(cVar.f23474a, cVar.f23475b, activity, result, null), 3);
                m13constructorimpl = Result.m13constructorimpl(tf.d.f30009a);
            } catch (Throwable th3) {
                m13constructorimpl = Result.m13constructorimpl(s.v(th3));
            }
            Result.m12boximpl(m13constructorimpl);
        }
    }

    public static void i(ol.f fVar) {
        lg.b bVar = j0.f20206a;
        t0.d0(x.a(l.f20194a), null, null, new BillingRepository$sendPurchaseEvent$1(fVar, null), 3);
    }

    public static Object j(jl.a aVar, String str, ContinuationImpl continuationImpl) {
        lg.b bVar = j0.f20206a;
        return t0.w0(l.f20194a, new BillingRepository$startPurchase$2(aVar, str, 1, null), continuationImpl);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ff, code lost:
        if (r13.equals(ea.a.p("VXIuZV50EGkTbBk3ZA==", "40QXCynd")) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0202, code lost:
        r0 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020e, code lost:
        if (r13.equals(ea.a.p("VXIuZV50EGkTbBkzZA==", "fWiyrYeS")) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0211, code lost:
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021d, code lost:
        if (r13.equals(ea.a.p("KXJUZVR0RWk7bGcxQWQ=", "NUtNfGPL")) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0220, code lost:
        r0 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0222, code lost:
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (r13.equals(ea.a.p("VXIuZV50EGkTbBkzZA==", "i00RVAr9")) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
        if (r13.equals(ea.a.p("KXJUZVR0RWk7bGczES0AYVlm", "sDRzYOuZ")) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
        r0 = ea.a.p("NmVQcjM=", "gpJVTRp3");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a9, code lost:
        if (r13.equals(ea.a.p("VXIuZV50EGkTbBk3ZA==", "pzUKDmK0")) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b7, code lost:
        if (r13.equals(ea.a.p("VXIuZV50EGkTbBkzZA==", "1YxLX9Sq")) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c7, code lost:
        if (r13.equals(ea.a.p("DHIDZWV0H2kpbEsxAGQ=", "ENjfHmu1")) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d6, code lost:
        if (r13.equals(ea.a.p("VXIuZV50EGkTbBkzDS0-YShm", "MWa9aykg")) == false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(android.app.Activity r23, com.android.billingclient.api.h.d r24, ol.g r25) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.billing.BillingRepository.k(android.app.Activity, com.android.billingclient.api.h$d, ol.g):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.c<? super kotlin.Result<tf.d>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof pdf.pdfreader.viewer.editor.free.billing.BillingRepository$checkSubscribeStateSafely$1
            if (r0 == 0) goto L13
            r0 = r6
            pdf.pdfreader.viewer.editor.free.billing.BillingRepository$checkSubscribeStateSafely$1 r0 = (pdf.pdfreader.viewer.editor.free.billing.BillingRepository$checkSubscribeStateSafely$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            pdf.pdfreader.viewer.editor.free.billing.BillingRepository$checkSubscribeStateSafely$1 r0 = new pdf.pdfreader.viewer.editor.free.billing.BillingRepository$checkSubscribeStateSafely$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            androidx.activity.s.u0(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            androidx.activity.s.u0(r6)
            lg.a r6 = kotlinx.coroutines.j0.f20207b
            pdf.pdfreader.viewer.editor.free.billing.BillingRepository$checkSubscribeStateSafely$2 r2 = new pdf.pdfreader.viewer.editor.free.billing.BillingRepository$checkSubscribeStateSafely$2
            r4 = 0
            r2.<init>(r4)
            r0.label = r3
            java.lang.Object r6 = pdf.pdfreader.viewer.editor.free.utils.t0.w0(r6, r2, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.m21unboximpl()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.billing.BillingRepository.b(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.c<? super kotlin.Result<tf.d>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof pdf.pdfreader.viewer.editor.free.billing.BillingRepository$fetchSubscribeInfoSafely$1
            if (r0 == 0) goto L13
            r0 = r6
            pdf.pdfreader.viewer.editor.free.billing.BillingRepository$fetchSubscribeInfoSafely$1 r0 = (pdf.pdfreader.viewer.editor.free.billing.BillingRepository$fetchSubscribeInfoSafely$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            pdf.pdfreader.viewer.editor.free.billing.BillingRepository$fetchSubscribeInfoSafely$1 r0 = new pdf.pdfreader.viewer.editor.free.billing.BillingRepository$fetchSubscribeInfoSafely$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            androidx.activity.s.u0(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            androidx.activity.s.u0(r6)
            lg.a r6 = kotlinx.coroutines.j0.f20207b
            pdf.pdfreader.viewer.editor.free.billing.BillingRepository$fetchSubscribeInfoSafely$2 r2 = new pdf.pdfreader.viewer.editor.free.billing.BillingRepository$fetchSubscribeInfoSafely$2
            r4 = 0
            r2.<init>(r4)
            r0.label = r3
            java.lang.Object r6 = pdf.pdfreader.viewer.editor.free.utils.t0.w0(r6, r2, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.m21unboximpl()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.billing.BillingRepository.d(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity r6, pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$restoreSubscribe$2.AnonymousClass1 r7, kotlin.coroutines.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof pdf.pdfreader.viewer.editor.free.billing.BillingRepository$restorePurchased$1
            if (r0 == 0) goto L13
            r0 = r8
            pdf.pdfreader.viewer.editor.free.billing.BillingRepository$restorePurchased$1 r0 = (pdf.pdfreader.viewer.editor.free.billing.BillingRepository$restorePurchased$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            pdf.pdfreader.viewer.editor.free.billing.BillingRepository$restorePurchased$1 r0 = new pdf.pdfreader.viewer.editor.free.billing.BillingRepository$restorePurchased$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            androidx.activity.s.u0(r8)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            androidx.activity.s.u0(r8)
            lg.a r8 = kotlinx.coroutines.j0.f20207b
            pdf.pdfreader.viewer.editor.free.billing.BillingRepository$restorePurchased$2 r2 = new pdf.pdfreader.viewer.editor.free.billing.BillingRepository$restorePurchased$2
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.label = r3
            java.lang.Object r8 = pdf.pdfreader.viewer.editor.free.utils.t0.w0(r8, r2, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r6 = r8.m21unboximpl()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.billing.BillingRepository.g(pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$restoreSubscribe$2$1, kotlin.coroutines.c):java.lang.Object");
    }
}

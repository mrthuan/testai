package pdf.pdfreader.viewer.editor.free.feature.ocr.helper;

import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;

/* compiled from: OCRStateManager.kt */
/* loaded from: classes3.dex */
public final class OCRStateManager {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25059a;

    /* compiled from: OCRStateManager.kt */
    /* loaded from: classes3.dex */
    public enum OCRState {
        vip,
        free,
        billing
    }

    /* compiled from: OCRStateManager.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(cg.a aVar, cg.a aVar2) {
            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
            if (!billingConfigImpl.w() && billingConfigImpl.z()) {
                if (BillingConfigImpl.j() <= 0) {
                    aVar2.invoke();
                    return;
                } else if (!BillingConfigImpl.p()) {
                    aVar2.invoke();
                    return;
                } else {
                    aVar.invoke();
                    return;
                }
            }
            aVar.invoke();
        }

        public static void b(cg.l lVar) {
            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
            if (!billingConfigImpl.w() && billingConfigImpl.z()) {
                if (BillingConfigImpl.j() <= 0) {
                    lVar.invoke(OCRState.billing);
                    return;
                } else {
                    lVar.invoke(OCRState.free);
                    return;
                }
            }
            lVar.invoke(OCRState.vip);
        }
    }

    static {
        ea.a.p("OENrSAhsQWVy", "QFw9m1YK");
        f25059a = new a();
    }
}

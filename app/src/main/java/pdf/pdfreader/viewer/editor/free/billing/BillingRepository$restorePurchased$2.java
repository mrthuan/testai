package pdf.pdfreader.viewer.editor.free.billing;

import android.content.Context;
import cg.p;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingRepository.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.billing.BillingRepository$restorePurchased$2", f = "BillingRepository.kt", l = {160, ShapeTypes.ACTION_BUTTON_BLANK, ShapeTypes.ACTION_BUTTON_SOUND}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BillingRepository$restorePurchased$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Result<? extends tf.d>>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ pl.b $listener;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRepository$restorePurchased$2(Context context, pl.b bVar, kotlin.coroutines.c<? super BillingRepository$restorePurchased$2> cVar) {
        super(2, cVar);
        this.$context = context;
        this.$listener = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        BillingRepository$restorePurchased$2 billingRepository$restorePurchased$2 = new BillingRepository$restorePurchased$2(this.$context, this.$listener, cVar);
        billingRepository$restorePurchased$2.L$0 = obj;
        return billingRepository$restorePurchased$2;
    }

    @Override // cg.p
    public /* bridge */ /* synthetic */ Object invoke(w wVar, kotlin.coroutines.c<? super Result<? extends tf.d>> cVar) {
        return invoke2(wVar, (kotlin.coroutines.c<? super Result<tf.d>>) cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173 A[Catch: all -> 0x0171, TryCatch #2 {all -> 0x0171, blocks: (B:7:0x0013, B:69:0x013b, B:73:0x014f, B:76:0x0173, B:77:0x0178, B:12:0x0026, B:34:0x00a0, B:39:0x00af, B:44:0x00ba, B:48:0x00c3, B:53:0x00e1, B:55:0x00e5, B:56:0x00ed, B:60:0x00fc, B:62:0x0106, B:63:0x011f, B:65:0x0131, B:66:0x0132, B:81:0x017c, B:82:0x0181, B:83:0x0182, B:84:0x0187, B:85:0x0188, B:86:0x018d, B:15:0x002f, B:28:0x006b, B:30:0x0075, B:87:0x018e, B:88:0x0193, B:18:0x003c, B:20:0x0040, B:21:0x0059, B:23:0x0060, B:24:0x0061, B:92:0x0197, B:93:0x019c, B:22:0x005a, B:64:0x0120), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0188 A[Catch: all -> 0x0171, TryCatch #2 {all -> 0x0171, blocks: (B:7:0x0013, B:69:0x013b, B:73:0x014f, B:76:0x0173, B:77:0x0178, B:12:0x0026, B:34:0x00a0, B:39:0x00af, B:44:0x00ba, B:48:0x00c3, B:53:0x00e1, B:55:0x00e5, B:56:0x00ed, B:60:0x00fc, B:62:0x0106, B:63:0x011f, B:65:0x0131, B:66:0x0132, B:81:0x017c, B:82:0x0181, B:83:0x0182, B:84:0x0187, B:85:0x0188, B:86:0x018d, B:15:0x002f, B:28:0x006b, B:30:0x0075, B:87:0x018e, B:88:0x0193, B:18:0x003c, B:20:0x0040, B:21:0x0059, B:23:0x0060, B:24:0x0061, B:92:0x0197, B:93:0x019c, B:22:0x005a, B:64:0x0120), top: B:116:0x000b }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.billing.BillingRepository$restorePurchased$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(w wVar, kotlin.coroutines.c<? super Result<tf.d>> cVar) {
        return ((BillingRepository$restorePurchased$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

package pdf.pdfreader.viewer.editor.free.billing;

import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: BillingRepository.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.billing.BillingRepository$fetchSubscribeInfo$2", f = "BillingRepository.kt", l = {113, 114, 125, ShapeTypes.FLOW_CHART_EXTRACT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BillingRepository$fetchSubscribeInfo$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    boolean Z$0;
    int label;

    public BillingRepository$fetchSubscribeInfo$2(kotlin.coroutines.c<? super BillingRepository$fetchSubscribeInfo$2> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BillingRepository$fetchSubscribeInfo$2(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0a7c  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0b3a  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0b69  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x01f1 A[EDGE_INSN: B:541:0x01f1->B:91:0x01f1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x025c A[EDGE_INSN: B:546:0x025c->B:115:0x025c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x059b A[EDGE_INSN: B:567:0x059b->B:236:0x059b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:579:0x072f A[EDGE_INSN: B:579:0x072f->B:313:0x072f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x09e8 A[EDGE_INSN: B:599:0x09e8->B:441:0x09e8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ed A[LOOP:2: B:70:0x0194->B:89:0x01ed, LOOP_END] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v64 */
    /* JADX WARN: Type inference failed for: r8v65, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 2945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.billing.BillingRepository$fetchSubscribeInfo$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((BillingRepository$fetchSubscribeInfo$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

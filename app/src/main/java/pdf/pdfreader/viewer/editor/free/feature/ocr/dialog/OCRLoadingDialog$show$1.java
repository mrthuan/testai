package pdf.pdfreader.viewer.editor.free.feature.ocr.dialog;

import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;
import wf.c;

/* compiled from: OCRLoadingDialog.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog$show$1", f = "OCRLoadingDialog.kt", l = {41, 43, 45}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRLoadingDialog$show$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;
    final /* synthetic */ OCRLoadingDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRLoadingDialog$show$1(OCRLoadingDialog oCRLoadingDialog, kotlin.coroutines.c<? super OCRLoadingDialog$show$1> cVar) {
        super(2, cVar);
        this.this$0 = oCRLoadingDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OCRLoadingDialog$show$1(this.this$0, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0091 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 2000(0x7d0, double:9.88E-321)
            r6 = 1
            if (r1 == 0) goto L26
            if (r1 == r6) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            androidx.activity.s.u0(r9)
            goto L92
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            androidx.activity.s.u0(r9)
            goto L70
        L22:
            androidx.activity.s.u0(r9)
            goto L4e
        L26:
            androidx.activity.s.u0(r9)
            pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog r9 = r8.this$0
            r1 = 0
            r9.f25057e = r1
            android.content.Context r1 = r9.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r7 = 2131952666(0x7f13041a, float:1.9541781E38)
            java.lang.String r1 = r1.getString(r7)
            java.lang.String r7 = "context.resources.getStr…g(R.string.recognizing_1)"
            kotlin.jvm.internal.g.d(r1, r7)
            pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog.p(r9, r1)
            r8.label = r6
            java.lang.Object r9 = kotlinx.coroutines.e0.a(r4, r8)
            if (r9 != r0) goto L4e
            return r0
        L4e:
            pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog r9 = r8.this$0
            android.content.Context r1 = r9.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r7 = 2131951918(0x7f13012e, float:1.9540264E38)
            java.lang.String r1 = r1.getString(r7)
            java.lang.String r7 = "context.resources.getStr…(R.string.extracting_gpt)"
            kotlin.jvm.internal.g.d(r1, r7)
            pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog.p(r9, r1)
            r8.label = r3
            java.lang.Object r9 = kotlinx.coroutines.e0.a(r4, r8)
            if (r9 != r0) goto L70
            return r0
        L70:
            pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog r9 = r8.this$0
            android.content.Context r1 = r9.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131951671(0x7f130037, float:1.9539763E38)
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r3 = "context.resources.getStr…g(R.string.adjusting_gpt)"
            kotlin.jvm.internal.g.d(r1, r3)
            pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog.p(r9, r1)
            r8.label = r2
            java.lang.Object r9 = kotlinx.coroutines.e0.a(r4, r8)
            if (r9 != r0) goto L92
            return r0
        L92:
            pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog r9 = r8.this$0
            android.content.Context r0 = r9.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131951910(0x7f130126, float:1.9540248E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "context.resources.getString(R.string.exporting_1)"
            kotlin.jvm.internal.g.d(r0, r1)
            pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog.p(r9, r0)
            pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog r9 = r8.this$0
            r9.f25057e = r6
            tf.d r9 = tf.d.f30009a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog$show$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((OCRLoadingDialog$show$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

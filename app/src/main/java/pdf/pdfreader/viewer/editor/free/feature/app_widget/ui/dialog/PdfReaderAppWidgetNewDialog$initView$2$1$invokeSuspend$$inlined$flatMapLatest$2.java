package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.activity.s;
import cg.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.l;
import kotlinx.coroutines.j0;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.IsIgnoredBrandUseCase;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetEdit2PDFLarge;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetEdit2PDFSmall;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetImg2PDFLarge;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetImg2PDFSmall;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetPDFTools1;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetPDFTools2;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetScan2PDFLarge;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetScan2PDFSmall;

/* compiled from: Merge.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog$initView$2$1$invokeSuspend$$inlined$flatMapLatest$2", f = "PdfReaderAppWidgetNewDialog.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PdfReaderAppWidgetNewDialog$initView$2$1$invokeSuspend$$inlined$flatMapLatest$2 extends SuspendLambda implements q<d<? super pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c>, Boolean, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ Activity $activity$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PdfReaderAppWidgetNewDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfReaderAppWidgetNewDialog$initView$2$1$invokeSuspend$$inlined$flatMapLatest$2(kotlin.coroutines.c cVar, PdfReaderAppWidgetNewDialog pdfReaderAppWidgetNewDialog, Activity activity) {
        super(3, cVar);
        this.this$0 = pdfReaderAppWidgetNewDialog;
        this.$activity$inlined = activity;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Class cls;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            d dVar = (d) this.L$0;
            boolean booleanValue = ((Boolean) this.L$1).booleanValue();
            PdfReaderAppWidgetNewDialog pdfReaderAppWidgetNewDialog = this.this$0;
            switch (pdfReaderAppWidgetNewDialog.L) {
                case 1:
                    cls = APPWidgetPDFTools2.class;
                    break;
                case 2:
                    cls = APPWidgetImg2PDFLarge.class;
                    break;
                case 3:
                    cls = APPWidgetScan2PDFLarge.class;
                    break;
                case 4:
                    cls = APPWidgetEdit2PDFLarge.class;
                    break;
                case 5:
                    cls = APPWidgetImg2PDFSmall.class;
                    break;
                case 6:
                    cls = APPWidgetScan2PDFSmall.class;
                    break;
                case 7:
                    cls = APPWidgetEdit2PDFSmall.class;
                    break;
                default:
                    cls = APPWidgetPDFTools1.class;
                    break;
            }
            PdfReaderAppWidgetNewDialog$initView$2$1$2$1 pdfReaderAppWidgetNewDialog$initView$2$1$2$1 = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog$initView$2$1$2$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }
            };
            ComponentName componentName = new ComponentName(pdfReaderAppWidgetNewDialog.getContext(), cls);
            Context context = pdfReaderAppWidgetNewDialog.getContext();
            g.d(context, ea.a.p("LG9fdBx4dA==", "stsW6y4V"));
            Context context2 = pdfReaderAppWidgetNewDialog.getContext();
            g.d(context2, ea.a.p("LG9fdBx4dA==", "ADrfCGG4"));
            pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.a aVar = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.a(context2, new IsIgnoredBrandUseCase());
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(pdfReaderAppWidgetNewDialog.getContext());
            g.d(appWidgetManager, ea.a.p("VGU_SR1zFmEcY1EoCm84dCF4Rik=", "bi03Q0zF"));
            pdfReaderAppWidgetNewDialog.N = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.g(context, aVar, appWidgetManager, componentName);
            final e eVar = new e(tf.d.f30009a);
            final PdfReaderAppWidgetNewDialog$addWidgetFlow$2 pdfReaderAppWidgetNewDialog$addWidgetFlow$2 = new PdfReaderAppWidgetNewDialog$addWidgetFlow$2(pdfReaderAppWidgetNewDialog, (androidx.appcompat.app.c) this.$activity$inlined, booleanValue, null);
            int i11 = l.f20129a;
            kotlinx.coroutines.flow.c o10 = aj.b.o(new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new PdfReaderAppWidgetNewDialog$addWidgetFlow$4(null), new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new PdfReaderAppWidgetNewDialog$addWidgetFlow$3(pdfReaderAppWidgetNewDialog$initView$2$1$2$1, null), new k(new kotlinx.coroutines.flow.c<kotlinx.coroutines.flow.c<Object>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass2<T> implements d {

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ d f20072a;

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ cg.p f20073b;

                    /* compiled from: Emitters.kt */
                    @wf.c(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", l = {223, 223}, m = "emit")
                    /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(kotlin.coroutines.c cVar) {
                            super(cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= SlideAtom.USES_MASTER_SLIDE_ID;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(d dVar, cg.p pVar) {
                        this.f20072a = dVar;
                        this.f20073b = pVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[RETURN] */
                    @Override // kotlinx.coroutines.flow.d
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.c r8) {
                        /*
                            r6 = this;
                            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r8
                            kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1
                            r0.<init>(r8)
                        L18:
                            java.lang.Object r8 = r0.result
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r2 = r0.label
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L3a
                            if (r2 == r4) goto L32
                            if (r2 != r3) goto L2a
                            androidx.activity.s.u0(r8)
                            goto L5b
                        L2a:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L32:
                            java.lang.Object r7 = r0.L$0
                            kotlinx.coroutines.flow.d r7 = (kotlinx.coroutines.flow.d) r7
                            androidx.activity.s.u0(r8)
                            goto L4f
                        L3a:
                            androidx.activity.s.u0(r8)
                            kotlinx.coroutines.flow.d r8 = r6.f20072a
                            r0.L$0 = r8
                            r0.label = r4
                            cg.p r2 = r6.f20073b
                            java.lang.Object r7 = r2.invoke(r7, r0)
                            if (r7 != r1) goto L4c
                            return r1
                        L4c:
                            r5 = r8
                            r8 = r7
                            r7 = r5
                        L4f:
                            r2 = 0
                            r0.L$0 = r2
                            r0.label = r3
                            java.lang.Object r7 = r7.emit(r8, r0)
                            if (r7 != r1) goto L5b
                            return r1
                        L5b:
                            tf.d r7 = tf.d.f30009a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.c
                public final Object a(d<? super c<Object>> dVar2, kotlin.coroutines.c cVar) {
                    Object a10 = eVar.a(new AnonymousClass2(dVar2, pdfReaderAppWidgetNewDialog$addWidgetFlow$2), cVar);
                    if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return a10;
                    }
                    return tf.d.f30009a;
                }
            }))), new PdfReaderAppWidgetNewDialog$addWidgetFlow$5(null)), j0.f20207b);
            this.label = 1;
            if (aj.b.m(this, o10, dVar) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.q
    public final Object invoke(d<? super pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c> dVar, Boolean bool, kotlin.coroutines.c<? super tf.d> cVar) {
        PdfReaderAppWidgetNewDialog$initView$2$1$invokeSuspend$$inlined$flatMapLatest$2 pdfReaderAppWidgetNewDialog$initView$2$1$invokeSuspend$$inlined$flatMapLatest$2 = new PdfReaderAppWidgetNewDialog$initView$2$1$invokeSuspend$$inlined$flatMapLatest$2(cVar, this.this$0, this.$activity$inlined);
        pdfReaderAppWidgetNewDialog$initView$2$1$invokeSuspend$$inlined$flatMapLatest$2.L$0 = dVar;
        pdfReaderAppWidgetNewDialog$initView$2$1$invokeSuspend$$inlined$flatMapLatest$2.L$1 = bool;
        return pdfReaderAppWidgetNewDialog$initView$2$1$invokeSuspend$$inlined$flatMapLatest$2.invokeSuspend(tf.d.f30009a);
    }
}

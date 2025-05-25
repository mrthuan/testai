package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import cg.p;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TryPinAppWidgetUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$1", f = "TryPinAppWidgetUseCase.kt", l = {85, 89}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TryPinAppWidgetUseCase$invoke$1 extends SuspendLambda implements p<kotlinx.coroutines.flow.d<? super Pair<? extends Boolean, ? extends int[]>>, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ boolean $shouldPinning;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TryPinAppWidgetUseCase$invoke$1(g gVar, boolean z10, kotlin.coroutines.c<? super TryPinAppWidgetUseCase$invoke$1> cVar) {
        super(2, cVar);
        this.this$0 = gVar;
        this.$shouldPinning = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        TryPinAppWidgetUseCase$invoke$1 tryPinAppWidgetUseCase$invoke$1 = new TryPinAppWidgetUseCase$invoke$1(this.this$0, this.$shouldPinning, cVar);
        tryPinAppWidgetUseCase$invoke$1.L$0 = obj;
        return tryPinAppWidgetUseCase$invoke$1;
    }

    @Override // cg.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.d<? super Pair<? extends Boolean, ? extends int[]>> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return invoke2((kotlinx.coroutines.flow.d<? super Pair<Boolean, int[]>>) dVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L1b
            if (r1 != r3) goto L13
            androidx.activity.s.u0(r11)
            goto Laf
        L13:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1b:
            java.lang.Object r1 = r10.L$1
            int[] r1 = (int[]) r1
            java.lang.Object r6 = r10.L$0
            kotlinx.coroutines.flow.d r6 = (kotlinx.coroutines.flow.d) r6
            androidx.activity.s.u0(r11)
            goto L8e
        L27:
            androidx.activity.s.u0(r11)
            java.lang.Object r11 = r10.L$0
            r6 = r11
            kotlinx.coroutines.flow.d r6 = (kotlinx.coroutines.flow.d) r6
            pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.g r11 = r10.this$0
            android.appwidget.AppWidgetManager r1 = r11.c
            android.content.ComponentName r11 = r11.f24821d
            int[] r1 = r1.getAppWidgetIds(r11)
            boolean r11 = r10.$shouldPinning
            if (r11 == 0) goto L97
            pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.g r11 = r10.this$0
            pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.a r11 = r11.f24820b
            pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.IsIgnoredBrandUseCase r7 = r11.f24806b
            r7.getClass()
            boolean r7 = pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.IsIgnoredBrandUseCase.a()
            if (r7 == 0) goto L4d
            goto L73
        L4d:
            tf.c r7 = pdf.pdfreader.viewer.editor.free.feature.app_widget.utils.ShortcutPermissionExtKt.f24844a
            java.lang.String r7 = "<this>"
            android.content.Context r11 = r11.f24805a
            kotlin.jvm.internal.g.e(r11, r7)
            pdf.pdfreader.viewer.editor.free.feature.app_widget.utils.ShortcutPermissionState r7 = pdf.pdfreader.viewer.editor.free.feature.app_widget.utils.ShortcutPermissionExtKt.c(r11)
            pdf.pdfreader.viewer.editor.free.feature.app_widget.utils.ShortcutPermissionState r8 = pdf.pdfreader.viewer.editor.free.feature.app_widget.utils.ShortcutPermissionState.ALLOW
            if (r7 != r8) goto L60
            r7 = r5
            goto L61
        L60:
            r7 = r2
        L61:
            if (r7 != 0) goto L64
            goto L73
        L64:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r7 < r8) goto L73
            android.appwidget.AppWidgetManager r11 = android.appwidget.AppWidgetManager.getInstance(r11)
            boolean r11 = c4.h.u(r11)
            goto L74
        L73:
            r11 = r2
        L74:
            if (r11 == 0) goto L97
            pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.g r11 = r10.this$0
            android.content.ComponentName r7 = r11.f24821d
            r10.L$0 = r6
            r10.L$1 = r1
            r10.label = r5
            lg.a r8 = kotlinx.coroutines.j0.f20207b
            pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$requestPinAppWidget$2 r9 = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$requestPinAppWidget$2
            r9.<init>(r11, r7, r4)
            java.lang.Object r11 = pdf.pdfreader.viewer.editor.free.utils.t0.w0(r8, r9, r10)
            if (r11 != r0) goto L8e
            return r0
        L8e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L97
            r2 = r5
        L97:
            java.lang.String r11 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a
            kotlin.Pair r11 = new kotlin.Pair
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r11.<init>(r2, r1)
            r10.L$0 = r4
            r10.L$1 = r4
            r10.label = r3
            java.lang.Object r11 = r6.emit(r11, r10)
            if (r11 != r0) goto Laf
            return r0
        Laf:
            tf.d r11 = tf.d.f30009a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(kotlinx.coroutines.flow.d<? super Pair<Boolean, int[]>> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((TryPinAppWidgetUseCase$invoke$1) create(dVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

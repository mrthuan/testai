package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import android.app.Activity;
import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import cg.q;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.t;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.j0;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* compiled from: Merge.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$$inlined$flatMapLatest$1", f = "TryPinAppWidgetUseCase.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TryPinAppWidgetUseCase$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements q<kotlinx.coroutines.flow.d<? super c>, Pair<? extends Boolean, ? extends int[]>, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ Activity $activity$inlined;
    final /* synthetic */ boolean $callInMyScreen$inlined;
    final /* synthetic */ kotlinx.coroutines.flow.c $lifecycleEventFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TryPinAppWidgetUseCase$invoke$$inlined$flatMapLatest$1(kotlin.coroutines.c cVar, g gVar, Activity activity, kotlinx.coroutines.flow.c cVar2, boolean z10) {
        super(3, cVar);
        this.this$0 = gVar;
        this.$activity$inlined = activity;
        this.$lifecycleEventFlow$inlined = cVar2;
        this.$callInMyScreen$inlined = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.flow.c o10;
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
            kotlinx.coroutines.flow.d dVar = (kotlinx.coroutines.flow.d) this.L$0;
            Pair pair = (Pair) this.L$1;
            boolean booleanValue = ((Boolean) pair.component1()).booleanValue();
            int[] iArr = (int[]) pair.component2();
            String str = n0.f28727a;
            if (!booleanValue) {
                g gVar = this.this$0;
                Activity activity = this.$activity$inlined;
                gVar.getClass();
                activity.runOnUiThread(new k0.a(activity, 1));
                o10 = new kotlinx.coroutines.flow.e(new c.b(0));
            } else {
                t tVar = new t(new TryPinAppWidgetUseCase$invoke$2$timeoutFlow$1(null));
                final FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new TryPinAppWidgetUseCase$invoke$2$resumeFlow$2(null), aj.b.i(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new TryPinAppWidgetUseCase$invoke$2$resumeFlow$1(null), this.$lifecycleEventFlow$inlined), -1));
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new TryPinAppWidgetUseCase$invoke$2$2(this.this$0, this.$activity$inlined, null), new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(new p(tVar, new kotlinx.coroutines.flow.c<Lifecycle.Event>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$lambda$1$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$lambda$1$$inlined$filter$1$2  reason: invalid class name */
                    /* loaded from: classes3.dex */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.d {

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ kotlinx.coroutines.flow.d f24804a;

                        /* compiled from: Emitters.kt */
                        @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$lambda$1$$inlined$filter$1$2", f = "TryPinAppWidgetUseCase.kt", l = {223}, m = "emit")
                        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$lambda$1$$inlined$filter$1$2$1  reason: invalid class name */
                        /* loaded from: classes3.dex */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
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

                        public AnonymousClass2(kotlinx.coroutines.flow.d dVar) {
                            this.f24804a = dVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                        @Override // kotlinx.coroutines.flow.d
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.c r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$lambda$1$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$lambda$1$$inlined$filter$1$2$1 r0 = (pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$lambda$1$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$lambda$1$$inlined$filter$1$2$1 r0 = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$lambda$1$$inlined$filter$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                androidx.activity.s.u0(r6)
                                goto L49
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                androidx.activity.s.u0(r6)
                                r6 = r5
                                androidx.lifecycle.Lifecycle$Event r6 = (androidx.lifecycle.Lifecycle.Event) r6
                                androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                                if (r6 != r2) goto L3b
                                r6 = r3
                                goto L3c
                            L3b:
                                r6 = 0
                            L3c:
                                if (r6 == 0) goto L49
                                r0.label = r3
                                kotlinx.coroutines.flow.d r6 = r4.f24804a
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L49
                                return r1
                            L49:
                                tf.d r5 = tf.d.f30009a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$lambda$1$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.c
                    public final Object a(kotlinx.coroutines.flow.d<? super Lifecycle.Event> dVar2, kotlin.coroutines.c cVar) {
                        Object a10 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1.a(new AnonymousClass2(dVar2), cVar);
                        if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            return a10;
                        }
                        return tf.d.f30009a;
                    }
                }, new TryPinAppWidgetUseCase$invoke$2$1(this.this$0, iArr, this.$callInMyScreen$inlined, null))));
                lg.b bVar = j0.f20206a;
                o10 = aj.b.o(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, l.f20194a);
            }
            this.label = 1;
            if (aj.b.m(this, o10, dVar) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.q
    public final Object invoke(kotlinx.coroutines.flow.d<? super c> dVar, Pair<? extends Boolean, ? extends int[]> pair, kotlin.coroutines.c<? super tf.d> cVar) {
        TryPinAppWidgetUseCase$invoke$$inlined$flatMapLatest$1 tryPinAppWidgetUseCase$invoke$$inlined$flatMapLatest$1 = new TryPinAppWidgetUseCase$invoke$$inlined$flatMapLatest$1(cVar, this.this$0, this.$activity$inlined, this.$lifecycleEventFlow$inlined, this.$callInMyScreen$inlined);
        tryPinAppWidgetUseCase$invoke$$inlined$flatMapLatest$1.L$0 = dVar;
        tryPinAppWidgetUseCase$invoke$$inlined$flatMapLatest$1.L$1 = pair;
        return tryPinAppWidgetUseCase$invoke$$inlined$flatMapLatest$1.invokeSuspend(tf.d.f30009a);
    }
}

package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: SubscriptionAIJ1Activity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionAIJ1Activity$reinitScrollTask$1", f = "SubscriptionAIJ1Activity.kt", l = {ShapeTypes.FLOW_CHART_MAGNETIC_DISK}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SubscriptionAIJ1Activity$reinitScrollTask$1 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ SubscriptionAIJ1Activity this$0;

    /* compiled from: SubscriptionAIJ1Activity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionAIJ1Activity$reinitScrollTask$1$1", f = "SubscriptionAIJ1Activity.kt", l = {ShapeTypes.FLOW_CHART_DISPLAY}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionAIJ1Activity$reinitScrollTask$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
        int label;
        final /* synthetic */ SubscriptionAIJ1Activity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SubscriptionAIJ1Activity subscriptionAIJ1Activity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = subscriptionAIJ1Activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:12:0x0025). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L16
                if (r1 != r2) goto Le
                androidx.activity.s.u0(r8)
                r8 = r7
                goto L25
            Le:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L16:
                androidx.activity.s.u0(r8)
                r8 = r7
            L1a:
                r8.label = r2
                r3 = 5000(0x1388, double:2.4703E-320)
                java.lang.Object r1 = kotlinx.coroutines.e0.a(r3, r8)
                if (r1 != r0) goto L25
                return r0
            L25:
                pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionAIJ1Activity r1 = r8.this$0
                pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionAIJ1Activity$a r3 = pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionAIJ1Activity.Z
                r1.getClass()
                java.lang.String r3 = "YHUpcxByC3AGaVtuLWEkaxBlQXRK"
                java.lang.String r4 = "SnYw5T5g"
                ea.a.p(r3, r4)
                java.lang.String r3 = "QGM5bx9sNGkXd2RhDmVy"
                java.lang.String r4 = "nj0jV5tQ"
                ea.a.p(r3, r4)
                am.x r3 = r1.M2()
                androidx.viewpager2.widget.ViewPager2 r3 = r3.f1624p
                androidx.recyclerview.widget.RecyclerView$Adapter r3 = r3.getAdapter()
                if (r3 == 0) goto L1a
                am.x r4 = r1.M2()
                androidx.viewpager2.widget.ViewPager2 r4 = r4.f1624p
                int r4 = r4.getCurrentItem()
                int r3 = r3.getItemCount()
                int r3 = r3 + (-1)
                if (r4 >= r3) goto L6f
                am.x r3 = r1.M2()
                androidx.viewpager2.widget.ViewPager2 r3 = r3.f1624p
                java.lang.String r5 = "LWlfZBBuUC4saS93JWEPZXI="
                java.lang.String r6 = "lePRT84n"
                java.lang.String r5 = ea.a.p(r5, r6)
                kotlin.jvm.internal.g.d(r3, r5)
                int r4 = r4 + 1
                r1.O2(r4, r3)
                goto L1a
            L6f:
                am.x r3 = r1.M2()
                androidx.viewpager2.widget.ViewPager2 r3 = r3.f1624p
                java.lang.String r4 = "Emk7ZDhuUC4-aQN3ZGEwZXI="
                java.lang.String r5 = "ANpUQ7Nz"
                java.lang.String r4 = ea.a.p(r4, r5)
                kotlin.jvm.internal.g.d(r3, r4)
                r4 = 0
                r1.O2(r4, r3)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionAIJ1Activity$reinitScrollTask$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // cg.p
        public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionAIJ1Activity$reinitScrollTask$1(SubscriptionAIJ1Activity subscriptionAIJ1Activity, kotlin.coroutines.c<? super SubscriptionAIJ1Activity$reinitScrollTask$1> cVar) {
        super(2, cVar);
        this.this$0 = subscriptionAIJ1Activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SubscriptionAIJ1Activity$reinitScrollTask$1(this.this$0, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            Lifecycle lifecycle = this.this$0.getLifecycle();
            kotlin.jvm.internal.g.d(lifecycle, "lifecycle");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((SubscriptionAIJ1Activity$reinitScrollTask$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

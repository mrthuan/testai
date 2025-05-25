package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.r;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.feature.billing.vm.SubscriptionViewModel;

/* compiled from: BaseSubscriptionActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$initViewModel$2", f = "BaseSubscriptionActivity.kt", l = {ShapeTypes.CHART_PLUS, 194}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseSubscriptionActivity$initViewModel$2 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ BaseSubscriptionActivity this$0;

    /* compiled from: BaseSubscriptionActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$initViewModel$2$1", f = "BaseSubscriptionActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$initViewModel$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<ol.d, kotlin.coroutines.c<? super tf.d>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseSubscriptionActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseSubscriptionActivity baseSubscriptionActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = baseSubscriptionActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ol.d dVar;
            boolean z10;
            Object obj2;
            boolean z11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                s.u0(obj);
                ol.d newInfo = (ol.d) this.L$0;
                BaseSubscriptionActivity baseSubscriptionActivity = this.this$0;
                if (baseSubscriptionActivity.f24887u) {
                    BaseSubscriptionActivity.L.getClass();
                    dVar = BaseSubscriptionActivity.R;
                } else {
                    dVar = newInfo;
                }
                baseSubscriptionActivity.u2(dVar);
                SubscriptionViewModel j22 = this.this$0.j2();
                if (this.this$0.f24887u) {
                    BaseSubscriptionActivity.L.getClass();
                    newInfo = BaseSubscriptionActivity.R;
                }
                kotlin.jvm.internal.g.e(newInfo, "newInfo");
                j22.f24958n = newInfo;
                StateFlowImpl stateFlowImpl = j22.f24954j;
                pm.a aVar = (pm.a) stateFlowImpl.b();
                Iterator<T> it = newInfo.c.iterator();
                while (true) {
                    z10 = false;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((ol.i) obj2).f23489a == SubscriptionType.YEAR_TRIAL_3D) {
                            z11 = true;
                            continue;
                        } else {
                            z11 = false;
                            continue;
                        }
                        if (z11) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if (obj2 != null) {
                    z10 = true;
                }
                stateFlowImpl.setValue(pm.a.a(aVar, null, z10, 1));
                return tf.d.f30009a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // cg.p
        public final Object invoke(ol.d dVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* compiled from: BaseSubscriptionActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$initViewModel$2$2", f = "BaseSubscriptionActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$initViewModel$2$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements cg.p<ol.d, kotlin.coroutines.c<? super tf.d>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseSubscriptionActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BaseSubscriptionActivity baseSubscriptionActivity, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = baseSubscriptionActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ol.d dVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                s.u0(obj);
                ol.d dVar2 = (ol.d) this.L$0;
                BaseSubscriptionActivity baseSubscriptionActivity = this.this$0;
                if (baseSubscriptionActivity.f24887u) {
                    BaseSubscriptionActivity.L.getClass();
                    dVar = BaseSubscriptionActivity.R;
                } else {
                    dVar = dVar2;
                }
                baseSubscriptionActivity.u2(dVar);
                SubscriptionViewModel j22 = this.this$0.j2();
                if (this.this$0.f24887u) {
                    BaseSubscriptionActivity.L.getClass();
                    dVar2 = BaseSubscriptionActivity.R;
                }
                j22.i(dVar2, this.this$0.f24891y);
                return tf.d.f30009a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // cg.p
        public final Object invoke(ol.d dVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass2) create(dVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSubscriptionActivity$initViewModel$2(BaseSubscriptionActivity baseSubscriptionActivity, kotlin.coroutines.c<? super BaseSubscriptionActivity$initViewModel$2> cVar) {
        super(2, cVar);
        this.this$0 = baseSubscriptionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BaseSubscriptionActivity$initViewModel$2(this.this$0, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r rVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.u0(obj);
        } else {
            s.u0(obj);
            BaseSubscriptionActivity baseSubscriptionActivity = this.this$0;
            if (baseSubscriptionActivity instanceof SubscriptionBlackFridayActivity) {
                SubscriptionViewModel j22 = baseSubscriptionActivity.j2();
                Lifecycle lifecycle = this.this$0.getLifecycle();
                kotlin.jvm.internal.g.d(lifecycle, "lifecycle");
                CallbackFlowBuilder a10 = androidx.lifecycle.g.a(j22.f24953i, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (aj.b.k(a10, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                SubscriptionViewModel j23 = baseSubscriptionActivity.j2();
                String plan = this.this$0.f24891y;
                kotlin.jvm.internal.g.e(plan, "plan");
                if (kotlin.jvm.internal.g.a(plan, ea.a.p("DDI=", "HsDK9c9B"))) {
                    rVar = j23.f24952h;
                } else {
                    rVar = j23.f24951g;
                }
                Lifecycle lifecycle2 = this.this$0.getLifecycle();
                kotlin.jvm.internal.g.d(lifecycle2, "lifecycle");
                CallbackFlowBuilder a11 = androidx.lifecycle.g.a(rVar, lifecycle2, Lifecycle.State.STARTED);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 2;
                if (aj.b.k(a11, anonymousClass2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((BaseSubscriptionActivity$initViewModel$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import androidx.activity.s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.state.SubscriptionRetainPage;
import pm.b;

/* compiled from: BaseAISubscriptionActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity$initViewModel$1", f = "BaseAISubscriptionActivity.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseAISubscriptionActivity$initViewModel$1 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ BaseAISubscriptionActivity this$0;

    /* compiled from: BaseAISubscriptionActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity$initViewModel$1$1", f = "BaseAISubscriptionActivity.kt", l = {110}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity$initViewModel$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
        int label;
        final /* synthetic */ BaseAISubscriptionActivity this$0;

        /* compiled from: BaseAISubscriptionActivity.kt */
        @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity$initViewModel$1$1$1", f = "BaseAISubscriptionActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity$initViewModel$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C03361 extends SuspendLambda implements cg.p<pm.b, kotlin.coroutines.c<? super tf.d>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ BaseAISubscriptionActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03361(BaseAISubscriptionActivity baseAISubscriptionActivity, kotlin.coroutines.c<? super C03361> cVar) {
                super(2, cVar);
                this.this$0 = baseAISubscriptionActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
                C03361 c03361 = new C03361(this.this$0, cVar);
                c03361.L$0 = obj;
                return c03361;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str;
                SubscriptionType subscriptionType;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    s.u0(obj);
                    pm.b bVar = (pm.b) this.L$0;
                    Object obj2 = null;
                    if (bVar instanceof b.a) {
                        List<Fragment> H = this.this$0.getSupportFragmentManager().H();
                        kotlin.jvm.internal.g.d(H, "supportFragmentManager.fragments");
                        Iterator<T> it = H.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((Fragment) next) instanceof SubscriptionRetainFragment) {
                                obj2 = next;
                                break;
                            }
                        }
                        Fragment fragment = (Fragment) obj2;
                        if (((b.a) bVar).f28975a == SubscriptionRetainPage.FREE_TRIAL_RETAIN && (fragment instanceof SubscriptionRetainFragment)) {
                            SubscriptionRetainFragment subscriptionRetainFragment = (SubscriptionRetainFragment) fragment;
                            this.this$0.t2(subscriptionRetainFragment.f24918e0, subscriptionRetainFragment.f24917d0);
                            if (kotlin.jvm.internal.g.a(subscriptionRetainFragment.f3692y, "SubscriptionRetain")) {
                                this.this$0.finish();
                            } else {
                                g0 supportFragmentManager = this.this$0.getSupportFragmentManager();
                                kotlin.jvm.internal.g.d(supportFragmentManager, "supportFragmentManager");
                                ge.a.R(supportFragmentManager, fragment);
                            }
                        } else {
                            this.this$0.p2();
                        }
                    } else if (kotlin.jvm.internal.g.a(bVar, b.C0364b.f28976a)) {
                        this.this$0.n2();
                    } else if (kotlin.jvm.internal.g.a(bVar, b.c.f28977a)) {
                        this.this$0.o2();
                    } else if (kotlin.jvm.internal.g.a(bVar, b.d.f28978a)) {
                        this.this$0.r2();
                    } else if (!(bVar instanceof b.h)) {
                        String str2 = "close";
                        if (bVar instanceof b.g) {
                            BaseAISubscriptionActivity baseAISubscriptionActivity = this.this$0;
                            baseAISubscriptionActivity.f24892z = true;
                            b.g gVar = (b.g) bVar;
                            if (!gVar.f28983b) {
                                str2 = "notpay";
                            }
                            String str3 = gVar.f28982a;
                            tn.a.d(baseAISubscriptionActivity, "iap", "iapretain_show", baseAISubscriptionActivity.g2(str2, str3, false), false);
                            BaseAISubscriptionActivity baseAISubscriptionActivity2 = this.this$0;
                            tn.a.d(baseAISubscriptionActivity2, "iap", "iapretain_show", baseAISubscriptionActivity2.g2(str2, str3, true), false);
                        } else if (bVar instanceof b.e) {
                            g0 supportFragmentManager2 = this.this$0.getSupportFragmentManager();
                            kotlin.jvm.internal.g.d(supportFragmentManager2, "supportFragmentManager");
                            b.e eVar = (b.e) bVar;
                            ge.a.R(supportFragmentManager2, eVar.f28979a);
                            boolean z10 = eVar.c;
                            if (z10) {
                                str = "close";
                            } else {
                                str = "notpay";
                            }
                            BaseAISubscriptionActivity baseAISubscriptionActivity3 = this.this$0;
                            BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                            String str4 = eVar.f28980b;
                            tn.a.d(baseAISubscriptionActivity3, "iap", "iapretain_start_click", baseAISubscriptionActivity3.g2(str, str4, false), false);
                            BaseAISubscriptionActivity baseAISubscriptionActivity4 = this.this$0;
                            tn.a.d(baseAISubscriptionActivity4, "iap", "iapretain_start_click", baseAISubscriptionActivity4.g2(str, str4, true), false);
                            if (z10) {
                                BaseAISubscriptionActivity baseAISubscriptionActivity5 = this.this$0;
                                SubscriptionType subscriptionType2 = SubscriptionType.YEAR_TRIAL_7D;
                                baseAISubscriptionActivity5.J = subscriptionType2;
                                baseAISubscriptionActivity5.w2(subscriptionType2, "close");
                            } else {
                                BaseAISubscriptionActivity baseAISubscriptionActivity6 = this.this$0;
                                if (baseAISubscriptionActivity6.C) {
                                    subscriptionType = SubscriptionType.YEAR_TRIAL_7D;
                                } else {
                                    subscriptionType = SubscriptionType.YEAR_TRIAL_14D;
                                }
                                baseAISubscriptionActivity6.J = subscriptionType;
                                baseAISubscriptionActivity6.w2(subscriptionType, "notpay");
                            }
                        } else if (bVar instanceof b.f) {
                            BaseAISubscriptionActivity baseAISubscriptionActivity7 = this.this$0;
                            b.f fVar = (b.f) bVar;
                            SubscriptionRetainFragment subscriptionRetainFragment2 = fVar.f28981a;
                            baseAISubscriptionActivity7.t2(subscriptionRetainFragment2.f24918e0, subscriptionRetainFragment2.f24917d0);
                            g0 supportFragmentManager3 = this.this$0.getSupportFragmentManager();
                            kotlin.jvm.internal.g.d(supportFragmentManager3, "supportFragmentManager");
                            ge.a.R(supportFragmentManager3, fVar.f28981a);
                        }
                    } else {
                        BaseAISubscriptionActivity baseAISubscriptionActivity8 = this.this$0;
                        ((b.h) bVar).getClass();
                        baseAISubscriptionActivity8.y2(null);
                        throw null;
                    }
                    return tf.d.f30009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // cg.p
            public final Object invoke(pm.b bVar, kotlin.coroutines.c<? super tf.d> cVar) {
                return ((C03361) create(bVar, cVar)).invokeSuspend(tf.d.f30009a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseAISubscriptionActivity baseAISubscriptionActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = baseAISubscriptionActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
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
                v vVar = this.this$0.j2().f24949e;
                C03361 c03361 = new C03361(this.this$0, null);
                this.label = 1;
                if (aj.b.k(vVar, c03361, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return tf.d.f30009a;
        }

        @Override // cg.p
        public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAISubscriptionActivity$initViewModel$1(BaseAISubscriptionActivity baseAISubscriptionActivity, kotlin.coroutines.c<? super BaseAISubscriptionActivity$initViewModel$1> cVar) {
        super(2, cVar);
        this.this$0 = baseAISubscriptionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BaseAISubscriptionActivity$initViewModel$1(this.this$0, cVar);
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
        return ((BaseAISubscriptionActivity$initViewModel$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

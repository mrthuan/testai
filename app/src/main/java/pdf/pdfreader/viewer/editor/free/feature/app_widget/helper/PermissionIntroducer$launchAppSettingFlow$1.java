package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import android.content.Intent;
import androidx.activity.s;
import cg.l;
import cg.p;
import cg.q;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.j;
import kotlinx.coroutines.y0;

/* compiled from: PermissionIntroducer.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.PermissionIntroducer$launchAppSettingFlow$1", f = "PermissionIntroducer.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PermissionIntroducer$launchAppSettingFlow$1 extends SuspendLambda implements p<j<? super androidx.activity.result.a>, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ l<Boolean, tf.d> $callback;
    final /* synthetic */ Intent $fallback;
    final /* synthetic */ Intent $intent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* compiled from: PermissionIntroducer.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.PermissionIntroducer$launchAppSettingFlow$1$1", f = "PermissionIntroducer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.PermissionIntroducer$launchAppSettingFlow$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements q<tf.d, androidx.activity.result.a, kotlin.coroutines.c<? super kotlinx.coroutines.channels.f<? extends tf.d>>, Object> {
        final /* synthetic */ j<androidx.activity.result.a> $$this$callbackFlow;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(b bVar, j<? super androidx.activity.result.a> jVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.this$0 = bVar;
            this.$$this$callbackFlow = jVar;
        }

        @Override // cg.q
        public /* bridge */ /* synthetic */ Object invoke(tf.d dVar, androidx.activity.result.a aVar, kotlin.coroutines.c<? super kotlinx.coroutines.channels.f<? extends tf.d>> cVar) {
            return invoke2(dVar, aVar, (kotlin.coroutines.c<? super kotlinx.coroutines.channels.f<tf.d>>) cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                s.u0(obj);
                androidx.activity.result.a aVar = (androidx.activity.result.a) this.L$0;
                y0 y0Var = this.this$0.c;
                if (y0Var != null) {
                    y0Var.b(null);
                }
                this.this$0.c = null;
                return new kotlinx.coroutines.channels.f(this.$$this$callbackFlow.v(aVar));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(tf.d dVar, androidx.activity.result.a aVar, kotlin.coroutines.c<? super kotlinx.coroutines.channels.f<tf.d>> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$callbackFlow, cVar);
            anonymousClass1.L$0 = aVar;
            return anonymousClass1.invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PermissionIntroducer$launchAppSettingFlow$1(b bVar, Intent intent, l<? super Boolean, tf.d> lVar, Intent intent2, kotlin.coroutines.c<? super PermissionIntroducer$launchAppSettingFlow$1> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
        this.$fallback = intent;
        this.$callback = lVar;
        this.$intent = intent2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PermissionIntroducer$launchAppSettingFlow$1 permissionIntroducer$launchAppSettingFlow$1 = new PermissionIntroducer$launchAppSettingFlow$1(this.this$0, this.$fallback, this.$callback, this.$intent, cVar);
        permissionIntroducer$launchAppSettingFlow$1.L$0 = obj;
        return permissionIntroducer$launchAppSettingFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m13constructorimpl;
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
            j jVar = (j) this.L$0;
            kotlinx.coroutines.flow.f.a(new kotlinx.coroutines.flow.internal.f(new kotlinx.coroutines.flow.a(this.this$0.f24807a, false), new kotlinx.coroutines.flow.e(tf.d.f30009a), new AnonymousClass1(this.this$0, jVar, null)), jVar);
            if (this.$fallback != null) {
                b bVar = this.this$0;
                try {
                    bVar.f24808b.a(this.$intent);
                    m13constructorimpl = Result.m13constructorimpl(Boolean.TRUE);
                } catch (Throwable th2) {
                    m13constructorimpl = Result.m13constructorimpl(s.v(th2));
                }
                b bVar2 = this.this$0;
                Intent intent = this.$fallback;
                if (Result.m16exceptionOrNullimpl(m13constructorimpl) != null) {
                    bVar2.f24808b.a(intent);
                    m13constructorimpl = Boolean.FALSE;
                }
                boolean booleanValue = ((Boolean) m13constructorimpl).booleanValue();
                l<Boolean, tf.d> lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(Boolean.valueOf(booleanValue));
                }
            } else {
                this.this$0.f24808b.a(this.$intent);
                l<Boolean, tf.d> lVar2 = this.$callback;
                if (lVar2 != null) {
                    lVar2.invoke(Boolean.TRUE);
                }
            }
            AnonymousClass2 anonymousClass2 = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.PermissionIntroducer$launchAppSettingFlow$1.2
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }
            };
            this.label = 1;
            if (ProduceKt.a(jVar, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(j<? super androidx.activity.result.a> jVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((PermissionIntroducer$launchAppSettingFlow$1) create(jVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

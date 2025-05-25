package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.s.network.NetworkType;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity;

/* compiled from: AIHomeActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$initViewModel$1", f = "AIHomeActivity.kt", l = {112}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AIHomeActivity$initViewModel$1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ AIHomeActivity this$0;

    /* compiled from: AIHomeActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$initViewModel$1$1", f = "AIHomeActivity.kt", l = {121}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$initViewModel$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
        int label;
        final /* synthetic */ AIHomeActivity this$0;

        /* compiled from: AIHomeActivity.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$initViewModel$1$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AIHomeActivity f24412a;

            public a(AIHomeActivity aIHomeActivity) {
                this.f24412a = aIHomeActivity;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                boolean z10;
                String string;
                NetworkType networkType = (NetworkType) obj;
                AIHomeActivity.a aVar = AIHomeActivity.J;
                AIHomeActivity aIHomeActivity = this.f24412a;
                TextView textView = aIHomeActivity.k2().f826d.f866f;
                if (networkType != NetworkType.NETWORK_NULL) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                textView.setSelected(z10);
                TextView textView2 = aIHomeActivity.k2().f826d.f866f;
                if (aIHomeActivity.k2().f826d.f866f.isSelected()) {
                    string = aIHomeActivity.getString(R.string.arg_res_0x7f1302e9);
                } else {
                    string = aIHomeActivity.getString(R.string.arg_res_0x7f1302e0);
                }
                textView2.setText(string);
                return tf.d.f30009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AIHomeActivity aIHomeActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = aIHomeActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String string;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.activity.s.u0(obj);
            } else {
                androidx.activity.s.u0(obj);
                AIHomeActivity aIHomeActivity = this.this$0;
                AIHomeActivity.a aVar = AIHomeActivity.J;
                aIHomeActivity.k2().f826d.f866f.setSelected(cl.b.b(this.this$0));
                TextView textView = this.this$0.k2().f826d.f866f;
                if (this.this$0.k2().f826d.f866f.isSelected()) {
                    string = this.this$0.getString(R.string.arg_res_0x7f1302e9);
                } else {
                    string = this.this$0.getString(R.string.arg_res_0x7f1302e0);
                }
                textView.setText(string);
                kotlinx.coroutines.flow.v vVar = ReaderPdfApplication.k().f28153j;
                a aVar2 = new a(this.this$0);
                this.label = 1;
                vVar.getClass();
                if (kotlinx.coroutines.flow.v.n(vVar, aVar2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // cg.p
        public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIHomeActivity$initViewModel$1(AIHomeActivity aIHomeActivity, kotlin.coroutines.c<? super AIHomeActivity$initViewModel$1> cVar) {
        super(2, cVar);
        this.this$0 = aIHomeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AIHomeActivity$initViewModel$1(this.this$0, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                androidx.activity.s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            androidx.activity.s.u0(obj);
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
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((AIHomeActivity$initViewModel$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

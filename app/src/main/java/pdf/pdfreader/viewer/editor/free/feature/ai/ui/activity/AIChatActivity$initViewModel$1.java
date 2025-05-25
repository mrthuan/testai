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

/* compiled from: AIChatActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initViewModel$1", f = "AIChatActivity.kt", l = {249}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AIChatActivity$initViewModel$1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ AIChatActivity this$0;

    /* compiled from: AIChatActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initViewModel$1$1", f = "AIChatActivity.kt", l = {257}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initViewModel$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
        int label;
        final /* synthetic */ AIChatActivity this$0;

        /* compiled from: AIChatActivity.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initViewModel$1$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AIChatActivity f24388a;

            public a(AIChatActivity aIChatActivity) {
                this.f24388a = aIChatActivity;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                String string;
                boolean z10;
                NetworkType networkType = (NetworkType) obj;
                AIChatActivity aIChatActivity = this.f24388a;
                TextView textView = aIChatActivity.A;
                boolean z11 = true;
                if (textView != null) {
                    if (networkType != NetworkType.NETWORK_NULL) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    textView.setSelected(z10);
                }
                TextView textView2 = aIChatActivity.A;
                if (textView2 != null) {
                    if (!textView2.isSelected()) {
                        z11 = false;
                    }
                    if (z11) {
                        string = aIChatActivity.getString(R.string.arg_res_0x7f1302e9);
                    } else {
                        string = aIChatActivity.getString(R.string.arg_res_0x7f1302e0);
                    }
                    textView2.setText(string);
                }
                return tf.d.f30009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AIChatActivity aIChatActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = aIChatActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
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
                AIChatActivity aIChatActivity = this.this$0;
                TextView textView = aIChatActivity.A;
                if (textView != null) {
                    textView.setSelected(cl.b.b(aIChatActivity));
                }
                TextView textView2 = this.this$0.A;
                if (textView2 != null) {
                    if (textView2.isSelected()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        string = this.this$0.getString(R.string.arg_res_0x7f1302e9);
                    } else {
                        string = this.this$0.getString(R.string.arg_res_0x7f1302e0);
                    }
                    textView2.setText(string);
                }
                kotlinx.coroutines.flow.v vVar = ReaderPdfApplication.k().f28153j;
                a aVar = new a(this.this$0);
                this.label = 1;
                vVar.getClass();
                if (kotlinx.coroutines.flow.v.n(vVar, aVar, this) == coroutineSingletons) {
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
    public AIChatActivity$initViewModel$1(AIChatActivity aIChatActivity, kotlin.coroutines.c<? super AIChatActivity$initViewModel$1> cVar) {
        super(2, cVar);
        this.this$0 = aIChatActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AIChatActivity$initViewModel$1(this.this$0, cVar);
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
        return ((AIChatActivity$initViewModel$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

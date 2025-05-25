package pdf.pdfreader.viewer.editor.free.ui.act;

import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: RecentAddedActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$initViewModel$3", f = "RecentAddedActivity.kt", l = {886}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RecentAddedActivity$initViewModel$3 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ kotlinx.coroutines.flow.a0<List<PdfPreviewEntity>> $dataWatcher;
    int label;
    final /* synthetic */ RecentAddedActivity this$0;

    /* compiled from: RecentAddedActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$initViewModel$3$1", f = "RecentAddedActivity.kt", l = {887}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$initViewModel$3$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.a0<List<PdfPreviewEntity>> $dataWatcher;
        int label;
        final /* synthetic */ RecentAddedActivity this$0;

        /* compiled from: RecentAddedActivity.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$initViewModel$3$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RecentAddedActivity f26871a;

            public a(RecentAddedActivity recentAddedActivity) {
                this.f26871a = recentAddedActivity;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                List list = (List) obj;
                List list2 = list;
                if (!list2.isEmpty()) {
                    RecentAddedActivity recentAddedActivity = this.f26871a;
                    recentAddedActivity.f26854c0.clear();
                    recentAddedActivity.f26854c0.addAll(list2);
                    boolean isEmpty = list.isEmpty();
                    tf.c cVar2 = recentAddedActivity.N;
                    if (isEmpty) {
                        ((TextView) cVar2.getValue()).setVisibility(8);
                    } else {
                        ((TextView) cVar2.getValue()).setVisibility(0);
                        ((TextView) cVar2.getValue()).setText(recentAddedActivity.getString(R.string.arg_res_0x7f1304d9, String.valueOf(list.size())));
                    }
                    pdf.pdfreader.viewer.editor.free.ui.frag.n q22 = recentAddedActivity.q2();
                    q22.f22156e0 = 203;
                    ArrayList<PdfPreviewEntity> arrayList = q22.F0;
                    arrayList.clear();
                    arrayList.addAll(list);
                    pdf.pdfreader.viewer.editor.free.utils.v.O(new no.e(), arrayList);
                    pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar = q22.E0;
                    if (dVar != null) {
                        dVar.j(arrayList);
                    }
                    q22.z0(false);
                    q22.d1(list.isEmpty());
                    if (!recentAddedActivity.f26859h0 && !dl.a.a(recentAddedActivity)) {
                        recentAddedActivity.f26859h0 = true;
                        gl.e.f17918a.getClass();
                        gl.e.d();
                    }
                }
                return tf.d.f30009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(kotlinx.coroutines.flow.a0<? extends List<? extends PdfPreviewEntity>> a0Var, RecentAddedActivity recentAddedActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$dataWatcher = a0Var;
            this.this$0 = recentAddedActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$dataWatcher, this.this$0, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.activity.s.u0(obj);
            } else {
                androidx.activity.s.u0(obj);
                kotlinx.coroutines.flow.a0<List<PdfPreviewEntity>> a0Var = this.$dataWatcher;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (a0Var.a(aVar, this) == coroutineSingletons) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public RecentAddedActivity$initViewModel$3(RecentAddedActivity recentAddedActivity, kotlinx.coroutines.flow.a0<? extends List<? extends PdfPreviewEntity>> a0Var, kotlin.coroutines.c<? super RecentAddedActivity$initViewModel$3> cVar) {
        super(2, cVar);
        this.this$0 = recentAddedActivity;
        this.$dataWatcher = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new RecentAddedActivity$initViewModel$3(this.this$0, this.$dataWatcher, cVar);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dataWatcher, this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((RecentAddedActivity$initViewModel$3) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

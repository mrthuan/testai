package pdf.pdfreader.viewer.editor.free.utils.init;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.RecentAddRepository;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import tf.d;
import wf.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppInitHelper.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.utils.init.AppInitHelper$watchRecentAdd$1", f = "AppInitHelper.kt", l = {126}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AppInitHelper$watchRecentAdd$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;

    /* compiled from: AppInitHelper.kt */
    @c(c = "pdf.pdfreader.viewer.editor.free.utils.init.AppInitHelper$watchRecentAdd$1$1", f = "AppInitHelper.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.utils.init.AppInitHelper$watchRecentAdd$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Integer, kotlin.coroutines.c<? super d>, Object> {
        /* synthetic */ int I$0;
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i10, kotlin.coroutines.c<? super d> cVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i10), cVar)).invokeSuspend(d.f30009a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                s.u0(obj);
                if (this.I$0 == 0) {
                    q0.x(ReaderPdfApplication.m(), 0, "home_page_new_file_flag");
                }
                return d.f30009a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // cg.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, kotlin.coroutines.c<? super d> cVar) {
            return invoke(num.intValue(), cVar);
        }
    }

    public AppInitHelper$watchRecentAdd$1(kotlin.coroutines.c<? super AppInitHelper$watchRecentAdd$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AppInitHelper$watchRecentAdd$1(cVar);
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
            r rVar = RecentAddRepository.f24201v;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (aj.b.k(rVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((AppInitHelper$watchRecentAdd$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

package kotlinx.coroutines.flow.internal;

import androidx.activity.s;
import cg.p;
import cg.q;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;

/* compiled from: Combine.kt */
@wf.c(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {54, 76, 79}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CombineKt$combineInternal$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ cg.a<Object[]> $arrayFactory;
    final /* synthetic */ kotlinx.coroutines.flow.c<Object>[] $flows;
    final /* synthetic */ kotlinx.coroutines.flow.d<Object> $this_combineInternal;
    final /* synthetic */ q<kotlinx.coroutines.flow.d<Object>, Object[], kotlin.coroutines.c<? super tf.d>, Object> $transform;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* compiled from: Combine.kt */
    @wf.c(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {31}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.c<Object>[] $flows;
        final /* synthetic */ int $i;
        final /* synthetic */ AtomicInteger $nonClosed;
        final /* synthetic */ kotlinx.coroutines.channels.b<kotlin.collections.o<Object>> $resultChannel;
        int label;

        /* compiled from: Combine.kt */
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C02721<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.channels.b<kotlin.collections.o<Object>> f20102a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int f20103b;

            public C02721(kotlinx.coroutines.channels.b<kotlin.collections.o<Object>> bVar, int i10) {
                this.f20102a = bVar;
                this.f20103b = i10;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00c9  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00db A[RETURN] */
            @Override // kotlinx.coroutines.flow.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r7, kotlin.coroutines.c<? super tf.d> r8) {
                /*
                    Method dump skipped, instructions count: 223
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1.C02721.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlinx.coroutines.flow.c<Object>[] cVarArr, int i10, AtomicInteger atomicInteger, kotlinx.coroutines.channels.b<kotlin.collections.o<Object>> bVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$flows = cVarArr;
            this.$i = i10;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AtomicInteger atomicInteger;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        s.u0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    s.u0(obj);
                    kotlinx.coroutines.flow.c<Object>[] cVarArr = this.$flows;
                    int i11 = this.$i;
                    kotlinx.coroutines.flow.c<Object> cVar = cVarArr[i11];
                    C02721 c02721 = new C02721(this.$resultChannel, i11);
                    this.label = 1;
                    if (cVar.a(c02721, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    this.$resultChannel.m(null);
                }
                return tf.d.f30009a;
            } finally {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    this.$resultChannel.m(null);
                }
            }
        }

        @Override // cg.p
        public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2(kotlinx.coroutines.flow.c<Object>[] cVarArr, cg.a<Object[]> aVar, q<? super kotlinx.coroutines.flow.d<Object>, ? super Object[], ? super kotlin.coroutines.c<? super tf.d>, ? extends Object> qVar, kotlinx.coroutines.flow.d<Object> dVar, kotlin.coroutines.c<? super CombineKt$combineInternal$2> cVar) {
        super(2, cVar);
        this.$flows = cVarArr;
        this.$arrayFactory = aVar;
        this.$transform = qVar;
        this.$this_combineInternal = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, cVar);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af A[LOOP:0: B:31:0x00af->B:41:0x00ce, LOOP_START, PHI: r9 r13 
      PHI: (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:28:0x00aa, B:41:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v5 kotlin.collections.o) = (r13v4 kotlin.collections.o), (r13v16 kotlin.collections.o) binds: [B:28:0x00aa, B:41:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0110 -> B:20:0x008d). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((CombineKt$combineInternal$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

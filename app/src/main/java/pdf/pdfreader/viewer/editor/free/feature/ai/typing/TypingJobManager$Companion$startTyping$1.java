package pdf.pdfreader.viewer.editor.free.feature.ai.typing;

import android.text.Spanned;
import androidx.activity.s;
import cg.p;
import jf.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import tf.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypingJobManager.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.typing.TypingJobManager$Companion$startTyping$1", f = "TypingJobManager.kt", l = {100, 114, ShapeTypes.PLUS, ShapeTypes.FLOW_CHART_INTERNAL_STORAGE, ShapeTypes.FLOW_CHART_CONNECTOR}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TypingJobManager$Companion$startTyping$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ CharSequence $currentSpan;
    final /* synthetic */ boolean $isLock;
    final /* synthetic */ p<Integer, CharSequence, d> $onTypingCompleted;
    final /* synthetic */ String $text;
    final /* synthetic */ long $typingSpeed;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* compiled from: TypingJobManager.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.typing.TypingJobManager$Companion$startTyping$1$2", f = "TypingJobManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ai.typing.TypingJobManager$Companion$startTyping$1$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
        int label;

        public AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                s.u0(obj);
                b bVar = c.c;
                if (bVar != null) {
                    bVar.b("");
                    return d.f30009a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // cg.p
        public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
            return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(d.f30009a);
        }
    }

    /* compiled from: TypingJobManager.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.typing.TypingJobManager$Companion$startTyping$1$3", f = "TypingJobManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ai.typing.TypingJobManager$Companion$startTyping$1$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
        final /* synthetic */ int $i;
        final /* synthetic */ Spanned $parsedSpanned;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Spanned spanned, int i10, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$parsedSpanned = spanned;
            this.$i = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass3(this.$parsedSpanned, this.$i, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                s.u0(obj);
                f fVar = c.f24352a;
                c.f24355e = this.$parsedSpanned.subSequence(0, this.$i);
                b bVar = c.c;
                if (bVar != null) {
                    bVar.b(c.f24355e);
                    return d.f30009a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // cg.p
        public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
            return ((AnonymousClass3) create(wVar, cVar)).invokeSuspend(d.f30009a);
        }
    }

    /* compiled from: TypingJobManager.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.typing.TypingJobManager$Companion$startTyping$1$4", f = "TypingJobManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ai.typing.TypingJobManager$Companion$startTyping$1$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass4 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
        final /* synthetic */ Ref$IntRef $currentIndex;
        final /* synthetic */ boolean $isLock;
        final /* synthetic */ p<Integer, CharSequence, d> $onTypingCompleted;
        final /* synthetic */ Spanned $parsedSpanned;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(boolean z10, p<? super Integer, ? super CharSequence, d> pVar, Ref$IntRef ref$IntRef, Spanned spanned, kotlin.coroutines.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
            this.$isLock = z10;
            this.$onTypingCompleted = pVar;
            this.$currentIndex = ref$IntRef;
            this.$parsedSpanned = spanned;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass4(this.$isLock, this.$onTypingCompleted, this.$currentIndex, this.$parsedSpanned, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                s.u0(obj);
                if (!c.f24354d && !this.$isLock) {
                    c.f24355e = null;
                    p<Integer, CharSequence, d> pVar = this.$onTypingCompleted;
                    if (pVar != null) {
                        pVar.invoke(new Integer(-1), this.$parsedSpanned);
                    }
                    b bVar = c.c;
                    if (bVar != null) {
                        bVar.a(this.$parsedSpanned);
                    }
                } else {
                    c.f24355e = null;
                    p<Integer, CharSequence, d> pVar2 = this.$onTypingCompleted;
                    if (pVar2 != null) {
                        pVar2.invoke(new Integer(this.$currentIndex.element), this.$parsedSpanned.subSequence(0, this.$currentIndex.element));
                    }
                    b bVar2 = c.c;
                    if (bVar2 != null) {
                        bVar2.a(this.$parsedSpanned.subSequence(0, this.$currentIndex.element));
                    }
                }
                c.f24354d = false;
                c.c = null;
                return d.f30009a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // cg.p
        public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
            return ((AnonymousClass4) create(wVar, cVar)).invokeSuspend(d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TypingJobManager$Companion$startTyping$1(String str, CharSequence charSequence, boolean z10, p<? super Integer, ? super CharSequence, d> pVar, long j10, kotlin.coroutines.c<? super TypingJobManager$Companion$startTyping$1> cVar) {
        super(2, cVar);
        this.$text = str;
        this.$currentSpan = charSequence;
        this.$isLock = z10;
        this.$onTypingCompleted = pVar;
        this.$typingSpeed = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        TypingJobManager$Companion$startTyping$1 typingJobManager$Companion$startTyping$1 = new TypingJobManager$Companion$startTyping$1(this.$text, this.$currentSpan, this.$isLock, this.$onTypingCompleted, this.$typingSpeed, cVar);
        typingJobManager$Companion$startTyping$1.L$0 = obj;
        return typingJobManager$Companion$startTyping$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0165 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0166 -> B:70:0x016b). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.typing.TypingJobManager$Companion$startTyping$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((TypingJobManager$Companion$startTyping$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

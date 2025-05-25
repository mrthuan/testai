package kotlin.text;

import cg.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: Regex.kt */
@wf.c(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", l = {274, 282, 286}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements p<jg.h<? super String>, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ CharSequence $input;
    final /* synthetic */ int $limit;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Regex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Regex$splitToSequence$1(Regex regex, CharSequence charSequence, int i10, kotlin.coroutines.c<? super Regex$splitToSequence$1> cVar) {
        super(2, cVar);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$limit = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.this$0, this.$input, this.$limit, cVar);
        regex$splitToSequence$1.L$0 = obj;
        return regex$splitToSequence$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006e -> B:21:0x0071). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L30
            if (r1 == r4) goto L2b
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            androidx.activity.s.u0(r11)
            goto L9d
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            int r1 = r10.I$0
            java.lang.Object r5 = r10.L$1
            java.util.regex.Matcher r5 = (java.util.regex.Matcher) r5
            java.lang.Object r6 = r10.L$0
            jg.h r6 = (jg.h) r6
            androidx.activity.s.u0(r11)
            r7 = r10
            goto L71
        L2b:
            androidx.activity.s.u0(r11)
            goto Laf
        L30:
            androidx.activity.s.u0(r11)
            java.lang.Object r11 = r10.L$0
            jg.h r11 = (jg.h) r11
            kotlin.text.Regex r1 = r10.this$0
            java.util.regex.Pattern r1 = kotlin.text.Regex.access$getNativePattern$p(r1)
            java.lang.CharSequence r5 = r10.$input
            java.util.regex.Matcher r1 = r1.matcher(r5)
            int r5 = r10.$limit
            if (r5 == r4) goto La0
            boolean r5 = r1.find()
            if (r5 != 0) goto L4e
            goto La0
        L4e:
            r5 = 0
            r7 = r10
            r6 = r11
            r11 = r5
            r5 = r1
            r1 = r11
        L54:
            java.lang.CharSequence r8 = r7.$input
            int r9 = r5.start()
            java.lang.CharSequence r11 = r8.subSequence(r11, r9)
            java.lang.String r11 = r11.toString()
            r7.L$0 = r6
            r7.L$1 = r5
            r7.I$0 = r1
            r7.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = r6.b(r11, r7)
            if (r11 != r0) goto L71
            return r0
        L71:
            int r11 = r5.end()
            int r1 = r1 + r4
            int r8 = r7.$limit
            int r8 = r8 - r4
            if (r1 == r8) goto L81
            boolean r8 = r5.find()
            if (r8 != 0) goto L54
        L81:
            java.lang.CharSequence r1 = r7.$input
            int r3 = r1.length()
            java.lang.CharSequence r11 = r1.subSequence(r11, r3)
            java.lang.String r11 = r11.toString()
            r1 = 0
            r7.L$0 = r1
            r7.L$1 = r1
            r7.label = r2
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = r6.b(r11, r7)
            if (r11 != r0) goto L9d
            return r0
        L9d:
            tf.d r11 = tf.d.f30009a
            return r11
        La0:
            java.lang.CharSequence r1 = r10.$input
            java.lang.String r1 = r1.toString()
            r10.label = r4
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = r11.b(r1, r10)
            if (r11 != r0) goto Laf
            return r0
        Laf:
            tf.d r11 = tf.d.f30009a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex$splitToSequence$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(jg.h<? super String> hVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((Regex$splitToSequence$1) create(hVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

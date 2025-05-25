package e5;

import android.content.Context;
import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;

/* compiled from: UpdateInfoFetcher.kt */
@wf.c(c = "com.drojian.upgradelib.data.UpdateInfoFetcher$assertS3FileExist$2", f = "UpdateInfoFetcher.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f16460a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f16461b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, kotlin.coroutines.c<? super e> cVar) {
        super(2, cVar);
        this.f16460a = context;
        this.f16461b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new e(this.f16460a, this.f16461b, cVar);
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super Boolean> cVar) {
        return ((e) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(3:3|(1:5)(1:11)|(3:7|8|9))|12|13|14|(4:18|(1:20)(1:26)|21|(5:23|24|25|8|9))|27|(1:29)(1:37)|30|(5:34|24|25|8|9)|36|25|8|9) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0103, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0104, code lost:
        r2 = c5.a.b();
        r2.a();
        r2.c.f5583e.k("", r0);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

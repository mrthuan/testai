package androidx.window.layout;

import android.app.Activity;
import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WindowInfoTrackerImpl.kt */
@wf.c(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends SuspendLambda implements p<kotlinx.coroutines.flow.d<? super WindowLayoutInfo>, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, kotlin.coroutines.c<? super WindowInfoTrackerImpl$windowLayoutInfo$1> cVar) {
        super(2, cVar);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
    public static final void m7invokeSuspend$lambda0(kotlinx.coroutines.channels.b bVar, WindowLayoutInfo info) {
        kotlin.jvm.internal.g.d(info, "info");
        bVar.v(info);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, cVar);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083 A[Catch: all -> 0x00aa, TRY_LEAVE, TryCatch #1 {all -> 0x00aa, blocks: (B:21:0x007b, B:23:0x0083), top: B:38:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0098 -> B:40:0x0065). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.flow.d<? super WindowLayoutInfo> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(dVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

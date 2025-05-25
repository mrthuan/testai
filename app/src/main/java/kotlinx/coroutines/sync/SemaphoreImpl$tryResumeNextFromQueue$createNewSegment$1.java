package kotlinx.coroutines.sync;

import cg.p;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Semaphore.kt */
/* loaded from: classes.dex */
final /* synthetic */ class SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 extends FunctionReferenceImpl implements p<Long, d, d> {
    public static final SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 INSTANCE = new SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1();

    public SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1() {
        super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // cg.p
    public /* bridge */ /* synthetic */ d invoke(Long l10, d dVar) {
        return invoke(l10.longValue(), dVar);
    }

    public final d invoke(long j10, d dVar) {
        int i10 = c.f20262a;
        return new d(j10, dVar, 0);
    }
}

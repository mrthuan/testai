package kotlinx.coroutines.channels;

import cg.p;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BufferedChannel.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements p<Long, g<Object>, g<Object>> {
    public static final BufferedChannelKt$createSegmentFunction$1 INSTANCE = new BufferedChannelKt$createSegmentFunction$1();

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, a.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // cg.p
    public /* bridge */ /* synthetic */ g<Object> invoke(Long l10, g<Object> gVar) {
        return invoke(l10.longValue(), gVar);
    }

    public final g<Object> invoke(long j10, g<Object> gVar) {
        g<Object> gVar2 = a.f20015a;
        BufferedChannel<Object> bufferedChannel = gVar.f20040e;
        kotlin.jvm.internal.g.b(bufferedChannel);
        return new g<>(j10, gVar, bufferedChannel, 0);
    }
}

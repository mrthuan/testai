package kotlinx.coroutines.flow;

import com.google.android.gms.common.api.Api;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* compiled from: Merge.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class l {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f20129a = 0;

    static {
        b.b.b0("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, (long) Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public static final ChannelFlowTransformLatest a(cg.p pVar, c cVar) {
        return aj.b.X(cVar, new FlowKt__MergeKt$mapLatest$1(pVar, null));
    }
}

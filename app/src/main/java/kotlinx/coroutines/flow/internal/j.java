package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes.dex */
public interface j<T> extends kotlinx.coroutines.flow.c<T> {

    /* compiled from: ChannelFlow.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ kotlinx.coroutines.flow.c a(j jVar, CoroutineDispatcher coroutineDispatcher, int i10, BufferOverflow bufferOverflow, int i11) {
            EmptyCoroutineContext emptyCoroutineContext = coroutineDispatcher;
            if ((i11 & 1) != 0) {
                emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return jVar.g(emptyCoroutineContext, i10, bufferOverflow);
        }
    }

    kotlinx.coroutines.flow.c<T> g(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow);
}

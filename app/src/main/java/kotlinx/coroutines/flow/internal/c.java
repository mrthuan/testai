package kotlinx.coroutines.flow.internal;

import androidx.activity.r;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.w;
import kotlinx.coroutines.x;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes.dex */
public abstract class c<T> implements j<T> {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f20115a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20116b;
    public final BufferOverflow c;

    public c(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        this.f20115a = coroutineContext;
        this.f20116b = i10;
        this.c = bufferOverflow;
    }

    @Override // kotlinx.coroutines.flow.c
    public Object a(kotlinx.coroutines.flow.d<? super T> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        Object c = x.c(new ChannelFlow$collect$2(dVar, this, null), cVar);
        if (c != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return tf.d.f30009a;
        }
        return c;
    }

    @Override // kotlinx.coroutines.flow.internal.j
    public final kotlinx.coroutines.flow.c<T> g(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        CoroutineContext coroutineContext2 = this.f20115a;
        CoroutineContext plus = coroutineContext.plus(coroutineContext2);
        BufferOverflow bufferOverflow2 = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow3 = this.c;
        int i11 = this.f20116b;
        if (bufferOverflow == bufferOverflow2) {
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2) {
                            i10 += i11;
                            if (i10 < 0) {
                                i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                            }
                        }
                    }
                }
                i10 = i11;
            }
            bufferOverflow = bufferOverflow3;
        }
        if (kotlin.jvm.internal.g.a(plus, coroutineContext2) && i10 == i11 && bufferOverflow == bufferOverflow3) {
            return this;
        }
        return j(plus, i10, bufferOverflow);
    }

    public String h() {
        return null;
    }

    public abstract Object i(kotlinx.coroutines.channels.j<? super T> jVar, kotlin.coroutines.c<? super tf.d> cVar);

    public abstract c<T> j(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow);

    public kotlinx.coroutines.flow.c<T> k() {
        return null;
    }

    public kotlinx.coroutines.channels.l<T> l(w wVar) {
        int i10 = this.f20116b;
        if (i10 == -3) {
            i10 = -2;
        }
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        kotlinx.coroutines.channels.i iVar = new kotlinx.coroutines.channels.i(CoroutineContextKt.c(wVar, this.f20115a), kotlinx.coroutines.channels.e.a(i10, this.c, 4));
        coroutineStart.invoke(channelFlow$collectToFun$1, iVar, iVar);
        return iVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String h10 = h();
        if (h10 != null) {
            arrayList.add(h10);
        }
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext = this.f20115a;
        if (coroutineContext != emptyCoroutineContext) {
            arrayList.add("context=" + coroutineContext);
        }
        int i10 = this.f20116b;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow2 = this.c;
        if (bufferOverflow2 != bufferOverflow) {
            arrayList.add("onBufferOverflow=" + bufferOverflow2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return r.f(sb2, kotlin.collections.m.w0(arrayList, ", ", null, null, null, 62), ']');
    }
}

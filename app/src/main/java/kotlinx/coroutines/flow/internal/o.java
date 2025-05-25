package kotlinx.coroutines.flow.internal;

import com.google.android.gms.common.api.Api;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.a0;
import kotlinx.coroutines.flow.v;

/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes.dex */
public final class o extends v<Integer> implements a0<Integer> {
    public o(int i10) {
        super(1, Api.BaseClientBuilder.API_PRIORITY_OTHER, BufferOverflow.DROP_OLDEST);
        e(Integer.valueOf(i10));
    }

    @Override // kotlinx.coroutines.flow.a0
    public final Integer b() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f20139h;
            kotlin.jvm.internal.g.b(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f20140i + ((int) ((r() + this.f20142k) - this.f20140i))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void y(int i10) {
        synchronized (this) {
            Object[] objArr = this.f20139h;
            kotlin.jvm.internal.g.b(objArr);
            e(Integer.valueOf(((Number) objArr[((int) ((this.f20140i + ((int) ((r() + this.f20142k) - this.f20140i))) - 1)) & (objArr.length - 1)]).intValue() + i10));
        }
    }
}

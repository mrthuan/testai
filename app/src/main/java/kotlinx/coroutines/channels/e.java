package kotlinx.coroutines.channels;

import com.google.android.gms.common.api.Api;
import kotlinx.coroutines.channels.b;

/* compiled from: Channel.kt */
/* loaded from: classes.dex */
public final class e {
    public static BufferedChannel a(int i10, BufferOverflow bufferOverflow, int i11) {
        BufferedChannel hVar;
        boolean z10 = false;
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if (i10 != -2) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != Integer.MAX_VALUE) {
                        if (bufferOverflow == BufferOverflow.SUSPEND) {
                            return new BufferedChannel(i10, null);
                        }
                        return new h(i10, bufferOverflow, null);
                    }
                    return new BufferedChannel(Api.BaseClientBuilder.API_PRIORITY_OTHER, null);
                } else if (bufferOverflow == BufferOverflow.SUSPEND) {
                    hVar = new BufferedChannel(0, null);
                } else {
                    hVar = new h(1, bufferOverflow, null);
                }
            } else {
                if (bufferOverflow == BufferOverflow.SUSPEND) {
                    z10 = true;
                }
                if (z10) {
                    return new h(1, BufferOverflow.DROP_OLDEST, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
        } else if (bufferOverflow == BufferOverflow.SUSPEND) {
            b.f20033e1.getClass();
            hVar = new BufferedChannel(b.a.f20035b, null);
        } else {
            hVar = new h(1, bufferOverflow, null);
        }
        return hVar;
    }
}

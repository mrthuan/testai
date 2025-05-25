package kotlinx.coroutines.channels;

import com.google.android.play.core.assetpacks.b1;
import kotlinx.coroutines.channels.f;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* compiled from: ConflatedBufferedChannel.kt */
/* loaded from: classes.dex */
public final class h<E> extends BufferedChannel<E> {

    /* renamed from: l  reason: collision with root package name */
    public final BufferOverflow f20042l;

    public h(int i10, BufferOverflow bufferOverflow, cg.l<? super E, tf.d> lVar) {
        super(i10, lVar);
        boolean z10;
        this.f20042l = bufferOverflow;
        if (bufferOverflow != BufferOverflow.SUSPEND) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 >= 1) {
                return;
            }
            throw new IllegalArgumentException(a0.a.g("Buffered channel capacity must be at least 1, but ", i10, " was specified").toString());
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.i.a(BufferedChannel.class).b() + " instead").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ee, code lost:
        return tf.d.f30009a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object L(E r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.h.L(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.m
    public final Object v(E e10) {
        return L(e10, false);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.m
    public final Object x(E e10, kotlin.coroutines.c<? super tf.d> cVar) {
        UndeliveredElementException c;
        Object L = L(e10, true);
        boolean z10 = L instanceof f.a;
        if (z10) {
            if (z10) {
                f.a aVar = (f.a) L;
            }
            cg.l<E, tf.d> lVar = this.f20012b;
            if (lVar != null && (c = OnUndeliveredElementKt.c(lVar, e10, null)) != null) {
                b1.n(c, r());
                throw c;
            }
            throw r();
        }
        return tf.d.f30009a;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final boolean z() {
        if (this.f20042l == BufferOverflow.DROP_OLDEST) {
            return true;
        }
        return false;
    }
}

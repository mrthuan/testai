package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.a;

/* loaded from: classes3.dex */
public class NnApiDelegate implements a, AutoCloseable {

    /* renamed from: a  reason: collision with root package name */
    public long f23585a;

    public NnApiDelegate() {
        TensorFlowLite.a();
        this.f23585a = createDelegate(-1, null, null, null, -1, false, false, false);
    }

    private static native long createDelegate(int i10, String str, String str2, String str3, int i11, boolean z10, boolean z11, boolean z12);

    private static native void deleteDelegate(long j10);

    private static native int getNnapiErrno(long j10);

    @Override // org.tensorflow.lite.a
    public final long a() {
        return this.f23585a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        long j10 = this.f23585a;
        if (j10 != 0) {
            deleteDelegate(j10);
            this.f23585a = 0L;
        }
    }
}

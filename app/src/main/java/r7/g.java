package r7;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class g extends f {
    public final byte[] c;

    public g(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.c = bArr;
    }

    @Override // r7.f
    public final byte[] L0() {
        return this.c;
    }
}

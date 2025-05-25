package d4;

import com.google.android.play.core.assetpacks.c;
import v3.l;

/* compiled from: BytesResource.java */
/* loaded from: classes.dex */
public final class b implements l<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f16117a;

    public b(byte[] bArr) {
        c.l(bArr);
        this.f16117a = bArr;
    }

    @Override // v3.l
    public final Class<byte[]> c() {
        return byte[].class;
    }

    @Override // v3.l
    public final byte[] get() {
        return this.f16117a;
    }

    @Override // v3.l
    public final int getSize() {
        return this.f16117a.length;
    }

    @Override // v3.l
    public final void a() {
    }
}

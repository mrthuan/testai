package w3;

/* compiled from: ByteArrayAdapter.java */
/* loaded from: classes.dex */
public final class e implements a<byte[]> {
    @Override // w3.a
    public final int a() {
        return 1;
    }

    @Override // w3.a
    public final String b() {
        return "ByteArrayPool";
    }

    @Override // w3.a
    public final int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // w3.a
    public final byte[] newArray(int i10) {
        return new byte[i10];
    }
}

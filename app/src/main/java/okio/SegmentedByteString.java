package okio;

import androidx.activity.s;
import ge.a;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kk.u;
import kotlin.collections.f;
import kotlin.jvm.internal.g;
import o9.d;

/* compiled from: SegmentedByteString.kt */
/* loaded from: classes3.dex */
public final class SegmentedByteString extends ByteString {
    public final transient byte[][] c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int[] f23471d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] segments, int[] directory) {
        super(ByteString.EMPTY.getData$okio());
        g.e(segments, "segments");
        g.e(directory, "directory");
        this.c = segments;
        this.f23471d = directory;
    }

    private final Object writeReplace() {
        return a();
    }

    public final ByteString a() {
        return new ByteString(toByteArray());
    }

    @Override // okio.ByteString
    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        g.d(asReadOnlyBuffer, "wrap(toByteArray()).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    @Override // okio.ByteString
    public String base64() {
        return a().base64();
    }

    @Override // okio.ByteString
    public String base64Url() {
        return a().base64Url();
    }

    @Override // okio.ByteString
    public void copyInto(int i10, byte[] target, int i11, int i12) {
        int i13;
        g.e(target, "target");
        long j10 = i12;
        s.u(size(), i10, j10);
        s.u(target.length, i11, j10);
        int i14 = i12 + i10;
        int S = a.S(this, i10);
        while (i10 < i14) {
            if (S == 0) {
                i13 = 0;
            } else {
                i13 = getDirectory$okio()[S - 1];
            }
            int i15 = getDirectory$okio()[getSegments$okio().length + S];
            int min = Math.min(i14, (getDirectory$okio()[S] - i13) + i13) - i10;
            int i16 = (i10 - i13) + i15;
            f.x(getSegments$okio()[S], i11, i16, target, i16 + min);
            i11 += min;
            i10 += min;
            S++;
        }
    }

    @Override // okio.ByteString
    public ByteString digest$okio(String algorithm) {
        g.e(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = getDirectory$okio()[length + i10];
            int i13 = getDirectory$okio()[i10];
            messageDigest.update(getSegments$okio()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digestBytes = messageDigest.digest();
        g.d(digestBytes, "digestBytes");
        return new ByteString(digestBytes);
    }

    @Override // okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    public final int[] getDirectory$okio() {
        return this.f23471d;
    }

    public final byte[][] getSegments$okio() {
        return this.c;
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio == 0) {
            int length = getSegments$okio().length;
            int i10 = 0;
            int i11 = 1;
            int i12 = 0;
            while (i10 < length) {
                int i13 = getDirectory$okio()[length + i10];
                int i14 = getDirectory$okio()[i10];
                byte[] bArr = getSegments$okio()[i10];
                int i15 = (i14 - i12) + i13;
                while (i13 < i15) {
                    i11 = (i11 * 31) + bArr[i13];
                    i13++;
                }
                i10++;
                i12 = i14;
            }
            setHashCode$okio(i11);
            return i11;
        }
        return hashCode$okio;
    }

    @Override // okio.ByteString
    public String hex() {
        return a().hex();
    }

    @Override // okio.ByteString
    public ByteString hmac$okio(String algorithm, ByteString key) {
        g.e(algorithm, "algorithm");
        g.e(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments$okio().length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = getDirectory$okio()[length + i10];
                int i13 = getDirectory$okio()[i10];
                mac.update(getSegments$okio()[i10], i12, i13 - i11);
                i10++;
                i11 = i13;
            }
            byte[] doFinal = mac.doFinal();
            g.d(doFinal, "mac.doFinal()");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // okio.ByteString
    public int indexOf(byte[] other, int i10) {
        g.e(other, "other");
        return a().indexOf(other, i10);
    }

    @Override // okio.ByteString
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int i10) {
        int i11;
        s.u(getDirectory$okio()[getSegments$okio().length - 1], i10, 1L);
        int S = a.S(this, i10);
        if (S == 0) {
            i11 = 0;
        } else {
            i11 = getDirectory$okio()[S - 1];
        }
        return getSegments$okio()[S][(i10 - i11) + getDirectory$okio()[getSegments$okio().length + S]];
    }

    @Override // okio.ByteString
    public int lastIndexOf(byte[] other, int i10) {
        g.e(other, "other");
        return a().lastIndexOf(other, i10);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i10, ByteString other, int i11, int i12) {
        g.e(other, "other");
        if (i10 < 0 || i10 > size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int S = a.S(this, i10);
        while (i10 < i13) {
            int i14 = S == 0 ? 0 : getDirectory$okio()[S - 1];
            int i15 = getDirectory$okio()[getSegments$okio().length + S];
            int min = Math.min(i13, (getDirectory$okio()[S] - i14) + i14) - i10;
            if (!other.rangeEquals(i11, getSegments$okio()[S], (i10 - i14) + i15, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            S++;
        }
        return true;
    }

    @Override // okio.ByteString
    public String string(Charset charset) {
        g.e(charset, "charset");
        return a().string(charset);
    }

    @Override // okio.ByteString
    public ByteString substring(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        int s02 = s.s0(this, i11);
        int i12 = 0;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (s02 <= size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i13 = s02 - i10;
                if (i13 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (i10 == 0 && s02 == size()) {
                        return this;
                    }
                    if (i10 == s02) {
                        return ByteString.EMPTY;
                    }
                    int S = a.S(this, i10);
                    int S2 = a.S(this, s02 - 1);
                    byte[][] segments$okio = getSegments$okio();
                    int i14 = S2 + 1;
                    g.e(segments$okio, "<this>");
                    d.m(i14, segments$okio.length);
                    Object[] copyOfRange = Arrays.copyOfRange(segments$okio, S, i14);
                    g.d(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
                    byte[][] bArr = (byte[][]) copyOfRange;
                    int[] iArr = new int[bArr.length * 2];
                    if (S <= S2) {
                        int i15 = 0;
                        int i16 = S;
                        while (true) {
                            iArr[i15] = Math.min(getDirectory$okio()[i16] - i10, i13);
                            int i17 = i15 + 1;
                            iArr[i15 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i16];
                            if (i16 == S2) {
                                break;
                            }
                            i16++;
                            i15 = i17;
                        }
                    }
                    if (S != 0) {
                        i12 = getDirectory$okio()[S - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = (i10 - i12) + iArr[length];
                    return new SegmentedByteString(bArr, iArr);
                }
                throw new IllegalArgumentException(a0.d.b("endIndex=", s02, " < beginIndex=", i10).toString());
            }
            StringBuilder e10 = androidx.appcompat.view.menu.d.e("endIndex=", s02, " > length(");
            e10.append(size());
            e10.append(')');
            throw new IllegalArgumentException(e10.toString().toString());
        }
        throw new IllegalArgumentException(a0.a.g("beginIndex=", i10, " < 0").toString());
    }

    @Override // okio.ByteString
    public ByteString toAsciiLowercase() {
        return a().toAsciiLowercase();
    }

    @Override // okio.ByteString
    public ByteString toAsciiUppercase() {
        return a().toAsciiUppercase();
    }

    @Override // okio.ByteString
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory$okio()[length + i10];
            int i14 = getDirectory$okio()[i10];
            int i15 = i14 - i11;
            f.x(getSegments$okio()[i10], i12, i13, bArr, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public String toString() {
        return a().toString();
    }

    @Override // okio.ByteString
    public void write(OutputStream out) {
        g.e(out, "out");
        int length = getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = getDirectory$okio()[length + i10];
            int i13 = getDirectory$okio()[i10];
            out.write(getSegments$okio()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
    }

    @Override // okio.ByteString
    public void write$okio(kk.f buffer, int i10, int i11) {
        int i12;
        g.e(buffer, "buffer");
        int i13 = i10 + i11;
        int S = a.S(this, i10);
        while (i10 < i13) {
            if (S == 0) {
                i12 = 0;
            } else {
                i12 = getDirectory$okio()[S - 1];
            }
            int i14 = getDirectory$okio()[getSegments$okio().length + S];
            int min = Math.min(i13, (getDirectory$okio()[S] - i12) + i12) - i10;
            int i15 = (i10 - i12) + i14;
            u uVar = new u(getSegments$okio()[S], i15, i15 + min, true);
            u uVar2 = buffer.f19825a;
            if (uVar2 == null) {
                uVar.f19854g = uVar;
                uVar.f19853f = uVar;
                buffer.f19825a = uVar;
            } else {
                u uVar3 = uVar2.f19854g;
                g.b(uVar3);
                uVar3.b(uVar);
            }
            i10 += min;
            S++;
        }
        buffer.f19826b += i11;
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i10, byte[] other, int i11, int i12) {
        g.e(other, "other");
        if (i10 < 0 || i10 > size() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int S = a.S(this, i10);
        while (i10 < i13) {
            int i14 = S == 0 ? 0 : getDirectory$okio()[S - 1];
            int i15 = getDirectory$okio()[getSegments$okio().length + S];
            int min = Math.min(i13, (getDirectory$okio()[S] - i14) + i14) - i10;
            if (!s.r(getSegments$okio()[S], (i10 - i14) + i15, i11, other, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            S++;
        }
        return true;
    }
}

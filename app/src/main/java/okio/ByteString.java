package okio;

import aj.b;
import androidx.activity.s;
import com.adjust.sdk.Constants;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kk.a0;
import kotlin.collections.f;
import kotlin.jvm.internal.g;

/* compiled from: ByteString.kt */
/* loaded from: classes3.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final a Companion = new a();
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: a  reason: collision with root package name */
    public transient int f23469a;

    /* renamed from: b  reason: collision with root package name */
    public transient String f23470b;
    private final byte[] data;

    /* compiled from: ByteString.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00e5, code lost:
            r7 = null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static okio.ByteString a(java.lang.String r16) {
            /*
                Method dump skipped, instructions count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.a.a(java.lang.String):okio.ByteString");
        }

        public static ByteString b(String str) {
            boolean z10;
            g.e(str, "<this>");
            if (str.length() % 2 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    bArr[i10] = (byte) (b.g(str.charAt(i11 + 1)) + (b.g(str.charAt(i11)) << 4));
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }

        public static ByteString c(String str) {
            g.e(str, "<this>");
            byte[] bytes = str.getBytes(kotlin.text.a.f19966b);
            g.d(bytes, "this as java.lang.String).getBytes(charset)");
            ByteString byteString = new ByteString(bytes);
            byteString.setUtf8$okio(str);
            return byteString;
        }

        public static ByteString d(byte[] bArr, int i10, int i11) {
            g.e(bArr, "<this>");
            if (i11 == -1234567890) {
                i11 = bArr.length;
            }
            s.u(bArr.length, i10, i11);
            return new ByteString(f.z(i10, i11 + i10, bArr));
        }

        public static /* synthetic */ ByteString e(a aVar, byte[] bArr) {
            aVar.getClass();
            return d(bArr, 0, -1234567890);
        }

        public static ByteString f(InputStream inputStream, int i10) {
            boolean z10;
            g.e(inputStream, "<this>");
            int i11 = 0;
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                byte[] bArr = new byte[i10];
                while (i11 < i10) {
                    int read = inputStream.read(bArr, i11, i10 - i11);
                    if (read != -1) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(b.a.c("byteCount < 0: ", i10).toString());
        }
    }

    public ByteString(byte[] data) {
        g.e(data, "data");
        this.data = data;
    }

    public static /* synthetic */ void copyInto$default(ByteString byteString, int i10, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 1) != 0) {
                i10 = 0;
            }
            if ((i13 & 4) != 0) {
                i11 = 0;
            }
            byteString.copyInto(i10, bArr, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
    }

    public static final ByteString decodeBase64(String str) {
        Companion.getClass();
        return a.a(str);
    }

    public static final ByteString decodeHex(String str) {
        Companion.getClass();
        return a.b(str);
    }

    public static final ByteString encodeString(String str, Charset charset) {
        Companion.getClass();
        g.e(str, "<this>");
        g.e(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        g.d(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteString(bytes);
    }

    public static final ByteString encodeUtf8(String str) {
        Companion.getClass();
        return a.c(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return byteString.indexOf(byteString2, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = -1234567890;
            }
            return byteString.lastIndexOf(byteString2, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static final ByteString of(ByteBuffer byteBuffer) {
        Companion.getClass();
        g.e(byteBuffer, "<this>");
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new ByteString(bArr);
    }

    public static final ByteString read(InputStream inputStream, int i10) {
        Companion.getClass();
        return a.f(inputStream, i10);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        Companion.getClass();
        ByteString f10 = a.f(objectInputStream, readInt);
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, f10.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i10, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = -1234567890;
            }
            return byteString.substring(i10, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m35deprecated_getByte(int i10) {
        return getByte(i10);
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m36deprecated_size() {
        return size();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        g.d(asReadOnlyBuffer, "wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    public String base64() {
        return a0.a(getData$okio(), a0.f19818a);
    }

    public String base64Url() {
        return a0.a(getData$okio(), a0.f19819b);
    }

    public void copyInto(int i10, byte[] target, int i11, int i12) {
        g.e(target, "target");
        f.x(getData$okio(), i11, i10, target, i12 + i10);
    }

    public ByteString digest$okio(String algorithm) {
        g.e(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, size());
        byte[] digestBytes = messageDigest.digest();
        g.d(digestBytes, "digestBytes");
        return new ByteString(digestBytes);
    }

    public final boolean endsWith(ByteString suffix) {
        g.e(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte getByte(int i10) {
        return internalGet$okio(i10);
    }

    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.f23469a;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    public final String getUtf8$okio() {
        return this.f23470b;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio == 0) {
            int hashCode = Arrays.hashCode(getData$okio());
            setHashCode$okio(hashCode);
            return hashCode;
        }
        return hashCode$okio;
    }

    public String hex() {
        byte[] data$okio;
        char[] cArr = new char[getData$okio().length * 2];
        int i10 = 0;
        for (byte b10 : getData$okio()) {
            int i11 = i10 + 1;
            char[] cArr2 = b.f568p;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public ByteString hmac$okio(String algorithm, ByteString key) {
        g.e(algorithm, "algorithm");
        g.e(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] doFinal = mac.doFinal(this.data);
            g.d(doFinal, "mac.doFinal(data)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public ByteString hmacSha1(ByteString key) {
        g.e(key, "key");
        return hmac$okio("HmacSHA1", key);
    }

    public ByteString hmacSha256(ByteString key) {
        g.e(key, "key");
        return hmac$okio("HmacSHA256", key);
    }

    public ByteString hmacSha512(ByteString key) {
        g.e(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    public final int indexOf(ByteString other) {
        g.e(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i10) {
        return getData$okio()[i10];
    }

    public final int lastIndexOf(ByteString other) {
        g.e(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    public final ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i10, ByteString other, int i11, int i12) {
        g.e(other, "other");
        return other.rangeEquals(i11, getData$okio(), i10, i12);
    }

    public final void setHashCode$okio(int i10) {
        this.f23469a = i10;
    }

    public final void setUtf8$okio(String str) {
        this.f23470b = str;
    }

    public final ByteString sha1() {
        return digest$okio("SHA-1");
    }

    public final ByteString sha256() {
        return digest$okio(Constants.SHA256);
    }

    public final ByteString sha512() {
        return digest$okio("SHA-512");
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(ByteString prefix) {
        g.e(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    public String string(Charset charset) {
        g.e(charset, "charset");
        return new String(this.data, charset);
    }

    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public ByteString toAsciiLowercase() {
        byte b10;
        for (int i10 = 0; i10 < getData$okio().length; i10++) {
            byte b11 = getData$okio()[i10];
            byte b12 = (byte) 65;
            if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                g.d(copyOf, "copyOf(this, size)");
                copyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b13 = copyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        copyOf[i11] = (byte) (b13 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public ByteString toAsciiUppercase() {
        byte b10;
        for (int i10 = 0; i10 < getData$okio().length; i10++) {
            byte b11 = getData$okio()[i10];
            byte b12 = (byte) 97;
            if (b11 >= b12 && b11 <= (b10 = (byte) 122)) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                g.d(copyOf, "copyOf(this, size)");
                copyOf[i10] = (byte) (b11 - 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b13 = copyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        copyOf[i11] = (byte) (b13 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        g.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x00fd, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x010e, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x011d, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x012f, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x013c, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0182, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0193, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x01a4, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x01b3, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x01c9, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x01d6, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x01dd, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x021a, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x021d, code lost:
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x009e, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ad, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00b8, code lost:
        if (r3 == 64) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:275:0x021d A[EDGE_INSN: B:275:0x021d->B:244:0x021d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x021d A[EDGE_INSN: B:280:0x021d->B:244:0x021d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x021d A[EDGE_INSN: B:285:0x021d->B:244:0x021d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x021d A[EDGE_INSN: B:297:0x021d->B:244:0x021d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x021d A[EDGE_INSN: B:302:0x021d->B:244:0x021d ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.toString():java.lang.String");
    }

    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio == null) {
            byte[] internalArray$okio = internalArray$okio();
            g.e(internalArray$okio, "<this>");
            String str = new String(internalArray$okio, kotlin.text.a.f19966b);
            setUtf8$okio(str);
            return str;
        }
        return utf8$okio;
    }

    public void write(OutputStream out) {
        g.e(out, "out");
        out.write(this.data);
    }

    public void write$okio(kk.f buffer, int i10, int i11) {
        g.e(buffer, "buffer");
        buffer.o(i10, i11, getData$okio());
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return byteString.indexOf(bArr, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = -1234567890;
            }
            return byteString.lastIndexOf(bArr, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0 < r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r7 < r8) goto L12;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g.e(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public final boolean endsWith(byte[] suffix) {
        g.e(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    public final int indexOf(byte[] other) {
        g.e(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    public final int lastIndexOf(byte[] other) {
        g.e(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    public boolean rangeEquals(int i10, byte[] other, int i11, int i12) {
        g.e(other, "other");
        return i10 >= 0 && i10 <= getData$okio().length - i12 && i11 >= 0 && i11 <= other.length - i12 && s.r(getData$okio(), i10, i11, other, i12);
    }

    public final boolean startsWith(byte[] prefix) {
        g.e(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    public final ByteString substring(int i10) {
        return substring$default(this, i10, 0, 2, null);
    }

    public final int indexOf(ByteString other, int i10) {
        g.e(other, "other");
        return indexOf(other.internalArray$okio(), i10);
    }

    public final int lastIndexOf(ByteString other, int i10) {
        g.e(other, "other");
        return lastIndexOf(other.internalArray$okio(), i10);
    }

    public ByteString substring(int i10, int i11) {
        int s02 = s.s0(this, i11);
        if (i10 >= 0) {
            if (s02 <= getData$okio().length) {
                if (s02 - i10 >= 0) {
                    return (i10 == 0 && s02 == getData$okio().length) ? this : new ByteString(f.z(i10, s02, getData$okio()));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(androidx.activity.f.n(new StringBuilder("endIndex > length("), getData$okio().length, ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public int indexOf(byte[] other, int i10) {
        g.e(other, "other");
        int length = getData$okio().length - other.length;
        int max = Math.max(i10, 0);
        if (max <= length) {
            while (!s.r(getData$okio(), max, 0, other, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public int lastIndexOf(byte[] other, int i10) {
        g.e(other, "other");
        for (int min = Math.min(s.s0(this, i10), getData$okio().length - other.length); -1 < min; min--) {
            if (s.r(getData$okio(), min, 0, other, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public static final ByteString of(byte... data) {
        Companion.getClass();
        g.e(data, "data");
        byte[] copyOf = Arrays.copyOf(data, data.length);
        g.d(copyOf, "copyOf(this, size)");
        return new ByteString(copyOf);
    }

    public static final ByteString of(byte[] bArr, int i10, int i11) {
        Companion.getClass();
        return a.d(bArr, i10, i11);
    }
}

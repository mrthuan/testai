package com.bytedance.sdk.component.cJ.Qhi.cJ;

import androidx.appcompat.view.menu.d;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* compiled from: Buffer.java */
/* loaded from: classes.dex */
public final class Qhi implements ac, cJ, Cloneable, ByteChannel {

    /* renamed from: ac  reason: collision with root package name */
    private static final byte[] f8352ac = {48, Field.EQ, Field.GOTOBUTTON, Field.MACROBUTTON, Field.AUTONUMOUT, Field.AUTONUMLGL, Field.AUTONUM, Field.IMPORT, 56, Field.SYMBOL, 97, 98, 99, 100, 101, 102};
    Tgh Qhi;
    long cJ;

    /* renamed from: CJ */
    public Qhi clone() {
        Qhi qhi = new Qhi();
        if (this.cJ == 0) {
            return qhi;
        }
        Tgh Qhi = this.Qhi.Qhi();
        qhi.Qhi = Qhi;
        Qhi.ROR = Qhi;
        Qhi.Tgh = Qhi;
        Tgh tgh = this.Qhi;
        while (true) {
            tgh = tgh.Tgh;
            if (tgh != this.Qhi) {
                qhi.Qhi.ROR.Qhi(tgh.Qhi());
            } else {
                qhi.cJ = this.cJ;
                return qhi;
            }
        }
    }

    public boolean Qhi() {
        return this.cJ == 0;
    }

    public String ac() {
        try {
            return Qhi(this.cJ, WAv.Qhi);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public byte cJ() {
        long j10 = this.cJ;
        if (j10 != 0) {
            Tgh tgh = this.Qhi;
            int i10 = tgh.cJ;
            int i11 = tgh.f8353ac;
            int i12 = i10 + 1;
            byte b10 = tgh.Qhi[i10];
            this.cJ = j10 - 1;
            if (i12 == i11) {
                this.Qhi = tgh.cJ();
                ROR.Qhi(tgh);
            } else {
                tgh.cJ = i12;
            }
            return b10;
        }
        throw new IllegalStateException("size == 0");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qhi)) {
            return false;
        }
        Qhi qhi = (Qhi) obj;
        long j10 = this.cJ;
        if (j10 != qhi.cJ) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        Tgh tgh = this.Qhi;
        Tgh tgh2 = qhi.Qhi;
        int i10 = tgh.cJ;
        int i11 = tgh2.cJ;
        while (j11 < this.cJ) {
            long min = Math.min(tgh.f8353ac - i10, tgh2.f8353ac - i11);
            int i12 = 0;
            while (i12 < min) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (tgh.Qhi[i10] != tgh2.Qhi[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == tgh.f8353ac) {
                tgh = tgh.Tgh;
                i10 = tgh.cJ;
            }
            if (i11 == tgh2.f8353ac) {
                tgh2 = tgh2.Tgh;
                i11 = tgh2.cJ;
            }
            j11 += min;
        }
        return true;
    }

    public final fl fl() {
        long j10 = this.cJ;
        if (j10 <= 2147483647L) {
            return CJ((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.cJ);
    }

    public int hashCode() {
        Tgh tgh = this.Qhi;
        if (tgh == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = tgh.f8353ac;
            for (int i12 = tgh.cJ; i12 < i11; i12++) {
                i10 = (i10 * 31) + tgh.Qhi[i12];
            }
            tgh = tgh.Tgh;
        } while (tgh != this.Qhi);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        Tgh tgh = this.Qhi;
        if (tgh == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), tgh.f8353ac - tgh.cJ);
        byteBuffer.put(tgh.Qhi, tgh.cJ, min);
        int i10 = tgh.cJ + min;
        tgh.cJ = i10;
        this.cJ -= min;
        if (i10 == tgh.f8353ac) {
            this.Qhi = tgh.cJ();
            ROR.Qhi(tgh);
        }
        return min;
    }

    public String toString() {
        return fl().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining;
            while (i10 > 0) {
                Tgh ac2 = ac(1);
                int min = Math.min(i10, 8192 - ac2.f8353ac);
                byteBuffer.get(ac2.Qhi, ac2.f8353ac, min);
                i10 -= min;
                ac2.f8353ac += min;
            }
            this.cJ += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public String Qhi(long j10, Charset charset) {
        WAv.Qhi(this.cJ, 0L, j10);
        if (charset != null) {
            if (j10 <= 2147483647L) {
                if (j10 == 0) {
                    return "";
                }
                Tgh tgh = this.Qhi;
                int i10 = tgh.cJ;
                if (i10 + j10 > tgh.f8353ac) {
                    return new String(Qhi(j10), charset);
                }
                String str = new String(tgh.Qhi, i10, (int) j10, charset);
                int i11 = (int) (tgh.cJ + j10);
                tgh.cJ = i11;
                this.cJ -= j10;
                if (i11 == tgh.f8353ac) {
                    this.Qhi = tgh.cJ();
                    ROR.Qhi(tgh);
                }
                return str;
            }
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
        }
        throw new IllegalArgumentException("charset == null");
    }

    public Tgh ac(int i10) {
        if (i10 > 0 && i10 <= 8192) {
            Tgh tgh = this.Qhi;
            if (tgh == null) {
                Tgh Qhi = ROR.Qhi();
                this.Qhi = Qhi;
                Qhi.ROR = Qhi;
                Qhi.Tgh = Qhi;
                return Qhi;
            }
            Tgh tgh2 = tgh.ROR;
            return (tgh2.f8353ac + i10 > 8192 || !tgh2.f8354fl) ? tgh2.Qhi(ROR.Qhi()) : tgh2;
        }
        throw new IllegalArgumentException();
    }

    public final fl CJ(int i10) {
        if (i10 == 0) {
            return fl.f8355ac;
        }
        return new Sf(this, i10);
    }

    public Qhi cJ(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            WAv.Qhi(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                Tgh ac2 = ac(1);
                int min = Math.min(i12 - i10, 8192 - ac2.f8353ac);
                System.arraycopy(bArr, i10, ac2.Qhi, ac2.f8353ac, min);
                i10 += min;
                ac2.f8353ac += min;
            }
            this.cJ += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] Qhi(long j10) {
        WAv.Qhi(this.cJ, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            Qhi(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
    }

    public void Qhi(byte[] bArr) {
        int i10 = 0;
        while (i10 < bArr.length) {
            int Qhi = Qhi(bArr, i10, bArr.length - i10);
            if (Qhi == -1) {
                throw new EOFException();
            }
            i10 += Qhi;
        }
    }

    public Qhi cJ(int i10) {
        Tgh ac2 = ac(1);
        byte[] bArr = ac2.Qhi;
        int i11 = ac2.f8353ac;
        ac2.f8353ac = i11 + 1;
        bArr[i11] = (byte) i10;
        this.cJ++;
        return this;
    }

    public int Qhi(byte[] bArr, int i10, int i11) {
        WAv.Qhi(bArr.length, i10, i11);
        Tgh tgh = this.Qhi;
        if (tgh == null) {
            return -1;
        }
        int min = Math.min(i11, tgh.f8353ac - tgh.cJ);
        System.arraycopy(tgh.Qhi, tgh.cJ, bArr, i10, min);
        int i12 = tgh.cJ + min;
        tgh.cJ = i12;
        this.cJ -= min;
        if (i12 == tgh.f8353ac) {
            this.Qhi = tgh.cJ();
            ROR.Qhi(tgh);
        }
        return min;
    }

    public Qhi cJ(long j10) {
        if (j10 == 0) {
            return cJ(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        Tgh ac2 = ac(numberOfTrailingZeros);
        byte[] bArr = ac2.Qhi;
        int i10 = ac2.f8353ac;
        for (int i11 = (i10 + numberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f8352ac[(int) (15 & j10)];
            j10 >>>= 4;
        }
        ac2.f8353ac += numberOfTrailingZeros;
        this.cJ += numberOfTrailingZeros;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public Qhi Qhi(String str) {
        return Qhi(str, 0, str.length());
    }

    public Qhi Qhi(String str, int i10, int i11) {
        char charAt;
        if (str != null) {
            if (i10 >= 0) {
                if (i11 >= i10) {
                    if (i11 > str.length()) {
                        StringBuilder e10 = d.e("endIndex > string.length: ", i11, " > ");
                        e10.append(str.length());
                        throw new IllegalArgumentException(e10.toString());
                    }
                    while (i10 < i11) {
                        char charAt2 = str.charAt(i10);
                        if (charAt2 < 128) {
                            Tgh ac2 = ac(1);
                            byte[] bArr = ac2.Qhi;
                            int i12 = ac2.f8353ac - i10;
                            int min = Math.min(i11, 8192 - i12);
                            int i13 = i10 + 1;
                            bArr[i10 + i12] = (byte) charAt2;
                            while (true) {
                                i10 = i13;
                                if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                                    break;
                                }
                                i13 = i10 + 1;
                                bArr[i10 + i12] = (byte) charAt;
                            }
                            int i14 = ac2.f8353ac;
                            int i15 = (i12 + i10) - i14;
                            ac2.f8353ac = i14 + i15;
                            this.cJ += i15;
                        } else {
                            if (charAt2 < 2048) {
                                cJ((charAt2 >> 6) | 192);
                                cJ((charAt2 & '?') | 128);
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i16 = i10 + 1;
                                char charAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                                if (charAt2 <= 56319 && charAt3 >= 56320 && charAt3 <= 57343) {
                                    int i17 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                                    cJ((i17 >> 18) | 240);
                                    cJ(((i17 >> 12) & 63) | 128);
                                    cJ(((i17 >> 6) & 63) | 128);
                                    cJ((i17 & 63) | 128);
                                    i10 += 2;
                                } else {
                                    cJ(63);
                                    i10 = i16;
                                }
                            } else {
                                cJ((charAt2 >> '\f') | 224);
                                cJ(((charAt2 >> 6) & 63) | 128);
                                cJ((charAt2 & '?') | 128);
                            }
                            i10++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(a0.d.b("endIndex < beginIndex: ", i11, " < ", i10));
            }
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        throw new IllegalArgumentException("string == null");
    }

    public Qhi Qhi(int i10) {
        if (i10 < 128) {
            cJ(i10);
        } else if (i10 < 2048) {
            cJ((i10 >> 6) | 192);
            cJ((i10 & 63) | 128);
        } else if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                cJ(63);
            } else {
                cJ((i10 >> 12) | 224);
                cJ(((i10 >> 6) & 63) | 128);
                cJ((i10 & 63) | 128);
            }
        } else if (i10 <= 1114111) {
            cJ((i10 >> 18) | 240);
            cJ(((i10 >> 12) & 63) | 128);
            cJ(((i10 >> 6) & 63) | 128);
            cJ((i10 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
        }
        return this;
    }

    public Qhi Qhi(String str, int i10, int i11, Charset charset) {
        if (str != null) {
            if (i10 >= 0) {
                if (i11 >= i10) {
                    if (i11 > str.length()) {
                        StringBuilder e10 = d.e("endIndex > string.length: ", i11, " > ");
                        e10.append(str.length());
                        throw new IllegalArgumentException(e10.toString());
                    } else if (charset != null) {
                        if (charset.equals(WAv.Qhi)) {
                            return Qhi(str, i10, i11);
                        }
                        byte[] bytes = str.substring(i10, i11).getBytes(charset);
                        return cJ(bytes, 0, bytes.length);
                    } else {
                        throw new IllegalArgumentException("charset == null");
                    }
                }
                throw new IllegalArgumentException(a0.d.b("endIndex < beginIndex: ", i11, " < ", i10));
            }
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        throw new IllegalArgumentException("string == null");
    }
}

package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class X9 implements InterfaceC0838Gz {
    public static byte[] A07;
    public static String[] A08 = {"Qq", "sLav", "xXJIeuat1Un3oETUCUBgWYVlLTYdvUXR", "pXicUG6N1XHbCG5QhjJ94uJ", "HKhocTo1", "Z1k35KQ5uMLjnmzbQjJ", "rJGKNzEqvOEIyk4kxb4", "sIOIMXdckNxf1vD7TuVkHKtZXYRsYSsj"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;
    public final HL<? super X9> A06;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{105, Field.FILESIZE, Field.SHAPE, Field.FORMTEXT, 78, 10, Field.INCLUDETEXT, Field.FILESIZE, Field.GREETINGLINE, 10, Field.FILESIZE, Field.LISTNUM, Field.AUTOTEXT, Field.INCLUDETEXT, 10, 76, Field.INCLUDEPICTURE, Field.FORMTEXT, Field.AUTOTEXT, 10, 78, Field.AUTOTEXT, Field.AUTOTEXTLIST, Field.TOA, Field.HYPERLINK, Field.INCLUDEPICTURE, Field.LISTNUM, Field.GREETINGLINE, Field.FILESIZE, Field.HYPERLINK, 10, 76, Field.FILESIZE, Field.HYPERLINK, 16, 10, Field.GOTOBUTTON};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final long AEE(H3 h32) throws C0834Gv {
        try {
            this.A02 = h32.A04;
            this.A01 = this.A05.openAssetFileDescriptor(this.A02, A00(36, 1, 106));
            if (this.A01 != null) {
                this.A03 = new FileInputStream(this.A01.getFileDescriptor());
                long startOffset = this.A01.getStartOffset();
                long skip = this.A03.skip(h32.A03 + startOffset) - startOffset;
                if (skip == h32.A03) {
                    if (h32.A02 != -1) {
                        this.A00 = h32.A02;
                    } else {
                        long length = this.A01.getLength();
                        if (length == -1) {
                            FileChannel channel = this.A03.getChannel();
                            long size = channel.size();
                            this.A00 = size != 0 ? size - channel.position() : -1L;
                        } else {
                            this.A00 = length - skip;
                        }
                    }
                    this.A04 = true;
                    if (this.A06 != null) {
                        this.A06.ADs(this, h32);
                    }
                    return this.A00;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException(A00(0, 36, 0) + this.A02);
        } catch (IOException e10) {
            throw new C0834Gv(e10);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.ContentDataSource> */
    public X9(Context context, HL<? super X9> hl2) {
        this.A05 = context.getContentResolver();
        this.A06 = hl2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final Uri A8c() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final void close() throws C0834Gv {
        this.A02 = null;
        try {
            try {
                if (this.A03 != null) {
                    this.A03.close();
                }
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                    } catch (IOException e10) {
                        throw new C0834Gv(e10);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        if (this.A06 != null) {
                            this.A06.ADr(this);
                        }
                    }
                }
            } catch (Throwable th2) {
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            if (A08[1].length() == 5) {
                                throw new RuntimeException();
                            }
                            A08[3] = "3rXXSzOuZYrIDyr67K";
                            if (this.A06 != null) {
                                this.A06.ADr(this);
                            }
                        }
                        throw th2;
                    } catch (IOException e11) {
                        throw new C0834Gv(e11);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        if (this.A06 != null) {
                            this.A06.ADr(this);
                        }
                    }
                }
            }
        } catch (IOException e12) {
            throw new C0834Gv(e12);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final int read(byte[] bArr, int i10, int i11) throws C0834Gv {
        if (i11 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        try {
            if (this.A00 != -1) {
                i11 = (int) Math.min(this.A00, i11);
            }
            int read = this.A03.read(bArr, i10, i11);
            if (read == -1) {
                int bytesRead = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
                if (bytesRead == 0) {
                    return -1;
                }
                throw new C0834Gv(new EOFException());
            }
            int bytesRead2 = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
            if (bytesRead2 != 0) {
                this.A00 -= read;
            }
            if (this.A06 != null) {
                this.A06.ABS(this, read);
            }
            return read;
        } catch (IOException e10) {
            throw new C0834Gv(e10);
        }
    }
}

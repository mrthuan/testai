package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f7035a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f7036b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes.dex */
    public interface Reader {

        /* loaded from: classes.dex */
        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        short b();

        long skip(long j10);
    }

    /* loaded from: classes.dex */
    public static final class a implements Reader {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f7037a;

        public a(ByteBuffer byteBuffer) {
            this.f7037a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a() {
            return (b() << 8) | b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short b() {
            ByteBuffer byteBuffer = this.f7037a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j10) {
            ByteBuffer byteBuffer = this.f7037a;
            int min = (int) Math.min(byteBuffer.remaining(), j10);
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f7038a;

        public b(byte[] bArr, int i10) {
            this.f7038a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public final short a(int i10) {
            boolean z10;
            ByteBuffer byteBuffer = this.f7038a;
            if (byteBuffer.remaining() - i10 >= 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return byteBuffer.getShort(i10);
            }
            return (short) -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Reader {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f7039a;

        public c(InputStream inputStream) {
            this.f7039a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a() {
            return (b() << 8) | b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short b() {
            int read = this.f7039a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        public final int c(int i10, byte[] bArr) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f7039a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i11;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j10) {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                InputStream inputStream = this.f7039a;
                long skip = inputStream.skip(j11);
                if (skip > 0) {
                    j11 -= skip;
                } else if (inputStream.read() == -1) {
                    break;
                } else {
                    j11--;
                }
            }
            return j10 - j11;
        }
    }

    public static ImageHeaderParser.ImageType d(Reader reader) {
        try {
            int a10 = reader.a();
            if (a10 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int b10 = (a10 << 8) | reader.b();
            if (b10 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int b11 = (b10 << 8) | reader.b();
            if (b11 == -1991225785) {
                reader.skip(21L);
                try {
                    if (reader.b() >= 3) {
                        return ImageHeaderParser.ImageType.PNG_A;
                    }
                    return ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (b11 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                reader.skip(4L);
                if (((reader.a() << 16) | reader.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int a11 = (reader.a() << 16) | reader.a();
                if ((a11 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i10 = a11 & FunctionEval.FunctionID.EXTERNAL_FUNC;
                if (i10 == 88) {
                    reader.skip(4L);
                    if ((reader.b() & 16) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else if (i10 == 76) {
                    reader.skip(4L);
                    if ((reader.b() & 8) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int e(c cVar, byte[] bArr, int i10) {
        boolean z10;
        ByteOrder byteOrder;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        if (cVar.c(i10, bArr) != i10) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        byte[] bArr2 = f7035a;
        if (bArr != null && i10 > bArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                if (i13 >= bArr2.length) {
                    break;
                } else if (bArr[i13] != bArr2[i13]) {
                    z10 = false;
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (z10) {
            b bVar = new b(bArr, i10);
            short a10 = bVar.a(6);
            if (a10 != 18761) {
                if (a10 != 19789) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            ByteBuffer byteBuffer = bVar.f7038a;
            byteBuffer.order(byteOrder);
            if (byteBuffer.remaining() - 10 >= 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i11 = byteBuffer.getInt(10);
            } else {
                i11 = -1;
            }
            int i14 = i11 + 6;
            short a11 = bVar.a(i14);
            for (int i15 = 0; i15 < a11; i15++) {
                int i16 = (i15 * 12) + i14 + 2;
                if (bVar.a(i16) == 274) {
                    short a12 = bVar.a(i16 + 2);
                    if (a12 >= 1 && a12 <= 12) {
                        int i17 = i16 + 4;
                        if (byteBuffer.remaining() - i17 >= 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            i12 = byteBuffer.getInt(i17);
                        } else {
                            i12 = -1;
                        }
                        if (i12 < 0) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                            int i18 = i12 + f7036b[a12];
                            if (i18 > 4) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                int i19 = i16 + 8;
                                if (i19 >= 0 && i19 <= byteBuffer.remaining()) {
                                    if (i18 >= 0 && i18 + i19 <= byteBuffer.remaining()) {
                                        return bVar.a(i19);
                                    }
                                    Log.isLoggable("DfltImageHeaderParser", 3);
                                } else {
                                    Log.isLoggable("DfltImageHeaderParser", 3);
                                }
                            }
                        }
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    }
                }
            }
            return -1;
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        com.google.android.play.core.assetpacks.c.l(byteBuffer);
        return d(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int b(InputStream inputStream, w3.b bVar) {
        boolean z10;
        int i10;
        com.google.android.play.core.assetpacks.c.l(inputStream);
        c cVar = new c(inputStream);
        com.google.android.play.core.assetpacks.c.l(bVar);
        try {
            int a10 = cVar.a();
            if ((a10 & 65496) != 65496 && a10 != 19789 && a10 != 18761) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            while (true) {
                if (cVar.b() != 255) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                    break;
                }
                short b10 = cVar.b();
                if (b10 == 218) {
                    break;
                } else if (b10 == 217) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                    break;
                } else {
                    i10 = cVar.a() - 2;
                    if (b10 == 225) {
                        break;
                    }
                    long j10 = i10;
                    if (cVar.skip(j10) != j10) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        break;
                    }
                }
            }
            i10 = -1;
            if (i10 == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) bVar.c(i10, byte[].class);
            int e10 = e(cVar, bArr, i10);
            bVar.put(bArr);
            return e10;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType c(InputStream inputStream) {
        com.google.android.play.core.assetpacks.c.l(inputStream);
        return d(new c(inputStream));
    }
}

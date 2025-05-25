package j1;

import a6.h;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.fontbox.ttf.WGL4Names;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: ExifInterface.java */
/* loaded from: classes.dex */
public final class a {
    public static final e T;
    public static final e[][] U;
    public static final e[] V;
    public static final e W;
    public static final e X;
    public static final HashMap<Integer, e>[] Y;
    public static final HashMap<String, e>[] Z;

    /* renamed from: a0  reason: collision with root package name */
    public static final HashSet<String> f18976a0;

    /* renamed from: b0  reason: collision with root package name */
    public static final HashMap<Integer, Integer> f18977b0;

    /* renamed from: c0  reason: collision with root package name */
    public static final Charset f18978c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final byte[] f18979d0;

    /* renamed from: e0  reason: collision with root package name */
    public static final byte[] f18980e0;

    /* renamed from: f0  reason: collision with root package name */
    public static final Pattern f18981f0;

    /* renamed from: a  reason: collision with root package name */
    public String f18990a;

    /* renamed from: b  reason: collision with root package name */
    public FileDescriptor f18991b;
    public AssetManager.AssetInputStream c;

    /* renamed from: d  reason: collision with root package name */
    public int f18992d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, d>[] f18993e;

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f18994f;

    /* renamed from: g  reason: collision with root package name */
    public ByteOrder f18995g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18996h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f18997i;

    /* renamed from: j  reason: collision with root package name */
    public int f18998j;

    /* renamed from: k  reason: collision with root package name */
    public int f18999k;

    /* renamed from: l  reason: collision with root package name */
    public byte[] f19000l;

    /* renamed from: m  reason: collision with root package name */
    public int f19001m;

    /* renamed from: n  reason: collision with root package name */
    public int f19002n;

    /* renamed from: o  reason: collision with root package name */
    public int f19003o;

    /* renamed from: p  reason: collision with root package name */
    public int f19004p;

    /* renamed from: q  reason: collision with root package name */
    public int f19005q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f19006r;

    /* renamed from: s  reason: collision with root package name */
    public static final boolean f18982s = Log.isLoggable("ExifInterface", 3);

    /* renamed from: t  reason: collision with root package name */
    public static final List<Integer> f18983t = Arrays.asList(1, 6, 3, 8);

    /* renamed from: u  reason: collision with root package name */
    public static final List<Integer> f18984u = Arrays.asList(2, 7, 4, 5);

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f18985v = {8, 8, 8};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f18986w = {8};

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f18987x = {-1, -40, -1};

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f18988y = {102, 116, 121, 112};

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f18989z = {109, 105, 102, Field.EQ};
    public static final byte[] A = {104, 101, 105, 99};
    public static final byte[] B = {Field.AUTOTEXT, 76, Field.AUTOTEXTLIST, 77, 80, 0};
    public static final byte[] C = {Field.AUTOTEXT, 76, Field.AUTOTEXTLIST, 77, 80, Field.DOCPROPERTY, Field.FORMDROPDOWN, 0, Field.TOA, Field.TOA};
    public static final byte[] D = {-119, 80, 78, Field.FORMCHECKBOX, 13, 10, 26, 10};
    public static final byte[] E = {101, Field.HYPERLINK, Field.TOA, 102};
    public static final byte[] F = {Field.TOA, Field.NOTEREF, Field.INCLUDETEXT, 82};
    public static final byte[] G = {Field.TOA, Field.FILESIZE, 78, Field.INCLUDETEXT};
    public static final byte[] H = {82, Field.TOA, Field.FORMTEXT, Field.FORMTEXT};
    public static final byte[] I = {Field.CONTROL, Field.FILESIZE, Field.SECTIONPAGES, 80};
    public static final byte[] J = {Field.FILESIZE, Field.HYPERLINK, Field.TOA, Field.FORMTEXT};
    public static final byte[] K = {-99, 1, 42};
    public static final byte[] L = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] M = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] N = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] O = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] P = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] Q = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] R = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] S = {Field.SECTION, Field.FORMDROPDOWN, Field.INCLUDEPICTURE, Field.TOA, Field.TOA, 0, 0, 0};

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: e  reason: collision with root package name */
        public static final ByteOrder f19009e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f  reason: collision with root package name */
        public static final ByteOrder f19010f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a  reason: collision with root package name */
        public final DataInputStream f19011a;

        /* renamed from: b  reason: collision with root package name */
        public ByteOrder f19012b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public int f19013d;

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f19011a.available();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i10) {
            this.f19011a.mark(i10);
        }

        @Override // java.io.InputStream
        public final int read() {
            this.f19013d++;
            return this.f19011a.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.f19013d++;
            return this.f19011a.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() {
            int i10 = this.f19013d + 1;
            this.f19013d = i10;
            if (i10 <= this.c) {
                int read = this.f19011a.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.f19013d += 2;
            return this.f19011a.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i10, int i11) {
            int i12 = this.f19013d + i11;
            this.f19013d = i12;
            if (i12 <= this.c) {
                if (this.f19011a.read(bArr, i10, i11) != i11) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final int readInt() {
            int i10 = this.f19013d + 4;
            this.f19013d = i10;
            if (i10 <= this.c) {
                DataInputStream dataInputStream = this.f19011a;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                int read3 = dataInputStream.read();
                int read4 = dataInputStream.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f19012b;
                    if (byteOrder == f19009e) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f19010f) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f19012b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readLine() {
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() {
            int i10 = this.f19013d + 8;
            this.f19013d = i10;
            if (i10 <= this.c) {
                DataInputStream dataInputStream = this.f19011a;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                int read3 = dataInputStream.read();
                int read4 = dataInputStream.read();
                int read5 = dataInputStream.read();
                int read6 = dataInputStream.read();
                int read7 = dataInputStream.read();
                int read8 = dataInputStream.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f19012b;
                    if (byteOrder == f19009e) {
                        return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f19010f) {
                        return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                    }
                    throw new IOException("Invalid byte order: " + this.f19012b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final short readShort() {
            int i10 = this.f19013d + 2;
            this.f19013d = i10;
            if (i10 <= this.c) {
                DataInputStream dataInputStream = this.f19011a;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f19012b;
                    if (byteOrder == f19009e) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f19010f) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f19012b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.f19013d += 2;
            return this.f19011a.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.f19013d++;
            return this.f19011a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() {
            int i10 = this.f19013d + 2;
            this.f19013d = i10;
            if (i10 <= this.c) {
                DataInputStream dataInputStream = this.f19011a;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f19012b;
                    if (byteOrder == f19009e) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f19010f) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f19012b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final void seek(long j10) {
            int i10 = this.f19013d;
            if (i10 > j10) {
                this.f19013d = 0;
                DataInputStream dataInputStream = this.f19011a;
                dataInputStream.reset();
                dataInputStream.mark(this.c);
            } else {
                j10 -= i10;
            }
            int i11 = (int) j10;
            if (skipBytes(i11) == i11) {
                return;
            }
            throw new IOException("Couldn't seek up to the byteCount");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i10) {
            int min = Math.min(i10, this.c - this.f19013d);
            int i11 = 0;
            while (i11 < min) {
                i11 += this.f19011a.skipBytes(min - i11);
            }
            this.f19013d += i11;
            return i11;
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            this.f19012b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f19011a = dataInputStream;
            int available = dataInputStream.available();
            this.c = available;
            this.f19013d = 0;
            dataInputStream.mark(available);
            this.f19012b = byteOrder;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            int read = this.f19011a.read(bArr, i10, i11);
            this.f19013d += read;
            return read;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) {
            int length = this.f19013d + bArr.length;
            this.f19013d = length;
            if (length <= this.c) {
                if (this.f19011a.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class c extends FilterOutputStream {

        /* renamed from: a  reason: collision with root package name */
        public final OutputStream f19014a;

        /* renamed from: b  reason: collision with root package name */
        public ByteOrder f19015b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f19014a = outputStream;
            this.f19015b = byteOrder;
        }

        public final void a(int i10) {
            this.f19014a.write(i10);
        }

        public final void b(int i10) {
            ByteOrder byteOrder = this.f19015b;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f19014a;
            if (byteOrder == byteOrder2) {
                outputStream.write((i10 >>> 0) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                outputStream.write((i10 >>> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                outputStream.write((i10 >>> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                outputStream.write((i10 >>> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((i10 >>> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                outputStream.write((i10 >>> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                outputStream.write((i10 >>> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                outputStream.write((i10 >>> 0) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            }
        }

        public final void c(short s4) {
            ByteOrder byteOrder = this.f19015b;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f19014a;
            if (byteOrder == byteOrder2) {
                outputStream.write((s4 >>> 0) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                outputStream.write((s4 >>> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((s4 >>> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                outputStream.write((s4 >>> 0) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) {
            this.f19014a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) {
            this.f19014a.write(bArr, i10, i11);
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f19016a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19017b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f19018d;

        public d(int i10, int i11, byte[] bArr) {
            this(-1L, bArr, i10, i11);
        }

        public static d a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(a.f18978c0);
            return new d(2, bytes.length, bytes);
        }

        public static d b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static d c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.R[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d d(g[] gVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.R[5] * gVarArr.length]);
            wrap.order(byteOrder);
            for (g gVar : gVarArr) {
                wrap.putInt((int) gVar.f19022a);
                wrap.putInt((int) gVar.f19023b);
            }
            return new d(5, gVarArr.length, wrap.array());
        }

        public static d e(int i10, ByteOrder byteOrder) {
            return f(new int[]{i10}, byteOrder);
        }

        public static d f(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.R[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public final double g(ByteOrder byteOrder) {
            Serializable j10 = j(byteOrder);
            if (j10 != null) {
                if (j10 instanceof String) {
                    return Double.parseDouble((String) j10);
                }
                if (j10 instanceof long[]) {
                    long[] jArr = (long[]) j10;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j10 instanceof int[]) {
                    int[] iArr = (int[]) j10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j10 instanceof double[]) {
                    double[] dArr = (double[]) j10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j10 instanceof g[]) {
                    g[] gVarArr = (g[]) j10;
                    if (gVarArr.length == 1) {
                        g gVar = gVarArr[0];
                        return gVar.f19022a / gVar.f19023b;
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public final int h(ByteOrder byteOrder) {
            Serializable j10 = j(byteOrder);
            if (j10 != null) {
                if (j10 instanceof String) {
                    return Integer.parseInt((String) j10);
                }
                if (j10 instanceof long[]) {
                    long[] jArr = (long[]) j10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j10 instanceof int[]) {
                    int[] iArr = (int[]) j10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public final String i(ByteOrder byteOrder) {
            Serializable j10 = j(byteOrder);
            if (j10 == null) {
                return null;
            }
            if (j10 instanceof String) {
                return (String) j10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (j10 instanceof long[]) {
                long[] jArr = (long[]) j10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (j10 instanceof int[]) {
                int[] iArr = (int[]) j10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (j10 instanceof double[]) {
                double[] dArr = (double[]) j10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (!(j10 instanceof g[])) {
                return null;
            } else {
                g[] gVarArr = (g[]) j10;
                while (i10 < gVarArr.length) {
                    sb2.append(gVarArr[i10].f19022a);
                    sb2.append(PackagingURIHelper.FORWARD_SLASH_CHAR);
                    sb2.append(gVarArr[i10].f19023b);
                    i10++;
                    if (i10 != gVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:81|(3:83|(2:84|(1:93)(2:86|(2:89|90)(1:88)))|(1:92))|94|(2:96|(6:105|106|107|108|109|110)(3:98|(2:100|101)(2:103|104)|102))|113|107|108|109|110) */
        /* JADX WARN: Type inference failed for: r13v17, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v18, types: [long[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v19, types: [j1.a$g[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v20, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v21, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v22, types: [j1.a$g[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v23, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v24, types: [double[], java.io.Serializable] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.io.Serializable j(java.nio.ByteOrder r13) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j1.a.d.j(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(a.Q[this.f19016a]);
            sb2.append(", data length:");
            return h.g(sb2, this.f19018d.length, ")");
        }

        public d(long j10, byte[] bArr, int i10, int i11) {
            this.f19016a = i10;
            this.f19017b = i11;
            this.c = j10;
            this.f19018d = bArr;
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class f {
        public static void a(FileDescriptor fileDescriptor, int i10) {
            try {
                Os.lseek(fileDescriptor, 0, i10);
            } catch (ErrnoException e10) {
                throw new IOException("Failed to seek file descriptor", e10);
            }
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public final long f19022a;

        /* renamed from: b  reason: collision with root package name */
        public final long f19023b;

        public g(long j10, long j11) {
            if (j11 == 0) {
                this.f19022a = 0L;
                this.f19023b = 1L;
                return;
            }
            this.f19022a = j10;
            this.f19023b = j11;
        }

        public final String toString() {
            return this.f19022a + PackagingURIHelper.FORWARD_SLASH_STRING + this.f19023b;
        }
    }

    static {
        e[] eVarArr;
        e[] eVarArr2 = {new e("NewSubfileType", 254, 4), new e("SubfileType", FunctionEval.FunctionID.EXTERNAL_FUNC, 4), new e("ImageWidth", 256), new e("ImageLength", 257), new e("BitsPerSample", WGL4Names.NUMBER_OF_MAC_GLYPHS, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278), new e("StripByteCounts", 279), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD, 1)};
        e[] eVarArr3 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962), new e("PixelYDimension", 40963), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720)};
        e[] eVarArr4 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr5 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr6 = {new e("NewSubfileType", 254, 4), new e("SubfileType", FunctionEval.FunctionID.EXTERNAL_FUNC, 4), new e("ThumbnailImageWidth", 256), new e("ThumbnailImageLength", 257), new e("BitsPerSample", WGL4Names.NUMBER_OF_MAC_GLYPHS, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278), new e("StripByteCounts", 279), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720)};
        T = new e("StripOffsets", 273, 3);
        U = new e[][]{eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr6, eVarArr2, new e[]{new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", WGL4Names.NUMBER_OF_MAC_GLYPHS, 4)}, new e[]{new e("AspectFrame", 4371, 3)}, new e[]{new e("ColorSpace", 55, 3)}};
        V = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        W = new e("JPEGInterchangeFormat", 513, 4);
        X = new e("JPEGInterchangeFormatLength", 514, 4);
        Y = new HashMap[10];
        Z = new HashMap[10];
        f18976a0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f18977b0 = new HashMap<>();
        Charset forName = Charset.forName(CharEncoding.US_ASCII);
        f18978c0 = forName;
        f18979d0 = "Exif\u0000\u0000".getBytes(forName);
        f18980e0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr7 = U;
            if (i10 < eVarArr7.length) {
                Y[i10] = new HashMap<>();
                Z[i10] = new HashMap<>();
                for (e eVar : eVarArr7[i10]) {
                    Y[i10].put(Integer.valueOf(eVar.f19019a), eVar);
                    Z[i10].put(eVar.f19020b, eVar);
                }
                i10++;
            } else {
                HashMap<Integer, Integer> hashMap = f18977b0;
                e[] eVarArr8 = V;
                hashMap.put(Integer.valueOf(eVarArr8[0].f19019a), 5);
                hashMap.put(Integer.valueOf(eVarArr8[1].f19019a), 1);
                hashMap.put(Integer.valueOf(eVarArr8[2].f19019a), 2);
                hashMap.put(Integer.valueOf(eVarArr8[3].f19019a), 3);
                hashMap.put(Integer.valueOf(eVarArr8[4].f19019a), 7);
                hashMap.put(Integer.valueOf(eVarArr8[5].f19019a), 8);
                Pattern.compile(".*[1-9].*");
                f18981f0 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public a(String str) {
        FileInputStream fileInputStream;
        boolean z10;
        e[][] eVarArr = U;
        this.f18993e = new HashMap[eVarArr.length];
        this.f18994f = new HashSet(eVarArr.length);
        this.f18995g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream2 = null;
            this.c = null;
            this.f18990a = str;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                try {
                    f.a(fileInputStream.getFD(), OsConstants.SEEK_CUR);
                    z10 = true;
                } catch (Exception unused) {
                    z10 = false;
                }
                if (z10) {
                    this.f18991b = fileInputStream.getFD();
                } else {
                    this.f18991b = null;
                }
                x(fileInputStream);
                c(fileInputStream);
                return;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                c(fileInputStream2);
                throw th;
            }
        }
        throw new NullPointerException("filename cannot be null");
    }

    public static ByteOrder A(b bVar) {
        short readShort = bVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i10])));
        }
        return sb2.toString();
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static long[] d(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = iArr[i10];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static void e(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i10) {
        byte[] bArr = new byte[8192];
        while (i10 > 0) {
            int min = Math.min(i10, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i10 -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    public static void g(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        String concat;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f18978c0;
                sb2.append(new String(bArr, charset));
                if (bArr2 == null) {
                    concat = "";
                } else {
                    concat = " or ".concat(new String(bArr2, charset));
                }
                sb2.append(concat);
                throw new IOException(sb2.toString());
            }
            int readInt = bVar.readInt();
            cVar.write(bArr3);
            cVar.b(readInt);
            if (readInt % 2 == 1) {
                readInt++;
            }
            f(bVar, cVar, readInt);
            if (!Arrays.equals(bArr3, bArr)) {
                if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static Pair<Integer, Integer> u(String str) {
        int intValue;
        int i10;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> u7 = u(split[0]);
            if (((Integer) u7.first).intValue() == 2) {
                return u7;
            }
            for (int i11 = 1; i11 < split.length; i11++) {
                Pair<Integer, Integer> u10 = u(split[i11]);
                if (!((Integer) u10.first).equals(u7.first) && !((Integer) u10.second).equals(u7.first)) {
                    intValue = -1;
                } else {
                    intValue = ((Integer) u7.first).intValue();
                }
                if (((Integer) u7.second).intValue() != -1 && (((Integer) u10.first).equals(u7.second) || ((Integer) u10.second).equals(u7.second))) {
                    i10 = ((Integer) u7.second).intValue();
                } else {
                    i10 = -1;
                }
                if (intValue == -1 && i10 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    u7 = new Pair<>(Integer.valueOf(i10), -1);
                } else if (i10 == -1) {
                    u7 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return u7;
        } else if (str.contains(PackagingURIHelper.FORWARD_SLASH_STRING)) {
            String[] split2 = str.split(PackagingURIHelper.FORWARD_SLASH_STRING, -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair<>(2, -1);
        } else {
            try {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    if (valueOf.longValue() >= 0 && valueOf.longValue() <= 65535) {
                        return new Pair<>(3, 4);
                    }
                    if (valueOf.longValue() < 0) {
                        return new Pair<>(9, -1);
                    }
                    return new Pair<>(4, -1);
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused3) {
                return new Pair<>(2, -1);
            }
        }
    }

    public final void B(int i10, byte[] bArr) {
        b bVar = new b(bArr);
        y(bVar, bArr.length);
        C(bVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(j1.a.b r29, int r30) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.a.C(j1.a$b, int):void");
    }

    public final void D(String str) {
        for (int i10 = 0; i10 < U.length; i10++) {
            this.f18993e[i10].remove(str);
        }
    }

    public final void E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        d dVar;
        if (f18982s) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            cVar.a(-1);
            if (dataInputStream.readByte() == -40) {
                cVar.a(-40);
                String h10 = h("Xmp");
                HashMap<String, d>[] hashMapArr = this.f18993e;
                if (h10 != null && this.f19006r) {
                    dVar = hashMapArr[0].remove("Xmp");
                } else {
                    dVar = null;
                }
                cVar.a(-1);
                cVar.a(-31);
                L(cVar);
                if (dVar != null) {
                    hashMapArr[0].put("Xmp", dVar);
                }
                byte[] bArr = new byte[4096];
                while (dataInputStream.readByte() == -1) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte != -39 && readByte != -38) {
                        if (readByte != -31) {
                            cVar.a(-1);
                            cVar.a(readByte);
                            int readUnsignedShort = dataInputStream.readUnsignedShort();
                            cVar.c((short) readUnsignedShort);
                            int i10 = readUnsignedShort - 2;
                            if (i10 >= 0) {
                                while (i10 > 0) {
                                    int read = dataInputStream.read(bArr, 0, Math.min(i10, 4096));
                                    if (read >= 0) {
                                        cVar.write(bArr, 0, read);
                                        i10 -= read;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        } else {
                            int readUnsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                            if (readUnsignedShort2 >= 0) {
                                byte[] bArr2 = new byte[6];
                                if (readUnsignedShort2 >= 6) {
                                    if (dataInputStream.read(bArr2) == 6) {
                                        if (Arrays.equals(bArr2, f18979d0)) {
                                            int i11 = readUnsignedShort2 - 6;
                                            if (dataInputStream.skipBytes(i11) != i11) {
                                                throw new IOException("Invalid length");
                                            }
                                        }
                                    } else {
                                        throw new IOException("Invalid exif");
                                    }
                                }
                                cVar.a(-1);
                                cVar.a(readByte);
                                cVar.c((short) (readUnsignedShort2 + 2));
                                if (readUnsignedShort2 >= 6) {
                                    readUnsignedShort2 -= 6;
                                    cVar.write(bArr2);
                                }
                                while (readUnsignedShort2 > 0) {
                                    int read2 = dataInputStream.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                    if (read2 >= 0) {
                                        cVar.write(bArr, 0, read2);
                                        readUnsignedShort2 -= read2;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        cVar.a(-1);
                        cVar.a(readByte);
                        e(dataInputStream, cVar);
                        return;
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    public final void F(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f18982s) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(bufferedOutputStream, byteOrder);
        byte[] bArr = D;
        f(dataInputStream, cVar, bArr.length);
        int i10 = this.f19002n;
        if (i10 == 0) {
            int readInt = dataInputStream.readInt();
            cVar.b(readInt);
            f(dataInputStream, cVar, readInt + 4 + 4);
        } else {
            f(dataInputStream, cVar, ((i10 - bArr.length) - 4) - 4);
            dataInputStream.skipBytes(dataInputStream.readInt() + 4 + 4);
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream, byteOrder);
                L(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f19014a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.b((int) crc32.getValue());
                c(byteArrayOutputStream);
                e(dataInputStream, cVar);
            } catch (Throwable th2) {
                th = th2;
                c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01a2 A[Catch: all -> 0x00bd, Exception -> 0x01e2, TryCatch #4 {Exception -> 0x01e2, all -> 0x00bd, blocks: (B:7:0x0030, B:9:0x0039, B:71:0x01c0, B:10:0x0052, B:12:0x005a, B:15:0x006a, B:17:0x0072, B:19:0x0076, B:22:0x0087, B:24:0x0092, B:25:0x0097, B:27:0x00a5, B:28:0x00a9, B:30:0x00b7, B:31:0x00b9, B:34:0x00c0, B:35:0x00c7, B:37:0x00cd, B:41:0x00da, B:43:0x00e2, B:45:0x00e6, B:48:0x00f1, B:50:0x00fe, B:52:0x0104, B:64:0x014e, B:66:0x01a2, B:70:0x01ba, B:67:0x01ac, B:69:0x01b2, B:53:0x0113, B:54:0x011a, B:55:0x011b, B:57:0x0123, B:59:0x012b, B:60:0x0140, B:61:0x0147, B:74:0x01da, B:75:0x01e1), top: B:88:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ac A[Catch: all -> 0x00bd, Exception -> 0x01e2, TryCatch #4 {Exception -> 0x01e2, all -> 0x00bd, blocks: (B:7:0x0030, B:9:0x0039, B:71:0x01c0, B:10:0x0052, B:12:0x005a, B:15:0x006a, B:17:0x0072, B:19:0x0076, B:22:0x0087, B:24:0x0092, B:25:0x0097, B:27:0x00a5, B:28:0x00a9, B:30:0x00b7, B:31:0x00b9, B:34:0x00c0, B:35:0x00c7, B:37:0x00cd, B:41:0x00da, B:43:0x00e2, B:45:0x00e6, B:48:0x00f1, B:50:0x00fe, B:52:0x0104, B:64:0x014e, B:66:0x01a2, B:70:0x01ba, B:67:0x01ac, B:69:0x01b2, B:53:0x0113, B:54:0x011a, B:55:0x011b, B:57:0x0123, B:59:0x012b, B:60:0x0140, B:61:0x0147, B:74:0x01da, B:75:0x01e1), top: B:88:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(java.io.BufferedInputStream r23, java.io.BufferedOutputStream r24) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.a.G(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(j1.a.b r18) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.a.H(j1.a$b):void");
    }

    public final void I(int i10, int i11) {
        HashMap<String, d>[] hashMapArr = this.f18993e;
        if (!hashMapArr[i10].isEmpty() && !hashMapArr[i11].isEmpty()) {
            d dVar = hashMapArr[i10].get("ImageLength");
            d dVar2 = hashMapArr[i10].get("ImageWidth");
            d dVar3 = hashMapArr[i11].get("ImageLength");
            d dVar4 = hashMapArr[i11].get("ImageWidth");
            if (dVar != null && dVar2 != null && dVar3 != null && dVar4 != null) {
                int h10 = dVar.h(this.f18995g);
                int h11 = dVar2.h(this.f18995g);
                int h12 = dVar3.h(this.f18995g);
                int h13 = dVar4.h(this.f18995g);
                if (h10 < h12 && h11 < h13) {
                    HashMap<String, d> hashMap = hashMapArr[i10];
                    hashMapArr[i10] = hashMapArr[i11];
                    hashMapArr[i11] = hashMap;
                }
            }
        }
    }

    public final void J(b bVar, int i10) {
        d e10;
        d e11;
        HashMap<String, d>[] hashMapArr = this.f18993e;
        d dVar = hashMapArr[i10].get("DefaultCropSize");
        d dVar2 = hashMapArr[i10].get("SensorTopBorder");
        d dVar3 = hashMapArr[i10].get("SensorLeftBorder");
        d dVar4 = hashMapArr[i10].get("SensorBottomBorder");
        d dVar5 = hashMapArr[i10].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f19016a == 5) {
                g[] gVarArr = (g[]) dVar.j(this.f18995g);
                if (gVarArr != null && gVarArr.length == 2) {
                    e10 = d.d(new g[]{gVarArr[0]}, this.f18995g);
                    e11 = d.d(new g[]{gVarArr[1]}, this.f18995g);
                } else {
                    Arrays.toString(gVarArr);
                    return;
                }
            } else {
                int[] iArr = (int[]) dVar.j(this.f18995g);
                if (iArr != null && iArr.length == 2) {
                    e10 = d.e(iArr[0], this.f18995g);
                    e11 = d.e(iArr[1], this.f18995g);
                } else {
                    Arrays.toString(iArr);
                    return;
                }
            }
            hashMapArr[i10].put("ImageWidth", e10);
            hashMapArr[i10].put("ImageLength", e11);
        } else if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int h10 = dVar2.h(this.f18995g);
            int h11 = dVar4.h(this.f18995g);
            int h12 = dVar5.h(this.f18995g);
            int h13 = dVar3.h(this.f18995g);
            if (h11 > h10 && h12 > h13) {
                d e12 = d.e(h11 - h10, this.f18995g);
                d e13 = d.e(h12 - h13, this.f18995g);
                hashMapArr[i10].put("ImageLength", e12);
                hashMapArr[i10].put("ImageWidth", e13);
            }
        } else {
            d dVar6 = hashMapArr[i10].get("ImageLength");
            d dVar7 = hashMapArr[i10].get("ImageWidth");
            if (dVar6 == null || dVar7 == null) {
                d dVar8 = hashMapArr[i10].get("JPEGInterchangeFormat");
                d dVar9 = hashMapArr[i10].get("JPEGInterchangeFormatLength");
                if (dVar8 != null && dVar9 != null) {
                    int h14 = dVar8.h(this.f18995g);
                    int h15 = dVar8.h(this.f18995g);
                    bVar.seek(h14);
                    byte[] bArr = new byte[h15];
                    bVar.read(bArr);
                    l(new b(bArr), h14, i10);
                }
            }
        }
    }

    public final void K() {
        I(0, 5);
        I(0, 4);
        I(5, 4);
        HashMap<String, d>[] hashMapArr = this.f18993e;
        d dVar = hashMapArr[1].get("PixelXDimension");
        d dVar2 = hashMapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            hashMapArr[0].put("ImageWidth", dVar);
            hashMapArr[0].put("ImageLength", dVar2);
        }
        if (hashMapArr[4].isEmpty() && w(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        w(hashMapArr[4]);
    }

    public final void L(c cVar) {
        HashMap<String, d>[] hashMapArr;
        int[] iArr;
        HashMap<String, d>[] hashMapArr2;
        short s4;
        int i10;
        e[][] eVarArr = U;
        int[] iArr2 = new int[eVarArr.length];
        int[] iArr3 = new int[eVarArr.length];
        e[] eVarArr2 = V;
        for (e eVar : eVarArr2) {
            D(eVar.f19020b);
        }
        e eVar2 = W;
        D(eVar2.f19020b);
        e eVar3 = X;
        D(eVar3.f19020b);
        int i11 = 0;
        while (true) {
            int length = eVarArr.length;
            hashMapArr = this.f18993e;
            if (i11 >= length) {
                break;
            }
            for (Object obj : hashMapArr[i11].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    hashMapArr[i11].remove(entry.getKey());
                }
            }
            i11++;
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(eVarArr2[1].f19020b, d.b(0L, this.f18995g));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(eVarArr2[2].f19020b, d.b(0L, this.f18995g));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(eVarArr2[3].f19020b, d.b(0L, this.f18995g));
        }
        boolean z10 = this.f18996h;
        String str = eVar2.f19020b;
        int i12 = 4;
        if (z10) {
            hashMapArr[4].put(str, d.b(0L, this.f18995g));
            hashMapArr[4].put(eVar3.f19020b, d.b(this.f18999k, this.f18995g));
        }
        int i13 = 0;
        while (true) {
            int length2 = eVarArr.length;
            iArr = R;
            if (i13 >= length2) {
                break;
            }
            int i14 = 0;
            for (Map.Entry<String, d> entry2 : hashMapArr[i13].entrySet()) {
                d value = entry2.getValue();
                value.getClass();
                int i15 = iArr[value.f19016a] * value.f19017b;
                if (i15 > 4) {
                    i14 += i15;
                }
            }
            iArr3[i13] = iArr3[i13] + i14;
            i13++;
        }
        int i16 = 8;
        for (int i17 = 0; i17 < eVarArr.length; i17++) {
            if (!hashMapArr[i17].isEmpty()) {
                iArr2[i17] = i16;
                i16 = (hashMapArr[i17].size() * 12) + 2 + 4 + iArr3[i17] + i16;
            }
        }
        if (this.f18996h) {
            hashMapArr2 = hashMapArr;
            hashMapArr[4].put(str, d.b(i16, this.f18995g));
            this.f18998j = i16;
            i16 += this.f18999k;
        } else {
            hashMapArr2 = hashMapArr;
        }
        if (this.f18992d == 4) {
            i16 += 8;
        }
        if (f18982s) {
            for (int i18 = 0; i18 < eVarArr.length; i18++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i18), Integer.valueOf(iArr2[i18]), Integer.valueOf(hashMapArr2[i18].size()), Integer.valueOf(iArr3[i18]), Integer.valueOf(i16));
            }
        }
        if (!hashMapArr2[1].isEmpty()) {
            hashMapArr2[0].put(eVarArr2[1].f19020b, d.b(iArr2[1], this.f18995g));
        }
        if (!hashMapArr2[2].isEmpty()) {
            hashMapArr2[0].put(eVarArr2[2].f19020b, d.b(iArr2[2], this.f18995g));
        }
        if (!hashMapArr2[3].isEmpty()) {
            hashMapArr2[1].put(eVarArr2[3].f19020b, d.b(iArr2[3], this.f18995g));
        }
        int i19 = this.f18992d;
        if (i19 != 4) {
            if (i19 != 13) {
                if (i19 == 14) {
                    cVar.write(J);
                    cVar.b(i16);
                }
            } else {
                cVar.b(i16);
                cVar.write(E);
            }
        } else {
            cVar.c((short) i16);
            cVar.write(f18979d0);
        }
        if (this.f18995g == ByteOrder.BIG_ENDIAN) {
            s4 = 19789;
        } else {
            s4 = 18761;
        }
        cVar.c(s4);
        cVar.f19015b = this.f18995g;
        cVar.c((short) 42);
        cVar.b((int) 8);
        int i20 = 0;
        while (i20 < eVarArr.length) {
            if (!hashMapArr2[i20].isEmpty()) {
                cVar.c((short) hashMapArr2[i20].size());
                int size = (hashMapArr2[i20].size() * 12) + iArr2[i20] + 2 + i12;
                for (Map.Entry<String, d> entry3 : hashMapArr2[i20].entrySet()) {
                    int i21 = Z[i20].get(entry3.getKey()).f19019a;
                    d value2 = entry3.getValue();
                    value2.getClass();
                    int i22 = iArr[value2.f19016a] * value2.f19017b;
                    cVar.c((short) i21);
                    cVar.c((short) value2.f19016a);
                    cVar.b(value2.f19017b);
                    if (i22 > i12) {
                        cVar.b(size);
                        size += i22;
                        i12 = 4;
                    } else {
                        cVar.write(value2.f19018d);
                        if (i22 < 4) {
                            for (int i23 = i22; i23 < 4; i23++) {
                                cVar.a(0);
                            }
                        }
                        i12 = 4;
                    }
                }
                int i24 = i12;
                if (i20 == 0 && !hashMapArr2[i24].isEmpty()) {
                    cVar.b(iArr2[i24]);
                } else {
                    cVar.b((int) 0);
                }
                for (Map.Entry<String, d> entry4 : hashMapArr2[i20].entrySet()) {
                    byte[] bArr = entry4.getValue().f19018d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
                i10 = 4;
            } else {
                i10 = i12;
            }
            i20++;
            i12 = i10;
        }
        if (this.f18996h) {
            cVar.write(s());
        }
        if (this.f18992d == 14 && i16 % 2 == 1) {
            cVar.a(0);
        }
        cVar.f19015b = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String h10 = h("DateTimeOriginal");
        HashMap<String, d>[] hashMapArr = this.f18993e;
        if (h10 != null && h("DateTime") == null) {
            hashMapArr[0].put("DateTime", d.a(h10));
        }
        if (h("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", d.b(0L, this.f18995g));
        }
        if (h("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", d.b(0L, this.f18995g));
        }
        if (h("Orientation") == null) {
            hashMapArr[0].put("Orientation", d.b(0L, this.f18995g));
        }
        if (h("LightSource") == null) {
            hashMapArr[1].put("LightSource", d.b(0L, this.f18995g));
        }
    }

    public final String h(String str) {
        d j10 = j(str);
        if (j10 != null) {
            if (!f18976a0.contains(str)) {
                return j10.i(this.f18995g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = j10.f19016a;
                if (i10 != 5 && i10 != 10) {
                    return null;
                }
                g[] gVarArr = (g[]) j10.j(this.f18995g);
                if (gVarArr != null && gVarArr.length == 3) {
                    g gVar = gVarArr[0];
                    g gVar2 = gVarArr[1];
                    g gVar3 = gVarArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) gVar.f19022a) / ((float) gVar.f19023b))), Integer.valueOf((int) (((float) gVar2.f19022a) / ((float) gVar2.f19023b))), Integer.valueOf((int) (((float) gVar3.f19022a) / ((float) gVar3.f19023b))));
                }
                Arrays.toString(gVarArr);
                return null;
            }
            try {
                return Double.toString(j10.g(this.f18995g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int i(int i10, String str) {
        d j10 = j(str);
        if (j10 == null) {
            return i10;
        }
        try {
            return j10.h(this.f18995g);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public final d j(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < U.length; i10++) {
            d dVar = this.f18993e[i10].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final void k(b bVar) {
        String str;
        String str2;
        String str3;
        int i10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C0257a(bVar));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(extractMetadata3)) {
                str = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str3 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str3 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            HashMap<String, d>[] hashMapArr = this.f18993e;
            if (str != null) {
                hashMapArr[0].put("ImageWidth", d.e(Integer.parseInt(str), this.f18995g));
            }
            if (str2 != null) {
                hashMapArr[0].put("ImageLength", d.e(Integer.parseInt(str2), this.f18995g));
            }
            if (str3 != null) {
                int parseInt = Integer.parseInt(str3);
                if (parseInt != 90) {
                    if (parseInt != 180) {
                        if (parseInt != 270) {
                            i10 = 1;
                        } else {
                            i10 = 8;
                        }
                    } else {
                        i10 = 3;
                    }
                } else {
                    i10 = 6;
                }
                hashMapArr[0].put("Orientation", d.e(i10, this.f18995g));
            }
            if (extractMetadata != null && extractMetadata2 != null) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.seek(parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i11 = parseInt2 + 6;
                        int i12 = parseInt3 - 6;
                        if (Arrays.equals(bArr, f18979d0)) {
                            byte[] bArr2 = new byte[i12];
                            if (bVar.read(bArr2) == i12) {
                                this.f19002n = i11;
                                B(0, bArr2);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x016e, code lost:
        r23.f19012b = r22.f18995g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0172, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(j1.a.b r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.a.l(j1.a$b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c4, code lost:
        if (r6 == null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.a.m(java.io.BufferedInputStream):int");
    }

    public final void n(b bVar) {
        int i10;
        int i11;
        q(bVar);
        HashMap<String, d>[] hashMapArr = this.f18993e;
        d dVar = hashMapArr[1].get("MakerNote");
        if (dVar != null) {
            b bVar2 = new b(dVar.f19018d);
            bVar2.f19012b = this.f18995g;
            byte[] bArr = B;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.seek(0L);
            byte[] bArr3 = C;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.seek(12L);
            }
            C(bVar2, 6);
            d dVar2 = hashMapArr[7].get("PreviewImageStart");
            d dVar3 = hashMapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", dVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = hashMapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.j(this.f18995g);
                if (iArr != null && iArr.length == 4) {
                    int i12 = iArr[2];
                    int i13 = iArr[0];
                    if (i12 > i13 && (i10 = iArr[3]) > (i11 = iArr[1])) {
                        int i14 = (i12 - i13) + 1;
                        int i15 = (i10 - i11) + 1;
                        if (i14 < i15) {
                            int i16 = i14 + i15;
                            i15 = i16 - i15;
                            i14 = i16 - i15;
                        }
                        d e10 = d.e(i14, this.f18995g);
                        d e11 = d.e(i15, this.f18995g);
                        hashMapArr[0].put("ImageWidth", e10);
                        hashMapArr[0].put("ImageLength", e11);
                        return;
                    }
                    return;
                }
                Arrays.toString(iArr);
            }
        }
    }

    public final void o(b bVar) {
        if (f18982s) {
            Objects.toString(bVar);
        }
        bVar.mark(0);
        bVar.f19012b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = D;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i11 = i10 + 4;
                    if (i11 == 16 && !Arrays.equals(bArr2, F)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, G)) {
                        if (Arrays.equals(bArr2, E)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f19002n = i11;
                                    B(0, bArr3);
                                    K();
                                    H(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                        }
                        int i12 = readInt + 4;
                        bVar.skipBytes(i12);
                        length = i11 + i12;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void p(b bVar) {
        if (f18982s) {
            Objects.toString(bVar);
        }
        bVar.mark(0);
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.seek(i10);
        bVar.read(bArr4);
        l(new b(bArr4), i10, 5);
        bVar.seek(i12);
        bVar.f19012b = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == T.f19019a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d e10 = d.e(readShort, this.f18995g);
                d e11 = d.e(readShort2, this.f18995g);
                HashMap<String, d>[] hashMapArr = this.f18993e;
                hashMapArr[0].put("ImageLength", e10);
                hashMapArr[0].put("ImageWidth", e11);
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    public final void q(b bVar) {
        y(bVar, bVar.available());
        C(bVar, 0);
        J(bVar, 0);
        J(bVar, 5);
        J(bVar, 4);
        K();
        if (this.f18992d == 8) {
            HashMap<String, d>[] hashMapArr = this.f18993e;
            d dVar = hashMapArr[1].get("MakerNote");
            if (dVar != null) {
                b bVar2 = new b(dVar.f19018d);
                bVar2.f19012b = this.f18995g;
                bVar2.seek(6L);
                C(bVar2, 9);
                d dVar2 = hashMapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    hashMapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final void r(b bVar) {
        if (f18982s) {
            Objects.toString(bVar);
        }
        q(bVar);
        HashMap<String, d>[] hashMapArr = this.f18993e;
        d dVar = hashMapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            l(new b(dVar.f19018d), (int) dVar.c, 5);
        }
        d dVar2 = hashMapArr[0].get("ISO");
        d dVar3 = hashMapArr[1].get("PhotographicSensitivity");
        if (dVar2 != null && dVar3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", dVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005b A[Catch: all -> 0x009a, Exception -> 0x00ae, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x00ae, all -> 0x009a, blocks: (B:36:0x005b, B:39:0x0071, B:41:0x007d, B:46:0x0088, B:47:0x008d, B:48:0x008e, B:49:0x0093, B:50:0x0094, B:51:0x0099), top: B:78:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094 A[Catch: all -> 0x009a, Exception -> 0x00ae, TryCatch #11 {Exception -> 0x00ae, all -> 0x009a, blocks: (B:36:0x005b, B:39:0x0071, B:41:0x007d, B:46:0x0088, B:47:0x008d, B:48:0x008e, B:49:0x0093, B:50:0x0094, B:51:0x0099), top: B:78:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] s() {
        /*
            Method dump skipped, instructions count: 183
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.a.s():byte[]");
    }

    public final void t(b bVar) {
        if (f18982s) {
            Objects.toString(bVar);
        }
        bVar.mark(0);
        bVar.f19012b = ByteOrder.LITTLE_ENDIAN;
        bVar.skipBytes(H.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(I.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i10 = skipBytes + 4 + 4;
                    if (Arrays.equals(J, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f19002n = i10;
                            B(0, bArr2);
                            H(new b(bArr2));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i11 = i10 + readInt2;
                    if (i11 == readInt) {
                        return;
                    }
                    if (i11 <= readInt) {
                        int skipBytes2 = bVar.skipBytes(readInt2);
                        if (skipBytes2 == readInt2) {
                            skipBytes = i10 + skipBytes2;
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void v(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar != null && dVar2 != null) {
            int h10 = dVar.h(this.f18995g);
            int h11 = dVar2.h(this.f18995g);
            if (this.f18992d == 7) {
                h10 += this.f19003o;
            }
            int min = Math.min(h11, bVar.c - h10);
            if (h10 > 0 && min > 0) {
                this.f18996h = true;
                if (this.f18990a == null && this.c == null && this.f18991b == null) {
                    byte[] bArr = new byte[min];
                    bVar.skip(h10);
                    bVar.read(bArr);
                    this.f19000l = bArr;
                }
                this.f18998j = h10;
                this.f18999k = min;
            }
        }
    }

    public final boolean w(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar != null && dVar2 != null) {
            int h10 = dVar.h(this.f18995g);
            int h11 = dVar2.h(this.f18995g);
            if (h10 <= 512 && h11 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void x(InputStream inputStream) {
        boolean z10 = f18982s;
        if (inputStream != null) {
            for (int i10 = 0; i10 < U.length; i10++) {
                try {
                    this.f18993e[i10] = new HashMap<>();
                } catch (IOException unused) {
                    a();
                    if (!z10) {
                        return;
                    }
                } catch (Throwable th2) {
                    a();
                    if (z10) {
                        z();
                    }
                    throw th2;
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f18992d = m(bufferedInputStream);
            b bVar = new b(bufferedInputStream);
            switch (this.f18992d) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    q(bVar);
                    break;
                case 4:
                    l(bVar, 0, 0);
                    a();
                    if (z10) {
                        z();
                        return;
                    }
                    return;
                case 7:
                    n(bVar);
                    break;
                case 9:
                    p(bVar);
                    a();
                    if (z10) {
                        z();
                        return;
                    }
                    return;
                case 10:
                    r(bVar);
                    a();
                    if (z10) {
                        z();
                        return;
                    }
                    return;
                case 12:
                    k(bVar);
                    break;
                case 13:
                    o(bVar);
                    a();
                    if (z10) {
                        z();
                        return;
                    }
                    return;
                case 14:
                    t(bVar);
                    a();
                    if (z10) {
                        z();
                        return;
                    }
                    return;
            }
            bVar.seek(this.f19002n);
            H(bVar);
            a();
            if (!z10) {
                return;
            }
            z();
            return;
        }
        throw new NullPointerException("inputstream shouldn't be null");
    }

    public final void y(b bVar, int i10) {
        ByteOrder A2 = A(bVar);
        this.f18995g = A2;
        bVar.f19012b = A2;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i11 = this.f18992d;
        if (i11 != 7 && i11 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt >= 8 && readInt < i10) {
            int i12 = readInt - 8;
            if (i12 > 0 && bVar.skipBytes(i12) != i12) {
                throw new IOException(b.a.c("Couldn't jump to first Ifd: ", i12));
            }
            return;
        }
        throw new IOException(b.a.c("Invalid first Ifd offset: ", readInt));
    }

    public final void z() {
        int i10 = 0;
        while (true) {
            HashMap<String, d>[] hashMapArr = this.f18993e;
            if (i10 < hashMapArr.length) {
                hashMapArr[i10].size();
                for (Map.Entry<String, d> entry : hashMapArr[i10].entrySet()) {
                    d value = entry.getValue();
                    entry.getKey();
                    value.toString();
                    value.i(this.f18995g);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f19019a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19020b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f19021d;

        public e(String str, int i10, int i11) {
            this.f19020b = str;
            this.f19019a = i10;
            this.c = i11;
            this.f19021d = -1;
        }

        public e(String str, int i10) {
            this.f19020b = str;
            this.f19019a = i10;
            this.c = 3;
            this.f19021d = 4;
        }
    }

    public a(InputStream inputStream) {
        boolean z10;
        e[][] eVarArr = U;
        this.f18993e = new HashMap[eVarArr.length];
        this.f18994f = new HashSet(eVarArr.length);
        this.f18995g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f18990a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream) inputStream;
                this.f18991b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        f.a(fileInputStream.getFD(), OsConstants.SEEK_CUR);
                        z10 = true;
                    } catch (Exception unused) {
                        z10 = false;
                    }
                    if (z10) {
                        this.c = null;
                        this.f18991b = fileInputStream.getFD();
                    }
                }
                this.c = null;
                this.f18991b = null;
            }
            x(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    /* compiled from: ExifInterface.java */
    /* renamed from: j1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0257a extends MediaDataSource {

        /* renamed from: a  reason: collision with root package name */
        public long f19007a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f19008b;

        public C0257a(b bVar) {
            this.f19008b = bVar;
        }

        @Override // android.media.MediaDataSource
        public final long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f19007a;
                int i12 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
                b bVar = this.f19008b;
                if (i12 != 0) {
                    if (j11 >= 0 && j10 >= j11 + bVar.available()) {
                        return -1;
                    }
                    bVar.seek(j10);
                    this.f19007a = j10;
                }
                if (i11 > bVar.available()) {
                    i11 = bVar.available();
                }
                int read = bVar.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f19007a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f19007a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}

package gf;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: StandardMessageCodec.java */
/* loaded from: classes.dex */
public final class j implements f<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final j f17801a = new j();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f17802b;
    public static final Charset c;

    /* compiled from: StandardMessageCodec.java */
    /* loaded from: classes.dex */
    public static final class a extends ByteArrayOutputStream {
        public final byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    static {
        boolean z10;
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            z10 = true;
        } else {
            z10 = false;
        }
        f17802b = z10;
        c = Charset.forName("UTF8");
    }

    public static final void c(int i10, ByteBuffer byteBuffer) {
        int position = byteBuffer.position() % i10;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i10) - position);
        }
    }

    public static final int d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i10 = byteBuffer.get() & 255;
            if (i10 < 254) {
                return i10;
            }
            if (i10 == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v11, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v12, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v15, types: [float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [byte[], java.io.Serializable] */
    public static Serializable e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byte b10 = byteBuffer.get();
            int i10 = 0;
            Charset charset = c;
            switch (b10) {
                case 0:
                    return null;
                case 1:
                    return Boolean.TRUE;
                case 2:
                    return Boolean.FALSE;
                case 3:
                    return Integer.valueOf(byteBuffer.getInt());
                case 4:
                    return Long.valueOf(byteBuffer.getLong());
                case 5:
                    byte[] bArr = new byte[d(byteBuffer)];
                    byteBuffer.get(bArr);
                    return new BigInteger(new String(bArr, charset), 16);
                case 6:
                    c(8, byteBuffer);
                    return Double.valueOf(byteBuffer.getDouble());
                case 7:
                    byte[] bArr2 = new byte[d(byteBuffer)];
                    byteBuffer.get(bArr2);
                    return new String(bArr2, charset);
                case 8:
                    ?? r12 = new byte[d(byteBuffer)];
                    byteBuffer.get((byte[]) r12);
                    return r12;
                case 9:
                    int d10 = d(byteBuffer);
                    ?? r13 = new int[d10];
                    c(4, byteBuffer);
                    byteBuffer.asIntBuffer().get((int[]) r13);
                    byteBuffer.position((d10 * 4) + byteBuffer.position());
                    return r13;
                case 10:
                    int d11 = d(byteBuffer);
                    ?? r14 = new long[d11];
                    c(8, byteBuffer);
                    byteBuffer.asLongBuffer().get((long[]) r14);
                    byteBuffer.position((d11 * 8) + byteBuffer.position());
                    return r14;
                case 11:
                    int d12 = d(byteBuffer);
                    ?? r15 = new double[d12];
                    c(8, byteBuffer);
                    byteBuffer.asDoubleBuffer().get((double[]) r15);
                    byteBuffer.position((d12 * 8) + byteBuffer.position());
                    return r15;
                case 12:
                    int d13 = d(byteBuffer);
                    ArrayList arrayList = new ArrayList(d13);
                    while (i10 < d13) {
                        arrayList.add(e(byteBuffer));
                        i10++;
                    }
                    return arrayList;
                case 13:
                    int d14 = d(byteBuffer);
                    HashMap hashMap = new HashMap();
                    while (i10 < d14) {
                        hashMap.put(e(byteBuffer), e(byteBuffer));
                        i10++;
                    }
                    return hashMap;
                case 14:
                    int d15 = d(byteBuffer);
                    ?? r16 = new float[d15];
                    c(4, byteBuffer);
                    byteBuffer.asFloatBuffer().get((float[]) r16);
                    byteBuffer.position((d15 * 4) + byteBuffer.position());
                    return r16;
                default:
                    throw new IllegalArgumentException("Message corrupted");
            }
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public static final void f(a aVar, int i10) {
        int size = aVar.size() % i10;
        if (size != 0) {
            for (int i11 = 0; i11 < i10 - size; i11++) {
                aVar.write(0);
            }
        }
    }

    public static final void g(a aVar, int i10) {
        if (f17802b) {
            aVar.write(i10);
            aVar.write(i10 >>> 8);
            aVar.write(i10 >>> 16);
            aVar.write(i10 >>> 24);
            return;
        }
        aVar.write(i10 >>> 24);
        aVar.write(i10 >>> 16);
        aVar.write(i10 >>> 8);
        aVar.write(i10);
    }

    public static final void h(a aVar, long j10) {
        if (f17802b) {
            aVar.write((byte) j10);
            aVar.write((byte) (j10 >>> 8));
            aVar.write((byte) (j10 >>> 16));
            aVar.write((byte) (j10 >>> 24));
            aVar.write((byte) (j10 >>> 32));
            aVar.write((byte) (j10 >>> 40));
            aVar.write((byte) (j10 >>> 48));
            aVar.write((byte) (j10 >>> 56));
            return;
        }
        aVar.write((byte) (j10 >>> 56));
        aVar.write((byte) (j10 >>> 48));
        aVar.write((byte) (j10 >>> 40));
        aVar.write((byte) (j10 >>> 32));
        aVar.write((byte) (j10 >>> 24));
        aVar.write((byte) (j10 >>> 16));
        aVar.write((byte) (j10 >>> 8));
        aVar.write((byte) j10);
    }

    public static final void i(a aVar, int i10) {
        if (i10 < 254) {
            aVar.write(i10);
        } else if (i10 <= 65535) {
            aVar.write(254);
            if (f17802b) {
                aVar.write(i10);
                aVar.write(i10 >>> 8);
                return;
            }
            aVar.write(i10 >>> 8);
            aVar.write(i10);
        } else {
            aVar.write(FunctionEval.FunctionID.EXTERNAL_FUNC);
            g(aVar, i10);
        }
    }

    public static void j(a aVar, Object obj) {
        int i10;
        int i11 = 0;
        if (obj != null && !obj.equals(null)) {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                aVar.write(i10);
                return;
            }
            boolean z10 = obj instanceof Number;
            Charset charset = c;
            if (z10) {
                if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
                    if (obj instanceof Long) {
                        aVar.write(4);
                        h(aVar, ((Long) obj).longValue());
                        return;
                    } else if (!(obj instanceof Float) && !(obj instanceof Double)) {
                        if (obj instanceof BigInteger) {
                            aVar.write(5);
                            byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                            i(aVar, bytes.length);
                            aVar.write(bytes, 0, bytes.length);
                            return;
                        }
                        throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                    } else {
                        aVar.write(6);
                        f(aVar, 8);
                        h(aVar, Double.doubleToLongBits(((Number) obj).doubleValue()));
                        return;
                    }
                }
                aVar.write(3);
                g(aVar, ((Number) obj).intValue());
                return;
            } else if (obj instanceof CharSequence) {
                aVar.write(7);
                byte[] bytes2 = obj.toString().getBytes(charset);
                i(aVar, bytes2.length);
                aVar.write(bytes2, 0, bytes2.length);
                return;
            } else if (obj instanceof byte[]) {
                aVar.write(8);
                byte[] bArr = (byte[]) obj;
                i(aVar, bArr.length);
                aVar.write(bArr, 0, bArr.length);
                return;
            } else if (obj instanceof int[]) {
                aVar.write(9);
                int[] iArr = (int[]) obj;
                i(aVar, iArr.length);
                f(aVar, 4);
                int length = iArr.length;
                while (i11 < length) {
                    g(aVar, iArr[i11]);
                    i11++;
                }
                return;
            } else if (obj instanceof long[]) {
                aVar.write(10);
                long[] jArr = (long[]) obj;
                i(aVar, jArr.length);
                f(aVar, 8);
                int length2 = jArr.length;
                while (i11 < length2) {
                    h(aVar, jArr[i11]);
                    i11++;
                }
                return;
            } else if (obj instanceof double[]) {
                aVar.write(11);
                double[] dArr = (double[]) obj;
                i(aVar, dArr.length);
                f(aVar, 8);
                int length3 = dArr.length;
                while (i11 < length3) {
                    h(aVar, Double.doubleToLongBits(dArr[i11]));
                    i11++;
                }
                return;
            } else if (obj instanceof List) {
                aVar.write(12);
                List<Object> list = (List) obj;
                i(aVar, list.size());
                for (Object obj2 : list) {
                    j(aVar, obj2);
                }
                return;
            } else if (obj instanceof Map) {
                aVar.write(13);
                Map map = (Map) obj;
                i(aVar, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    j(aVar, entry.getKey());
                    j(aVar, entry.getValue());
                }
                return;
            } else if (obj instanceof float[]) {
                aVar.write(14);
                float[] fArr = (float[]) obj;
                i(aVar, fArr.length);
                f(aVar, 4);
                int length4 = fArr.length;
                while (i11 < length4) {
                    g(aVar, Float.floatToIntBits(fArr[i11]));
                    i11++;
                }
                return;
            } else {
                throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + OperatorName.SHOW_TEXT_LINE);
            }
        }
        aVar.write(0);
    }

    @Override // gf.f
    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = new a();
        j(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // gf.f
    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Serializable e10 = e(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return e10;
        }
        throw new IllegalArgumentException("Message corrupted");
    }
}

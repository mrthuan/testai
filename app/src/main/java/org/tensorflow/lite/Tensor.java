package org.tensorflow.lite;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Tensor {

    /* renamed from: a  reason: collision with root package name */
    public long f23579a;

    /* renamed from: b  reason: collision with root package name */
    public final DataType f23580b;
    public int[] c;

    public Tensor(long j10) {
        this.f23579a = j10;
        this.f23580b = DataType.fromC(dtype(j10));
        this.c = shape(j10);
        shapeSignature(j10);
        quantizationScale(j10);
        quantizationZeroPoint(j10);
    }

    private static native ByteBuffer buffer(long j10);

    public static int c(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return c(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    private static native long create(long j10, int i10);

    private static native void delete(long j10);

    private static native int dtype(long j10);

    public static void f(Object obj, int i10, int[] iArr) {
        if (i10 == iArr.length) {
            return;
        }
        int length = Array.getLength(obj);
        int i11 = iArr[i10];
        if (i11 == 0) {
            iArr[i10] = length;
        } else if (i11 != length) {
            throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", Integer.valueOf(iArr[i10]), Integer.valueOf(length), Integer.valueOf(i10)));
        }
        for (int i12 = 0; i12 < length; i12++) {
            f(Array.get(obj, i12), i10 + 1, iArr);
        }
    }

    public static Tensor g(int i10, long j10) {
        return new Tensor(create(j10, i10));
    }

    private static native boolean hasDelegateBufferHandle(long j10);

    private static native int index(long j10);

    private static native String name(long j10);

    private static native int numBytes(long j10);

    private static native float quantizationScale(long j10);

    private static native int quantizationZeroPoint(long j10);

    private static native void readMultiDimensionalArray(long j10, Object obj);

    private static native int[] shape(long j10);

    private static native int[] shapeSignature(long j10);

    private static native void writeDirectBuffer(long j10, Buffer buffer);

    private static native void writeMultiDimensionalArray(long j10, Object obj);

    private static native void writeScalar(long j10, Object obj);

    public final ByteBuffer a() {
        return buffer(this.f23579a).order(ByteOrder.nativeOrder());
    }

    public final void b() {
        delete(this.f23579a);
        this.f23579a = 0L;
    }

    public final int[] d(Object obj) {
        int c = c(obj);
        if (this.f23580b == DataType.STRING) {
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                while (cls.isArray()) {
                    cls = cls.getComponentType();
                }
                if (Byte.TYPE.equals(cls)) {
                    c--;
                }
            }
        }
        int[] iArr = new int[c];
        f(obj, 0, iArr);
        return iArr;
    }

    public final void e(Object obj) {
        int capacity;
        if (obj == null) {
            if (hasDelegateBufferHandle(this.f23579a)) {
                return;
            }
            throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
        }
        j(obj);
        boolean z10 = obj instanceof Buffer;
        if (z10) {
            Buffer buffer = (Buffer) obj;
            int numBytes = numBytes(this.f23579a);
            if (obj instanceof ByteBuffer) {
                capacity = buffer.capacity();
            } else {
                capacity = buffer.capacity() * this.f23580b.byteSize();
            }
            if (numBytes > capacity) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", name(this.f23579a), Integer.valueOf(numBytes), Integer.valueOf(capacity)));
            }
        } else {
            int[] d10 = d(obj);
            if (!Arrays.equals(d10, this.c)) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with shape %s to a Java object with shape %s.", name(this.f23579a), Arrays.toString(this.c), Arrays.toString(d10)));
            }
        }
        if (z10) {
            Buffer buffer2 = (Buffer) obj;
            if (buffer2 instanceof ByteBuffer) {
                ((ByteBuffer) buffer2).put(a());
                return;
            } else if (buffer2 instanceof FloatBuffer) {
                ((FloatBuffer) buffer2).put(a().asFloatBuffer());
                return;
            } else if (buffer2 instanceof LongBuffer) {
                ((LongBuffer) buffer2).put(a().asLongBuffer());
                return;
            } else if (buffer2 instanceof IntBuffer) {
                ((IntBuffer) buffer2).put(a().asIntBuffer());
                return;
            } else {
                throw new IllegalArgumentException("Unexpected output buffer type: " + buffer2);
            }
        }
        readMultiDimensionalArray(this.f23579a, obj);
    }

    public final void h() {
        this.c = shape(this.f23579a);
    }

    public final void i(Object obj) {
        int capacity;
        if (obj == null) {
            if (hasDelegateBufferHandle(this.f23579a)) {
                return;
            }
            throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
        }
        j(obj);
        boolean z10 = obj instanceof Buffer;
        if (z10) {
            Buffer buffer = (Buffer) obj;
            int numBytes = numBytes(this.f23579a);
            if (obj instanceof ByteBuffer) {
                capacity = buffer.capacity();
            } else {
                capacity = buffer.capacity() * this.f23580b.byteSize();
            }
            if (numBytes != capacity) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", name(this.f23579a), Integer.valueOf(numBytes), Integer.valueOf(capacity)));
            }
        } else {
            int[] d10 = d(obj);
            if (!Arrays.equals(d10, this.c)) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with shape %s from a Java object with shape %s.", name(this.f23579a), Arrays.toString(this.c), Arrays.toString(d10)));
            }
        }
        if (z10) {
            Buffer buffer2 = (Buffer) obj;
            if (buffer2 instanceof ByteBuffer) {
                ByteBuffer byteBuffer = (ByteBuffer) buffer2;
                if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
                    writeDirectBuffer(this.f23579a, buffer2);
                } else {
                    a().put(byteBuffer);
                }
            } else if (buffer2 instanceof LongBuffer) {
                LongBuffer longBuffer = (LongBuffer) buffer2;
                if (longBuffer.isDirect() && longBuffer.order() == ByteOrder.nativeOrder()) {
                    writeDirectBuffer(this.f23579a, buffer2);
                } else {
                    a().asLongBuffer().put(longBuffer);
                }
            } else if (buffer2 instanceof FloatBuffer) {
                FloatBuffer floatBuffer = (FloatBuffer) buffer2;
                if (floatBuffer.isDirect() && floatBuffer.order() == ByteOrder.nativeOrder()) {
                    writeDirectBuffer(this.f23579a, buffer2);
                } else {
                    a().asFloatBuffer().put(floatBuffer);
                }
            } else if (buffer2 instanceof IntBuffer) {
                IntBuffer intBuffer = (IntBuffer) buffer2;
                if (intBuffer.isDirect() && intBuffer.order() == ByteOrder.nativeOrder()) {
                    writeDirectBuffer(this.f23579a, buffer2);
                } else {
                    a().asIntBuffer().put(intBuffer);
                }
            } else {
                throw new IllegalArgumentException("Unexpected input buffer type: " + buffer2);
            }
        } else if (obj.getClass().isArray()) {
            writeMultiDimensionalArray(this.f23579a, obj);
        } else {
            writeScalar(this.f23579a, obj);
        }
    }

    public final void j(Object obj) {
        DataType dataType;
        if (obj instanceof ByteBuffer) {
            return;
        }
        if (obj != null) {
            Class<?> cls = obj.getClass();
            boolean isArray = cls.isArray();
            DataType dataType2 = this.f23580b;
            if (isArray) {
                while (cls.isArray()) {
                    cls = cls.getComponentType();
                }
                if (Float.TYPE.equals(cls)) {
                    dataType = DataType.FLOAT32;
                } else if (Integer.TYPE.equals(cls)) {
                    dataType = DataType.INT32;
                } else if (Byte.TYPE.equals(cls)) {
                    dataType = DataType.STRING;
                    if (dataType2 != dataType) {
                        dataType = DataType.UINT8;
                    }
                } else if (Long.TYPE.equals(cls)) {
                    dataType = DataType.INT64;
                } else if (Boolean.TYPE.equals(cls)) {
                    dataType = DataType.BOOL;
                } else if (String.class.equals(cls)) {
                    dataType = DataType.STRING;
                }
                if (dataType != dataType2 || dataType.toStringName().equals(dataType2.toStringName())) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", dataType2, obj.getClass().getName(), dataType));
            }
            if (!Float.class.equals(cls) && !(obj instanceof FloatBuffer)) {
                if (!Integer.class.equals(cls) && !(obj instanceof IntBuffer)) {
                    if (Byte.class.equals(cls)) {
                        dataType = DataType.UINT8;
                    } else if (!Long.class.equals(cls) && !(obj instanceof LongBuffer)) {
                        if (Boolean.class.equals(cls)) {
                            dataType = DataType.BOOL;
                        } else if (String.class.equals(cls)) {
                            dataType = DataType.STRING;
                        }
                    } else {
                        dataType = DataType.INT64;
                    }
                } else {
                    dataType = DataType.INT32;
                }
            } else {
                dataType = DataType.FLOAT32;
            }
            if (dataType != dataType2) {
                return;
            }
            return;
        }
        throw new IllegalArgumentException("DataType error: cannot resolve DataType of ".concat(obj.getClass().getName()));
    }
}

package org.tensorflow.lite;

import com.adjust.sdk.Constants;

/* loaded from: classes3.dex */
public enum DataType {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5),
    BOOL(6),
    INT8(9);
    

    /* renamed from: a  reason: collision with root package name */
    public static final DataType[] f23568a = values();
    private final int value;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23570a;

        static {
            int[] iArr = new int[DataType.values().length];
            f23570a = iArr;
            try {
                iArr[DataType.FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23570a[DataType.INT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23570a[DataType.INT8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23570a[DataType.UINT8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23570a[DataType.INT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23570a[DataType.BOOL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23570a[DataType.STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    DataType(int i10) {
        this.value = i10;
    }

    public static DataType fromC(int i10) {
        DataType[] dataTypeArr;
        for (DataType dataType : f23568a) {
            if (dataType.value == i10) {
                return dataType;
            }
        }
        StringBuilder sb2 = new StringBuilder("DataType error: DataType ");
        sb2.append(i10);
        sb2.append(" is not recognized in Java (version ");
        TensorFlowLite.a();
        sb2.append(TensorFlowLite.nativeRuntimeVersion());
        sb2.append(")");
        throw new IllegalArgumentException(sb2.toString());
    }

    public int byteSize() {
        switch (a.f23570a[ordinal()]) {
            case 1:
            case 2:
                return 4;
            case 3:
            case 4:
                return 1;
            case 5:
                return 8;
            case 6:
            case 7:
                return -1;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }

    public int c() {
        return this.value;
    }

    public String toStringName() {
        switch (a.f23570a[ordinal()]) {
            case 1:
                return "float";
            case 2:
                return "int";
            case 3:
            case 4:
                return "byte";
            case 5:
                return Constants.LONG;
            case 6:
                return "bool";
            case 7:
                return "string";
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }
}

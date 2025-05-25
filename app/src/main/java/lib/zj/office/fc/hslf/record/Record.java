package lib.zj.office.fc.hslf.record;

import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import lib.zj.office.fc.hslf.exceptions.CorruptPowerPointFileException;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public abstract class Record {
    protected POILogger logger = POILogFactory.getLogger(getClass());

    public static Record buildRecordAtOffset(byte[] bArr, int i10) {
        long uShort = LittleEndian.getUShort(bArr, i10 + 2);
        int uInt = (int) LittleEndian.getUInt(bArr, i10 + 4);
        if (uInt < 0) {
            uInt = 0;
        }
        return createRecordForType(uShort, bArr, i10, uInt + 8);
    }

    public static Record createRecordForType(long j10, byte[] bArr, int i10, int i11) {
        Class<? extends Record> cls = null;
        if (i10 + i11 > bArr.length) {
            PrintStream printStream = System.err;
            printStream.println("Warning: Skipping record of type " + j10 + " at position " + i10 + " which claims to be longer than the file! (" + i11 + " vs " + (bArr.length - i10) + ")");
            return null;
        }
        try {
            cls = RecordTypes.recordHandlingClass((int) j10);
            if (cls == null) {
                cls = RecordTypes.recordHandlingClass(RecordTypes.Unknown.typeID);
            }
            Class<?> cls2 = Integer.TYPE;
            Record newInstance = cls.getDeclaredConstructor(byte[].class, cls2, cls2).newInstance(bArr, Integer.valueOf(i10), Integer.valueOf(i11));
            if (newInstance instanceof PositionDependentRecord) {
                ((PositionDependentRecord) newInstance).setLastOnDiskOffset(i10);
            }
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't access the constructor for type with id " + j10 + " on class " + cls + " : " + e10, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Couldn't instantiate the class for type with id " + j10 + " on class " + cls + " : " + e11, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Couldn't access the constructor for type with id " + j10 + " on class " + cls + " : " + e12, e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Couldn't instantiate the class for type with id " + j10 + " on class " + cls + " : " + e13 + "\nCause was : " + e13.getCause(), e13);
        }
    }

    public static Record[] findChildRecords(byte[] bArr, int i10, int i11) {
        ArrayList arrayList = new ArrayList(5);
        int i12 = i10;
        while (i12 <= (i10 + i11) - 8) {
            long uShort = LittleEndian.getUShort(bArr, i12 + 2);
            int uInt = (int) LittleEndian.getUInt(bArr, i12 + 4);
            if (uInt < 0) {
                uInt = 0;
            }
            if (i12 == 0 && uShort == 0 && uInt == 65535) {
                throw new CorruptPowerPointFileException("Corrupt document - starts with record of type 0000 and length 0xFFFF");
            }
            Record createRecordForType = createRecordForType(uShort, bArr, i12, uInt + 8);
            if (createRecordForType != null) {
                arrayList.add(createRecordForType);
            }
            i12 = i12 + 8 + uInt;
        }
        return (Record[]) arrayList.toArray(new Record[arrayList.size()]);
    }

    public static void writeLittleEndian(int i10, OutputStream outputStream) {
        byte[] bArr = new byte[4];
        LittleEndian.putInt(bArr, i10);
        outputStream.write(bArr);
    }

    public abstract void dispose();

    public abstract Record[] getChildRecords();

    public abstract long getRecordType();

    public abstract boolean isAnAtom();

    public static void writeLittleEndian(short s4, OutputStream outputStream) {
        byte[] bArr = new byte[2];
        LittleEndian.putShort(bArr, s4);
        outputStream.write(bArr);
    }

    public static Record buildRecordAtOffset(byte[] bArr, int i10, int i11) {
        long uShort = LittleEndian.getUShort(bArr, i10 + 2);
        int uInt = (int) LittleEndian.getUInt(bArr, i10 + 4);
        if (uInt < 0) {
            uInt = 0;
        }
        return createRecordForType(uShort, bArr, i10, uInt + 8, i11);
    }

    public static Record createRecordForType(long j10, byte[] bArr, int i10, int i11, int i12) {
        Class<? extends Record> cls = null;
        if (i10 + i11 > bArr.length) {
            PrintStream printStream = System.err;
            printStream.println("Warning: Skipping record of type " + j10 + " at position " + i10 + " which claims to be longer than the file! (" + i11 + " vs " + (bArr.length - i10) + ")");
            return null;
        }
        try {
            cls = RecordTypes.recordHandlingClass((int) j10);
            if (cls == null) {
                cls = RecordTypes.recordHandlingClass(RecordTypes.Unknown.typeID);
            }
            Class<?> cls2 = Integer.TYPE;
            Record newInstance = cls.getDeclaredConstructor(byte[].class, cls2, cls2).newInstance(bArr, Integer.valueOf(i10), Integer.valueOf(i11));
            if (newInstance instanceof PositionDependentRecord) {
                ((PositionDependentRecord) newInstance).setLastOnDiskOffset(i12);
            }
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't access the constructor for type with id " + j10 + " on class " + cls + " : " + e10, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Couldn't instantiate the class for type with id " + j10 + " on class " + cls + " : " + e11, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Couldn't access the constructor for type with id " + j10 + " on class " + cls + " : " + e12, e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Couldn't instantiate the class for type with id " + j10 + " on class " + cls + " : " + e13 + "\nCause was : " + e13.getCause(), e13);
        }
    }
}

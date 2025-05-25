package lib.zj.office.fc.hpsf;

import a0.a;
import java.io.OutputStream;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class TypeWriter {
    public static int writeToStream(OutputStream outputStream, short s4) {
        byte[] bArr = new byte[2];
        LittleEndian.putShort(bArr, 0, s4);
        outputStream.write(bArr, 0, 2);
        return 2;
    }

    public static int writeUIntToStream(OutputStream outputStream, long j10) {
        long j11 = j10 & (-4294967296L);
        if (j11 != 0 && j11 != -4294967296L) {
            throw new IllegalPropertySetDataException("Value " + j10 + " cannot be represented by 4 bytes.");
        }
        return writeToStream(outputStream, (int) j10);
    }

    public static void writeUShortToStream(OutputStream outputStream, int i10) {
        if (((-65536) & i10) == 0) {
            writeToStream(outputStream, (short) i10);
            return;
        }
        throw new IllegalPropertySetDataException(a.g("Value ", i10, " cannot be represented by 2 bytes."));
    }

    public static int writeToStream(OutputStream outputStream, int i10) {
        byte[] bArr = new byte[4];
        LittleEndian.putInt(bArr, 0, i10);
        outputStream.write(bArr, 0, 4);
        return 4;
    }

    public static int writeToStream(OutputStream outputStream, long j10) {
        byte[] bArr = new byte[8];
        LittleEndian.putLong(bArr, 0, j10);
        outputStream.write(bArr, 0, 8);
        return 8;
    }

    public static int writeToStream(OutputStream outputStream, ClassID classID) {
        byte[] bArr = new byte[16];
        classID.write(bArr, 0);
        outputStream.write(bArr, 0, 16);
        return 16;
    }

    public static void writeToStream(OutputStream outputStream, Property[] propertyArr, int i10) {
        long type;
        if (propertyArr == null) {
            return;
        }
        for (Property property : propertyArr) {
            writeUIntToStream(outputStream, property.getID());
            writeUIntToStream(outputStream, property.getSize());
        }
        for (Property property2 : propertyArr) {
            writeUIntToStream(outputStream, property2.getType());
            VariantSupport.write(outputStream, (int) type, property2.getValue(), i10);
        }
    }

    public static int writeToStream(OutputStream outputStream, double d10) {
        byte[] bArr = new byte[8];
        LittleEndian.putDouble(bArr, 0, d10);
        outputStream.write(bArr, 0, 8);
        return 8;
    }
}

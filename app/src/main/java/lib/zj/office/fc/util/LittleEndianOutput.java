package lib.zj.office.fc.util;

/* loaded from: classes3.dex */
public interface LittleEndianOutput {
    void write(byte[] bArr);

    void write(byte[] bArr, int i10, int i11);

    void writeByte(int i10);

    void writeDouble(double d10);

    void writeInt(int i10);

    void writeLong(long j10);

    void writeShort(int i10);
}

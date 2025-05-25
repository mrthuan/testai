package lib.zj.office.fc.util;

/* loaded from: classes3.dex */
public interface LittleEndianInput {
    int available();

    byte readByte();

    double readDouble();

    void readFully(byte[] bArr);

    void readFully(byte[] bArr, int i10, int i11);

    int readInt();

    long readLong();

    short readShort();

    int readUByte();

    int readUShort();
}

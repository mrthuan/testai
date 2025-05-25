package lib.zj.office.fc.util;

import java.io.InputStream;

/* loaded from: classes3.dex */
public interface FixedField {
    void readFromBytes(byte[] bArr);

    void readFromStream(InputStream inputStream);

    String toString();

    void writeToBytes(byte[] bArr);
}

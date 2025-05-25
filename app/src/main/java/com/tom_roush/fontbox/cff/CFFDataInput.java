package com.tom_roush.fontbox.cff;

import androidx.appcompat.view.menu.d;
import java.io.IOException;

/* loaded from: classes2.dex */
public class CFFDataInput extends DataInput {
    public CFFDataInput(byte[] bArr) {
        super(bArr);
    }

    public int readCard16() {
        return readUnsignedShort();
    }

    public int readCard8() {
        return readUnsignedByte();
    }

    public int readOffSize() {
        int readUnsignedByte = readUnsignedByte();
        if (readUnsignedByte >= 1 && readUnsignedByte <= 4) {
            return readUnsignedByte;
        }
        StringBuilder e10 = d.e("Illegal (< 1 or > 4) offSize value ", readUnsignedByte, " in CFF font at position ");
        e10.append(getPosition() - 1);
        throw new IOException(e10.toString());
    }

    public int readOffset(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 << 8) | readUnsignedByte();
        }
        return i11;
    }

    public int readSID() {
        return readUnsignedShort();
    }
}

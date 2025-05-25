package lib.zj.office.fc.hwpf.model;

import java.io.OutputStream;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class ParagraphHeight {
    private int dxaCol;
    private int dymLineOrHeight;
    private short infoField;
    private short reserved;
    private BitField fSpare = BitFieldFactory.getInstance(1);
    private BitField fUnk = BitFieldFactory.getInstance(2);
    private BitField fDiffLines = BitFieldFactory.getInstance(4);
    private BitField clMac = BitFieldFactory.getInstance(65280);

    public ParagraphHeight(byte[] bArr, int i10) {
        this.infoField = LittleEndian.getShort(bArr, i10);
        int i11 = i10 + 2;
        this.reserved = LittleEndian.getShort(bArr, i11);
        int i12 = i11 + 2;
        this.dxaCol = LittleEndian.getInt(bArr, i12);
        this.dymLineOrHeight = LittleEndian.getInt(bArr, i12 + 4);
    }

    public boolean equals(Object obj) {
        ParagraphHeight paragraphHeight = (ParagraphHeight) obj;
        if (this.infoField == paragraphHeight.infoField && this.reserved == paragraphHeight.reserved && this.dxaCol == paragraphHeight.dxaCol && this.dymLineOrHeight == paragraphHeight.dymLineOrHeight) {
            return true;
        }
        return false;
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[12];
        LittleEndian.putShort(bArr, 0, this.infoField);
        LittleEndian.putShort(bArr, 2, this.reserved);
        LittleEndian.putInt(bArr, 4, this.dxaCol);
        LittleEndian.putInt(bArr, 8, this.dymLineOrHeight);
        return bArr;
    }

    public void write(OutputStream outputStream) {
        outputStream.write(toByteArray());
    }

    public ParagraphHeight() {
    }
}

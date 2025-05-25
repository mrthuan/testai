package lib.zj.office.fc.hslf.blip;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class DIB extends Bitmap {
    public static final int HEADER_SIZE = 14;

    public static byte[] addBMPHeader(byte[] bArr) {
        byte[] bArr2 = new byte[14];
        LittleEndian.putInt(bArr2, 0, 19778);
        int i10 = LittleEndian.getInt(bArr, 20);
        int length = bArr.length + 14;
        LittleEndian.putInt(bArr2, 2, length);
        LittleEndian.putInt(bArr2, 6, 0);
        LittleEndian.putInt(bArr2, 10, length - i10);
        byte[] bArr3 = new byte[bArr.length + 14];
        System.arraycopy(bArr2, 0, bArr3, 0, 14);
        System.arraycopy(bArr, 0, bArr3, 14, bArr.length);
        return bArr3;
    }

    @Override // lib.zj.office.fc.hslf.blip.Bitmap, lib.zj.office.fc.hslf.usermodel.PictureData
    public byte[] getData() {
        return addBMPHeader(super.getData());
    }

    @Override // lib.zj.office.fc.hslf.usermodel.PictureData
    public int getSignature() {
        return 31360;
    }

    @Override // lib.zj.office.fc.hslf.usermodel.PictureData
    public int getType() {
        return 7;
    }

    @Override // lib.zj.office.fc.hslf.blip.Bitmap, lib.zj.office.fc.hslf.usermodel.PictureData
    public void setData(byte[] bArr) {
        int length = bArr.length - 14;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 14, bArr2, 0, length);
        super.setData(bArr2);
    }
}

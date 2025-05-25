package lib.zj.office.fc.hslf.blip;

import lib.zj.office.fc.hslf.usermodel.PictureData;

/* loaded from: classes3.dex */
public abstract class Bitmap extends PictureData {
    @Override // lib.zj.office.fc.hslf.usermodel.PictureData
    public byte[] getData() {
        byte[] rawData = getRawData();
        int length = rawData.length - 17;
        byte[] bArr = new byte[length];
        System.arraycopy(rawData, 17, bArr, 0, length);
        return bArr;
    }

    @Override // lib.zj.office.fc.hslf.usermodel.PictureData
    public void setData(byte[] bArr) {
    }
}

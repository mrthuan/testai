package lib.zj.office.fc.hslf.usermodel;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import lib.zj.office.fc.hslf.blip.DIB;
import lib.zj.office.fc.hslf.blip.EMF;
import lib.zj.office.fc.hslf.blip.ImagePainter;
import lib.zj.office.fc.hslf.blip.JPEG;
import lib.zj.office.fc.hslf.blip.PICT;
import lib.zj.office.fc.hslf.blip.PNG;
import lib.zj.office.fc.hslf.blip.WMF;
import lib.zj.office.fc.hslf.exceptions.HSLFException;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public abstract class PictureData {
    protected static final int CHECKSUM_SIZE = 16;
    protected static ImagePainter[] painters = new ImagePainter[8];
    protected int offset;
    protected byte[] rawdata;
    private String tempFilePath;

    public static PictureData create(int i10) {
        switch (i10) {
            case 2:
                return new EMF();
            case 3:
                return new WMF();
            case 4:
                return new PICT();
            case 5:
                return new JPEG();
            case 6:
                return new PNG();
            case 7:
                return new DIB();
            default:
                return new JPEG();
        }
    }

    public static byte[] getChecksum(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e10) {
            throw new HSLFException(e10.getMessage());
        }
    }

    public abstract byte[] getData();

    public byte[] getHeader() {
        byte[] bArr = new byte[24];
        LittleEndian.putInt(bArr, 0, getSignature());
        return bArr;
    }

    public int getOffset() {
        return this.offset;
    }

    public byte[] getRawData() {
        return this.rawdata;
    }

    public abstract int getSignature();

    public int getSize() {
        return getData().length;
    }

    public String getTempFilePath() {
        return this.tempFilePath;
    }

    public abstract int getType();

    public byte[] getUID() {
        return new byte[16];
    }

    public abstract void setData(byte[] bArr);

    public void setOffset(int i10) {
        this.offset = i10;
    }

    public void setRawData(byte[] bArr) {
        this.rawdata = bArr;
    }

    public void setTempFilePath(String str) {
        this.tempFilePath = str;
    }

    public void dispose() {
    }
}

package lib.zj.office.fc.hwpf.model;

import java.util.Arrays;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public class PictureDescriptor {
    private static final int CBHEADER_OFFSET = 4;
    private static final int DXACROPLEFT_OFFSET = 36;
    private static final int DXACROPRIGHT_OFFSET = 40;
    private static final int DXAGOAL_OFFSET = 28;
    private static final int DYACROPBOTTOM_OFFSET = 42;
    private static final int DYACROPTOP_OFFSET = 38;
    private static final int DYAGOAL_OFFSET = 30;
    private static final int LCB_OFFSET = 0;
    private static final int MFP_HMF_OFFSET = 12;
    private static final int MFP_MM_OFFSET = 6;
    private static final int MFP_XEXT_OFFSET = 8;
    private static final int MFP_YEXT_OFFSET = 10;
    private static final int MX_OFFSET = 32;
    private static final int MY_OFFSET = 34;
    protected boolean bGrayScl;
    protected boolean bSetBright;
    protected boolean bSetContrast;
    protected boolean bSetGrayScl;
    protected boolean bSetThreshold;
    protected int cbHeader;
    protected float dxaCropLeft;
    protected float dxaCropRight;
    protected short dxaGoal;
    protected float dyaCropBottom;
    protected float dyaCropTop;
    protected short dyaGoal;
    protected float fBright;
    protected float fContrast;
    protected float fThreshold;
    protected int lcb;
    protected int mfp_hMF;
    protected int mfp_mm;
    protected int mfp_xExt;
    protected int mfp_yExt;
    protected short mx;
    protected short my;
    protected byte[] offset14;

    /* loaded from: classes3.dex */
    public class BlipBooleanProperties {
        public BitField fPictureBiLevel;
        public BitField fPictureGray;
        public BitField fUsefPictureBiLevel;
        public BitField fUsefPictureGray;
        int propValue;

        public BlipBooleanProperties() {
        }
    }

    /* loaded from: classes3.dex */
    public class OfficeArtOpid {
        public BitField fBid;
        public BitField fComplex;
        public short flag;
        public BitField opid;

        public OfficeArtOpid() {
        }
    }

    /* loaded from: classes3.dex */
    public class OfficeArtRecordHeader {
        public short recFlag;
        public BitField recInstance;
        public long recLength;
        public int recType;
        public BitField recVer;

        public OfficeArtRecordHeader() {
        }
    }

    public PictureDescriptor() {
        this.offset14 = new byte[14];
        this.dxaGoal = (short) 0;
        this.dyaGoal = (short) 0;
        this.dxaCropLeft = 0.0f;
        this.dyaCropTop = 0.0f;
        this.dxaCropRight = 0.0f;
        this.dyaCropBottom = 0.0f;
    }

    private short getOpid(OfficeArtOpid officeArtOpid) {
        return officeArtOpid.opid.getShortValue(officeArtOpid.flag);
    }

    private float getRealNumFromFixedPoint(byte[] bArr) {
        short s4 = LittleEndian.getShort(bArr, 2);
        return (LittleEndian.getUShort(bArr, 0) / 65536.0f) + s4;
    }

    private short getRecInstance(OfficeArtRecordHeader officeArtRecordHeader) {
        return (short) officeArtRecordHeader.recInstance.getValue(officeArtRecordHeader.recFlag);
    }

    private short getRecVer(OfficeArtRecordHeader officeArtRecordHeader) {
        return (short) officeArtRecordHeader.recVer.getValue(officeArtRecordHeader.recFlag);
    }

    private boolean isfBid(OfficeArtOpid officeArtOpid) {
        if (officeArtOpid.fBid.getShortValue(officeArtOpid.flag) == 1) {
            return true;
        }
        return false;
    }

    private boolean isfComplex(OfficeArtOpid officeArtOpid) {
        if (officeArtOpid.fComplex.getShortValue(officeArtOpid.flag) == 1) {
            return true;
        }
        return false;
    }

    private boolean isfPictureBiLevel(BlipBooleanProperties blipBooleanProperties) {
        if (blipBooleanProperties.fPictureBiLevel.getValue(blipBooleanProperties.propValue) == 1) {
            return true;
        }
        return false;
    }

    private boolean isfPictureGray(BlipBooleanProperties blipBooleanProperties) {
        if (blipBooleanProperties.fPictureBiLevel.getValue(blipBooleanProperties.propValue) == 1) {
            return true;
        }
        return false;
    }

    private boolean isfUsefPictureBiLevel(BlipBooleanProperties blipBooleanProperties) {
        if (blipBooleanProperties.fUsefPictureBiLevel.getValue(blipBooleanProperties.propValue) == 1) {
            return true;
        }
        return false;
    }

    private boolean isfUsefPictureGray(BlipBooleanProperties blipBooleanProperties) {
        if (blipBooleanProperties.fUsefPictureBiLevel.getValue(blipBooleanProperties.propValue) == 1) {
            return true;
        }
        return false;
    }

    private BlipBooleanProperties readBlipBooleanProperties(byte[] bArr, int i10) {
        BlipBooleanProperties blipBooleanProperties = new BlipBooleanProperties();
        blipBooleanProperties.propValue = LittleEndian.getInt(bArr, i10);
        blipBooleanProperties.fPictureBiLevel = new BitField(131072);
        blipBooleanProperties.fUsefPictureBiLevel = new BitField(2);
        blipBooleanProperties.fPictureGray = new BitField(262144);
        blipBooleanProperties.fUsefPictureGray = new BitField(4);
        return blipBooleanProperties;
    }

    private OfficeArtRecordHeader readHeader(byte[] bArr, int i10) {
        OfficeArtRecordHeader officeArtRecordHeader = new OfficeArtRecordHeader();
        officeArtRecordHeader.recVer = new BitField(15);
        officeArtRecordHeader.recInstance = new BitField(65520);
        int i11 = i10 + 4;
        if (i11 < bArr.length) {
            officeArtRecordHeader.recFlag = LittleEndian.getShort(bArr, i10);
            officeArtRecordHeader.recType = LittleEndian.getUShort(bArr, i10 + 2);
            officeArtRecordHeader.recLength = LittleEndian.getUInt(bArr, i11);
        }
        return officeArtRecordHeader;
    }

    private OfficeArtOpid readOfficeArtOpid(byte[] bArr, int i10) {
        OfficeArtOpid officeArtOpid = new OfficeArtOpid();
        officeArtOpid.opid = new BitField(16383);
        officeArtOpid.fBid = new BitField(16384);
        officeArtOpid.fComplex = new BitField(Variant.VT_RESERVED);
        officeArtOpid.flag = LittleEndian.getShort(bArr, i10);
        return officeArtOpid;
    }

    public float getBright() {
        return this.fBright;
    }

    public float getContrast() {
        return this.fContrast;
    }

    public float getThreshold() {
        return this.fThreshold;
    }

    public short getZoomX() {
        return this.mx;
    }

    public short getZoomY() {
        return this.my;
    }

    public boolean isGrayScl() {
        return this.bGrayScl;
    }

    public boolean isSetBright() {
        return this.bSetBright;
    }

    public boolean isSetContrast() {
        return this.bSetContrast;
    }

    public boolean isSetGrayScl() {
        return this.bSetGrayScl;
    }

    public boolean isSetThreshold() {
        return this.bSetThreshold;
    }

    public String toString() {
        return "[PICF]\n        lcb           = " + this.lcb + "\n        cbHeader      = " + this.cbHeader + "\n        mfp.mm        = " + this.mfp_mm + "\n        mfp.xExt      = " + this.mfp_xExt + "\n        mfp.yExt      = " + this.mfp_yExt + "\n        mfp.hMF       = " + this.mfp_hMF + "\n        offset14      = " + Arrays.toString(this.offset14) + "\n        dxaGoal       = " + ((int) this.dxaGoal) + "\n        dyaGoal       = " + ((int) this.dyaGoal) + "\n        dxaCropLeft   = " + this.dxaCropLeft + "\n        dyaCropTop    = " + this.dyaCropTop + "\n        dxaCropRight  = " + this.dxaCropRight + "\n        dyaCropBottom = " + this.dyaCropBottom + "\n[/PICF]";
    }

    public PictureDescriptor(byte[] bArr, int i10) {
        this.offset14 = new byte[14];
        this.dxaGoal = (short) 0;
        this.dyaGoal = (short) 0;
        this.dxaCropLeft = 0.0f;
        this.dyaCropTop = 0.0f;
        this.dxaCropRight = 0.0f;
        this.dyaCropBottom = 0.0f;
        this.lcb = LittleEndian.getInt(bArr, i10 + 0);
        this.cbHeader = LittleEndian.getUShort(bArr, i10 + 4);
        this.mfp_mm = LittleEndian.getUShort(bArr, i10 + 6);
        this.mfp_xExt = LittleEndian.getUShort(bArr, i10 + 8);
        this.mfp_yExt = LittleEndian.getUShort(bArr, i10 + 10);
        this.mfp_hMF = LittleEndian.getUShort(bArr, i10 + 12);
        this.offset14 = LittleEndian.getByteArray(bArr, i10 + 14, 14);
        this.dxaGoal = LittleEndian.getShort(bArr, i10 + 28);
        this.dyaGoal = LittleEndian.getShort(bArr, i10 + 30);
        this.mx = LittleEndian.getShort(bArr, i10 + 32);
        this.my = LittleEndian.getShort(bArr, i10 + 34);
        int i11 = i10 + 68;
        i11 = this.mfp_mm == 102 ? i11 + (bArr[i11] & Variant.VT_ILLEGAL) + 1 : i11;
        OfficeArtRecordHeader readHeader = readHeader(bArr, i11);
        short recVer = getRecVer(readHeader);
        short recInstance = getRecInstance(readHeader);
        if (recVer == 15 && recInstance == 0 && readHeader.recType == 61444) {
            long j10 = readHeader.recLength;
            int i12 = i11 + 8;
            while (j10 > 0 && i12 < bArr.length) {
                OfficeArtRecordHeader readHeader2 = readHeader(bArr, i12);
                j10 -= readHeader2.recLength;
                int i13 = i12 + 8;
                short recVer2 = getRecVer(readHeader2);
                getRecInstance(readHeader2);
                if (recVer2 == 3 && readHeader2.recType == 61451) {
                    short recInstance2 = getRecInstance(readHeader2);
                    for (int i14 = 0; i14 < recInstance2; i14++) {
                        OfficeArtOpid readOfficeArtOpid = readOfficeArtOpid(bArr, i13);
                        short opid = getOpid(readOfficeArtOpid);
                        boolean isfBid = isfBid(readOfficeArtOpid);
                        boolean isfComplex = isfComplex(readOfficeArtOpid);
                        if (opid == 256 && !isfBid && !isfComplex) {
                            this.dyaCropTop = getRealNumFromFixedPoint(LittleEndian.getByteArray(bArr, i13 + 2, 4));
                        }
                        if (opid == 257 && !isfBid && !isfComplex) {
                            this.dyaCropBottom = getRealNumFromFixedPoint(LittleEndian.getByteArray(bArr, i13 + 2, 4));
                        }
                        if (opid == 258 && !isfBid && !isfComplex) {
                            this.dxaCropLeft = getRealNumFromFixedPoint(LittleEndian.getByteArray(bArr, i13 + 2, 4));
                        }
                        if (opid == 259 && !isfBid && !isfComplex) {
                            this.dxaCropRight = getRealNumFromFixedPoint(LittleEndian.getByteArray(bArr, i13 + 2, 4));
                        }
                        if (opid == 265 && !isfBid && !isfComplex) {
                            int i15 = LittleEndian.getInt(bArr, i13 + 2);
                            this.bSetBright = true;
                            this.fBright = (i15 / 32768.0f) * 255.0f;
                        }
                        if (opid == 264 && !isfBid && !isfComplex) {
                            int i16 = LittleEndian.getInt(bArr, i13 + 2);
                            this.bSetContrast = true;
                            this.fContrast = Math.min(i16 / 65536.0f, 10.0f);
                        }
                        if (opid == 319 && !isfBid && !isfComplex) {
                            BlipBooleanProperties readBlipBooleanProperties = readBlipBooleanProperties(bArr, i13 + 2);
                            if (isfUsefPictureBiLevel(readBlipBooleanProperties)) {
                                if (isfPictureBiLevel(readBlipBooleanProperties)) {
                                    this.bSetThreshold = true;
                                    this.fThreshold = 128.0f;
                                }
                            } else if (isfUsefPictureGray(readBlipBooleanProperties) && isfPictureGray(readBlipBooleanProperties)) {
                                this.bSetGrayScl = true;
                                this.bGrayScl = true;
                            }
                        }
                        i13 += 6;
                    }
                    return;
                }
                i12 = (int) (i13 + readHeader2.recLength);
            }
        }
    }
}

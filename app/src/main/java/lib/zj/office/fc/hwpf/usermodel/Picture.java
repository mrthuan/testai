package lib.zj.office.fc.hwpf.usermodel;

import androidx.activity.r;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.InflaterInputStream;
import lib.zj.office.fc.hwpf.model.PictureDescriptor;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class Picture extends PictureDescriptor {
    public static final byte[] COMPRESSED1;
    public static final byte[] COMPRESSED2;
    @Deprecated
    public static final byte[] EMF;
    public static final byte[] IHDR;
    static final int MFPMM_OFFSET = 6;
    static final int PICF_OFFSET = 0;
    static final int PICF_SHAPE_OFFSET = 14;
    static final int PICT_HEADER_OFFSET = 4;
    private static final int PRELOADDATA_LENGTH = 128;
    @Deprecated
    public static final byte[] TIFF;
    @Deprecated
    public static final byte[] TIFF1;
    static final int UNKNOWN_HEADER_SIZE = 73;
    @Deprecated
    public static final byte[] WMF1;
    @Deprecated
    public static final byte[] WMF2;
    private byte[] _dataStream;
    private byte[] content;
    private int dataBlockSize;
    private int dataBlockStartOfsset;
    private int height;
    private int pictureBytesStartOffset;
    private byte[] preloadRawContent;
    private byte[] rawContent;
    private int size;
    private String tempFilePath;
    private String tempPath;
    private int width;
    @Deprecated
    public static final byte[] GIF = PictureType.GIF.getSignatures()[0];
    @Deprecated
    public static final byte[] PNG = PictureType.PNG.getSignatures()[0];
    @Deprecated
    public static final byte[] JPG = PictureType.JPEG.getSignatures()[0];
    @Deprecated
    public static final byte[] BMP = PictureType.BMP.getSignatures()[0];

    /* renamed from: lib.zj.office.fc.hwpf.usermodel.Picture$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$lib$zj$office$fc$hwpf$usermodel$PictureType;

        static {
            int[] iArr = new int[PictureType.values().length];
            $SwitchMap$lib$zj$office$fc$hwpf$usermodel$PictureType = iArr;
            try {
                iArr[PictureType.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$lib$zj$office$fc$hwpf$usermodel$PictureType[PictureType.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        PictureType pictureType = PictureType.TIFF;
        TIFF = pictureType.getSignatures()[0];
        TIFF1 = pictureType.getSignatures()[1];
        EMF = PictureType.EMF.getSignatures()[0];
        PictureType pictureType2 = PictureType.WMF;
        WMF1 = pictureType2.getSignatures()[0];
        WMF2 = pictureType2.getSignatures()[1];
        IHDR = new byte[]{Field.TOA, Field.NOTEREF, Field.INCLUDETEXT, 82};
        COMPRESSED1 = new byte[]{-2, 120, -38};
        COMPRESSED2 = new byte[]{-2, 120, -100};
    }

    public Picture(String str, int i10, byte[] bArr, boolean z10) {
        super(bArr, i10);
        this.height = -1;
        this.width = -1;
        this._dataStream = bArr;
        this.dataBlockStartOfsset = i10;
        int i11 = LittleEndian.getInt(bArr, i10);
        this.dataBlockSize = i11;
        int pictureBytesStartOffset = getPictureBytesStartOffset(i10, bArr, i11);
        this.pictureBytesStartOffset = pictureBytesStartOffset;
        int i12 = this.dataBlockSize - (pictureBytesStartOffset - i10);
        this.size = i12;
        if (i12 >= 0) {
            if (z10) {
                fillImageContent();
            }
            this.tempPath = str;
            return;
        }
        throw new Exception("picture size is wrong");
    }

    private void fillImageContent() {
        byte[] bArr = this.content;
        if (bArr != null && bArr.length > 0) {
            return;
        }
        byte[] preLoadRawContent = getPreLoadRawContent();
        this.content = preLoadRawContent;
        int i10 = this.pictureBytesStartOffset;
        int i11 = this.size;
        if (!matchSignature(preLoadRawContent, COMPRESSED1, 32) && !matchSignature(preLoadRawContent, COMPRESSED2, 32)) {
            try {
                InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(this._dataStream, this.pictureBytesStartOffset + 33, this.size - 33));
                byte[] bArr2 = new byte[128];
                inflaterInputStream.read(bArr2);
                String extension = PictureType.findMatchingType(bArr2).getExtension();
                if (!"wmf".equalsIgnoreCase(extension) && !"emf".equalsIgnoreCase(extension)) {
                    this.tempFilePath = writeTempFile(this._dataStream, i10, i11);
                    inflaterInputStream.close();
                    return;
                }
                this.content = bArr2;
                File file = new File(this.tempPath + File.separator + System.currentTimeMillis() + ".tmp");
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArr2);
                byte[] bArr3 = new byte[4096];
                while (true) {
                    int read = inflaterInputStream.read(bArr3);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr3, 0, read);
                }
                fileOutputStream.close();
                this.tempFilePath = file.getAbsolutePath();
                inflaterInputStream.close();
                return;
            } catch (Exception unused) {
                this.tempFilePath = writeTempFile(this._dataStream, i10, i11);
                return;
            }
        }
        try {
            InflaterInputStream inflaterInputStream2 = new InflaterInputStream(new ByteArrayInputStream(this._dataStream, this.pictureBytesStartOffset + 33, this.size - 33));
            this.tempFilePath = this.tempPath + File.separator + String.valueOf(System.currentTimeMillis()) + ".tmp";
            File file2 = new File(this.tempFilePath);
            file2.createNewFile();
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            byte[] bArr4 = new byte[4096];
            boolean z10 = false;
            while (true) {
                int read2 = inflaterInputStream2.read(bArr4);
                if (read2 > 0) {
                    if (!z10) {
                        byte[] bArr5 = new byte[read2];
                        this.content = bArr5;
                        System.arraycopy(bArr4, 0, bArr5, 0, read2);
                        z10 = true;
                    }
                    fileOutputStream2.write(bArr4, 0, read2);
                } else {
                    fileOutputStream2.close();
                    return;
                }
            }
        } catch (Exception unused2) {
        }
    }

    private void fillJPGWidthHeight() {
        byte[] bArr;
        byte b10;
        byte b11;
        int i10 = this.pictureBytesStartOffset;
        int i11 = i10 + 2;
        byte[] bArr2 = this._dataStream;
        byte b12 = bArr2[i11];
        byte b13 = bArr2[i11 + 1];
        int i12 = i10 + this.size;
        while (true) {
            int i13 = i12 - 1;
            if (i11 < i13) {
                do {
                    bArr = this._dataStream;
                    b10 = bArr[i11];
                    b11 = bArr[i11 + 1];
                    i11 += 2;
                    if (b10 == -1) {
                        break;
                    }
                } while (i11 < i13);
                if (b10 == -1 && i11 < i13) {
                    if (b11 != -39 && b11 != -38) {
                        if ((b11 & 240) == 192 && b11 != -60 && b11 != -56 && b11 != -52) {
                            int i14 = i11 + 5;
                            this.height = getBigEndianShort(bArr, i14);
                            this.width = getBigEndianShort(this._dataStream, i14 + 2);
                            return;
                        }
                        int i15 = i11 + 1 + 1;
                        i11 = i15 + getBigEndianShort(bArr, i15);
                    } else {
                        return;
                    }
                } else {
                    i11++;
                }
            } else {
                return;
            }
        }
    }

    private void fillPNGWidthHeight() {
        int length = this.pictureBytesStartOffset + PNG.length + 4;
        if (matchSignature(this._dataStream, IHDR, length)) {
            int i10 = length + 4;
            this.width = getBigEndianInt(this._dataStream, i10);
            this.height = getBigEndianInt(this._dataStream, i10 + 4);
        }
    }

    private void fillPreloadRawImageContent() {
        byte[] bArr = this.preloadRawContent;
        if (bArr != null && bArr.length > 0) {
            return;
        }
        byte[] bArr2 = new byte[Math.min(this.size, 128)];
        this.preloadRawContent = bArr2;
        try {
            System.arraycopy(this._dataStream, this.pictureBytesStartOffset, bArr2, 0, bArr2.length);
        } catch (Exception unused) {
        }
    }

    private void fillRawImageContent() {
        byte[] bArr = this.rawContent;
        if (bArr != null && bArr.length > 0) {
            return;
        }
        int i10 = this.size;
        byte[] bArr2 = new byte[i10];
        this.rawContent = bArr2;
        try {
            System.arraycopy(this._dataStream, this.pictureBytesStartOffset, bArr2, 0, i10);
        } catch (Exception unused) {
        }
    }

    private void fillWidthHeight() {
        int i10 = AnonymousClass1.$SwitchMap$lib$zj$office$fc$hwpf$usermodel$PictureType[suggestPictureType().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                fillPNGWidthHeight();
                return;
            }
            return;
        }
        fillJPGWidthHeight();
    }

    private static int getBigEndianInt(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private static int getBigEndianShort(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 8) + (bArr[i10 + 1] & 255);
    }

    private static int getPictureBytesStartOffset(int i10, byte[] bArr, int i11) {
        int i12 = i11 + i10;
        int i13 = i10 + 4;
        int i14 = LittleEndian.getShort(bArr, i13) + 4;
        if (LittleEndian.getShort(bArr, i13 + 2) == 102) {
            i14 += LittleEndian.getUnsignedByte(bArr, i14) + 1;
        }
        int i15 = LittleEndian.getInt(bArr, i10 + i14) + i14;
        if (i15 < i12) {
            i14 = i15;
        }
        int i16 = i14 + 73 + i10;
        if (i16 >= i12) {
            return i16 - 73;
        }
        return i16;
    }

    private static boolean matchSignature(byte[] bArr, byte[] bArr2, int i10) {
        boolean z10;
        if (i10 < bArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = 0;
        while (true) {
            int i12 = i11 + i10;
            if (i12 >= bArr.length || i11 >= bArr2.length) {
                break;
            } else if (bArr[i12] != bArr2[i11]) {
                return false;
            } else {
                i11++;
            }
        }
        return z10;
    }

    private String writeTempFile(byte[] bArr, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tempPath);
        File file = new File(r.g(sb2, File.separator, String.valueOf(System.currentTimeMillis()) + ".tmp"));
        try {
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr, i10, i11);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
        return file.getAbsolutePath();
    }

    @Deprecated
    public int getAspectRatioX() {
        return this.mx / 10;
    }

    @Deprecated
    public int getAspectRatioY() {
        return this.my / 10;
    }

    public byte[] getContent() {
        fillImageContent();
        return this.content;
    }

    public float getDxaCropLeft() {
        return this.dxaCropLeft;
    }

    public float getDxaCropRight() {
        return this.dxaCropRight;
    }

    public int getDxaGoal() {
        return this.dxaGoal;
    }

    public float getDyaCropBottom() {
        return this.dyaCropBottom;
    }

    public float getDyaCropTop() {
        return this.dyaCropTop;
    }

    public int getDyaGoal() {
        return this.dyaGoal;
    }

    public int getHeight() {
        if (this.height == -1) {
            fillWidthHeight();
        }
        return this.height;
    }

    public int getHorizontalScalingFactor() {
        return this.mx;
    }

    public String getMimeType() {
        return suggestPictureType().getMime();
    }

    public byte[] getPreLoadRawContent() {
        fillPreloadRawImageContent();
        return this.preloadRawContent;
    }

    public byte[] getRawContent() {
        fillRawImageContent();
        return this.rawContent;
    }

    public int getSize() {
        return this.size;
    }

    public int getStartOffset() {
        return this.dataBlockStartOfsset;
    }

    public String getTempFilePath() {
        return this.tempFilePath;
    }

    public int getVerticalScalingFactor() {
        return this.my;
    }

    public int getWidth() {
        if (this.width == -1) {
            fillWidthHeight();
        }
        return this.width;
    }

    public void setTempFilePath(String str) {
        this.tempFilePath = str;
    }

    public String suggestFileExtension() {
        return suggestPictureType().getExtension();
    }

    public String suggestFullFileName() {
        String str;
        String suggestFileExtension = suggestFileExtension();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(this.dataBlockStartOfsset));
        if (suggestFileExtension.length() > 0) {
            str = ".".concat(suggestFileExtension);
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public PictureType suggestPictureType() {
        return PictureType.findMatchingType(getContent());
    }

    public Picture(byte[] bArr) {
        this.height = -1;
        this.width = -1;
        this._dataStream = bArr;
        this.dataBlockStartOfsset = 0;
        this.dataBlockSize = bArr.length;
        this.pictureBytesStartOffset = 0;
        this.size = bArr.length;
    }
}

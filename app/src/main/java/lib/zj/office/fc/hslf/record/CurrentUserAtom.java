package lib.zj.office.fc.hslf.record;

import a6.h;
import lib.zj.office.fc.fs.filesystem.CFBFileSystem;
import lib.zj.office.fc.hslf.exceptions.CorruptPowerPointFileException;
import lib.zj.office.fc.hslf.exceptions.EncryptedPowerPointFileException;
import lib.zj.office.fc.hslf.exceptions.OldPowerPointFormatException;
import lib.zj.office.fc.hwpf.OldWordFileFormatException;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.poifs.filesystem.POIFSFileSystem;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public class CurrentUserAtom {
    private byte[] _contents;
    private long currentEditOffset;
    private int docFinalVersion;
    private byte docMajorNo;
    private byte docMinorNo;
    private String lastEditUser;
    private long releaseVersion;
    public static final byte[] atomHeader = {0, 0, -10, 15};
    public static final byte[] headerToken = {Field.SHAPE, -64, -111, -29};
    public static final byte[] encHeaderToken = {-33, -60, -47, -13};
    public static final byte[] ppt97FileVer = {8, 0, -13, 3, 3, 0};

    public CurrentUserAtom() {
        this._contents = new byte[0];
        this.docFinalVersion = 1012;
        this.docMajorNo = (byte) 3;
        this.docMinorNo = (byte) 0;
        this.releaseVersion = 8L;
        this.currentEditOffset = 0L;
        this.lastEditUser = "Apache POI";
    }

    private void init() {
        byte[] bArr = this._contents;
        byte b10 = bArr[12];
        byte[] bArr2 = encHeaderToken;
        if (b10 == bArr2[0] && bArr[13] == bArr2[1] && bArr[14] == bArr2[2] && bArr[15] == bArr2[3]) {
            throw new EncryptedPowerPointFileException("Cannot process encrypted office files!");
        }
        this.currentEditOffset = LittleEndian.getUInt(bArr, 16);
        this.docFinalVersion = LittleEndian.getUShort(this._contents, 22);
        byte[] bArr3 = this._contents;
        this.docMajorNo = bArr3[24];
        this.docMinorNo = bArr3[25];
        long uShort = LittleEndian.getUShort(bArr3, 20);
        if (uShort > 512) {
            System.err.println("Warning - invalid username length " + uShort + " found, treating as if there was no username set");
            uShort = 0L;
        }
        byte[] bArr4 = this._contents;
        int i10 = (int) uShort;
        int i11 = i10 + 28;
        int i12 = i11 + 4;
        if (bArr4.length >= i12) {
            long uInt = LittleEndian.getUInt(bArr4, i11);
            this.releaseVersion = uInt;
            if (uInt == 0) {
                throw new OldWordFileFormatException("The document is too old - Word 95 or older. Try HWPFOldDocument instead?");
            }
        } else {
            this.releaseVersion = 0L;
        }
        int i13 = i10 * 2;
        byte[] bArr5 = this._contents;
        if (bArr5.length >= i12 + i13) {
            byte[] bArr6 = new byte[i13];
            System.arraycopy(bArr5, i12, bArr6, 0, i13);
            this.lastEditUser = StringUtil.getFromUnicodeLE(bArr6);
            return;
        }
        byte[] bArr7 = new byte[i10];
        System.arraycopy(bArr5, 28, bArr7, 0, i10);
        this.lastEditUser = StringUtil.getFromCompressedUnicode(bArr7, 0, i10);
    }

    public long getCurrentEditOffset() {
        return this.currentEditOffset;
    }

    public int getDocFinalVersion() {
        return this.docFinalVersion;
    }

    public byte getDocMajorNo() {
        return this.docMajorNo;
    }

    public byte getDocMinorNo() {
        return this.docMinorNo;
    }

    public String getLastEditUsername() {
        return this.lastEditUser;
    }

    public long getReleaseVersion() {
        return this.releaseVersion;
    }

    public void setCurrentEditOffset(long j10) {
        this.currentEditOffset = j10;
    }

    public void setLastEditUsername(String str) {
        this.lastEditUser = str;
    }

    public void setReleaseVersion(long j10) {
        this.releaseVersion = j10;
    }

    public CurrentUserAtom(POIFSFileSystem pOIFSFileSystem) {
    }

    public CurrentUserAtom(CFBFileSystem cFBFileSystem) {
        byte[] propertyRawData = cFBFileSystem.getPropertyRawData("Current User");
        this._contents = propertyRawData;
        if (propertyRawData != null && propertyRawData.length <= 131072) {
            if (propertyRawData.length < 28) {
                if (propertyRawData.length >= 4) {
                    int i10 = LittleEndian.getInt(propertyRawData);
                    System.err.println(i10);
                    if (i10 + 4 == this._contents.length) {
                        throw new OldPowerPointFormatException("Based on the Current User stream, you seem to have supplied a PowerPoint95 file, which isn't supported");
                    }
                }
                throw new CorruptPowerPointFileException("The Current User stream must be at least 28 bytes long, but was only " + this._contents.length);
            }
            init();
            return;
        }
        throw new CorruptPowerPointFileException(h.g(new StringBuilder("The Current User stream is implausably long. It's normally 28-200 bytes long, but was "), this._contents.length, " bytes"));
    }

    public void dispose() {
    }

    public CurrentUserAtom(byte[] bArr) {
        this._contents = bArr;
        init();
    }
}

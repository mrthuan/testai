package lib.zj.office.fc.hslf.record;

import java.io.OutputStream;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class DocumentAtom extends RecordAtom {
    private static long _type = 1001;
    private byte[] _header;
    private int firstSlideNum;
    private long handoutMasterPersist;
    private long notesMasterPersist;
    private long notesSizeX;
    private long notesSizeY;
    private byte omitTitlePlace;
    private byte[] reserved;
    private byte rightToLeft;
    private byte saveWithFonts;
    private long serverZoomFrom;
    private long serverZoomTo;
    private byte showComments;
    private int slideSizeType;
    private long slideSizeX;
    private long slideSizeY;

    /* loaded from: classes3.dex */
    public static final class SlideSize {
        public static final int A4_SIZED_PAPER = 2;
        public static final int BANNER = 5;
        public static final int CUSTOM = 6;
        public static final int LETTER_SIZED_PAPER = 1;
        public static final int ON_35MM = 3;
        public static final int ON_SCREEN = 0;
        public static final int OVERHEAD = 4;
    }

    public DocumentAtom(byte[] bArr, int i10, int i11) {
        i11 = i11 < 48 ? 48 : i11;
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this.slideSizeX = LittleEndian.getInt(bArr, i10 + 0 + 8);
        this.slideSizeY = LittleEndian.getInt(bArr, i10 + 4 + 8);
        this.notesSizeX = LittleEndian.getInt(bArr, i10 + 8 + 8);
        this.notesSizeY = LittleEndian.getInt(bArr, i10 + 12 + 8);
        this.serverZoomFrom = LittleEndian.getInt(bArr, i10 + 16 + 8);
        this.serverZoomTo = LittleEndian.getInt(bArr, i10 + 20 + 8);
        this.notesMasterPersist = LittleEndian.getInt(bArr, i10 + 24 + 8);
        this.handoutMasterPersist = LittleEndian.getInt(bArr, i10 + 28 + 8);
        this.firstSlideNum = LittleEndian.getShort(bArr, i10 + 32 + 8);
        this.slideSizeType = LittleEndian.getShort(bArr, i10 + 34 + 8);
        this.saveWithFonts = bArr[i10 + 36 + 8];
        this.omitTitlePlace = bArr[i10 + 37 + 8];
        this.rightToLeft = bArr[i10 + 38 + 8];
        this.showComments = bArr[i10 + 39 + 8];
        byte[] bArr3 = new byte[(i11 - 40) - 8];
        this.reserved = bArr3;
        System.arraycopy(bArr, i10 + 48, bArr3, 0, bArr3.length);
    }

    public int getFirstSlideNum() {
        return this.firstSlideNum;
    }

    public long getHandoutMasterPersist() {
        return this.handoutMasterPersist;
    }

    public long getNotesMasterPersist() {
        return this.notesMasterPersist;
    }

    public long getNotesSizeX() {
        return this.notesSizeX;
    }

    public long getNotesSizeY() {
        return this.notesSizeY;
    }

    public boolean getOmitTitlePlace() {
        if (this.omitTitlePlace != 0) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public boolean getRightToLeft() {
        if (this.rightToLeft != 0) {
            return true;
        }
        return false;
    }

    public boolean getSaveWithFonts() {
        if (this.saveWithFonts != 0) {
            return true;
        }
        return false;
    }

    public long getServerZoomFrom() {
        return this.serverZoomFrom;
    }

    public long getServerZoomTo() {
        return this.serverZoomTo;
    }

    public boolean getShowComments() {
        if (this.showComments != 0) {
            return true;
        }
        return false;
    }

    public int getSlideSizeType() {
        return this.slideSizeType;
    }

    public long getSlideSizeX() {
        return this.slideSizeX;
    }

    public long getSlideSizeY() {
        return this.slideSizeY;
    }

    public void setNotesSizeX(long j10) {
        this.notesSizeX = j10;
    }

    public void setNotesSizeY(long j10) {
        this.notesSizeY = j10;
    }

    public void setServerZoomFrom(long j10) {
        this.serverZoomFrom = j10;
    }

    public void setServerZoomTo(long j10) {
        this.serverZoomTo = j10;
    }

    public void setSlideSizeX(long j10) {
        this.slideSizeX = j10;
    }

    public void setSlideSizeY(long j10) {
        this.slideSizeY = j10;
    }

    public void writeOut(OutputStream outputStream) {
        outputStream.write(this._header);
        Record.writeLittleEndian((int) this.slideSizeX, outputStream);
        Record.writeLittleEndian((int) this.slideSizeY, outputStream);
        Record.writeLittleEndian((int) this.notesSizeX, outputStream);
        Record.writeLittleEndian((int) this.notesSizeY, outputStream);
        Record.writeLittleEndian((int) this.serverZoomFrom, outputStream);
        Record.writeLittleEndian((int) this.serverZoomTo, outputStream);
        Record.writeLittleEndian((int) this.notesMasterPersist, outputStream);
        Record.writeLittleEndian((int) this.handoutMasterPersist, outputStream);
        Record.writeLittleEndian((short) this.firstSlideNum, outputStream);
        Record.writeLittleEndian((short) this.slideSizeType, outputStream);
        outputStream.write(this.saveWithFonts);
        outputStream.write(this.omitTitlePlace);
        outputStream.write(this.rightToLeft);
        outputStream.write(this.showComments);
        outputStream.write(this.reserved);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}

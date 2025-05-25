package lib.zj.office.fc.hslf.record;

import a6.h;
import java.io.OutputStream;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class SlideAtom extends RecordAtom {
    public static final int MASTER_SLIDE_ID = 0;
    public static final int USES_MASTER_SLIDE_ID = Integer.MIN_VALUE;
    private static long _type = 1007;
    private byte[] _header;
    private boolean followMasterBackground;
    private boolean followMasterObjects;
    private boolean followMasterScheme;
    private SSlideLayoutAtom layoutAtom;
    private int masterID;
    private int notesID;
    private byte[] reserved;

    public SlideAtom(byte[] bArr, int i10, int i11) {
        i11 = i11 < 30 ? 30 : i11;
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        byte[] bArr3 = new byte[12];
        System.arraycopy(bArr, i10 + 8, bArr3, 0, 12);
        this.layoutAtom = new SSlideLayoutAtom(bArr3);
        this.masterID = LittleEndian.getInt(bArr, i10 + 12 + 8);
        this.notesID = LittleEndian.getInt(bArr, i10 + 16 + 8);
        int uShort = LittleEndian.getUShort(bArr, i10 + 20 + 8);
        if ((uShort & 4) == 4) {
            this.followMasterBackground = true;
        } else {
            this.followMasterBackground = false;
        }
        if ((uShort & 2) == 2) {
            this.followMasterScheme = true;
        } else {
            this.followMasterScheme = false;
        }
        if ((uShort & 1) == 1) {
            this.followMasterObjects = true;
        } else {
            this.followMasterObjects = false;
        }
        byte[] bArr4 = new byte[i11 - 30];
        this.reserved = bArr4;
        System.arraycopy(bArr, i10 + 30, bArr4, 0, bArr4.length);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        SSlideLayoutAtom sSlideLayoutAtom = this.layoutAtom;
        if (sSlideLayoutAtom != null) {
            sSlideLayoutAtom.dispose();
        }
    }

    public boolean getFollowMasterBackground() {
        return this.followMasterBackground;
    }

    public boolean getFollowMasterObjects() {
        return this.followMasterObjects;
    }

    public boolean getFollowMasterScheme() {
        return this.followMasterScheme;
    }

    public int getMasterID() {
        return this.masterID;
    }

    public int getNotesID() {
        return this.notesID;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public SSlideLayoutAtom getSSlideLayoutAtom() {
        return this.layoutAtom;
    }

    public void setFollowMasterBackground(boolean z10) {
        this.followMasterBackground = z10;
    }

    public void setFollowMasterObjects(boolean z10) {
        this.followMasterObjects = z10;
    }

    public void setFollowMasterScheme(boolean z10) {
        this.followMasterScheme = z10;
    }

    public void setMasterID(int i10) {
        this.masterID = i10;
    }

    public void setNotesID(int i10) {
        this.notesID = i10;
    }

    public void writeOut(OutputStream outputStream) {
        short s4;
        outputStream.write(this._header);
        this.layoutAtom.writeOut(outputStream);
        Record.writeLittleEndian(this.masterID, outputStream);
        Record.writeLittleEndian(this.notesID, outputStream);
        if (this.followMasterObjects) {
            s4 = (short) 1;
        } else {
            s4 = 0;
        }
        if (this.followMasterScheme) {
            s4 = (short) (s4 + 2);
        }
        if (this.followMasterBackground) {
            s4 = (short) (s4 + 4);
        }
        Record.writeLittleEndian(s4, outputStream);
        outputStream.write(this.reserved);
    }

    public SlideAtom() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        LittleEndian.putUShort(bArr, 0, 2);
        LittleEndian.putUShort(this._header, 2, (int) _type);
        LittleEndian.putInt(this._header, 4, 24);
        SSlideLayoutAtom sSlideLayoutAtom = new SSlideLayoutAtom(new byte[12]);
        this.layoutAtom = sSlideLayoutAtom;
        sSlideLayoutAtom.setGeometryType(16);
        this.followMasterObjects = true;
        this.followMasterScheme = true;
        this.followMasterBackground = true;
        this.masterID = USES_MASTER_SLIDE_ID;
        this.notesID = 0;
        this.reserved = new byte[2];
    }

    /* loaded from: classes3.dex */
    public class SSlideLayoutAtom {
        public static final int BIG_OBJECT = 15;
        public static final int BLANK_SLIDE = 16;
        public static final int FOUR_OBJECTS = 14;
        public static final int HANDOUT = 6;
        public static final int MASTER_NOTES = 4;
        public static final int MASTER_SLIDE = 3;
        public static final int NOTES_TITLE_BODY = 5;
        public static final int TITLE_2_COLUMN_BODY = 8;
        public static final int TITLE_2_COLUNM_LEFT_2_ROW_BODY = 11;
        public static final int TITLE_2_COLUNM_RIGHT_2_ROW_BODY = 10;
        public static final int TITLE_2_ROW_BODY = 9;
        public static final int TITLE_2_ROW_BOTTOM_2_COLUMN_BODY = 12;
        public static final int TITLE_2_ROW_TOP_2_COLUMN_BODY = 13;
        public static final int TITLE_BODY_SLIDE = 1;
        public static final int TITLE_MASTER_SLIDE = 2;
        public static final int TITLE_ONLY = 7;
        public static final int TITLE_SLIDE = 0;
        public static final int VERTICAL_TITLE_2_ROW_BODY_LEFT = 17;
        public static final int VERTICAL_TITLE_BODY_LEFT = 17;
        private int geometry;
        private byte[] placeholderIDs;

        public SSlideLayoutAtom(byte[] bArr) {
            if (bArr.length == 12) {
                this.geometry = LittleEndian.getInt(bArr, 0);
                byte[] bArr2 = new byte[8];
                this.placeholderIDs = bArr2;
                System.arraycopy(bArr, 4, bArr2, 0, 8);
                return;
            }
            throw new RuntimeException(h.g(new StringBuilder("SSlideLayoutAtom created with byte array not 12 bytes long - was "), bArr.length, " bytes in size"));
        }

        public int getGeometryType() {
            return this.geometry;
        }

        public void setGeometryType(int i10) {
            this.geometry = i10;
        }

        public void writeOut(OutputStream outputStream) {
            Record.writeLittleEndian(this.geometry, outputStream);
            outputStream.write(this.placeholderIDs);
        }

        public void dispose() {
        }
    }
}

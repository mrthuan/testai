package lib.zj.office.fc.hpsf;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class Thumbnail {
    public static int CFTAG_FMTID = -3;
    public static int CFTAG_MACINTOSH = -2;
    public static int CFTAG_NODATA = 0;
    public static int CFTAG_WINDOWS = -1;
    public static int CF_BITMAP = 2;
    public static int CF_DIB = 8;
    public static int CF_ENHMETAFILE = 14;
    public static int CF_METAFILEPICT = 3;
    public static int OFFSET_CF = 8;
    public static int OFFSET_CFTAG = 4;
    public static int OFFSET_WMFDATA = 20;
    private byte[] _thumbnailData;

    public Thumbnail() {
        this._thumbnailData = null;
    }

    public long getClipboardFormat() {
        if (getClipboardFormatTag() == CFTAG_WINDOWS) {
            return LittleEndian.getUInt(getThumbnail(), OFFSET_CF);
        }
        throw new HPSFException("Clipboard Format Tag of Thumbnail must be CFTAG_WINDOWS.");
    }

    public long getClipboardFormatTag() {
        return LittleEndian.getUInt(getThumbnail(), OFFSET_CFTAG);
    }

    public byte[] getThumbnail() {
        return this._thumbnailData;
    }

    public byte[] getThumbnailAsWMF() {
        if (getClipboardFormatTag() == CFTAG_WINDOWS) {
            if (getClipboardFormat() == CF_METAFILEPICT) {
                byte[] thumbnail = getThumbnail();
                int length = thumbnail.length;
                int i10 = OFFSET_WMFDATA;
                int i11 = length - i10;
                byte[] bArr = new byte[i11];
                System.arraycopy(thumbnail, i10, bArr, 0, i11);
                return bArr;
            }
            throw new HPSFException("Clipboard Format of Thumbnail must be CF_METAFILEPICT.");
        }
        throw new HPSFException("Clipboard Format Tag of Thumbnail must be CFTAG_WINDOWS.");
    }

    public void setThumbnail(byte[] bArr) {
        this._thumbnailData = bArr;
    }

    public Thumbnail(byte[] bArr) {
        this._thumbnailData = bArr;
    }
}

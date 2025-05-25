package com.tom_roush.fontbox.ttf;

/* loaded from: classes2.dex */
public class CmapTable extends TTFTable {
    public static final int ENCODING_MAC_ROMAN = 0;
    public static final int ENCODING_UNICODE_1_0 = 0;
    public static final int ENCODING_UNICODE_1_1 = 1;
    public static final int ENCODING_UNICODE_2_0_BMP = 3;
    public static final int ENCODING_UNICODE_2_0_FULL = 4;
    public static final int ENCODING_WIN_BIG5 = 3;
    public static final int ENCODING_WIN_JOHAB = 6;
    public static final int ENCODING_WIN_PRC = 4;
    public static final int ENCODING_WIN_SHIFT_JIS = 2;
    public static final int ENCODING_WIN_SYMBOL = 0;
    public static final int ENCODING_WIN_UNICODE_BMP = 1;
    public static final int ENCODING_WIN_UNICODE_FULL = 10;
    public static final int ENCODING_WIN_WANSUNG = 5;
    public static final int PLATFORM_MACINTOSH = 1;
    public static final int PLATFORM_UNICODE = 0;
    public static final int PLATFORM_WINDOWS = 3;
    public static final String TAG = "cmap";
    private CmapSubtable[] cmaps;

    public CmapTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    public CmapSubtable[] getCmaps() {
        return this.cmaps;
    }

    public CmapSubtable getSubtable(int i10, int i11) {
        CmapSubtable[] cmapSubtableArr;
        for (CmapSubtable cmapSubtable : this.cmaps) {
            if (cmapSubtable.getPlatformId() == i10 && cmapSubtable.getPlatformEncodingId() == i11) {
                return cmapSubtable;
            }
        }
        return null;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    public void read(TrueTypeFont trueTypeFont, TTFDataStream tTFDataStream) {
        tTFDataStream.readUnsignedShort();
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        this.cmaps = new CmapSubtable[readUnsignedShort];
        for (int i10 = 0; i10 < readUnsignedShort; i10++) {
            CmapSubtable cmapSubtable = new CmapSubtable();
            cmapSubtable.initData(tTFDataStream);
            this.cmaps[i10] = cmapSubtable;
        }
        for (int i11 = 0; i11 < readUnsignedShort; i11++) {
            this.cmaps[i11].initSubtable(this, trueTypeFont.getNumberOfGlyphs(), tTFDataStream);
        }
        this.initialized = true;
    }

    public void setCmaps(CmapSubtable[] cmapSubtableArr) {
        this.cmaps = cmapSubtableArr;
    }
}

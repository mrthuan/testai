package com.tom_roush.fontbox.ttf;

/* loaded from: classes2.dex */
public class GlyphTable extends TTFTable {
    private static final int MAX_CACHED_GLYPHS = 100;
    private static final int MAX_CACHE_SIZE = 5000;
    public static final String TAG = "glyf";
    private int cached;
    private TTFDataStream data;
    private GlyphData[] glyphs;
    private IndexToLocationTable loca;
    private int numGlyphs;

    public GlyphTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
        this.cached = 0;
    }

    private GlyphData getGlyphData(int i10) {
        int leftSideBearing;
        GlyphData glyphData = new GlyphData();
        HorizontalMetricsTable horizontalMetrics = this.font.getHorizontalMetrics();
        if (horizontalMetrics == null) {
            leftSideBearing = 0;
        } else {
            leftSideBearing = horizontalMetrics.getLeftSideBearing(i10);
        }
        glyphData.initData(this, this.data, leftSideBearing);
        if (glyphData.getDescription().isComposite()) {
            glyphData.getDescription().resolve();
        }
        return glyphData;
    }

    public GlyphData getGlyph(int i10) {
        GlyphData glyphData;
        int i11;
        GlyphData glyphData2;
        if (i10 >= 0 && i10 < this.numGlyphs) {
            GlyphData[] glyphDataArr = this.glyphs;
            if (glyphDataArr != null && (glyphData2 = glyphDataArr[i10]) != null) {
                return glyphData2;
            }
            synchronized (this.data) {
                long[] offsets = this.loca.getOffsets();
                if (offsets[i10] == offsets[i10 + 1]) {
                    glyphData = new GlyphData();
                    glyphData.initEmptyData();
                } else {
                    long currentPosition = this.data.getCurrentPosition();
                    this.data.seek(getOffset() + offsets[i10]);
                    glyphData = getGlyphData(i10);
                    this.data.seek(currentPosition);
                }
                GlyphData[] glyphDataArr2 = this.glyphs;
                if (glyphDataArr2 != null && glyphDataArr2[i10] == null && (i11 = this.cached) < 100) {
                    glyphDataArr2[i10] = glyphData;
                    this.cached = i11 + 1;
                }
            }
            return glyphData;
        }
        return null;
    }

    @Deprecated
    public GlyphData[] getGlyphs() {
        GlyphData[] glyphDataArr;
        synchronized (this.data) {
            long[] offsets = this.loca.getOffsets();
            long j10 = offsets[this.numGlyphs];
            long offset = getOffset();
            if (this.glyphs == null) {
                this.glyphs = new GlyphData[this.numGlyphs];
            }
            int i10 = 0;
            while (i10 < this.numGlyphs && (j10 == 0 || j10 != offsets[i10])) {
                int i11 = i10 + 1;
                long j11 = offsets[i11];
                long j12 = offsets[i10];
                if (j11 > j12 && this.glyphs[i10] == null) {
                    this.data.seek(j12 + offset);
                    GlyphData[] glyphDataArr2 = this.glyphs;
                    if (glyphDataArr2[i10] == null) {
                        this.cached++;
                    }
                    glyphDataArr2[i10] = getGlyphData(i10);
                }
                i10 = i11;
            }
            this.initialized = true;
            glyphDataArr = this.glyphs;
        }
        return glyphDataArr;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    public void read(TrueTypeFont trueTypeFont, TTFDataStream tTFDataStream) {
        this.loca = trueTypeFont.getIndexToLocation();
        int numberOfGlyphs = trueTypeFont.getNumberOfGlyphs();
        this.numGlyphs = numberOfGlyphs;
        if (numberOfGlyphs < 5000) {
            this.glyphs = new GlyphData[numberOfGlyphs];
        }
        this.data = tTFDataStream;
        this.initialized = true;
    }

    public void setGlyphs(GlyphData[] glyphDataArr) {
        this.glyphs = glyphDataArr;
    }
}

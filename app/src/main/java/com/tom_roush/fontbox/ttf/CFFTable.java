package com.tom_roush.fontbox.ttf;

import com.tom_roush.fontbox.cff.CFFFont;
import com.tom_roush.fontbox.cff.CFFParser;

/* loaded from: classes2.dex */
public class CFFTable extends TTFTable {
    public static final String TAG = "CFF ";
    private CFFFont cffFont;

    /* loaded from: classes2.dex */
    public static class CFFBytesource implements CFFParser.ByteSource {
        private final TrueTypeFont ttf;

        public CFFBytesource(TrueTypeFont trueTypeFont) {
            this.ttf = trueTypeFont;
        }

        @Override // com.tom_roush.fontbox.cff.CFFParser.ByteSource
        public byte[] getBytes() {
            TrueTypeFont trueTypeFont = this.ttf;
            return trueTypeFont.getTableBytes(trueTypeFont.getTableMap().get(CFFTable.TAG));
        }
    }

    public CFFTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    public CFFFont getFont() {
        return this.cffFont;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    public void read(TrueTypeFont trueTypeFont, TTFDataStream tTFDataStream) {
        this.cffFont = new CFFParser().parse(tTFDataStream.read((int) getLength()), new CFFBytesource(this.font)).get(0);
        this.initialized = true;
    }
}

package com.tom_roush.fontbox.ttf;

import java.io.File;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class OTFParser extends TTFParser {
    public OTFParser() {
    }

    @Override // com.tom_roush.fontbox.ttf.TTFParser
    public boolean allowCFF() {
        return true;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFParser
    public TTFTable readTable(TrueTypeFont trueTypeFont, String str) {
        if (!str.equals("BASE") && !str.equals("GDEF") && !str.equals("GPOS") && !str.equals(GlyphSubstitutionTable.TAG) && !str.equals("JSTF")) {
            if (str.equals(CFFTable.TAG)) {
                return new CFFTable(trueTypeFont);
            }
            return super.readTable(trueTypeFont, str);
        }
        return new OTLTable(trueTypeFont);
    }

    public OTFParser(boolean z10) {
        this(z10, false);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFParser
    public OpenTypeFont newFont(TTFDataStream tTFDataStream) {
        return new OpenTypeFont(tTFDataStream);
    }

    public OTFParser(boolean z10, boolean z11) {
        super(z10, z11);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFParser
    public OpenTypeFont parse(String str) {
        return (OpenTypeFont) super.parse(str);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFParser
    public OpenTypeFont parse(File file) {
        return (OpenTypeFont) super.parse(file);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFParser
    public OpenTypeFont parse(InputStream inputStream) {
        return (OpenTypeFont) super.parse(inputStream);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFParser
    public OpenTypeFont parse(TTFDataStream tTFDataStream) {
        return (OpenTypeFont) super.parse(tTFDataStream);
    }
}

package com.tom_roush.fontbox.ttf;

import android.graphics.Path;

/* loaded from: classes2.dex */
public class OpenTypeFont extends TrueTypeFont {
    private boolean isPostScript;

    public OpenTypeFont(TTFDataStream tTFDataStream) {
        super(tTFDataStream);
    }

    public CFFTable getCFF() {
        if (this.isPostScript) {
            return (CFFTable) getTable(CFFTable.TAG);
        }
        throw new UnsupportedOperationException("TTF fonts do not have a CFF table");
    }

    @Override // com.tom_roush.fontbox.ttf.TrueTypeFont
    public GlyphTable getGlyph() {
        if (!this.isPostScript) {
            return super.getGlyph();
        }
        throw new UnsupportedOperationException("OTF fonts do not have a glyf table");
    }

    @Override // com.tom_roush.fontbox.ttf.TrueTypeFont, com.tom_roush.fontbox.FontBoxFont
    public Path getPath(String str) {
        return getCFF().getFont().getType2CharString(nameToGID(str)).getPath();
    }

    public boolean hasLayoutTables() {
        if (!this.tables.containsKey("BASE") && !this.tables.containsKey("GDEF") && !this.tables.containsKey("GPOS") && !this.tables.containsKey(GlyphSubstitutionTable.TAG) && !this.tables.containsKey("JSTF")) {
            return false;
        }
        return true;
    }

    public boolean isPostScript() {
        return this.tables.containsKey(CFFTable.TAG);
    }

    @Override // com.tom_roush.fontbox.ttf.TrueTypeFont
    public void setVersion(float f10) {
        boolean z10;
        if (Float.floatToIntBits(f10) == 1184802985) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.isPostScript = z10;
        super.setVersion(f10);
    }
}

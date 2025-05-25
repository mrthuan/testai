package com.tom_roush.fontbox.ttf;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class TTFParser {
    private boolean isEmbedded;
    private boolean parseOnDemandOnly;

    public TTFParser() {
        this(false);
    }

    private void parseTables(TrueTypeFont trueTypeFont) {
        boolean z10;
        for (TTFTable tTFTable : trueTypeFont.getTables()) {
            if (!tTFTable.getInitialized()) {
                trueTypeFont.readTable(tTFTable);
            }
        }
        if (allowCFF() && trueTypeFont.tables.containsKey(CFFTable.TAG)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (trueTypeFont.getHeader() != null) {
            if (trueTypeFont.getHorizontalHeader() != null) {
                if (trueTypeFont.getMaximumProfile() != null) {
                    if (trueTypeFont.getPostScript() == null && !this.isEmbedded) {
                        throw new IOException("post is mandatory");
                    }
                    if (!z10) {
                        if (trueTypeFont.getIndexToLocation() != null) {
                            if (trueTypeFont.getGlyph() == null) {
                                throw new IOException("glyf is mandatory");
                            }
                        } else {
                            throw new IOException("loca is mandatory");
                        }
                    }
                    if (trueTypeFont.getNaming() == null && !this.isEmbedded) {
                        throw new IOException("name is mandatory");
                    }
                    if (trueTypeFont.getHorizontalMetrics() != null) {
                        if (!this.isEmbedded && trueTypeFont.getCmap() == null) {
                            throw new IOException("cmap is mandatory");
                        }
                        return;
                    }
                    throw new IOException("hmtx is mandatory");
                }
                throw new IOException("maxp is mandatory");
            }
            throw new IOException("hhead is mandatory");
        }
        throw new IOException("head is mandatory");
    }

    private TTFTable readTableDirectory(TrueTypeFont trueTypeFont, TTFDataStream tTFDataStream) {
        TTFTable readTable;
        String readString = tTFDataStream.readString(4);
        if (readString.equals(CmapTable.TAG)) {
            readTable = new CmapTable(trueTypeFont);
        } else if (readString.equals(GlyphTable.TAG)) {
            readTable = new GlyphTable(trueTypeFont);
        } else if (readString.equals(HeaderTable.TAG)) {
            readTable = new HeaderTable(trueTypeFont);
        } else if (readString.equals(HorizontalHeaderTable.TAG)) {
            readTable = new HorizontalHeaderTable(trueTypeFont);
        } else if (readString.equals(HorizontalMetricsTable.TAG)) {
            readTable = new HorizontalMetricsTable(trueTypeFont);
        } else if (readString.equals(IndexToLocationTable.TAG)) {
            readTable = new IndexToLocationTable(trueTypeFont);
        } else if (readString.equals(MaximumProfileTable.TAG)) {
            readTable = new MaximumProfileTable(trueTypeFont);
        } else if (readString.equals(NamingTable.TAG)) {
            readTable = new NamingTable(trueTypeFont);
        } else if (readString.equals(OS2WindowsMetricsTable.TAG)) {
            readTable = new OS2WindowsMetricsTable(trueTypeFont);
        } else if (readString.equals(PostScriptTable.TAG)) {
            readTable = new PostScriptTable(trueTypeFont);
        } else if (readString.equals(DigitalSignatureTable.TAG)) {
            readTable = new DigitalSignatureTable(trueTypeFont);
        } else if (readString.equals(KerningTable.TAG)) {
            readTable = new KerningTable(trueTypeFont);
        } else if (readString.equals(VerticalHeaderTable.TAG)) {
            readTable = new VerticalHeaderTable(trueTypeFont);
        } else if (readString.equals(VerticalMetricsTable.TAG)) {
            readTable = new VerticalMetricsTable(trueTypeFont);
        } else if (readString.equals(VerticalOriginTable.TAG)) {
            readTable = new VerticalOriginTable(trueTypeFont);
        } else if (readString.equals(GlyphSubstitutionTable.TAG)) {
            readTable = new GlyphSubstitutionTable(trueTypeFont);
        } else {
            readTable = readTable(trueTypeFont, readString);
        }
        readTable.setTag(readString);
        readTable.setCheckSum(tTFDataStream.readUnsignedInt());
        readTable.setOffset(tTFDataStream.readUnsignedInt());
        readTable.setLength(tTFDataStream.readUnsignedInt());
        if (readTable.getLength() == 0 && !readString.equals(GlyphTable.TAG)) {
            return null;
        }
        return readTable;
    }

    public boolean allowCFF() {
        return false;
    }

    public TrueTypeFont newFont(TTFDataStream tTFDataStream) {
        return new TrueTypeFont(tTFDataStream);
    }

    public TrueTypeFont parse(String str) {
        return parse(new File(str));
    }

    public TrueTypeFont parseEmbedded(InputStream inputStream) {
        this.isEmbedded = true;
        return parse(new MemoryTTFDataStream(inputStream));
    }

    public TTFTable readTable(TrueTypeFont trueTypeFont, String str) {
        return new TTFTable(trueTypeFont);
    }

    public TTFParser(boolean z10) {
        this(z10, false);
    }

    public TrueTypeFont parse(File file) {
        RAFDataStream rAFDataStream = new RAFDataStream(file, "r");
        try {
            return parse(rAFDataStream);
        } catch (IOException e10) {
            rAFDataStream.close();
            throw e10;
        }
    }

    public TTFParser(boolean z10, boolean z11) {
        this.isEmbedded = z10;
        this.parseOnDemandOnly = z11;
    }

    public TrueTypeFont parse(InputStream inputStream) {
        return parse(new MemoryTTFDataStream(inputStream));
    }

    public TrueTypeFont parse(TTFDataStream tTFDataStream) {
        TrueTypeFont newFont = newFont(tTFDataStream);
        newFont.setVersion(tTFDataStream.read32Fixed());
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        tTFDataStream.readUnsignedShort();
        tTFDataStream.readUnsignedShort();
        tTFDataStream.readUnsignedShort();
        for (int i10 = 0; i10 < readUnsignedShort; i10++) {
            TTFTable readTableDirectory = readTableDirectory(newFont, tTFDataStream);
            if (readTableDirectory != null) {
                newFont.addTable(readTableDirectory);
            }
        }
        if (!this.parseOnDemandOnly) {
            parseTables(newFont);
        }
        return newFont;
    }
}

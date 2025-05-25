package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.ttf.CmapSubtable;
import com.tom_roush.fontbox.ttf.CmapTable;
import com.tom_roush.fontbox.ttf.GlyphData;
import com.tom_roush.fontbox.ttf.PostScriptTable;
import com.tom_roush.fontbox.ttf.TTFParser;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.font.encoding.BuiltInEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.GlyphList;
import com.tom_roush.pdfbox.pdmodel.font.encoding.MacOSRomanEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.MacRomanEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.StandardEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Type1Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.WinAnsiEncoding;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class PDTrueTypeFont extends PDSimpleFont implements PDVectorFont {
    private static final Map<String, Integer> INVERTED_MACOS_ROMAN = new HashMap(250);
    private static final int START_RANGE_F000 = 61440;
    private static final int START_RANGE_F100 = 61696;
    private static final int START_RANGE_F200 = 61952;
    private boolean cmapInitialized;
    private CmapSubtable cmapMacRoman;
    private CmapSubtable cmapWinSymbol;
    private CmapSubtable cmapWinUnicode;
    private BoundingBox fontBBox;
    private Map<Integer, Integer> gidToCode;
    private final boolean isDamaged;
    private final boolean isEmbedded;
    private final TrueTypeFont ttf;

    static {
        for (Map.Entry<Integer, String> entry : MacOSRomanEncoding.INSTANCE.getCodeToNameMap().entrySet()) {
            Map<String, Integer> map = INVERTED_MACOS_ROMAN;
            if (!map.containsKey(entry.getValue())) {
                map.put(entry.getValue(), entry.getKey());
            }
        }
    }

    public PDTrueTypeFont(COSDictionary cOSDictionary) {
        super(cOSDictionary);
        boolean z10;
        PDStream fontFile2;
        TrueTypeFont trueTypeFont = null;
        this.cmapWinUnicode = null;
        this.cmapWinSymbol = null;
        this.cmapMacRoman = null;
        this.cmapInitialized = false;
        if (getFontDescriptor() != null && (fontFile2 = super.getFontDescriptor().getFontFile2()) != null) {
            try {
                trueTypeFont = new TTFParser(true).parse(fontFile2.createInputStream());
            } catch (IOException unused) {
                getBaseFont();
                z10 = true;
            }
        }
        z10 = false;
        this.isEmbedded = trueTypeFont != null;
        this.isDamaged = z10;
        if (trueTypeFont == null) {
            FontMapping<TrueTypeFont> trueTypeFont2 = FontMappers.instance().getTrueTypeFont(getBaseFont(), getFontDescriptor());
            TrueTypeFont font = trueTypeFont2.getFont();
            if (trueTypeFont2.isFallback()) {
                Objects.toString(font);
                getBaseFont();
            }
            trueTypeFont = font;
        }
        this.ttf = trueTypeFont;
        readEncoding();
    }

    private void extractCmapTable() {
        CmapSubtable[] cmaps;
        if (this.cmapInitialized) {
            return;
        }
        CmapTable cmap = this.ttf.getCmap();
        if (cmap != null) {
            for (CmapSubtable cmapSubtable : cmap.getCmaps()) {
                if (3 == cmapSubtable.getPlatformId()) {
                    if (1 == cmapSubtable.getPlatformEncodingId()) {
                        this.cmapWinUnicode = cmapSubtable;
                    } else if (cmapSubtable.getPlatformEncodingId() == 0) {
                        this.cmapWinSymbol = cmapSubtable;
                    }
                } else if (1 == cmapSubtable.getPlatformId() && cmapSubtable.getPlatformEncodingId() == 0) {
                    this.cmapMacRoman = cmapSubtable;
                } else if (cmapSubtable.getPlatformId() == 0 && cmapSubtable.getPlatformEncodingId() == 0) {
                    this.cmapWinUnicode = cmapSubtable;
                }
            }
        }
        this.cmapInitialized = true;
    }

    private BoundingBox generateBoundingBox() {
        PDRectangle fontBoundingBox;
        if (getFontDescriptor() != null && (fontBoundingBox = getFontDescriptor().getFontBoundingBox()) != null) {
            return new BoundingBox(fontBoundingBox.getLowerLeftX(), fontBoundingBox.getLowerLeftY(), fontBoundingBox.getUpperRightX(), fontBoundingBox.getUpperRightY());
        }
        return this.ttf.getFontBBox();
    }

    public static PDTrueTypeFont load(PDDocument pDDocument, File file, Encoding encoding) {
        return new PDTrueTypeFont(pDDocument, new TTFParser().parse(file), encoding, true);
    }

    @Deprecated
    public static PDTrueTypeFont loadTTF(PDDocument pDDocument, File file) {
        return new PDTrueTypeFont(pDDocument, new TTFParser().parse(file), WinAnsiEncoding.INSTANCE, true);
    }

    public int codeToGID(int i10) {
        CmapSubtable cmapSubtable;
        Integer num;
        String unicode;
        extractCmapTable();
        int i11 = 0;
        if (!isSymbolic()) {
            String name = this.encoding.getName(i10);
            if (".notdef".equals(name)) {
                return 0;
            }
            if (this.cmapWinUnicode != null && (unicode = GlyphList.getAdobeGlyphList().toUnicode(name)) != null) {
                i11 = this.cmapWinUnicode.getGlyphId(unicode.codePointAt(0));
            }
            if (i11 == 0 && this.cmapMacRoman != null && (num = INVERTED_MACOS_ROMAN.get(name)) != null) {
                i11 = this.cmapMacRoman.getGlyphId(num.intValue());
            }
            if (i11 == 0) {
                return this.ttf.nameToGID(name);
            }
            return i11;
        }
        CmapSubtable cmapSubtable2 = this.cmapWinUnicode;
        if (cmapSubtable2 != null) {
            Encoding encoding = this.encoding;
            if (!(encoding instanceof WinAnsiEncoding) && !(encoding instanceof MacRomanEncoding)) {
                i11 = cmapSubtable2.getGlyphId(i10);
            } else {
                String name2 = encoding.getName(i10);
                if (".notdef".equals(name2)) {
                    return 0;
                }
                String unicode2 = GlyphList.getAdobeGlyphList().toUnicode(name2);
                if (unicode2 != null) {
                    i11 = this.cmapWinUnicode.getGlyphId(unicode2.codePointAt(0));
                }
            }
        }
        CmapSubtable cmapSubtable3 = this.cmapWinSymbol;
        if (cmapSubtable3 != null) {
            int glyphId = cmapSubtable3.getGlyphId(i10);
            if (i10 >= 0 && i10 <= 255) {
                if (glyphId == 0) {
                    glyphId = this.cmapWinSymbol.getGlyphId(61440 + i10);
                }
                if (glyphId == 0) {
                    glyphId = this.cmapWinSymbol.getGlyphId(START_RANGE_F100 + i10);
                }
                if (glyphId == 0) {
                    glyphId = this.cmapWinSymbol.getGlyphId(START_RANGE_F200 + i10);
                }
            }
            i11 = glyphId;
        }
        if (i11 == 0 && (cmapSubtable = this.cmapMacRoman) != null) {
            return cmapSubtable.getGlyphId(i10);
        }
        return i11;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public byte[] encode(int i10) {
        Encoding encoding = this.encoding;
        if (encoding != null) {
            if (encoding.contains(getGlyphList().codePointToName(i10))) {
                String codePointToName = getGlyphList().codePointToName(i10);
                Map<String, Integer> nameToCodeMap = this.encoding.getNameToCodeMap();
                if (this.ttf.hasGlyph(codePointToName) || this.ttf.hasGlyph(UniUtil.getUniNameOfCodePoint(i10))) {
                    return new byte[]{(byte) nameToCodeMap.get(codePointToName).intValue()};
                }
                throw new IllegalArgumentException(String.format("No glyph for U+%04X in font %s", Integer.valueOf(i10), getName()));
            }
            throw new IllegalArgumentException(String.format("U+%04X is not available in this font's encoding: %s", Integer.valueOf(i10), this.encoding.getEncodingName()));
        }
        String codePointToName2 = getGlyphList().codePointToName(i10);
        if (this.ttf.hasGlyph(codePointToName2)) {
            Integer num = getGIDToCode().get(Integer.valueOf(this.ttf.nameToGID(codePointToName2)));
            if (num != null) {
                return new byte[]{(byte) num.intValue()};
            }
            throw new IllegalArgumentException(String.format("U+%04X is not available in this font's Encoding", Integer.valueOf(i10)));
        }
        throw new IllegalArgumentException(String.format("No glyph for U+%04X in font %s", Integer.valueOf(i10), getName()));
    }

    public final String getBaseFont() {
        return this.dict.getNameAsString(COSName.BASE_FONT);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public BoundingBox getBoundingBox() {
        if (this.fontBBox == null) {
            this.fontBBox = generateBoundingBox();
        }
        return this.fontBBox;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public FontBoxFont getFontBoxFont() {
        return this.ttf;
    }

    public Map<Integer, Integer> getGIDToCode() {
        Map<Integer, Integer> map = this.gidToCode;
        if (map != null) {
            return map;
        }
        this.gidToCode = new HashMap();
        for (int i10 = 0; i10 <= 255; i10++) {
            int codeToGID = codeToGID(i10);
            if (!this.gidToCode.containsKey(Integer.valueOf(codeToGID))) {
                this.gidToCode.put(Integer.valueOf(codeToGID), Integer.valueOf(i10));
            }
        }
        return this.gidToCode;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getHeight(int i10) {
        GlyphData glyph = this.ttf.getGlyph().getGlyph(codeToGID(i10));
        if (glyph != null) {
            return glyph.getBoundingBox().getHeight();
        }
        return 0.0f;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public String getName() {
        return getBaseFont();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public Path getPath(int i10) {
        GlyphData glyph = this.ttf.getGlyph().getGlyph(codeToGID(i10));
        if (glyph == null) {
            return new Path();
        }
        return glyph.getPath();
    }

    public TrueTypeFont getTrueTypeFont() {
        return this.ttf;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidthFromFont(int i10) {
        float advanceWidth = this.ttf.getAdvanceWidth(codeToGID(i10));
        float unitsPerEm = this.ttf.getUnitsPerEm();
        if (unitsPerEm != 1000.0f) {
            return advanceWidth * (1000.0f / unitsPerEm);
        }
        return advanceWidth;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public boolean hasGlyph(String str) {
        return this.ttf.nameToGID(str) != 0;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isDamaged() {
        return this.isDamaged;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isEmbedded() {
        return this.isEmbedded;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public int readCode(InputStream inputStream) {
        return inputStream.read();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Encoding readEncodingFromFont() {
        String str;
        if (!isEmbedded() && getStandard14AFM() != null) {
            return new Type1Encoding(getStandard14AFM());
        }
        if (getSymbolicFlag() != null && !getSymbolicFlag().booleanValue()) {
            return StandardEncoding.INSTANCE;
        }
        String mappedFontName = Standard14Fonts.getMappedFontName(getName());
        if (isStandard14() && !mappedFontName.equals("Symbol") && !mappedFontName.equals("ZapfDingbats")) {
            return StandardEncoding.INSTANCE;
        }
        PostScriptTable postScript = this.ttf.getPostScript();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 <= 256; i10++) {
            int codeToGID = codeToGID(i10);
            if (codeToGID > 0) {
                if (postScript != null) {
                    str = postScript.getName(codeToGID);
                } else {
                    str = null;
                }
                if (str == null) {
                    str = Integer.toString(codeToGID);
                }
                hashMap.put(Integer.valueOf(i10), str);
            }
        }
        return new BuiltInEncoding(hashMap);
    }

    public static PDTrueTypeFont load(PDDocument pDDocument, InputStream inputStream, Encoding encoding) {
        return new PDTrueTypeFont(pDDocument, new TTFParser().parse(inputStream), encoding, true);
    }

    @Deprecated
    public static PDTrueTypeFont loadTTF(PDDocument pDDocument, InputStream inputStream) {
        return new PDTrueTypeFont(pDDocument, new TTFParser().parse(inputStream), WinAnsiEncoding.INSTANCE, true);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public boolean hasGlyph(int i10) {
        return codeToGID(i10) != 0;
    }

    public static PDTrueTypeFont load(PDDocument pDDocument, TrueTypeFont trueTypeFont, Encoding encoding) {
        return new PDTrueTypeFont(pDDocument, trueTypeFont, encoding, false);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Path getPath(String str) {
        int nameToGID = this.ttf.nameToGID(str);
        if (nameToGID == 0) {
            nameToGID = 0;
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt <= this.ttf.getNumberOfGlyphs()) {
                    nameToGID = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (nameToGID == 0) {
            return new Path();
        }
        GlyphData glyph = this.ttf.getGlyph().getGlyph(nameToGID);
        if (glyph != null) {
            return glyph.getPath();
        }
        return new Path();
    }

    private PDTrueTypeFont(PDDocument pDDocument, TrueTypeFont trueTypeFont, Encoding encoding, boolean z10) {
        this.cmapWinUnicode = null;
        this.cmapWinSymbol = null;
        this.cmapMacRoman = null;
        this.cmapInitialized = false;
        PDTrueTypeFontEmbedder pDTrueTypeFontEmbedder = new PDTrueTypeFontEmbedder(pDDocument, this.dict, trueTypeFont, encoding);
        this.encoding = encoding;
        this.ttf = trueTypeFont;
        setFontDescriptor(pDTrueTypeFontEmbedder.getFontDescriptor());
        this.isEmbedded = true;
        this.isDamaged = false;
        this.glyphList = GlyphList.getAdobeGlyphList();
        if (z10) {
            trueTypeFont.close();
        }
    }
}

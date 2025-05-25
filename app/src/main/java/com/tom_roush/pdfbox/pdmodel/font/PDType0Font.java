package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import com.tom_roush.fontbox.cmap.CMap;
import com.tom_roush.fontbox.ttf.TTFParser;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.Vector;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes2.dex */
public class PDType0Font extends PDFont implements PDVectorFont {
    private CMap cMap;
    private CMap cMapUCS2;
    private final PDCIDFont descendantFont;
    private PDCIDFontType2Embedder embedder;
    private boolean isCMapPredefined;
    private boolean isDescendantCJK;
    private final Set<Integer> noUnicode;
    private TrueTypeFont ttf;

    public PDType0Font(COSDictionary cOSDictionary) {
        super(cOSDictionary);
        this.noUnicode = new HashSet();
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.DESCENDANT_FONTS);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            if (cOSArray.size() != 0) {
                COSBase object = cOSArray.getObject(0);
                if (object instanceof COSDictionary) {
                    this.descendantFont = PDFontFactory.createDescendantFont((COSDictionary) object, this);
                    readEncoding();
                    fetchCMapUCS2();
                    return;
                }
                throw new IOException("Missing descendant font dictionary");
            }
            throw new IOException("Descendant font array is empty");
        }
        throw new IOException("Missing descendant font array");
    }

    private void fetchCMapUCS2() {
        String str;
        COSName cOSName = this.dict.getCOSName(COSName.ENCODING);
        if ((this.isCMapPredefined && cOSName != COSName.IDENTITY_H && cOSName != COSName.IDENTITY_V) || this.isDescendantCJK) {
            if (this.isDescendantCJK) {
                str = this.descendantFont.getCIDSystemInfo().getRegistry() + "-" + this.descendantFont.getCIDSystemInfo().getOrdering() + "-" + this.descendantFont.getCIDSystemInfo().getSupplement();
            } else if (cOSName != null) {
                str = cOSName.getName();
            } else {
                str = null;
            }
            if (str != null) {
                try {
                    CMap predefinedCMap = CMapManager.getPredefinedCMap(str);
                    this.cMapUCS2 = CMapManager.getPredefinedCMap(predefinedCMap.getRegistry() + "-" + predefinedCMap.getOrdering() + "-UCS2");
                } catch (IOException unused) {
                    getName();
                }
            }
        }
    }

    public static PDType0Font load(PDDocument pDDocument, File file) {
        return new PDType0Font(pDDocument, new TTFParser().parse(file), true, true, false);
    }

    public static PDType0Font loadVertical(PDDocument pDDocument, File file) {
        return new PDType0Font(pDDocument, new TTFParser().parse(file), true, true, true);
    }

    private void readEncoding() {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.ENCODING);
        boolean z10 = true;
        if (dictionaryObject instanceof COSName) {
            CMap predefinedCMap = CMapManager.getPredefinedCMap(((COSName) dictionaryObject).getName());
            this.cMap = predefinedCMap;
            if (predefinedCMap != null) {
                this.isCMapPredefined = true;
            } else {
                throw new IOException("Missing required CMap");
            }
        } else if (dictionaryObject != null) {
            CMap readCMap = readCMap(dictionaryObject);
            this.cMap = readCMap;
            if (readCMap != null) {
                if (!readCMap.hasCIDMappings()) {
                    getName();
                }
            } else {
                throw new IOException("Missing required CMap");
            }
        }
        PDCIDSystemInfo cIDSystemInfo = this.descendantFont.getCIDSystemInfo();
        if (cIDSystemInfo != null) {
            if (!"Adobe".equals(cIDSystemInfo.getRegistry()) || (!"GB1".equals(cIDSystemInfo.getOrdering()) && !"CNS1".equals(cIDSystemInfo.getOrdering()) && !"Japan1".equals(cIDSystemInfo.getOrdering()) && !"Korea1".equals(cIDSystemInfo.getOrdering()))) {
                z10 = false;
            }
            this.isDescendantCJK = z10;
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public void addToSubset(int i10) {
        if (willBeSubset()) {
            this.embedder.addToSubset(i10);
            return;
        }
        throw new IllegalStateException("This font was created with subsetting disabled");
    }

    public int codeToCID(int i10) {
        return this.descendantFont.codeToCID(i10);
    }

    public int codeToGID(int i10) {
        return this.descendantFont.codeToGID(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public byte[] encode(int i10) {
        return this.descendantFont.encode(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getAverageFontWidth() {
        return this.descendantFont.getAverageFontWidth();
    }

    public String getBaseFont() {
        return this.dict.getNameAsString(COSName.BASE_FONT);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public BoundingBox getBoundingBox() {
        return this.descendantFont.getBoundingBox();
    }

    public CMap getCMap() {
        return this.cMap;
    }

    public CMap getCMapUCS2() {
        return this.cMapUCS2;
    }

    public PDCIDFont getDescendantFont() {
        return this.descendantFont;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public Vector getDisplacement(int i10) {
        if (isVertical()) {
            return new Vector(0.0f, this.descendantFont.getVerticalDisplacementVectorY(i10) / 1000.0f);
        }
        return super.getDisplacement(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public PDFontDescriptor getFontDescriptor() {
        return this.descendantFont.getFontDescriptor();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public Matrix getFontMatrix() {
        return this.descendantFont.getFontMatrix();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getHeight(int i10) {
        return this.descendantFont.getHeight(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public String getName() {
        return getBaseFont();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public Path getPath(int i10) {
        return this.descendantFont.getPath(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public Vector getPositionVector(int i10) {
        return this.descendantFont.getPositionVector(i10).scale(-0.001f);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public float getStandard14Width(int i10) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidth(int i10) {
        return this.descendantFont.getWidth(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidthFromFont(int i10) {
        return this.descendantFont.getWidthFromFont(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean hasExplicitWidth(int i10) {
        return this.descendantFont.hasExplicitWidth(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public boolean hasGlyph(int i10) {
        return this.descendantFont.hasGlyph(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isDamaged() {
        return this.descendantFont.isDamaged();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isEmbedded() {
        return this.descendantFont.isEmbedded();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public boolean isStandard14() {
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public boolean isVertical() {
        if (this.cMap.getWMode() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public int readCode(InputStream inputStream) {
        return this.cMap.readCode(inputStream);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public void subset() {
        if (willBeSubset()) {
            this.embedder.subset();
            TrueTypeFont trueTypeFont = this.ttf;
            if (trueTypeFont != null) {
                trueTypeFont.close();
                this.ttf = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("This font was created with subsetting disabled");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public String toString() {
        String str;
        if (getDescendantFont() != null) {
            str = getDescendantFont().getClass().getSimpleName();
        } else {
            str = null;
        }
        return getClass().getSimpleName() + PackagingURIHelper.FORWARD_SLASH_STRING + str + ", PostScript name: " + getBaseFont();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public String toUnicode(int i10) {
        String unicode = super.toUnicode(i10);
        if (unicode != null) {
            return unicode;
        }
        if ((this.isCMapPredefined || this.isDescendantCJK) && this.cMapUCS2 != null) {
            return this.cMapUCS2.toUnicode(codeToCID(i10));
        } else if (!this.noUnicode.contains(Integer.valueOf(i10))) {
            new StringBuilder("CID+").append(codeToCID(i10));
            getName();
            this.noUnicode.add(Integer.valueOf(i10));
            return null;
        } else {
            return null;
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public boolean willBeSubset() {
        PDCIDFontType2Embedder pDCIDFontType2Embedder = this.embedder;
        if (pDCIDFontType2Embedder != null && pDCIDFontType2Embedder.needsSubset()) {
            return true;
        }
        return false;
    }

    public static PDType0Font load(PDDocument pDDocument, InputStream inputStream) {
        return load(pDDocument, inputStream, true);
    }

    public static PDType0Font loadVertical(PDDocument pDDocument, InputStream inputStream) {
        return new PDType0Font(pDDocument, new TTFParser().parse(inputStream), true, true, true);
    }

    public static PDType0Font load(PDDocument pDDocument, InputStream inputStream, boolean z10) {
        return new PDType0Font(pDDocument, new TTFParser().parse(inputStream), z10, true, false);
    }

    public static PDType0Font loadVertical(PDDocument pDDocument, InputStream inputStream, boolean z10) {
        return new PDType0Font(pDDocument, new TTFParser().parse(inputStream), z10, true, true);
    }

    public static PDType0Font load(PDDocument pDDocument, TrueTypeFont trueTypeFont, boolean z10) {
        return new PDType0Font(pDDocument, trueTypeFont, z10, false, false);
    }

    public static PDType0Font loadVertical(PDDocument pDDocument, TrueTypeFont trueTypeFont, boolean z10) {
        return new PDType0Font(pDDocument, trueTypeFont, z10, false, true);
    }

    private PDType0Font(PDDocument pDDocument, TrueTypeFont trueTypeFont, boolean z10, boolean z11, boolean z12) {
        this.noUnicode = new HashSet();
        if (z12) {
            trueTypeFont.enableVerticalSubstitutions();
        }
        PDCIDFontType2Embedder pDCIDFontType2Embedder = new PDCIDFontType2Embedder(pDDocument, this.dict, trueTypeFont, z10, this, z12);
        this.embedder = pDCIDFontType2Embedder;
        this.descendantFont = pDCIDFontType2Embedder.getCIDFont();
        readEncoding();
        fetchCMapUCS2();
        if (z11) {
            if (z10) {
                this.ttf = trueTypeFont;
                pDDocument.registerTrueTypeFontForClosing(trueTypeFont);
                return;
            }
            trueTypeFont.close();
        }
    }
}

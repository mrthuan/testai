package com.tom_roush.fontbox.type1;

import android.graphics.Path;
import com.tom_roush.fontbox.EncodedFont;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.cff.Type1CharString;
import com.tom_roush.fontbox.cff.Type1CharStringParser;
import com.tom_roush.fontbox.encoding.Encoding;
import com.tom_roush.fontbox.pfb.PfbParser;
import com.tom_roush.fontbox.util.BoundingBox;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class Type1Font implements Type1CharStringReader, EncodedFont, FontBoxFont {
    int blueFuzz;
    float blueScale;
    int blueShift;
    int fontType;
    boolean forceBold;
    boolean isFixedPitch;
    float italicAngle;
    int languageGroup;
    int paintType;
    private final byte[] segment1;
    private final byte[] segment2;
    float strokeWidth;
    float underlinePosition;
    float underlineThickness;
    int uniqueID;
    String fontName = "";
    Encoding encoding = null;
    List<Number> fontMatrix = new ArrayList();
    List<Number> fontBBox = new ArrayList();
    String fontID = "";
    String version = "";
    String notice = "";
    String fullName = "";
    String familyName = "";
    String weight = "";
    List<Number> blueValues = new ArrayList();
    List<Number> otherBlues = new ArrayList();
    List<Number> familyBlues = new ArrayList();
    List<Number> familyOtherBlues = new ArrayList();
    List<Number> stdHW = new ArrayList();
    List<Number> stdVW = new ArrayList();
    List<Number> stemSnapH = new ArrayList();
    List<Number> stemSnapV = new ArrayList();
    final List<byte[]> subrs = new ArrayList();
    final Map<String, byte[]> charstrings = new LinkedHashMap();
    private final Map<String, Type1CharString> charStringCache = new ConcurrentHashMap();

    public Type1Font(byte[] bArr, byte[] bArr2) {
        this.segment1 = bArr;
        this.segment2 = bArr2;
    }

    public static Type1Font createWithPFB(InputStream inputStream) {
        PfbParser pfbParser = new PfbParser(inputStream);
        return new Type1Parser().parse(pfbParser.getSegment1(), pfbParser.getSegment2());
    }

    public static Type1Font createWithSegments(byte[] bArr, byte[] bArr2) {
        return new Type1Parser().parse(bArr, bArr2);
    }

    public byte[] getASCIISegment() {
        return this.segment1;
    }

    public byte[] getBinarySegment() {
        return this.segment2;
    }

    public int getBlueFuzz() {
        return this.blueFuzz;
    }

    public float getBlueScale() {
        return this.blueScale;
    }

    public int getBlueShift() {
        return this.blueShift;
    }

    public List<Number> getBlueValues() {
        return Collections.unmodifiableList(this.blueValues);
    }

    public Map<String, byte[]> getCharStringsDict() {
        return Collections.unmodifiableMap(this.charstrings);
    }

    @Override // com.tom_roush.fontbox.EncodedFont
    public Encoding getEncoding() {
        return this.encoding;
    }

    public List<Number> getFamilyBlues() {
        return Collections.unmodifiableList(this.familyBlues);
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public List<Number> getFamilyOtherBlues() {
        return Collections.unmodifiableList(this.familyOtherBlues);
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public BoundingBox getFontBBox() {
        return new BoundingBox(this.fontBBox);
    }

    public String getFontID() {
        return this.fontID;
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public List<Number> getFontMatrix() {
        return Collections.unmodifiableList(this.fontMatrix);
    }

    public String getFontName() {
        return this.fontName;
    }

    public int getFontType() {
        return this.fontType;
    }

    public String getFullName() {
        return this.fullName;
    }

    public float getItalicAngle() {
        return this.italicAngle;
    }

    public int getLanguageGroup() {
        return this.languageGroup;
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public String getName() {
        return this.fontName;
    }

    public String getNotice() {
        return this.notice;
    }

    public List<Number> getOtherBlues() {
        return Collections.unmodifiableList(this.otherBlues);
    }

    public int getPaintType() {
        return this.paintType;
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public Path getPath(String str) {
        return getType1CharString(str).getPath();
    }

    public List<Number> getStdHW() {
        return Collections.unmodifiableList(this.stdHW);
    }

    public List<Number> getStdVW() {
        return Collections.unmodifiableList(this.stdVW);
    }

    public List<Number> getStemSnapH() {
        return Collections.unmodifiableList(this.stemSnapH);
    }

    public List<Number> getStemSnapV() {
        return Collections.unmodifiableList(this.stemSnapV);
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public List<byte[]> getSubrsArray() {
        return Collections.unmodifiableList(this.subrs);
    }

    @Override // com.tom_roush.fontbox.type1.Type1CharStringReader
    public Type1CharString getType1CharString(String str) {
        Type1CharString type1CharString = this.charStringCache.get(str);
        if (type1CharString == null) {
            byte[] bArr = this.charstrings.get(str);
            if (bArr == null) {
                bArr = this.charstrings.get(".notdef");
            }
            Type1CharString type1CharString2 = new Type1CharString(this, this.fontName, str, new Type1CharStringParser(this.fontName, str).parse(bArr, this.subrs));
            this.charStringCache.put(str, type1CharString2);
            return type1CharString2;
        }
        return type1CharString;
    }

    public float getUnderlinePosition() {
        return this.underlinePosition;
    }

    public float getUnderlineThickness() {
        return this.underlineThickness;
    }

    public int getUniqueID() {
        return this.uniqueID;
    }

    public String getVersion() {
        return this.version;
    }

    public String getWeight() {
        return this.weight;
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public float getWidth(String str) {
        return getType1CharString(str).getWidth();
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public boolean hasGlyph(String str) {
        if (this.charstrings.get(str) != null) {
            return true;
        }
        return false;
    }

    public boolean isFixedPitch() {
        return this.isFixedPitch;
    }

    public boolean isForceBold() {
        return this.forceBold;
    }

    public String toString() {
        return Type1Font.class.getName() + "[fontName=" + this.fontName + ", fullName=" + this.fullName + ", encoding=" + this.encoding + ", charStringsDict=" + this.charstrings + "]";
    }

    public static Type1Font createWithPFB(byte[] bArr) {
        PfbParser pfbParser = new PfbParser(bArr);
        return new Type1Parser().parse(pfbParser.getSegment1(), pfbParser.getSegment2());
    }
}

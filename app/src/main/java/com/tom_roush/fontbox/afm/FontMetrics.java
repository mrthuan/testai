package com.tom_roush.fontbox.afm;

import a0.a;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class FontMetrics {
    private float afmVersion;
    private float ascender;
    private float capHeight;
    private float[] charWidth;
    private String characterSet;
    private int characters;
    private float descender;
    private String encodingScheme;
    private int escChar;
    private String familyName;
    private BoundingBox fontBBox;
    private String fontName;
    private String fontVersion;
    private String fullName;
    private boolean isBaseFont;
    private boolean isFixedPitch;
    private boolean isFixedV;
    private float italicAngle;
    private int mappingScheme;
    private String notice;
    private float standardHorizontalWidth;
    private float standardVerticalWidth;
    private float underlinePosition;
    private float underlineThickness;
    private float[] vVector;
    private String weight;
    private float xHeight;
    private int metricSets = 0;
    private final List<String> comments = new ArrayList();
    private List<CharMetric> charMetrics = new ArrayList();
    private Map<String, CharMetric> charMetricsMap = new HashMap();
    private List<TrackKern> trackKern = new ArrayList();
    private List<Composite> composites = new ArrayList();
    private List<KernPair> kernPairs = new ArrayList();
    private List<KernPair> kernPairs0 = new ArrayList();
    private List<KernPair> kernPairs1 = new ArrayList();

    public void addCharMetric(CharMetric charMetric) {
        this.charMetrics.add(charMetric);
        this.charMetricsMap.put(charMetric.getName(), charMetric);
    }

    public void addComment(String str) {
        this.comments.add(str);
    }

    public void addComposite(Composite composite) {
        this.composites.add(composite);
    }

    public void addKernPair(KernPair kernPair) {
        this.kernPairs.add(kernPair);
    }

    public void addKernPair0(KernPair kernPair) {
        this.kernPairs0.add(kernPair);
    }

    public void addKernPair1(KernPair kernPair) {
        this.kernPairs1.add(kernPair);
    }

    public void addTrackKern(TrackKern trackKern) {
        this.trackKern.add(trackKern);
    }

    public float getAFMVersion() {
        return this.afmVersion;
    }

    public float getAscender() {
        return this.ascender;
    }

    public float getAverageCharacterWidth() {
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (CharMetric charMetric : this.charMetrics) {
            if (charMetric.getWx() > 0.0f) {
                f10 += charMetric.getWx();
                f11 += 1.0f;
            }
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        return f10 / f11;
    }

    public float getCapHeight() {
        return this.capHeight;
    }

    public List<CharMetric> getCharMetrics() {
        return Collections.unmodifiableList(this.charMetrics);
    }

    public float[] getCharWidth() {
        return this.charWidth;
    }

    public float getCharacterHeight(String str) {
        CharMetric charMetric = this.charMetricsMap.get(str);
        if (charMetric == null) {
            return 0.0f;
        }
        float wy = charMetric.getWy();
        if (wy == 0.0f) {
            return charMetric.getBoundingBox().getHeight();
        }
        return wy;
    }

    public String getCharacterSet() {
        return this.characterSet;
    }

    public float getCharacterWidth(String str) {
        CharMetric charMetric = this.charMetricsMap.get(str);
        if (charMetric != null) {
            return charMetric.getWx();
        }
        return 0.0f;
    }

    public int getCharacters() {
        return this.characters;
    }

    public List<String> getComments() {
        return Collections.unmodifiableList(this.comments);
    }

    public List<Composite> getComposites() {
        return Collections.unmodifiableList(this.composites);
    }

    public float getDescender() {
        return this.descender;
    }

    public String getEncodingScheme() {
        return this.encodingScheme;
    }

    public int getEscChar() {
        return this.escChar;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public BoundingBox getFontBBox() {
        return this.fontBBox;
    }

    public String getFontName() {
        return this.fontName;
    }

    public String getFontVersion() {
        return this.fontVersion;
    }

    public String getFullName() {
        return this.fullName;
    }

    public float getItalicAngle() {
        return this.italicAngle;
    }

    public List<KernPair> getKernPairs() {
        return Collections.unmodifiableList(this.kernPairs);
    }

    public List<KernPair> getKernPairs0() {
        return Collections.unmodifiableList(this.kernPairs0);
    }

    public List<KernPair> getKernPairs1() {
        return Collections.unmodifiableList(this.kernPairs1);
    }

    public int getMappingScheme() {
        return this.mappingScheme;
    }

    public int getMetricSets() {
        return this.metricSets;
    }

    public String getNotice() {
        return this.notice;
    }

    public float getStandardHorizontalWidth() {
        return this.standardHorizontalWidth;
    }

    public float getStandardVerticalWidth() {
        return this.standardVerticalWidth;
    }

    public List<TrackKern> getTrackKern() {
        return Collections.unmodifiableList(this.trackKern);
    }

    public float getUnderlinePosition() {
        return this.underlinePosition;
    }

    public float getUnderlineThickness() {
        return this.underlineThickness;
    }

    public float[] getVVector() {
        return this.vVector;
    }

    public String getWeight() {
        return this.weight;
    }

    public float getXHeight() {
        return this.xHeight;
    }

    public boolean isBaseFont() {
        return this.isBaseFont;
    }

    public boolean isFixedPitch() {
        return this.isFixedPitch;
    }

    public boolean isFixedV() {
        return this.isFixedV;
    }

    public void setAFMVersion(float f10) {
        this.afmVersion = f10;
    }

    public void setAscender(float f10) {
        this.ascender = f10;
    }

    public void setCapHeight(float f10) {
        this.capHeight = f10;
    }

    public void setCharMetrics(List<CharMetric> list) {
        this.charMetrics = list;
        this.charMetricsMap = new HashMap(this.charMetrics.size());
        for (CharMetric charMetric : list) {
            this.charMetricsMap.put(charMetric.getName(), charMetric);
        }
    }

    public void setCharWidth(float[] fArr) {
        this.charWidth = fArr;
    }

    public void setCharacterSet(String str) {
        this.characterSet = str;
    }

    public void setCharacters(int i10) {
        this.characters = i10;
    }

    public void setComposites(List<Composite> list) {
        this.composites = list;
    }

    public void setDescender(float f10) {
        this.descender = f10;
    }

    public void setEncodingScheme(String str) {
        this.encodingScheme = str;
    }

    public void setEscChar(int i10) {
        this.escChar = i10;
    }

    public void setFamilyName(String str) {
        this.familyName = str;
    }

    public void setFixedPitch(boolean z10) {
        this.isFixedPitch = z10;
    }

    public void setFontBBox(BoundingBox boundingBox) {
        this.fontBBox = boundingBox;
    }

    public void setFontName(String str) {
        this.fontName = str;
    }

    public void setFontVersion(String str) {
        this.fontVersion = str;
    }

    public void setFullName(String str) {
        this.fullName = str;
    }

    public void setIsBaseFont(boolean z10) {
        this.isBaseFont = z10;
    }

    public void setIsFixedV(boolean z10) {
        this.isFixedV = z10;
    }

    public void setItalicAngle(float f10) {
        this.italicAngle = f10;
    }

    public void setKernPairs(List<KernPair> list) {
        this.kernPairs = list;
    }

    public void setKernPairs0(List<KernPair> list) {
        this.kernPairs0 = list;
    }

    public void setKernPairs1(List<KernPair> list) {
        this.kernPairs1 = list;
    }

    public void setMappingScheme(int i10) {
        this.mappingScheme = i10;
    }

    public void setMetricSets(int i10) {
        if (i10 >= 0 && i10 <= 2) {
            this.metricSets = i10;
            return;
        }
        throw new IllegalArgumentException(a.g("The metricSets attribute must be in the set {0,1,2} and not '", i10, OperatorName.SHOW_TEXT_LINE));
    }

    public void setNotice(String str) {
        this.notice = str;
    }

    public void setStandardHorizontalWidth(float f10) {
        this.standardHorizontalWidth = f10;
    }

    public void setStandardVerticalWidth(float f10) {
        this.standardVerticalWidth = f10;
    }

    public void setTrackKern(List<TrackKern> list) {
        this.trackKern = list;
    }

    public void setUnderlinePosition(float f10) {
        this.underlinePosition = f10;
    }

    public void setUnderlineThickness(float f10) {
        this.underlineThickness = f10;
    }

    public void setVVector(float[] fArr) {
        this.vVector = fArr;
    }

    public void setWeight(String str) {
        this.weight = str;
    }

    public void setXHeight(float f10) {
        this.xHeight = f10;
    }
}

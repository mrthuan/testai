package com.tom_roush.fontbox.afm;

import a6.h;
import androidx.activity.r;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.fontbox.util.Charsets;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public class AFMParser {
    public static final String ASCENDER = "Ascender";
    private static final int BITS_IN_HEX = 16;
    public static final String CAP_HEIGHT = "CapHeight";
    public static final String CC = "CC";
    public static final String CHARACTERS = "Characters";
    public static final String CHARACTER_SET = "CharacterSet";
    public static final String CHARMETRICS_B = "B";
    public static final String CHARMETRICS_C = "C";
    public static final String CHARMETRICS_CH = "CH";
    public static final String CHARMETRICS_L = "L";
    public static final String CHARMETRICS_N = "N";
    public static final String CHARMETRICS_VV = "VV";
    public static final String CHARMETRICS_W = "W";
    public static final String CHARMETRICS_W0 = "W0";
    public static final String CHARMETRICS_W0X = "W0X";
    public static final String CHARMETRICS_W0Y = "W0Y";
    public static final String CHARMETRICS_W1 = "W1";
    public static final String CHARMETRICS_W1X = "W1X";
    public static final String CHARMETRICS_W1Y = "W1Y";
    public static final String CHARMETRICS_WX = "WX";
    public static final String CHARMETRICS_WY = "WY";
    public static final String CHAR_WIDTH = "CharWidth";
    public static final String COMMENT = "Comment";
    public static final String DESCENDER = "Descender";
    public static final String ENCODING_SCHEME = "EncodingScheme";
    public static final String END_CHAR_METRICS = "EndCharMetrics";
    public static final String END_COMPOSITES = "EndComposites";
    public static final String END_FONT_METRICS = "EndFontMetrics";
    public static final String END_KERN_DATA = "EndKernData";
    public static final String END_KERN_PAIRS = "EndKernPairs";
    public static final String END_TRACK_KERN = "EndTrackKern";
    public static final String ESC_CHAR = "EscChar";
    public static final String FAMILY_NAME = "FamilyName";
    public static final String FONT_BBOX = "FontBBox";
    public static final String FONT_NAME = "FontName";
    public static final String FULL_NAME = "FullName";
    public static final String IS_BASE_FONT = "IsBaseFont";
    public static final String IS_FIXED_PITCH = "IsFixedPitch";
    public static final String IS_FIXED_V = "IsFixedV";
    public static final String ITALIC_ANGLE = "ItalicAngle";
    public static final String KERN_PAIR_KP = "KP";
    public static final String KERN_PAIR_KPH = "KPH";
    public static final String KERN_PAIR_KPX = "KPX";
    public static final String KERN_PAIR_KPY = "KPY";
    public static final String MAPPING_SCHEME = "MappingScheme";
    public static final String NOTICE = "Notice";
    public static final String PCC = "PCC";
    public static final String START_CHAR_METRICS = "StartCharMetrics";
    public static final String START_COMPOSITES = "StartComposites";
    public static final String START_FONT_METRICS = "StartFontMetrics";
    public static final String START_KERN_DATA = "StartKernData";
    public static final String START_KERN_PAIRS = "StartKernPairs";
    public static final String START_KERN_PAIRS0 = "StartKernPairs0";
    public static final String START_KERN_PAIRS1 = "StartKernPairs1";
    public static final String START_TRACK_KERN = "StartTrackKern";
    public static final String STD_HW = "StdHW";
    public static final String STD_VW = "StdVW";
    public static final String UNDERLINE_POSITION = "UnderlinePosition";
    public static final String UNDERLINE_THICKNESS = "UnderlineThickness";
    public static final String VERSION = "Version";
    public static final String V_VECTOR = "VVector";
    public static final String WEIGHT = "Weight";
    public static final String X_HEIGHT = "XHeight";
    private final InputStream input;

    public AFMParser(InputStream inputStream) {
        this.input = inputStream;
    }

    private String hexToString(String str) {
        if (str.length() >= 2) {
            if (str.charAt(0) == '<' && str.charAt(str.length() - 1) == '>') {
                String e10 = r.e(str, 1, 1);
                byte[] bArr = new byte[e10.length() / 2];
                for (int i10 = 0; i10 < e10.length(); i10 += 2) {
                    try {
                        bArr[i10 / 2] = (byte) Integer.parseInt(Character.toString(e10.charAt(i10)) + e10.charAt(i10 + 1), 16);
                    } catch (NumberFormatException e11) {
                        throw new IOException("Error parsing AFM file:" + e11);
                    }
                }
                return new String(bArr, Charsets.ISO_8859_1);
            }
            throw new IOException(h.d("String should be enclosed by angle brackets '", str, OperatorName.SHOW_TEXT_LINE));
        }
        throw new IOException("Error: Expected hex string of length >= 2 not='".concat(str));
    }

    private boolean isEOL(int i10) {
        if (i10 != 13 && i10 != 10) {
            return false;
        }
        return true;
    }

    private boolean isWhitespace(int i10) {
        if (i10 != 32 && i10 != 9 && i10 != 13 && i10 != 10) {
            return false;
        }
        return true;
    }

    private CharMetric parseCharMetric() {
        CharMetric charMetric = new CharMetric();
        StringTokenizer stringTokenizer = new StringTokenizer(readLine());
        while (stringTokenizer.hasMoreTokens()) {
            try {
                String nextToken = stringTokenizer.nextToken();
                if (nextToken.equals("C")) {
                    charMetric.setCharacterCode(Integer.parseInt(stringTokenizer.nextToken()));
                    verifySemicolon(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_CH)) {
                    charMetric.setCharacterCode(Integer.parseInt(stringTokenizer.nextToken(), 16));
                    verifySemicolon(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_WX)) {
                    charMetric.setWx(Float.parseFloat(stringTokenizer.nextToken()));
                    verifySemicolon(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_W0X)) {
                    charMetric.setW0x(Float.parseFloat(stringTokenizer.nextToken()));
                    verifySemicolon(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_W1X)) {
                    charMetric.setW1x(Float.parseFloat(stringTokenizer.nextToken()));
                    verifySemicolon(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_WY)) {
                    charMetric.setWy(Float.parseFloat(stringTokenizer.nextToken()));
                    verifySemicolon(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_W0Y)) {
                    charMetric.setW0y(Float.parseFloat(stringTokenizer.nextToken()));
                    verifySemicolon(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_W1Y)) {
                    charMetric.setW1y(Float.parseFloat(stringTokenizer.nextToken()));
                    verifySemicolon(stringTokenizer);
                } else if (nextToken.equals("W")) {
                    charMetric.setW(new float[]{Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken())});
                    verifySemicolon(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_W0)) {
                    charMetric.setW0(new float[]{Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken())});
                    verifySemicolon(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_W1)) {
                    charMetric.setW1(new float[]{Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken())});
                    verifySemicolon(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_VV)) {
                    charMetric.setVv(new float[]{Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken())});
                    verifySemicolon(stringTokenizer);
                } else if (nextToken.equals("N")) {
                    charMetric.setName(stringTokenizer.nextToken());
                    verifySemicolon(stringTokenizer);
                } else if (nextToken.equals("B")) {
                    BoundingBox boundingBox = new BoundingBox();
                    boundingBox.setLowerLeftX(Float.parseFloat(stringTokenizer.nextToken()));
                    boundingBox.setLowerLeftY(Float.parseFloat(stringTokenizer.nextToken()));
                    boundingBox.setUpperRightX(Float.parseFloat(stringTokenizer.nextToken()));
                    boundingBox.setUpperRightY(Float.parseFloat(stringTokenizer.nextToken()));
                    charMetric.setBoundingBox(boundingBox);
                    verifySemicolon(stringTokenizer);
                } else if (nextToken.equals("L")) {
                    Ligature ligature = new Ligature();
                    ligature.setSuccessor(stringTokenizer.nextToken());
                    ligature.setLigature(stringTokenizer.nextToken());
                    charMetric.addLigature(ligature);
                    verifySemicolon(stringTokenizer);
                } else {
                    throw new IOException("Unknown CharMetrics command '" + nextToken + OperatorName.SHOW_TEXT_LINE);
                }
            } catch (NumberFormatException e10) {
                throw new IOException("Error: Corrupt AFM document:" + e10);
            }
        }
        return charMetric;
    }

    private Composite parseComposite() {
        Composite composite = new Composite();
        StringTokenizer stringTokenizer = new StringTokenizer(readLine(), " ;");
        String nextToken = stringTokenizer.nextToken();
        if (nextToken.equals(CC)) {
            composite.setName(stringTokenizer.nextToken());
            try {
                int parseInt = Integer.parseInt(stringTokenizer.nextToken());
                for (int i10 = 0; i10 < parseInt; i10++) {
                    CompositePart compositePart = new CompositePart();
                    String nextToken2 = stringTokenizer.nextToken();
                    if (nextToken2.equals(PCC)) {
                        String nextToken3 = stringTokenizer.nextToken();
                        try {
                            int parseInt2 = Integer.parseInt(stringTokenizer.nextToken());
                            int parseInt3 = Integer.parseInt(stringTokenizer.nextToken());
                            compositePart.setName(nextToken3);
                            compositePart.setXDisplacement(parseInt2);
                            compositePart.setYDisplacement(parseInt3);
                            composite.addPart(compositePart);
                        } catch (NumberFormatException e10) {
                            throw new IOException("Error parsing AFM document:" + e10);
                        }
                    } else {
                        throw new IOException(h.d("Expected 'PCC' actual='", nextToken2, OperatorName.SHOW_TEXT_LINE));
                    }
                }
                return composite;
            } catch (NumberFormatException e11) {
                throw new IOException("Error parsing AFM document:" + e11);
            }
        }
        throw new IOException(h.d("Expected 'CC' actual='", nextToken, OperatorName.SHOW_TEXT_LINE));
    }

    private FontMetrics parseFontMetric(boolean z10) {
        String readString;
        FontMetrics fontMetrics = new FontMetrics();
        String readString2 = readString();
        if (START_FONT_METRICS.equals(readString2)) {
            fontMetrics.setAFMVersion(readFloat());
            boolean z11 = false;
            while (true) {
                readString = readString();
                if (END_FONT_METRICS.equals(readString)) {
                    break;
                } else if (FONT_NAME.equals(readString)) {
                    fontMetrics.setFontName(readLine());
                } else if (FULL_NAME.equals(readString)) {
                    fontMetrics.setFullName(readLine());
                } else if (FAMILY_NAME.equals(readString)) {
                    fontMetrics.setFamilyName(readLine());
                } else if (WEIGHT.equals(readString)) {
                    fontMetrics.setWeight(readLine());
                } else if (FONT_BBOX.equals(readString)) {
                    BoundingBox boundingBox = new BoundingBox();
                    boundingBox.setLowerLeftX(readFloat());
                    boundingBox.setLowerLeftY(readFloat());
                    boundingBox.setUpperRightX(readFloat());
                    boundingBox.setUpperRightY(readFloat());
                    fontMetrics.setFontBBox(boundingBox);
                } else if (VERSION.equals(readString)) {
                    fontMetrics.setFontVersion(readLine());
                } else if (NOTICE.equals(readString)) {
                    fontMetrics.setNotice(readLine());
                } else if (ENCODING_SCHEME.equals(readString)) {
                    fontMetrics.setEncodingScheme(readLine());
                } else if (MAPPING_SCHEME.equals(readString)) {
                    fontMetrics.setMappingScheme(readInt());
                } else if (ESC_CHAR.equals(readString)) {
                    fontMetrics.setEscChar(readInt());
                } else if (CHARACTER_SET.equals(readString)) {
                    fontMetrics.setCharacterSet(readLine());
                } else if (CHARACTERS.equals(readString)) {
                    fontMetrics.setCharacters(readInt());
                } else if (IS_BASE_FONT.equals(readString)) {
                    fontMetrics.setIsBaseFont(readBoolean());
                } else if (V_VECTOR.equals(readString)) {
                    fontMetrics.setVVector(new float[]{readFloat(), readFloat()});
                } else if (IS_FIXED_V.equals(readString)) {
                    fontMetrics.setIsFixedV(readBoolean());
                } else if (CAP_HEIGHT.equals(readString)) {
                    fontMetrics.setCapHeight(readFloat());
                } else if (X_HEIGHT.equals(readString)) {
                    fontMetrics.setXHeight(readFloat());
                } else if (ASCENDER.equals(readString)) {
                    fontMetrics.setAscender(readFloat());
                } else if (DESCENDER.equals(readString)) {
                    fontMetrics.setDescender(readFloat());
                } else if (STD_HW.equals(readString)) {
                    fontMetrics.setStandardHorizontalWidth(readFloat());
                } else if (STD_VW.equals(readString)) {
                    fontMetrics.setStandardVerticalWidth(readFloat());
                } else if ("Comment".equals(readString)) {
                    fontMetrics.addComment(readLine());
                } else if (UNDERLINE_POSITION.equals(readString)) {
                    fontMetrics.setUnderlinePosition(readFloat());
                } else if (UNDERLINE_THICKNESS.equals(readString)) {
                    fontMetrics.setUnderlineThickness(readFloat());
                } else if (ITALIC_ANGLE.equals(readString)) {
                    fontMetrics.setItalicAngle(readFloat());
                } else if (CHAR_WIDTH.equals(readString)) {
                    fontMetrics.setCharWidth(new float[]{readFloat(), readFloat()});
                } else if (IS_FIXED_PITCH.equals(readString)) {
                    fontMetrics.setFixedPitch(readBoolean());
                } else if (START_CHAR_METRICS.equals(readString)) {
                    int readInt = readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i10 = 0; i10 < readInt; i10++) {
                        arrayList.add(parseCharMetric());
                    }
                    String readString3 = readString();
                    if (readString3.equals(END_CHAR_METRICS)) {
                        fontMetrics.setCharMetrics(arrayList);
                        z11 = true;
                    } else {
                        throw new IOException(h.d("Error: Expected 'EndCharMetrics' actual '", readString3, OperatorName.SHOW_TEXT_LINE));
                    }
                } else if (!z10 && START_COMPOSITES.equals(readString)) {
                    int readInt2 = readInt();
                    for (int i11 = 0; i11 < readInt2; i11++) {
                        fontMetrics.addComposite(parseComposite());
                    }
                    String readString4 = readString();
                    if (!readString4.equals(END_COMPOSITES)) {
                        throw new IOException(h.d("Error: Expected 'EndComposites' actual '", readString4, OperatorName.SHOW_TEXT_LINE));
                    }
                } else if (z10 || !START_KERN_DATA.equals(readString)) {
                    break;
                } else {
                    parseKernData(fontMetrics);
                }
            }
            if (!z10 || !z11) {
                throw new IOException(h.d("Unknown AFM key '", readString, OperatorName.SHOW_TEXT_LINE));
            }
            return fontMetrics;
        }
        throw new IOException(h.d("Error: The AFM file should start with StartFontMetrics and not '", readString2, OperatorName.SHOW_TEXT_LINE));
    }

    private void parseKernData(FontMetrics fontMetrics) {
        while (true) {
            String readString = readString();
            if (!readString.equals(END_KERN_DATA)) {
                int i10 = 0;
                if (START_TRACK_KERN.equals(readString)) {
                    int readInt = readInt();
                    while (i10 < readInt) {
                        TrackKern trackKern = new TrackKern();
                        trackKern.setDegree(readInt());
                        trackKern.setMinPointSize(readFloat());
                        trackKern.setMinKern(readFloat());
                        trackKern.setMaxPointSize(readFloat());
                        trackKern.setMaxKern(readFloat());
                        fontMetrics.addTrackKern(trackKern);
                        i10++;
                    }
                    String readString2 = readString();
                    if (!readString2.equals(END_TRACK_KERN)) {
                        throw new IOException(h.d("Error: Expected 'EndTrackKern' actual '", readString2, OperatorName.SHOW_TEXT_LINE));
                    }
                } else if (START_KERN_PAIRS.equals(readString)) {
                    int readInt2 = readInt();
                    while (i10 < readInt2) {
                        fontMetrics.addKernPair(parseKernPair());
                        i10++;
                    }
                    String readString3 = readString();
                    if (!readString3.equals(END_KERN_PAIRS)) {
                        throw new IOException(h.d("Error: Expected 'EndKernPairs' actual '", readString3, OperatorName.SHOW_TEXT_LINE));
                    }
                } else if (START_KERN_PAIRS0.equals(readString)) {
                    int readInt3 = readInt();
                    while (i10 < readInt3) {
                        fontMetrics.addKernPair0(parseKernPair());
                        i10++;
                    }
                    String readString4 = readString();
                    if (!readString4.equals(END_KERN_PAIRS)) {
                        throw new IOException(h.d("Error: Expected 'EndKernPairs' actual '", readString4, OperatorName.SHOW_TEXT_LINE));
                    }
                } else if (START_KERN_PAIRS1.equals(readString)) {
                    int readInt4 = readInt();
                    while (i10 < readInt4) {
                        fontMetrics.addKernPair1(parseKernPair());
                        i10++;
                    }
                    String readString5 = readString();
                    if (!readString5.equals(END_KERN_PAIRS)) {
                        throw new IOException(h.d("Error: Expected 'EndKernPairs' actual '", readString5, OperatorName.SHOW_TEXT_LINE));
                    }
                } else {
                    throw new IOException(h.d("Unknown kerning data type '", readString, OperatorName.SHOW_TEXT_LINE));
                }
            } else {
                return;
            }
        }
    }

    private KernPair parseKernPair() {
        KernPair kernPair = new KernPair();
        String readString = readString();
        if (KERN_PAIR_KP.equals(readString)) {
            kernPair.setFirstKernCharacter(readString());
            kernPair.setSecondKernCharacter(readString());
            kernPair.setX(readFloat());
            kernPair.setY(readFloat());
        } else if (KERN_PAIR_KPH.equals(readString)) {
            kernPair.setFirstKernCharacter(hexToString(readString()));
            kernPair.setSecondKernCharacter(hexToString(readString()));
            kernPair.setX(readFloat());
            kernPair.setY(readFloat());
        } else if (KERN_PAIR_KPX.equals(readString)) {
            kernPair.setFirstKernCharacter(readString());
            kernPair.setSecondKernCharacter(readString());
            kernPair.setX(readFloat());
            kernPair.setY(0.0f);
        } else if (KERN_PAIR_KPY.equals(readString)) {
            kernPair.setFirstKernCharacter(readString());
            kernPair.setSecondKernCharacter(readString());
            kernPair.setX(0.0f);
            kernPair.setY(readFloat());
        } else {
            throw new IOException(h.d("Error expected kern pair command actual='", readString, OperatorName.SHOW_TEXT_LINE));
        }
        return kernPair;
    }

    private boolean readBoolean() {
        return Boolean.parseBoolean(readString());
    }

    private float readFloat() {
        return Float.parseFloat(readString());
    }

    private int readInt() {
        try {
            return Integer.parseInt(readString());
        } catch (NumberFormatException e10) {
            throw new IOException("Error parsing AFM document:" + e10);
        }
    }

    private String readLine() {
        StringBuilder sb2 = new StringBuilder(60);
        int read = this.input.read();
        while (isWhitespace(read)) {
            read = this.input.read();
        }
        sb2.append((char) read);
        int read2 = this.input.read();
        while (read2 != -1 && !isEOL(read2)) {
            sb2.append((char) read2);
            read2 = this.input.read();
        }
        return sb2.toString();
    }

    private String readString() {
        StringBuilder sb2 = new StringBuilder(24);
        int read = this.input.read();
        while (isWhitespace(read)) {
            read = this.input.read();
        }
        sb2.append((char) read);
        int read2 = this.input.read();
        while (read2 != -1 && !isWhitespace(read2)) {
            sb2.append((char) read2);
            read2 = this.input.read();
        }
        return sb2.toString();
    }

    private void verifySemicolon(StringTokenizer stringTokenizer) {
        if (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (";".equals(nextToken)) {
                return;
            }
            throw new IOException(h.d("Error: Expected semicolon in stream actual='", nextToken, OperatorName.SHOW_TEXT_LINE));
        }
        throw new IOException("CharMetrics is missing a semicolon after a command");
    }

    public FontMetrics parse() {
        return parseFontMetric(false);
    }

    public FontMetrics parse(boolean z10) {
        return parseFontMetric(z10);
    }
}

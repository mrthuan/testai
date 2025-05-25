package com.tom_roush.pdfbox.pdmodel.font;

import a6.h;
import com.tom_roush.fontbox.ttf.GlyphData;
import com.tom_roush.fontbox.ttf.GlyphTable;
import com.tom_roush.fontbox.ttf.HorizontalMetricsTable;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.fontbox.ttf.VerticalHeaderTable;
import com.tom_roush.fontbox.ttf.VerticalMetricsTable;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PDCIDFontType2Embedder extends TrueTypeEmbedder {
    private final COSDictionary cidFont;
    private final COSDictionary dict;
    private final PDDocument document;
    private final PDType0Font parent;
    private final boolean vertical;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType2Embedder$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tom_roush$pdfbox$pdmodel$font$PDCIDFontType2Embedder$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$com$tom_roush$pdfbox$pdmodel$font$PDCIDFontType2Embedder$State = iArr;
            try {
                iArr[State.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tom_roush$pdfbox$pdmodel$font$PDCIDFontType2Embedder$State[State.BRACKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tom_roush$pdfbox$pdmodel$font$PDCIDFontType2Embedder$State[State.SERIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum State {
        FIRST,
        BRACKET,
        SERIAL
    }

    public PDCIDFontType2Embedder(PDDocument pDDocument, COSDictionary cOSDictionary, TrueTypeFont trueTypeFont, boolean z10, PDType0Font pDType0Font, boolean z11) {
        super(pDDocument, cOSDictionary, trueTypeFont, z10);
        COSBase cOSBase;
        this.document = pDDocument;
        this.dict = cOSDictionary;
        this.parent = pDType0Font;
        this.vertical = z11;
        cOSDictionary.setItem(COSName.SUBTYPE, COSName.TYPE0);
        cOSDictionary.setName(COSName.BASE_FONT, this.fontDescriptor.getFontName());
        COSName cOSName = COSName.ENCODING;
        if (z11) {
            cOSBase = COSName.IDENTITY_V;
        } else {
            cOSBase = COSName.IDENTITY_H;
        }
        cOSDictionary.setItem(cOSName, cOSBase);
        COSDictionary createCIDFont = createCIDFont();
        this.cidFont = createCIDFont;
        COSArray cOSArray = new COSArray();
        cOSArray.add((COSBase) createCIDFont);
        cOSDictionary.setItem(COSName.DESCENDANT_FONTS, (COSBase) cOSArray);
        if (!z10) {
            buildToUnicodeCMap(null);
        }
    }

    private void addNameTag(String str) {
        String c = h.c(str, this.fontDescriptor.getFontName());
        COSDictionary cOSDictionary = this.dict;
        COSName cOSName = COSName.BASE_FONT;
        cOSDictionary.setName(cOSName, c);
        this.fontDescriptor.setFontName(c);
        this.cidFont.setName(cOSName, c);
    }

    private void buildCIDSet(Map<Integer, Integer> map) {
        int intValue = ((Integer) Collections.max(map.keySet())).intValue();
        byte[] bArr = new byte[(intValue / 8) + 1];
        for (int i10 = 0; i10 <= intValue; i10++) {
            int i11 = i10 / 8;
            bArr[i11] = (byte) ((1 << (7 - (i10 % 8))) | bArr[i11]);
        }
        this.fontDescriptor.setCIDSet(new PDStream(this.document, (InputStream) new ByteArrayInputStream(bArr), COSName.FLATE_DECODE));
    }

    private void buildCIDToGIDMap(Map<Integer, Integer> map) {
        int i10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int intValue = ((Integer) Collections.max(map.keySet())).intValue();
        for (int i11 = 0; i11 <= intValue; i11++) {
            if (map.containsKey(Integer.valueOf(i11))) {
                i10 = map.get(Integer.valueOf(i11)).intValue();
            } else {
                i10 = 0;
            }
            byteArrayOutputStream.write(new byte[]{(byte) ((i10 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC), (byte) (i10 & FunctionEval.FunctionID.EXTERNAL_FUNC)});
        }
        this.cidFont.setItem(COSName.CID_TO_GID_MAP, new PDStream(this.document, (InputStream) new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), COSName.FLATE_DECODE));
    }

    private void buildToUnicodeCMap(Map<Integer, Integer> map) {
        int i10;
        ToUnicodeWriter toUnicodeWriter = new ToUnicodeWriter();
        int numGlyphs = this.ttf.getMaximumProfile().getNumGlyphs();
        boolean z10 = false;
        for (int i11 = 1; i11 <= numGlyphs; i11++) {
            if (map != null) {
                if (map.containsKey(Integer.valueOf(i11))) {
                    i10 = map.get(Integer.valueOf(i11)).intValue();
                }
            } else {
                i10 = i11;
            }
            List<Integer> charCodes = this.cmapLookup.getCharCodes(i10);
            if (charCodes != null) {
                int intValue = charCodes.get(0).intValue();
                if (intValue > 65535) {
                    z10 = true;
                }
                toUnicodeWriter.add(i10, new String(new int[]{intValue}, 0, 1));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        toUnicodeWriter.writeTo(byteArrayOutputStream);
        PDStream pDStream = new PDStream(this.document, (InputStream) new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), COSName.FLATE_DECODE);
        if (z10 && this.document.getVersion() < 1.5d) {
            this.document.setVersion(1.5f);
        }
        this.dict.setItem(COSName.TO_UNICODE, pDStream);
    }

    private boolean buildVerticalHeader(COSDictionary cOSDictionary) {
        VerticalHeaderTable verticalHeader;
        if (this.ttf.getVerticalHeader() == null) {
            return false;
        }
        float unitsPerEm = 1000.0f / this.ttf.getHeader().getUnitsPerEm();
        long round = Math.round(verticalHeader.getAscender() * unitsPerEm);
        long round2 = Math.round((-verticalHeader.getAdvanceHeightMax()) * unitsPerEm);
        if (round != 880 || round2 != -1000) {
            COSArray cOSArray = new COSArray();
            cOSArray.add((COSBase) COSInteger.get(round));
            cOSArray.add((COSBase) COSInteger.get(round2));
            cOSDictionary.setItem(COSName.DW2, (COSBase) cOSArray);
            return true;
        }
        return true;
    }

    private void buildVerticalMetrics(Map<Integer, Integer> map) {
        GlyphData glyph;
        VerticalMetricsTable verticalMetricsTable;
        GlyphTable glyphTable;
        long j10;
        if (buildVerticalHeader(this.cidFont)) {
            float unitsPerEm = 1000.0f / this.ttf.getHeader().getUnitsPerEm();
            VerticalHeaderTable verticalHeader = this.ttf.getVerticalHeader();
            VerticalMetricsTable verticalMetrics = this.ttf.getVerticalMetrics();
            GlyphTable glyph2 = this.ttf.getGlyph();
            HorizontalMetricsTable horizontalMetrics = this.ttf.getHorizontalMetrics();
            long round = Math.round(verticalHeader.getAscender() * unitsPerEm);
            long round2 = Math.round((-verticalHeader.getAdvanceHeightMax()) * unitsPerEm);
            COSArray cOSArray = new COSArray();
            COSArray cOSArray2 = new COSArray();
            Iterator it = new TreeSet(map.keySet()).iterator();
            int i10 = SlideAtom.USES_MASTER_SLIDE_ID;
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (glyph2.getGlyph(intValue) == null) {
                    verticalMetricsTable = verticalMetrics;
                    glyphTable = glyph2;
                } else {
                    long round3 = Math.round((verticalMetrics.getTopSideBearing(intValue) + glyph.getYMaximum()) * unitsPerEm);
                    glyphTable = glyph2;
                    verticalMetricsTable = verticalMetrics;
                    long round4 = Math.round((-verticalMetrics.getAdvanceHeight(intValue)) * unitsPerEm);
                    if (round3 != round || round4 != round2) {
                        long j11 = round;
                        if (i10 != intValue - 1) {
                            COSArray cOSArray3 = new COSArray();
                            j10 = round2;
                            cOSArray.add((COSBase) COSInteger.get(intValue));
                            cOSArray.add((COSBase) cOSArray3);
                            cOSArray2 = cOSArray3;
                        } else {
                            j10 = round2;
                        }
                        cOSArray2.add((COSBase) COSInteger.get(round4));
                        cOSArray2.add((COSBase) COSInteger.get(Math.round(horizontalMetrics.getAdvanceWidth(intValue) * unitsPerEm) / 2));
                        cOSArray2.add((COSBase) COSInteger.get(round3));
                        i10 = intValue;
                        glyph2 = glyphTable;
                        verticalMetrics = verticalMetricsTable;
                        round = j11;
                        round2 = j10;
                    }
                }
                glyph2 = glyphTable;
                verticalMetrics = verticalMetricsTable;
            }
            this.cidFont.setItem(COSName.W2, (COSBase) cOSArray);
        }
    }

    private void buildWidths(Map<Integer, Integer> map) {
        float unitsPerEm = 1000.0f / this.ttf.getHeader().getUnitsPerEm();
        COSArray cOSArray = new COSArray();
        COSArray cOSArray2 = new COSArray();
        Iterator it = new TreeSet(map.keySet()).iterator();
        int i10 = SlideAtom.USES_MASTER_SLIDE_ID;
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            long round = Math.round(this.ttf.getHorizontalMetrics().getAdvanceWidth(map.get(Integer.valueOf(intValue)).intValue()) * unitsPerEm);
            if (round != 1000) {
                if (i10 != intValue - 1) {
                    cOSArray2 = new COSArray();
                    cOSArray.add((COSBase) COSInteger.get(intValue));
                    cOSArray.add((COSBase) cOSArray2);
                }
                cOSArray2.add((COSBase) COSInteger.get(round));
                i10 = intValue;
            }
        }
        this.cidFont.setItem(COSName.W, (COSBase) cOSArray);
    }

    private COSDictionary createCIDFont() {
        COSDictionary cOSDictionary = new COSDictionary();
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.FONT);
        cOSDictionary.setItem(COSName.SUBTYPE, (COSBase) COSName.CID_FONT_TYPE2);
        cOSDictionary.setName(COSName.BASE_FONT, this.fontDescriptor.getFontName());
        cOSDictionary.setItem(COSName.CIDSYSTEMINFO, (COSBase) toCIDSystemInfo("Adobe", "Identity", 0));
        cOSDictionary.setItem(COSName.FONT_DESC, (COSBase) this.fontDescriptor.getCOSObject());
        buildWidths(cOSDictionary);
        if (this.vertical) {
            buildVerticalMetrics(cOSDictionary);
        }
        cOSDictionary.setItem(COSName.CID_TO_GID_MAP, (COSBase) COSName.IDENTITY);
        return cOSDictionary;
    }

    private COSArray getVerticalMetrics(int[] iArr) {
        float f10;
        COSArray cOSArray;
        State state;
        int[] iArr2 = iArr;
        if (iArr2.length != 0) {
            float unitsPerEm = 1000.0f / this.ttf.getHeader().getUnitsPerEm();
            long j10 = iArr2[0];
            long round = Math.round((-iArr2[1]) * unitsPerEm);
            long round2 = Math.round((iArr2[2] * unitsPerEm) / 2.0f);
            long round3 = Math.round(iArr2[3] * unitsPerEm);
            COSArray cOSArray2 = new COSArray();
            COSArray cOSArray3 = new COSArray();
            cOSArray3.add((COSBase) COSInteger.get(j10));
            State state2 = State.FIRST;
            int i10 = 4;
            while (i10 < iArr2.length) {
                COSArray cOSArray4 = cOSArray3;
                long j11 = iArr2[i10];
                if (j11 == -2147483648L) {
                    f10 = unitsPerEm;
                    state = state2;
                    cOSArray = cOSArray4;
                } else {
                    long j12 = round3;
                    long round4 = Math.round((-iArr2[i10 + 1]) * unitsPerEm);
                    long j13 = round2;
                    round2 = Math.round((iArr2[i10 + 2] * unitsPerEm) / 2.0f);
                    long round5 = Math.round(iArr2[i10 + 3] * unitsPerEm);
                    f10 = unitsPerEm;
                    int i11 = AnonymousClass1.$SwitchMap$com$tom_roush$pdfbox$pdmodel$font$PDCIDFontType2Embedder$State[state2.ordinal()];
                    State state3 = state2;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3 || (j11 == j10 + 1 && round4 == round && round2 == j13 && round5 == j12)) {
                                cOSArray = cOSArray4;
                                state = state3;
                                j10 = j11;
                                round = round4;
                                round3 = round5;
                            } else {
                                cOSArray = cOSArray4;
                                cOSArray.add((COSBase) COSInteger.get(j10));
                                cOSArray.add((COSBase) COSInteger.get(round));
                                cOSArray.add((COSBase) COSInteger.get(j13));
                                cOSArray.add((COSBase) COSInteger.get(j12));
                                cOSArray.add((COSBase) COSInteger.get(j11));
                                state = State.FIRST;
                                j10 = j11;
                                round = round4;
                                round3 = round5;
                            }
                        } else {
                            cOSArray = cOSArray4;
                            int i12 = (j11 > (j10 + 1) ? 1 : (j11 == (j10 + 1) ? 0 : -1));
                            if (i12 == 0 && round4 == round && round2 == j13 && round5 == j12) {
                                state = State.SERIAL;
                                cOSArray.add((COSBase) cOSArray2);
                                cOSArray.add((COSBase) COSInteger.get(j10));
                            } else if (i12 == 0) {
                                cOSArray2.add((COSBase) COSInteger.get(round));
                                cOSArray2.add((COSBase) COSInteger.get(j13));
                                cOSArray2.add((COSBase) COSInteger.get(j12));
                                state = state3;
                            } else {
                                state = State.FIRST;
                                cOSArray2.add((COSBase) COSInteger.get(round));
                                cOSArray2.add((COSBase) COSInteger.get(j13));
                                cOSArray2.add((COSBase) COSInteger.get(j12));
                                cOSArray.add((COSBase) cOSArray2);
                                cOSArray.add((COSBase) COSInteger.get(j11));
                            }
                            j10 = j11;
                            round = round4;
                            round3 = round5;
                        }
                    } else {
                        cOSArray = cOSArray4;
                        int i13 = (j11 > (j10 + 1) ? 1 : (j11 == (j10 + 1) ? 0 : -1));
                        if (i13 == 0 && round4 == round && round2 == j13 && round5 == j12) {
                            state = State.SERIAL;
                        } else if (i13 == 0) {
                            state = State.BRACKET;
                            cOSArray2 = new COSArray();
                            cOSArray2.add((COSBase) COSInteger.get(round));
                            cOSArray2.add((COSBase) COSInteger.get(j13));
                            cOSArray2.add((COSBase) COSInteger.get(j12));
                        } else {
                            cOSArray2 = new COSArray();
                            cOSArray2.add((COSBase) COSInteger.get(round));
                            cOSArray2.add((COSBase) COSInteger.get(j13));
                            cOSArray2.add((COSBase) COSInteger.get(j12));
                            cOSArray.add((COSBase) cOSArray2);
                            cOSArray.add((COSBase) COSInteger.get(j11));
                            state = state3;
                        }
                        j10 = j11;
                        round = round4;
                        round3 = round5;
                    }
                }
                i10 += 4;
                iArr2 = iArr;
                cOSArray3 = cOSArray;
                state2 = state;
                unitsPerEm = f10;
            }
            State state4 = state2;
            COSArray cOSArray5 = cOSArray3;
            long j14 = round2;
            long j15 = round3;
            int i14 = AnonymousClass1.$SwitchMap$com$tom_roush$pdfbox$pdmodel$font$PDCIDFontType2Embedder$State[state4.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        cOSArray5.add((COSBase) COSInteger.get(j10));
                        cOSArray5.add((COSBase) COSInteger.get(round));
                        cOSArray5.add((COSBase) COSInteger.get(j14));
                        cOSArray5.add((COSBase) COSInteger.get(j15));
                    }
                } else {
                    cOSArray2.add((COSBase) COSInteger.get(round));
                    cOSArray2.add((COSBase) COSInteger.get(j14));
                    cOSArray2.add((COSBase) COSInteger.get(j15));
                    cOSArray5.add((COSBase) cOSArray2);
                }
            } else {
                COSArray cOSArray6 = new COSArray();
                cOSArray6.add((COSBase) COSInteger.get(round));
                cOSArray6.add((COSBase) COSInteger.get(j14));
                cOSArray6.add((COSBase) COSInteger.get(j15));
                cOSArray5.add((COSBase) cOSArray6);
            }
            return cOSArray5;
        }
        throw new IllegalArgumentException("length of values must be > 0");
    }

    private COSArray getWidths(int[] iArr) {
        State state;
        if (iArr.length != 0) {
            float unitsPerEm = 1000.0f / this.ttf.getHeader().getUnitsPerEm();
            long j10 = iArr[0];
            int i10 = 1;
            long round = Math.round(iArr[1] * unitsPerEm);
            COSArray cOSArray = new COSArray();
            COSArray cOSArray2 = new COSArray();
            cOSArray2.add((COSBase) COSInteger.get(j10));
            State state2 = State.FIRST;
            int i11 = 2;
            while (i11 < iArr.length) {
                long j11 = iArr[i11];
                int i12 = i11;
                long round2 = Math.round(iArr[i11 + 1] * unitsPerEm);
                int i13 = AnonymousClass1.$SwitchMap$com$tom_roush$pdfbox$pdmodel$font$PDCIDFontType2Embedder$State[state2.ordinal()];
                if (i13 != i10) {
                    if (i13 != 2) {
                        if (i13 == 3 && (j11 != j10 + 1 || round2 != round)) {
                            cOSArray2.add((COSBase) COSInteger.get(j10));
                            cOSArray2.add((COSBase) COSInteger.get(round));
                            cOSArray2.add((COSBase) COSInteger.get(j11));
                            state = State.FIRST;
                            state2 = state;
                        }
                    } else {
                        int i14 = (j11 > (j10 + 1) ? 1 : (j11 == (j10 + 1) ? 0 : -1));
                        if (i14 == 0 && round2 == round) {
                            state = State.SERIAL;
                            cOSArray2.add((COSBase) cOSArray);
                            cOSArray2.add((COSBase) COSInteger.get(j10));
                        } else if (i14 == 0) {
                            cOSArray.add((COSBase) COSInteger.get(round));
                        } else {
                            state = State.FIRST;
                            cOSArray.add((COSBase) COSInteger.get(round));
                            cOSArray2.add((COSBase) cOSArray);
                            cOSArray2.add((COSBase) COSInteger.get(j11));
                        }
                        state2 = state;
                    }
                } else {
                    int i15 = (j11 > (j10 + 1) ? 1 : (j11 == (j10 + 1) ? 0 : -1));
                    if (i15 == 0 && round2 == round) {
                        state = State.SERIAL;
                        state2 = state;
                    } else if (i15 == 0) {
                        State state3 = State.BRACKET;
                        COSArray cOSArray3 = new COSArray();
                        cOSArray3.add((COSBase) COSInteger.get(round));
                        state2 = state3;
                        cOSArray = cOSArray3;
                    } else {
                        COSArray cOSArray4 = new COSArray();
                        cOSArray4.add((COSBase) COSInteger.get(round));
                        cOSArray2.add((COSBase) cOSArray4);
                        cOSArray2.add((COSBase) COSInteger.get(j11));
                        cOSArray = cOSArray4;
                    }
                }
                round = round2;
                j10 = j11;
                i11 = i12 + 2;
                i10 = 1;
            }
            int i16 = AnonymousClass1.$SwitchMap$com$tom_roush$pdfbox$pdmodel$font$PDCIDFontType2Embedder$State[state2.ordinal()];
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 == 3) {
                        cOSArray2.add((COSBase) COSInteger.get(j10));
                        cOSArray2.add((COSBase) COSInteger.get(round));
                    }
                } else {
                    cOSArray.add((COSBase) COSInteger.get(round));
                    cOSArray2.add((COSBase) cOSArray);
                }
            } else {
                COSArray cOSArray5 = new COSArray();
                cOSArray5.add((COSBase) COSInteger.get(round));
                cOSArray2.add((COSBase) cOSArray5);
            }
            return cOSArray2;
        }
        throw new IllegalArgumentException("length of widths must be > 0");
    }

    private COSDictionary toCIDSystemInfo(String str, String str2, int i10) {
        COSDictionary cOSDictionary = new COSDictionary();
        cOSDictionary.setString(COSName.REGISTRY, str);
        cOSDictionary.setString(COSName.ORDERING, str2);
        cOSDictionary.setInt(COSName.SUPPLEMENT, i10);
        return cOSDictionary;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.TrueTypeEmbedder
    public void buildSubset(InputStream inputStream, String str, Map<Integer, Integer> map) {
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            hashMap.put(Integer.valueOf(entry.getValue().intValue()), Integer.valueOf(entry.getKey().intValue()));
        }
        buildToUnicodeCMap(map);
        if (this.vertical) {
            buildVerticalMetrics(hashMap);
        }
        buildFontFile2(inputStream);
        addNameTag(str);
        buildWidths(hashMap);
        buildCIDToGIDMap(hashMap);
        buildCIDSet(hashMap);
    }

    public PDCIDFont getCIDFont() {
        return new PDCIDFontType2(this.cidFont, this.parent, this.ttf);
    }

    private void buildWidths(COSDictionary cOSDictionary) {
        int numberOfGlyphs = this.ttf.getNumberOfGlyphs();
        int[] iArr = new int[numberOfGlyphs * 2];
        for (int i10 = 0; i10 < numberOfGlyphs; i10++) {
            int i11 = i10 * 2;
            iArr[i11] = i10;
            iArr[i11 + 1] = this.ttf.getHorizontalMetrics().getAdvanceWidth(i10);
        }
        cOSDictionary.setItem(COSName.W, (COSBase) getWidths(iArr));
    }

    private void buildVerticalMetrics(COSDictionary cOSDictionary) {
        if (buildVerticalHeader(cOSDictionary)) {
            int numberOfGlyphs = this.ttf.getNumberOfGlyphs();
            int[] iArr = new int[numberOfGlyphs * 4];
            for (int i10 = 0; i10 < numberOfGlyphs; i10++) {
                GlyphData glyph = this.ttf.getGlyph().getGlyph(i10);
                if (glyph == null) {
                    iArr[i10 * 4] = Integer.MIN_VALUE;
                } else {
                    int i11 = i10 * 4;
                    iArr[i11] = i10;
                    iArr[i11 + 1] = this.ttf.getVerticalMetrics().getAdvanceHeight(i10);
                    iArr[i11 + 2] = this.ttf.getHorizontalMetrics().getAdvanceWidth(i10);
                    iArr[i11 + 3] = this.ttf.getVerticalMetrics().getTopSideBearing(i10) + glyph.getYMaximum();
                }
            }
            cOSDictionary.setItem(COSName.W2, (COSBase) getVerticalMetrics(iArr));
        }
    }
}

package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.fontbox.ttf.CmapLookup;
import com.tom_roush.fontbox.ttf.CmapSubtable;
import com.tom_roush.fontbox.ttf.GlyphTable;
import com.tom_roush.fontbox.ttf.HeaderTable;
import com.tom_roush.fontbox.ttf.HorizontalHeaderTable;
import com.tom_roush.fontbox.ttf.HorizontalMetricsTable;
import com.tom_roush.fontbox.ttf.IndexToLocationTable;
import com.tom_roush.fontbox.ttf.MaximumProfileTable;
import com.tom_roush.fontbox.ttf.TTFParser;
import com.tom_roush.fontbox.ttf.TTFSubsetter;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInputStream;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class TrueTypeEmbedder implements Subsetter {
    private static final String BASE25 = "BCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int ITALIC = 1;
    private static final int OBLIQUE = 512;
    @Deprecated
    protected final CmapSubtable cmap;
    protected final CmapLookup cmapLookup;
    private final PDDocument document;
    private final boolean embedSubset;
    protected PDFontDescriptor fontDescriptor;
    private final Set<Integer> subsetCodePoints = new HashSet();
    protected TrueTypeFont ttf;

    public TrueTypeEmbedder(PDDocument pDDocument, COSDictionary cOSDictionary, TrueTypeFont trueTypeFont, boolean z10) {
        this.document = pDDocument;
        this.embedSubset = z10;
        this.ttf = trueTypeFont;
        this.fontDescriptor = createFontDescriptor(trueTypeFont);
        if (isEmbeddingPermitted(trueTypeFont)) {
            if (!z10) {
                InputStream originalData = trueTypeFont.getOriginalData();
                byte[] bArr = new byte[4];
                originalData.mark(4);
                if (originalData.read(bArr) == 4 && new String(bArr).equals("ttcf")) {
                    originalData.close();
                    throw new IOException("Full embedding of TrueType font collections not supported");
                }
                if (originalData.markSupported()) {
                    originalData.reset();
                } else {
                    originalData.close();
                    originalData = trueTypeFont.getOriginalData();
                }
                PDStream pDStream = new PDStream(pDDocument, originalData, COSName.FLATE_DECODE);
                pDStream.getCOSObject().setLong(COSName.LENGTH1, trueTypeFont.getOriginalDataSize());
                this.fontDescriptor.setFontFile2(pDStream);
            }
            cOSDictionary.setName(COSName.BASE_FONT, trueTypeFont.getName());
            this.cmap = trueTypeFont.getUnicodeCmap();
            this.cmapLookup = trueTypeFont.getUnicodeCmapLookup();
            return;
        }
        throw new IOException("This font does not permit embedding");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
        if (r3 != 5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor createFontDescriptor(com.tom_roush.fontbox.ttf.TrueTypeFont r10) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.font.TrueTypeEmbedder.createFontDescriptor(com.tom_roush.fontbox.ttf.TrueTypeFont):com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor");
    }

    private boolean isSubsettingPermitted(TrueTypeFont trueTypeFont) {
        if (trueTypeFont.getOS2Windows() != null && (trueTypeFont.getOS2Windows().getFsType() & 256) == 256) {
            return false;
        }
        return true;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.Subsetter
    public void addToSubset(int i10) {
        this.subsetCodePoints.add(Integer.valueOf(i10));
    }

    public void buildFontFile2(InputStream inputStream) {
        COSInputStream cOSInputStream;
        PDStream pDStream = new PDStream(this.document, inputStream, COSName.FLATE_DECODE);
        try {
            cOSInputStream = pDStream.createInputStream();
        } catch (Throwable th2) {
            th = th2;
            cOSInputStream = null;
        }
        try {
            TrueTypeFont parseEmbedded = new TTFParser().parseEmbedded(cOSInputStream);
            this.ttf = parseEmbedded;
            if (isEmbeddingPermitted(parseEmbedded)) {
                if (this.fontDescriptor == null) {
                    this.fontDescriptor = createFontDescriptor(this.ttf);
                }
                IOUtils.closeQuietly(cOSInputStream);
                pDStream.getCOSObject().setLong(COSName.LENGTH1, this.ttf.getOriginalDataSize());
                this.fontDescriptor.setFontFile2(pDStream);
                return;
            }
            throw new IOException("This font does not permit embedding");
        } catch (Throwable th3) {
            th = th3;
            IOUtils.closeQuietly(cOSInputStream);
            throw th;
        }
    }

    public abstract void buildSubset(InputStream inputStream, String str, Map<Integer, Integer> map);

    public PDFontDescriptor getFontDescriptor() {
        return this.fontDescriptor;
    }

    public String getTag(Map<Integer, Integer> map) {
        long hashCode = map.hashCode();
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j10 = hashCode / 25;
            sb2.append(BASE25.charAt((int) (hashCode % 25)));
            if (j10 == 0 || sb2.length() >= 6) {
                break;
            }
            hashCode = j10;
        }
        while (sb2.length() < 6) {
            sb2.insert(0, 'A');
        }
        sb2.append('+');
        return sb2.toString();
    }

    @Deprecated
    public TrueTypeFont getTrueTypeFont() {
        return this.ttf;
    }

    public boolean isEmbeddingPermitted(TrueTypeFont trueTypeFont) {
        if (trueTypeFont.getOS2Windows() != null) {
            short fsType = trueTypeFont.getOS2Windows().getFsType();
            if ((fsType & 15) == 2 || (fsType & 512) == 512) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean needsSubset() {
        return this.embedSubset;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.Subsetter
    public void subset() {
        if (isSubsettingPermitted(this.ttf)) {
            if (this.embedSubset) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(HeaderTable.TAG);
                arrayList.add(HorizontalHeaderTable.TAG);
                arrayList.add(IndexToLocationTable.TAG);
                arrayList.add(MaximumProfileTable.TAG);
                arrayList.add("cvt ");
                arrayList.add("prep");
                arrayList.add(GlyphTable.TAG);
                arrayList.add(HorizontalMetricsTable.TAG);
                arrayList.add("fpgm");
                arrayList.add("gasp");
                TTFSubsetter tTFSubsetter = new TTFSubsetter(this.ttf, arrayList);
                tTFSubsetter.addAll(this.subsetCodePoints);
                Map<Integer, Integer> gIDMap = tTFSubsetter.getGIDMap();
                String tag = getTag(gIDMap);
                tTFSubsetter.setPrefix(tag);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                tTFSubsetter.writeToStream(byteArrayOutputStream);
                buildSubset(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), tag, gIDMap);
                this.ttf.close();
                return;
            }
            throw new IllegalStateException("Subsetting is disabled");
        }
        throw new IOException("This font does not permit subsetting");
    }
}

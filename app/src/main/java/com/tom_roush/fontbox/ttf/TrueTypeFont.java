package com.tom_roush.fontbox.ttf;

import android.graphics.Path;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.util.BoundingBox;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class TrueTypeFont implements FontBoxFont, Closeable {
    private final TTFDataStream data;
    private Map<String, Integer> postScriptNames;
    private float version;
    private int numberOfGlyphs = -1;
    private int unitsPerEm = -1;
    protected Map<String, TTFTable> tables = new HashMap();
    private final List<String> enabledGsubFeatures = new ArrayList();

    public TrueTypeFont(TTFDataStream tTFDataStream) {
        this.data = tTFDataStream;
    }

    private CmapSubtable getUnicodeCmapImpl(boolean z10) {
        CmapTable cmap = getCmap();
        if (cmap == null) {
            if (!z10) {
                return null;
            }
            throw new IOException("The TrueType font " + getName() + " does not contain a 'cmap' table");
        }
        CmapSubtable subtable = cmap.getSubtable(0, 4);
        if (subtable == null) {
            subtable = cmap.getSubtable(3, 10);
        }
        if (subtable == null) {
            subtable = cmap.getSubtable(0, 3);
        }
        if (subtable == null) {
            subtable = cmap.getSubtable(3, 1);
        }
        if (subtable == null) {
            subtable = cmap.getSubtable(3, 0);
        }
        if (subtable == null) {
            if (!z10) {
                if (cmap.getCmaps().length > 0) {
                    return cmap.getCmaps()[0];
                }
                return subtable;
            }
            throw new IOException("The TrueType font does not contain a Unicode cmap");
        }
        return subtable;
    }

    private int parseUniName(String str) {
        if (str.startsWith("uni") && str.length() == 7) {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder();
            int i10 = 3;
            while (true) {
                int i11 = i10 + 4;
                if (i11 > length) {
                    break;
                }
                try {
                    int parseInt = Integer.parseInt(str.substring(i10, i11), 16);
                    if (parseInt <= 55295 || parseInt >= 57344) {
                        sb2.append((char) parseInt);
                    }
                    i10 = i11;
                } catch (NumberFormatException unused) {
                }
            }
            String sb3 = sb2.toString();
            if (sb3.length() == 0) {
                return -1;
            }
            return sb3.codePointAt(0);
        }
        return -1;
    }

    private synchronized void readPostScriptNames() {
        if (this.postScriptNames == null && getPostScript() != null) {
            String[] glyphNames = getPostScript().getGlyphNames();
            if (glyphNames != null) {
                this.postScriptNames = new HashMap(glyphNames.length);
                for (int i10 = 0; i10 < glyphNames.length; i10++) {
                    this.postScriptNames.put(glyphNames[i10], Integer.valueOf(i10));
                }
            } else {
                this.postScriptNames = new HashMap();
            }
        }
    }

    public void addTable(TTFTable tTFTable) {
        this.tables.put(tTFTable.getTag(), tTFTable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.data.close();
    }

    public void disableGsubFeature(String str) {
        this.enabledGsubFeatures.remove(str);
    }

    public void enableGsubFeature(String str) {
        this.enabledGsubFeatures.add(str);
    }

    public void enableVerticalSubstitutions() {
        enableGsubFeature("vrt2");
        enableGsubFeature("vert");
    }

    public void finalize() {
        super.finalize();
        close();
    }

    public int getAdvanceHeight(int i10) {
        VerticalMetricsTable verticalMetrics = getVerticalMetrics();
        if (verticalMetrics != null) {
            return verticalMetrics.getAdvanceHeight(i10);
        }
        return 250;
    }

    public int getAdvanceWidth(int i10) {
        HorizontalMetricsTable horizontalMetrics = getHorizontalMetrics();
        if (horizontalMetrics != null) {
            return horizontalMetrics.getAdvanceWidth(i10);
        }
        return 250;
    }

    public CmapTable getCmap() {
        return (CmapTable) getTable(CmapTable.TAG);
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public BoundingBox getFontBBox() {
        HeaderTable header = getHeader();
        short xMin = header.getXMin();
        short xMax = header.getXMax();
        short yMin = header.getYMin();
        short yMax = header.getYMax();
        float unitsPerEm = 1000.0f / getUnitsPerEm();
        return new BoundingBox(xMin * unitsPerEm, yMin * unitsPerEm, xMax * unitsPerEm, yMax * unitsPerEm);
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public List<Number> getFontMatrix() {
        float unitsPerEm = (1000.0f / getUnitsPerEm()) * 0.001f;
        return Arrays.asList(Float.valueOf(unitsPerEm), 0, 0, Float.valueOf(unitsPerEm), 0, 0);
    }

    public GlyphTable getGlyph() {
        return (GlyphTable) getTable(GlyphTable.TAG);
    }

    public GlyphSubstitutionTable getGsub() {
        return (GlyphSubstitutionTable) getTable(GlyphSubstitutionTable.TAG);
    }

    public HeaderTable getHeader() {
        return (HeaderTable) getTable(HeaderTable.TAG);
    }

    public HorizontalHeaderTable getHorizontalHeader() {
        return (HorizontalHeaderTable) getTable(HorizontalHeaderTable.TAG);
    }

    public HorizontalMetricsTable getHorizontalMetrics() {
        return (HorizontalMetricsTable) getTable(HorizontalMetricsTable.TAG);
    }

    public IndexToLocationTable getIndexToLocation() {
        return (IndexToLocationTable) getTable(IndexToLocationTable.TAG);
    }

    public KerningTable getKerning() {
        return (KerningTable) getTable(KerningTable.TAG);
    }

    public MaximumProfileTable getMaximumProfile() {
        return (MaximumProfileTable) getTable(MaximumProfileTable.TAG);
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public String getName() {
        if (getNaming() != null) {
            return getNaming().getPostScriptName();
        }
        return null;
    }

    public NamingTable getNaming() {
        return (NamingTable) getTable(NamingTable.TAG);
    }

    public int getNumberOfGlyphs() {
        if (this.numberOfGlyphs == -1) {
            MaximumProfileTable maximumProfile = getMaximumProfile();
            if (maximumProfile != null) {
                this.numberOfGlyphs = maximumProfile.getNumGlyphs();
            } else {
                this.numberOfGlyphs = 0;
            }
        }
        return this.numberOfGlyphs;
    }

    public OS2WindowsMetricsTable getOS2Windows() {
        return (OS2WindowsMetricsTable) getTable(OS2WindowsMetricsTable.TAG);
    }

    public InputStream getOriginalData() {
        return this.data.getOriginalData();
    }

    public long getOriginalDataSize() {
        return this.data.getOriginalDataSize();
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public Path getPath(String str) {
        GlyphData glyph = getGlyph().getGlyph(nameToGID(str));
        if (glyph == null) {
            return new Path();
        }
        return glyph.getPath();
    }

    public PostScriptTable getPostScript() {
        return (PostScriptTable) getTable(PostScriptTable.TAG);
    }

    public synchronized TTFTable getTable(String str) {
        TTFTable tTFTable;
        tTFTable = this.tables.get(str);
        if (tTFTable != null && !tTFTable.getInitialized()) {
            readTable(tTFTable);
        }
        return tTFTable;
    }

    public synchronized byte[] getTableBytes(TTFTable tTFTable) {
        byte[] read;
        long currentPosition = this.data.getCurrentPosition();
        this.data.seek(tTFTable.getOffset());
        read = this.data.read((int) tTFTable.getLength());
        this.data.seek(currentPosition);
        return read;
    }

    public Map<String, TTFTable> getTableMap() {
        return this.tables;
    }

    public Collection<TTFTable> getTables() {
        return this.tables.values();
    }

    @Deprecated
    public CmapSubtable getUnicodeCmap() {
        return getUnicodeCmap(true);
    }

    public CmapLookup getUnicodeCmapLookup() {
        return getUnicodeCmapLookup(true);
    }

    public int getUnitsPerEm() {
        if (this.unitsPerEm == -1) {
            HeaderTable header = getHeader();
            if (header != null) {
                this.unitsPerEm = header.getUnitsPerEm();
            } else {
                this.unitsPerEm = 0;
            }
        }
        return this.unitsPerEm;
    }

    public float getVersion() {
        return this.version;
    }

    public VerticalHeaderTable getVerticalHeader() {
        return (VerticalHeaderTable) getTable(VerticalHeaderTable.TAG);
    }

    public VerticalMetricsTable getVerticalMetrics() {
        return (VerticalMetricsTable) getTable(VerticalMetricsTable.TAG);
    }

    public VerticalOriginTable getVerticalOrigin() {
        return (VerticalOriginTable) getTable(VerticalOriginTable.TAG);
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public float getWidth(String str) {
        return getAdvanceWidth(nameToGID(str));
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public boolean hasGlyph(String str) {
        if (nameToGID(str) != 0) {
            return true;
        }
        return false;
    }

    public int nameToGID(String str) {
        Integer num;
        readPostScriptNames();
        Map<String, Integer> map = this.postScriptNames;
        if (map != null && (num = map.get(str)) != null && num.intValue() > 0 && num.intValue() < getMaximumProfile().getNumGlyphs()) {
            return num.intValue();
        }
        int parseUniName = parseUniName(str);
        if (parseUniName <= -1) {
            return 0;
        }
        return getUnicodeCmapLookup(false).getGlyphId(parseUniName);
    }

    public void readTable(TTFTable tTFTable) {
        synchronized (this.data) {
            long currentPosition = this.data.getCurrentPosition();
            this.data.seek(tTFTable.getOffset());
            tTFTable.read(this, this.data);
            this.data.seek(currentPosition);
        }
    }

    public void setVersion(float f10) {
        this.version = f10;
    }

    public String toString() {
        try {
            if (getNaming() != null) {
                return getNaming().getPostScriptName();
            }
            return "(null)";
        } catch (IOException e10) {
            return "(null - " + e10.getMessage() + ")";
        }
    }

    @Deprecated
    public CmapSubtable getUnicodeCmap(boolean z10) {
        return getUnicodeCmapImpl(z10);
    }

    public CmapLookup getUnicodeCmapLookup(boolean z10) {
        GlyphSubstitutionTable gsub;
        CmapSubtable unicodeCmapImpl = getUnicodeCmapImpl(z10);
        return (this.enabledGsubFeatures.isEmpty() || (gsub = getGsub()) == null) ? unicodeCmapImpl : new SubstitutingCmapLookup(unicodeCmapImpl, gsub, Collections.unmodifiableList(this.enabledGsubFeatures));
    }
}

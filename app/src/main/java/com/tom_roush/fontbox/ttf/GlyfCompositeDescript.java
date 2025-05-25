package com.tom_roush.fontbox.ttf;

import a0.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class GlyfCompositeDescript extends GlyfDescript {
    private boolean beingResolved;
    private final List<GlyfCompositeComp> components;
    private int contourCount;
    private final Map<Integer, GlyphDescription> descriptions;
    private GlyphTable glyphTable;
    private int pointCount;
    private boolean resolved;

    public GlyfCompositeDescript(TTFDataStream tTFDataStream, GlyphTable glyphTable) {
        super((short) -1, tTFDataStream);
        GlyfCompositeComp glyfCompositeComp;
        this.components = new ArrayList();
        this.descriptions = new HashMap();
        this.beingResolved = false;
        this.resolved = false;
        this.pointCount = -1;
        this.contourCount = -1;
        this.glyphTable = glyphTable;
        do {
            glyfCompositeComp = new GlyfCompositeComp(tTFDataStream);
            this.components.add(glyfCompositeComp);
        } while ((glyfCompositeComp.getFlags() & 32) != 0);
        if ((glyfCompositeComp.getFlags() & 256) != 0) {
            readInstructions(tTFDataStream, tTFDataStream.readUnsignedShort());
        }
        initDescriptions();
    }

    private GlyfCompositeComp getCompositeComp(int i10) {
        for (GlyfCompositeComp glyfCompositeComp : this.components) {
            GlyphDescription glyphDescription = this.descriptions.get(Integer.valueOf(glyfCompositeComp.getGlyphIndex()));
            if (glyfCompositeComp.getFirstIndex() <= i10 && glyphDescription != null) {
                if (i10 < glyphDescription.getPointCount() + glyfCompositeComp.getFirstIndex()) {
                    return glyfCompositeComp;
                }
            }
        }
        return null;
    }

    private GlyfCompositeComp getCompositeCompEndPt(int i10) {
        for (GlyfCompositeComp glyfCompositeComp : this.components) {
            GlyphDescription glyphDescription = this.descriptions.get(Integer.valueOf(glyfCompositeComp.getGlyphIndex()));
            if (glyfCompositeComp.getFirstContour() <= i10 && glyphDescription != null) {
                if (i10 < glyphDescription.getContourCount() + glyfCompositeComp.getFirstContour()) {
                    return glyfCompositeComp;
                }
            }
        }
        return null;
    }

    private void initDescriptions() {
        for (GlyfCompositeComp glyfCompositeComp : this.components) {
            try {
                int glyphIndex = glyfCompositeComp.getGlyphIndex();
                GlyphData glyph = this.glyphTable.getGlyph(glyphIndex);
                if (glyph != null) {
                    this.descriptions.put(Integer.valueOf(glyphIndex), glyph.getDescription());
                }
            } catch (IOException e10) {
                e10.getMessage();
            }
        }
    }

    public int getComponentCount() {
        return this.components.size();
    }

    @Override // com.tom_roush.fontbox.ttf.GlyfDescript, com.tom_roush.fontbox.ttf.GlyphDescription
    public int getContourCount() {
        if (this.contourCount < 0) {
            GlyfCompositeComp glyfCompositeComp = (GlyfCompositeComp) a.f(this.components, -1);
            this.contourCount = this.descriptions.get(Integer.valueOf(glyfCompositeComp.getGlyphIndex())).getContourCount() + glyfCompositeComp.getFirstContour();
        }
        return this.contourCount;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public int getEndPtOfContours(int i10) {
        GlyfCompositeComp compositeCompEndPt = getCompositeCompEndPt(i10);
        if (compositeCompEndPt != null) {
            return compositeCompEndPt.getFirstIndex() + this.descriptions.get(Integer.valueOf(compositeCompEndPt.getGlyphIndex())).getEndPtOfContours(i10 - compositeCompEndPt.getFirstContour());
        }
        return 0;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public byte getFlags(int i10) {
        GlyfCompositeComp compositeComp = getCompositeComp(i10);
        if (compositeComp != null) {
            return this.descriptions.get(Integer.valueOf(compositeComp.getGlyphIndex())).getFlags(i10 - compositeComp.getFirstIndex());
        }
        return (byte) 0;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public int getPointCount() {
        if (this.pointCount < 0) {
            GlyfCompositeComp glyfCompositeComp = (GlyfCompositeComp) a.f(this.components, -1);
            GlyphDescription glyphDescription = this.descriptions.get(Integer.valueOf(glyfCompositeComp.getGlyphIndex()));
            if (glyphDescription == null) {
                glyfCompositeComp.getGlyphIndex();
                this.pointCount = 0;
            } else {
                this.pointCount = glyphDescription.getPointCount() + glyfCompositeComp.getFirstIndex();
            }
        }
        return this.pointCount;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public short getXCoordinate(int i10) {
        GlyfCompositeComp compositeComp = getCompositeComp(i10);
        if (compositeComp != null) {
            GlyphDescription glyphDescription = this.descriptions.get(Integer.valueOf(compositeComp.getGlyphIndex()));
            int firstIndex = i10 - compositeComp.getFirstIndex();
            return (short) (compositeComp.getXTranslate() + ((short) compositeComp.scaleX(glyphDescription.getXCoordinate(firstIndex), glyphDescription.getYCoordinate(firstIndex))));
        }
        return (short) 0;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public short getYCoordinate(int i10) {
        GlyfCompositeComp compositeComp = getCompositeComp(i10);
        if (compositeComp != null) {
            GlyphDescription glyphDescription = this.descriptions.get(Integer.valueOf(compositeComp.getGlyphIndex()));
            int firstIndex = i10 - compositeComp.getFirstIndex();
            return (short) (compositeComp.getYTranslate() + ((short) compositeComp.scaleY(glyphDescription.getXCoordinate(firstIndex), glyphDescription.getYCoordinate(firstIndex))));
        }
        return (short) 0;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public boolean isComposite() {
        return true;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyfDescript, com.tom_roush.fontbox.ttf.GlyphDescription
    public void resolve() {
        if (this.resolved || this.beingResolved) {
            return;
        }
        this.beingResolved = true;
        int i10 = 0;
        int i11 = 0;
        for (GlyfCompositeComp glyfCompositeComp : this.components) {
            glyfCompositeComp.setFirstIndex(i10);
            glyfCompositeComp.setFirstContour(i11);
            GlyphDescription glyphDescription = this.descriptions.get(Integer.valueOf(glyfCompositeComp.getGlyphIndex()));
            if (glyphDescription != null) {
                glyphDescription.resolve();
                i10 += glyphDescription.getPointCount();
                i11 += glyphDescription.getContourCount();
            }
        }
        this.resolved = true;
        this.beingResolved = false;
    }
}

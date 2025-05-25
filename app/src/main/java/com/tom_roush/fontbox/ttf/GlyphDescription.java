package com.tom_roush.fontbox.ttf;

/* loaded from: classes2.dex */
public interface GlyphDescription {
    int getContourCount();

    int getEndPtOfContours(int i10);

    byte getFlags(int i10);

    int getPointCount();

    short getXCoordinate(int i10);

    short getYCoordinate(int i10);

    boolean isComposite();

    void resolve();
}

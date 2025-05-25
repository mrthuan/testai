package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.Vector;

/* loaded from: classes2.dex */
public interface PDFontLike {
    float getAverageFontWidth();

    BoundingBox getBoundingBox();

    PDFontDescriptor getFontDescriptor();

    Matrix getFontMatrix();

    @Deprecated
    float getHeight(int i10);

    String getName();

    Vector getPositionVector(int i10);

    float getWidth(int i10);

    float getWidthFromFont(int i10);

    boolean hasExplicitWidth(int i10);

    boolean isDamaged();

    boolean isEmbedded();
}

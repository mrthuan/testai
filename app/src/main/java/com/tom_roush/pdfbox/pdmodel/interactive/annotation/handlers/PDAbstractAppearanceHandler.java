package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class PDAbstractAppearanceHandler implements PDAppearanceHandler {
    private final PDAnnotation annotation;
    protected PDDocument document;
    protected static final Set<String> SHORT_STYLES = createShortStyles();
    static final double ARROW_ANGLE = Math.toRadians(30.0d);
    protected static final Set<String> INTERIOR_COLOR_STYLES = createInteriorColorStyles();
    protected static final Set<String> ANGLED_STYLES = createAngledStyles();

    public PDAbstractAppearanceHandler(PDAnnotation pDAnnotation) {
        this(pDAnnotation, null);
    }

    private static Set<String> createAngledStyles() {
        HashSet hashSet = new HashSet();
        hashSet.add(PDAnnotationLine.LE_CLOSED_ARROW);
        hashSet.add(PDAnnotationLine.LE_OPEN_ARROW);
        hashSet.add(PDAnnotationLine.LE_R_CLOSED_ARROW);
        hashSet.add(PDAnnotationLine.LE_R_OPEN_ARROW);
        hashSet.add(PDAnnotationLine.LE_BUTT);
        hashSet.add(PDAnnotationLine.LE_SLASH);
        return Collections.unmodifiableSet(hashSet);
    }

    private static Set<String> createInteriorColorStyles() {
        HashSet hashSet = new HashSet();
        hashSet.add(PDAnnotationLine.LE_CLOSED_ARROW);
        hashSet.add("Circle");
        hashSet.add(PDAnnotationLine.LE_DIAMOND);
        hashSet.add(PDAnnotationLine.LE_R_CLOSED_ARROW);
        hashSet.add("Square");
        return Collections.unmodifiableSet(hashSet);
    }

    private static Set<String> createShortStyles() {
        HashSet hashSet = new HashSet();
        hashSet.add(PDAnnotationLine.LE_OPEN_ARROW);
        hashSet.add(PDAnnotationLine.LE_CLOSED_ARROW);
        hashSet.add("Square");
        hashSet.add("Circle");
        hashSet.add(PDAnnotationLine.LE_DIAMOND);
        return Collections.unmodifiableSet(hashSet);
    }

    private PDAppearanceContentStream getAppearanceEntryAsContentStream(PDAppearanceEntry pDAppearanceEntry, boolean z10) {
        PDAppearanceStream appearanceStream = pDAppearanceEntry.getAppearanceStream();
        setTransformationMatrix(appearanceStream);
        if (appearanceStream.getResources() == null) {
            appearanceStream.setResources(new PDResources());
        }
        return new PDAppearanceContentStream(appearanceStream, z10);
    }

    private PDAppearanceEntry getNormalAppearance() {
        PDAppearanceDictionary appearance = getAppearance();
        PDAppearanceEntry normalAppearance = appearance.getNormalAppearance();
        if (normalAppearance == null || normalAppearance.isSubDictionary()) {
            PDAppearanceEntry pDAppearanceEntry = new PDAppearanceEntry(createCOSStream());
            appearance.setNormalAppearance(pDAppearanceEntry);
            return pDAppearanceEntry;
        }
        return normalAppearance;
    }

    private void setTransformationMatrix(PDAppearanceStream pDAppearanceStream) {
        PDRectangle rectangle = getRectangle();
        pDAppearanceStream.setBBox(rectangle);
        pDAppearanceStream.setMatrix(AffineTransform.getTranslateInstance(-rectangle.getLowerLeftX(), -rectangle.getLowerLeftY()));
    }

    public PDRectangle addRectDifferences(PDRectangle pDRectangle, float[] fArr) {
        if (fArr != null && fArr.length == 4) {
            return new PDRectangle(pDRectangle.getLowerLeftX() - fArr[0], pDRectangle.getLowerLeftY() - fArr[1], pDRectangle.getWidth() + fArr[0] + fArr[2], pDRectangle.getHeight() + fArr[1] + fArr[3]);
        }
        return pDRectangle;
    }

    public PDRectangle applyRectDifferences(PDRectangle pDRectangle, float[] fArr) {
        if (fArr != null && fArr.length == 4) {
            return new PDRectangle(pDRectangle.getLowerLeftX() + fArr[0], pDRectangle.getLowerLeftY() + fArr[1], (pDRectangle.getWidth() - fArr[0]) - fArr[2], (pDRectangle.getHeight() - fArr[1]) - fArr[3]);
        }
        return pDRectangle;
    }

    public COSStream createCOSStream() {
        PDDocument pDDocument = this.document;
        if (pDDocument == null) {
            return new COSStream();
        }
        return pDDocument.getDocument().createCOSStream();
    }

    public void drawArrow(PDAppearanceContentStream pDAppearanceContentStream, float f10, float f11, float f12) {
        double d10 = ARROW_ANGLE;
        double d11 = f12;
        pDAppearanceContentStream.moveTo(((float) (Math.cos(d10) * d11)) + f10, ((float) (Math.sin(d10) * d11)) + f11);
        pDAppearanceContentStream.lineTo(f10, f11);
        pDAppearanceContentStream.lineTo(f10 + ((float) (Math.cos(d10) * d11)), f11 - ((float) (Math.sin(d10) * d11)));
    }

    public void drawCircle(PDAppearanceContentStream pDAppearanceContentStream, float f10, float f11, float f12) {
        float f13 = f12 * 0.551784f;
        float f14 = f11 + f12;
        pDAppearanceContentStream.moveTo(f10, f14);
        float f15 = f10 + f13;
        float f16 = f10 + f12;
        float f17 = f11 + f13;
        pDAppearanceContentStream.curveTo(f15, f14, f16, f17, f16, f11);
        float f18 = f11 - f13;
        float f19 = f11 - f12;
        pDAppearanceContentStream.curveTo(f16, f18, f15, f19, f10, f19);
        float f20 = f10 - f13;
        float f21 = f10 - f12;
        pDAppearanceContentStream.curveTo(f20, f19, f21, f18, f21, f11);
        pDAppearanceContentStream.curveTo(f21, f17, f20, f14, f10, f14);
        pDAppearanceContentStream.closePath();
    }

    public void drawCircle2(PDAppearanceContentStream pDAppearanceContentStream, float f10, float f11, float f12) {
        float f13 = f12 * 0.551784f;
        float f14 = f11 + f12;
        pDAppearanceContentStream.moveTo(f10, f14);
        float f15 = f10 - f13;
        float f16 = f10 - f12;
        float f17 = f11 + f13;
        pDAppearanceContentStream.curveTo(f15, f14, f16, f17, f16, f11);
        float f18 = f11 - f13;
        float f19 = f11 - f12;
        pDAppearanceContentStream.curveTo(f16, f18, f15, f19, f10, f19);
        float f20 = f13 + f10;
        float f21 = f10 + f12;
        pDAppearanceContentStream.curveTo(f20, f19, f21, f18, f21, f11);
        pDAppearanceContentStream.curveTo(f21, f17, f20, f14, f10, f14);
        pDAppearanceContentStream.closePath();
    }

    public void drawDiamond(PDAppearanceContentStream pDAppearanceContentStream, float f10, float f11, float f12) {
        pDAppearanceContentStream.moveTo(f10 - f12, f11);
        pDAppearanceContentStream.lineTo(f10, f11 + f12);
        pDAppearanceContentStream.lineTo(f10 + f12, f11);
        pDAppearanceContentStream.lineTo(f10, f11 - f12);
        pDAppearanceContentStream.closePath();
    }

    public void drawStyle(String str, PDAppearanceContentStream pDAppearanceContentStream, float f10, float f11, float f12, boolean z10, boolean z11, boolean z12) {
        int i10;
        boolean z13;
        if (z12) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        boolean z14 = false;
        if (!PDAnnotationLine.LE_OPEN_ARROW.equals(str) && !PDAnnotationLine.LE_CLOSED_ARROW.equals(str)) {
            if (PDAnnotationLine.LE_BUTT.equals(str)) {
                float f13 = f12 * 3.0f;
                pDAppearanceContentStream.moveTo(f10, f11 - f13);
                pDAppearanceContentStream.lineTo(f10, f11 + f13);
            } else if (PDAnnotationLine.LE_DIAMOND.equals(str)) {
                drawDiamond(pDAppearanceContentStream, f10, f11, f12 * 3.0f);
            } else if ("Square".equals(str)) {
                float f14 = f12 * 3.0f;
                float f15 = f10 - f14;
                float f16 = f11 - f14;
                float f17 = 6.0f * f12;
                pDAppearanceContentStream.addRect(f15, f16, f17, f17);
            } else if ("Circle".equals(str)) {
                drawCircle(pDAppearanceContentStream, f10, f11, f12 * 3.0f);
            } else if (!PDAnnotationLine.LE_R_OPEN_ARROW.equals(str) && !PDAnnotationLine.LE_R_CLOSED_ARROW.equals(str)) {
                if (PDAnnotationLine.LE_SLASH.equals(str)) {
                    double d10 = f12;
                    pDAppearanceContentStream.moveTo(((float) (Math.cos(Math.toRadians(60.0d)) * d10 * 9.0d)) + f10, ((float) (Math.sin(Math.toRadians(60.0d)) * d10 * 9.0d)) + f11);
                    pDAppearanceContentStream.lineTo(f10 + ((float) (Math.cos(Math.toRadians(240.0d)) * d10 * 9.0d)), f11 + ((float) (Math.sin(Math.toRadians(240.0d)) * d10 * 9.0d)));
                }
            } else {
                float f18 = (0 - i10) * f12;
                drawArrow(pDAppearanceContentStream, f10 + f18, f11, f18 * 9.0f);
            }
        } else {
            float f19 = i10 * f12;
            drawArrow(pDAppearanceContentStream, f10 + f19, f11, f19 * 9.0f);
        }
        if (PDAnnotationLine.LE_R_CLOSED_ARROW.equals(str) || PDAnnotationLine.LE_CLOSED_ARROW.equals(str)) {
            pDAppearanceContentStream.closePath();
        }
        if (INTERIOR_COLOR_STYLES.contains(str)) {
            z13 = z10;
            z14 = z11;
        } else {
            z13 = z10;
        }
        pDAppearanceContentStream.drawShape(f12, z13, z14);
    }

    public PDAnnotation getAnnotation() {
        return this.annotation;
    }

    public PDAppearanceDictionary getAppearance() {
        PDAppearanceDictionary appearance = this.annotation.getAppearance();
        if (appearance == null) {
            PDAppearanceDictionary pDAppearanceDictionary = new PDAppearanceDictionary();
            this.annotation.setAppearance(pDAppearanceDictionary);
            return pDAppearanceDictionary;
        }
        return appearance;
    }

    public PDColor getColor() {
        return this.annotation.getColor();
    }

    public PDAppearanceEntry getDownAppearance() {
        PDAppearanceDictionary appearance = getAppearance();
        PDAppearanceEntry downAppearance = appearance.getDownAppearance();
        if (downAppearance.isSubDictionary()) {
            PDAppearanceEntry pDAppearanceEntry = new PDAppearanceEntry(createCOSStream());
            appearance.setDownAppearance(pDAppearanceEntry);
            return pDAppearanceEntry;
        }
        return downAppearance;
    }

    public PDAppearanceContentStream getNormalAppearanceAsContentStream() {
        return getNormalAppearanceAsContentStream(false);
    }

    public PDRectangle getPaddedRectangle(PDRectangle pDRectangle, float f10) {
        float lowerLeftX = pDRectangle.getLowerLeftX() + f10;
        float lowerLeftY = pDRectangle.getLowerLeftY() + f10;
        float f11 = f10 * 2.0f;
        return new PDRectangle(lowerLeftX, lowerLeftY, pDRectangle.getWidth() - f11, pDRectangle.getHeight() - f11);
    }

    public PDRectangle getRectangle() {
        return this.annotation.getRectangle();
    }

    public PDAppearanceEntry getRolloverAppearance() {
        PDAppearanceDictionary appearance = getAppearance();
        PDAppearanceEntry rolloverAppearance = appearance.getRolloverAppearance();
        if (rolloverAppearance.isSubDictionary()) {
            PDAppearanceEntry pDAppearanceEntry = new PDAppearanceEntry(createCOSStream());
            appearance.setRolloverAppearance(pDAppearanceEntry);
            return pDAppearanceEntry;
        }
        return rolloverAppearance;
    }

    public PDRectangle handleBorderBox(PDAnnotationSquareCircle pDAnnotationSquareCircle, float f10) {
        float[] rectDifferences = pDAnnotationSquareCircle.getRectDifferences();
        if (rectDifferences.length == 0) {
            float f11 = f10 / 2.0f;
            PDRectangle paddedRectangle = getPaddedRectangle(getRectangle(), f11);
            pDAnnotationSquareCircle.setRectDifferences(f11);
            pDAnnotationSquareCircle.setRectangle(addRectDifferences(getRectangle(), pDAnnotationSquareCircle.getRectDifferences()));
            pDAnnotationSquareCircle.getNormalAppearanceStream().setBBox(getRectangle());
            pDAnnotationSquareCircle.getNormalAppearanceStream().setMatrix(AffineTransform.getTranslateInstance(-getRectangle().getLowerLeftX(), -getRectangle().getLowerLeftY()));
            return paddedRectangle;
        }
        return getPaddedRectangle(applyRectDifferences(getRectangle(), rectDifferences), f10 / 2.0f);
    }

    public void setOpacity(PDAppearanceContentStream pDAppearanceContentStream, float f10) {
        if (f10 < 1.0f) {
            PDExtendedGraphicsState pDExtendedGraphicsState = new PDExtendedGraphicsState();
            pDExtendedGraphicsState.setStrokingAlphaConstant(Float.valueOf(f10));
            pDExtendedGraphicsState.setNonStrokingAlphaConstant(Float.valueOf(f10));
            pDAppearanceContentStream.setGraphicsStateParameters(pDExtendedGraphicsState);
        }
    }

    public PDAbstractAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        this.annotation = pDAnnotation;
        this.document = pDDocument;
    }

    public PDAppearanceContentStream getNormalAppearanceAsContentStream(boolean z10) {
        return getAppearanceEntryAsContentStream(getNormalAppearance(), z10);
    }
}

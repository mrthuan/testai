package com.tom_roush.pdfbox.pdmodel.graphics.state;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.PDLineDashPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.util.Matrix;

/* loaded from: classes2.dex */
public class PDGraphicsState implements Cloneable {
    private double alphaConstant;
    private boolean alphaSource;
    private BlendMode blendMode;
    private Region clippingPath;
    private Matrix currentTransformationMatrix = new Matrix();
    private double flatness;
    private boolean isClippingPathDirty;
    private Paint.Cap lineCap;
    private PDLineDashPattern lineDashPattern;
    private Paint.Join lineJoin;
    private float lineWidth;
    private float miterLimit;
    private double nonStrokingAlphaConstant;
    private PDColor nonStrokingColor;
    private PDColorSpace nonStrokingColorSpace;
    private boolean nonStrokingOverprint;
    private boolean overprint;
    private double overprintMode;
    private RenderingIntent renderingIntent;
    private double smoothness;
    private PDSoftMask softMask;
    private boolean strokeAdjustment;
    private PDColor strokingColor;
    private PDColorSpace strokingColorSpace;
    private PDTextState textState;
    private COSBase transfer;

    public PDGraphicsState(PDRectangle pDRectangle) {
        PDDeviceGray pDDeviceGray = PDDeviceGray.INSTANCE;
        this.strokingColor = pDDeviceGray.getInitialColor();
        this.nonStrokingColor = pDDeviceGray.getInitialColor();
        this.strokingColorSpace = pDDeviceGray;
        this.nonStrokingColorSpace = pDDeviceGray;
        this.textState = new PDTextState();
        this.lineWidth = 1.0f;
        this.lineCap = Paint.Cap.BUTT;
        this.lineJoin = Paint.Join.MITER;
        this.miterLimit = 10.0f;
        this.lineDashPattern = new PDLineDashPattern();
        this.strokeAdjustment = false;
        this.blendMode = BlendMode.COMPATIBLE;
        this.alphaConstant = 1.0d;
        this.nonStrokingAlphaConstant = 1.0d;
        this.alphaSource = false;
        this.overprint = false;
        this.nonStrokingOverprint = false;
        this.overprintMode = 0.0d;
        this.transfer = null;
        this.flatness = 1.0d;
        this.smoothness = 0.0d;
        RectF rectF = new RectF();
        pDRectangle.toGeneralPath().computeBounds(rectF, true);
        this.clippingPath = new Region();
        Rect rect = new Rect();
        rectF.round(rect);
        this.clippingPath.setPath(pDRectangle.toGeneralPath(), new Region(rect));
    }

    public double getAlphaConstant() {
        return this.alphaConstant;
    }

    public BlendMode getBlendMode() {
        return this.blendMode;
    }

    public Region getCurrentClippingPath() {
        return this.clippingPath;
    }

    public Matrix getCurrentTransformationMatrix() {
        return this.currentTransformationMatrix;
    }

    public double getFlatness() {
        return this.flatness;
    }

    public Paint.Cap getLineCap() {
        return this.lineCap;
    }

    public PDLineDashPattern getLineDashPattern() {
        return this.lineDashPattern;
    }

    public Paint.Join getLineJoin() {
        return this.lineJoin;
    }

    public float getLineWidth() {
        return this.lineWidth;
    }

    public float getMiterLimit() {
        return this.miterLimit;
    }

    public double getNonStrokeAlphaConstant() {
        return this.nonStrokingAlphaConstant;
    }

    @Deprecated
    public double getNonStrokeAlphaConstants() {
        return this.nonStrokingAlphaConstant;
    }

    public PDColor getNonStrokingColor() {
        return this.nonStrokingColor;
    }

    public PDColorSpace getNonStrokingColorSpace() {
        return this.nonStrokingColorSpace;
    }

    public double getOverprintMode() {
        return this.overprintMode;
    }

    public RenderingIntent getRenderingIntent() {
        return this.renderingIntent;
    }

    public double getSmoothness() {
        return this.smoothness;
    }

    public PDSoftMask getSoftMask() {
        return this.softMask;
    }

    public PDColor getStrokingColor() {
        return this.strokingColor;
    }

    public PDColorSpace getStrokingColorSpace() {
        return this.strokingColorSpace;
    }

    public PDTextState getTextState() {
        return this.textState;
    }

    public COSBase getTransfer() {
        return this.transfer;
    }

    public void intersectClippingPath(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        Region region = new Region();
        Rect rect = new Rect();
        rectF.round(rect);
        region.setPath(path, new Region(rect));
        intersectClippingPath(region);
    }

    public boolean isAlphaSource() {
        return this.alphaSource;
    }

    public boolean isNonStrokingOverprint() {
        return this.nonStrokingOverprint;
    }

    public boolean isOverprint() {
        return this.overprint;
    }

    public boolean isStrokeAdjustment() {
        return this.strokeAdjustment;
    }

    public void setAlphaConstant(double d10) {
        this.alphaConstant = d10;
    }

    public void setAlphaSource(boolean z10) {
        this.alphaSource = z10;
    }

    public void setBlendMode(BlendMode blendMode) {
        this.blendMode = blendMode;
    }

    public void setCurrentTransformationMatrix(Matrix matrix) {
        this.currentTransformationMatrix = matrix;
    }

    public void setFlatness(double d10) {
        this.flatness = d10;
    }

    public void setLineCap(Paint.Cap cap) {
        this.lineCap = cap;
    }

    public void setLineDashPattern(PDLineDashPattern pDLineDashPattern) {
        this.lineDashPattern = pDLineDashPattern;
    }

    public void setLineJoin(Paint.Join join) {
        this.lineJoin = join;
    }

    public void setLineWidth(float f10) {
        this.lineWidth = f10;
    }

    public void setMiterLimit(float f10) {
        this.miterLimit = f10;
    }

    public void setNonStrokeAlphaConstant(double d10) {
        this.nonStrokingAlphaConstant = d10;
    }

    @Deprecated
    public void setNonStrokeAlphaConstants(double d10) {
        this.nonStrokingAlphaConstant = d10;
    }

    public void setNonStrokingColor(PDColor pDColor) {
        this.nonStrokingColor = pDColor;
    }

    public void setNonStrokingColorSpace(PDColorSpace pDColorSpace) {
        this.nonStrokingColorSpace = pDColorSpace;
    }

    public void setNonStrokingOverprint(boolean z10) {
        this.nonStrokingOverprint = z10;
    }

    public void setOverprint(boolean z10) {
        this.overprint = z10;
    }

    public void setOverprintMode(double d10) {
        this.overprintMode = d10;
    }

    public void setRenderingIntent(RenderingIntent renderingIntent) {
        this.renderingIntent = renderingIntent;
    }

    public void setSmoothness(double d10) {
        this.smoothness = d10;
    }

    public void setSoftMask(PDSoftMask pDSoftMask) {
        this.softMask = pDSoftMask;
    }

    public void setStrokeAdjustment(boolean z10) {
        this.strokeAdjustment = z10;
    }

    public void setStrokingColor(PDColor pDColor) {
        this.strokingColor = pDColor;
    }

    public void setStrokingColorSpace(PDColorSpace pDColorSpace) {
        this.strokingColorSpace = pDColorSpace;
    }

    public void setTextState(PDTextState pDTextState) {
        this.textState = pDTextState;
    }

    public void setTransfer(COSBase cOSBase) {
        this.transfer = cOSBase;
    }

    /* renamed from: clone */
    public PDGraphicsState m9clone() {
        try {
            PDGraphicsState pDGraphicsState = (PDGraphicsState) super.clone();
            pDGraphicsState.textState = this.textState.m10clone();
            pDGraphicsState.currentTransformationMatrix = this.currentTransformationMatrix.m11clone();
            pDGraphicsState.strokingColor = this.strokingColor;
            pDGraphicsState.nonStrokingColor = this.nonStrokingColor;
            pDGraphicsState.lineDashPattern = this.lineDashPattern;
            pDGraphicsState.clippingPath = this.clippingPath;
            pDGraphicsState.isClippingPathDirty = false;
            return pDGraphicsState;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void intersectClippingPath(Region region) {
        if (!this.isClippingPathDirty) {
            this.clippingPath = new Region(region);
            this.isClippingPathDirty = true;
        }
        this.clippingPath.op(region, Region.Op.INTERSECT);
    }
}

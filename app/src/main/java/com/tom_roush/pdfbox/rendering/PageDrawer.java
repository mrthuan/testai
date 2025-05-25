package com.tom_roush.pdfbox.rendering;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.function.PDFunction;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType0;
import com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType2;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDTrueTypeFont;
import com.tom_roush.pdfbox.pdmodel.font.PDType0Font;
import com.tom_roush.pdfbox.pdmodel.font.PDType1CFont;
import com.tom_roush.pdfbox.pdmodel.font.PDType1Font;
import com.tom_roush.pdfbox.pdmodel.font.PDType3Font;
import com.tom_roush.pdfbox.pdmodel.graphics.PDLineDashPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDTransparencyGroup;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentMembershipDictionary;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDGraphicsState;
import com.tom_roush.pdfbox.pdmodel.graphics.state.RenderingMode;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.AnnotationFilter;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationUnknown;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.Vector;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.StringTokenizer;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes2.dex */
public class PageDrawer extends PDFGraphicsStreamEngine {
    static final int JAVA_VERSION = getJavaVersion();
    private AnnotationFilter annotationFilter;
    private Canvas canvas;
    private Path.FillType clipWindingRule;
    private PointF currentPoint;
    private final RenderDestination destination;
    private boolean flipTG;
    private final Map<PDFont, Glyph2D> fontGlyph2D;
    private final float imageDownscalingOptimizationThreshold;
    private Path initialClip;
    private Region lastClip;
    private Path linePath;
    private int nestedHiddenOCGCount;
    private PDRectangle pageSize;
    private Paint paint;
    private final PDFRenderer renderer;
    private final boolean subsamplingAllowed;
    private List<Path> textClippings;
    private final Deque<TransparencyGroup> transparencyGroupStack;
    private AffineTransform xform;

    /* loaded from: classes2.dex */
    public final class TransparencyGroup {
        private final float scaleX;
        private final float scaleY;

        public /* synthetic */ TransparencyGroup(PageDrawer pageDrawer, PDTransparencyGroup pDTransparencyGroup, Matrix matrix) {
            this(pDTransparencyGroup, false, matrix, null);
        }

        private boolean isGray(PDColorSpace pDColorSpace) {
            if (pDColorSpace instanceof PDDeviceGray) {
                return true;
            }
            return false;
        }

        private TransparencyGroup(PDTransparencyGroup pDTransparencyGroup, boolean z10, Matrix matrix, PDColor pDColor) {
            pDTransparencyGroup.getBBox().transform(Matrix.concatenate(matrix, pDTransparencyGroup.getMatrix()));
            Matrix matrix2 = new Matrix(PageDrawer.this.xform);
            float abs = Math.abs(matrix2.getScalingFactorX());
            this.scaleX = abs;
            float abs2 = Math.abs(matrix2.getScalingFactorY());
            this.scaleY = abs2;
            double d10 = abs;
            double d11 = abs2;
            AffineTransform.getScaleInstance(d10, d11);
            isGray(pDTransparencyGroup.getGroup().getColorSpace(pDTransparencyGroup.getResources()));
            if ((z10 || pDTransparencyGroup.getGroup().isIsolated() || !PageDrawer.this.hasBlendMode(pDTransparencyGroup, new HashSet())) ? false : true) {
                if (PageDrawer.this.transparencyGroupStack.isEmpty()) {
                    PageDrawer.this.renderer.getPageImage();
                } else {
                    TransparencyGroup transparencyGroup = (TransparencyGroup) PageDrawer.this.transparencyGroupStack.peek();
                }
            }
            boolean z11 = PageDrawer.this.flipTG;
            PageDrawer.this.flipTG = false;
            AffineTransform affineTransform = PageDrawer.this.xform;
            PageDrawer.this.xform = AffineTransform.getScaleInstance(d10, d11);
            PDRectangle pDRectangle = PageDrawer.this.pageSize;
            Path.FillType fillType = PageDrawer.this.clipWindingRule;
            PageDrawer.this.clipWindingRule = null;
            Path path = PageDrawer.this.linePath;
            PageDrawer.this.linePath = new Path();
            PageDrawer.this.setRenderingHints();
            try {
                if (z10) {
                    PageDrawer.this.processSoftMask(pDTransparencyGroup);
                } else {
                    PageDrawer.this.transparencyGroupStack.push(this);
                    PageDrawer.this.processTransparencyGroup(pDTransparencyGroup);
                    if (!PageDrawer.this.transparencyGroupStack.isEmpty()) {
                        PageDrawer.this.transparencyGroupStack.pop();
                    }
                }
            } finally {
                PageDrawer.this.flipTG = z11;
                PageDrawer.this.clipWindingRule = fillType;
                PageDrawer.this.linePath = path;
                PageDrawer.this.pageSize = pDRectangle;
                PageDrawer.this.xform = affineTransform;
            }
        }
    }

    public PageDrawer(PageDrawerParameters pageDrawerParameters) {
        super(pageDrawerParameters.getPage());
        this.flipTG = false;
        this.clipWindingRule = null;
        this.linePath = new Path();
        this.fontGlyph2D = new HashMap();
        this.currentPoint = new PointF();
        this.transparencyGroupStack = new ArrayDeque();
        this.annotationFilter = new AnnotationFilter() { // from class: com.tom_roush.pdfbox.rendering.PageDrawer.1
            @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.AnnotationFilter
            public boolean accept(PDAnnotation pDAnnotation) {
                return true;
            }
        };
        this.renderer = pageDrawerParameters.getRenderer();
        this.subsamplingAllowed = pageDrawerParameters.isSubsamplingAllowed();
        this.destination = pageDrawerParameters.getDestination();
        this.imageDownscalingOptimizationThreshold = pageDrawerParameters.getImageDownscalingOptimizationThreshold();
    }

    private Bitmap applyTransferFunction(Bitmap bitmap, COSBase cOSBase) {
        PDFunction create;
        Integer[] numArr;
        PDFunction pDFunction;
        PDFunction pDFunction2;
        Integer[] numArr2;
        Integer[] numArr3;
        int i10;
        int i11;
        int i12;
        int i13;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        int i14 = 0;
        if (cOSBase instanceof COSArray) {
            COSArray cOSArray = (COSArray) cOSBase;
            create = PDFunction.create(cOSArray.getObject(0));
            pDFunction2 = PDFunction.create(cOSArray.getObject(1));
            pDFunction = PDFunction.create(cOSArray.getObject(2));
            numArr = new Integer[256];
            numArr3 = new Integer[256];
            numArr2 = new Integer[256];
        } else {
            create = PDFunction.create(cOSBase);
            numArr = new Integer[256];
            pDFunction = create;
            pDFunction2 = pDFunction;
            numArr2 = numArr;
            numArr3 = numArr2;
        }
        float[] fArr = new float[1];
        for (int i15 = 0; i15 < bitmap.getWidth(); i15++) {
            int i16 = i14;
            while (i16 < bitmap.getHeight()) {
                int pixel = bitmap.getPixel(i15, i16);
                int i17 = (pixel >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC;
                int i18 = (pixel >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC;
                int i19 = pixel & FunctionEval.FunctionID.EXTERNAL_FUNC;
                Integer num = numArr[i17];
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    fArr[0] = (i17 & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f;
                    int i20 = (int) (create.eval(fArr)[0] * 255.0f);
                    numArr[i17] = Integer.valueOf(i20);
                    i10 = i20;
                }
                Integer num2 = numArr3[i18];
                if (num2 != null) {
                    i11 = num2.intValue();
                } else {
                    fArr[0] = (i18 & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f;
                    i11 = (int) (pDFunction2.eval(fArr)[0] * 255.0f);
                    numArr3[i18] = Integer.valueOf(i11);
                }
                Integer num3 = numArr2[i19];
                if (num3 != null) {
                    i13 = num3.intValue();
                    i12 = 0;
                } else {
                    i12 = 0;
                    fArr[0] = (i19 & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f;
                    i13 = (int) (pDFunction.eval(fArr)[0] * 255.0f);
                    numArr2[i19] = Integer.valueOf(i13);
                }
                createBitmap.setPixel(i15, i16, (i11 << 8) | (pixel & (-16777216)) | (i10 << 16) | i13);
                i16++;
                i14 = i12;
            }
        }
        return createBitmap;
    }

    private void beginTextClip() {
        this.textClippings = new ArrayList();
    }

    private float clampColor(float f10) {
        float f11 = 0.0f;
        if (f10 >= 0.0f) {
            f11 = 1.0f;
            if (f10 <= 1.0f) {
                return f10;
            }
        }
        return f11;
    }

    private Glyph2D createGlyph2D(PDFont pDFont) {
        Glyph2D glyph2D;
        Glyph2D glyph2D2 = this.fontGlyph2D.get(pDFont);
        if (glyph2D2 != null) {
            return glyph2D2;
        }
        if (pDFont instanceof PDTrueTypeFont) {
            glyph2D = new TTFGlyph2D((PDTrueTypeFont) pDFont);
        } else if (pDFont instanceof PDType1Font) {
            glyph2D = new Type1Glyph2D((PDType1Font) pDFont);
        } else if (pDFont instanceof PDType1CFont) {
            glyph2D = new Type1Glyph2D((PDType1CFont) pDFont);
        } else if (pDFont instanceof PDType0Font) {
            PDType0Font pDType0Font = (PDType0Font) pDFont;
            if (pDType0Font.getDescendantFont() instanceof PDCIDFontType2) {
                glyph2D2 = new TTFGlyph2D(pDType0Font);
            } else if (pDType0Font.getDescendantFont() instanceof PDCIDFontType0) {
                glyph2D2 = new CIDType0Glyph2D((PDCIDFontType0) pDType0Font.getDescendantFont());
            }
            glyph2D = glyph2D2;
        } else {
            throw new IllegalStateException("Bad font type: ".concat(pDFont.getClass().getSimpleName()));
        }
        if (glyph2D != null) {
            this.fontGlyph2D.put(pDFont, glyph2D);
        }
        if (glyph2D != null) {
            return glyph2D;
        }
        throw new UnsupportedOperationException("No font for " + pDFont.getName());
    }

    private void drawBitmap(Bitmap bitmap, AffineTransform affineTransform) {
        setClip();
        AffineTransform affineTransform2 = new AffineTransform(affineTransform);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        affineTransform2.scale(1.0d / width, (-1.0d) / height);
        affineTransform2.translate(0.0d, -height);
        if (getGraphicsState().getSoftMask() != null) {
            new RectF(0.0f, 0.0f, width, height);
            return;
        }
        COSBase transfer = getGraphicsState().getTransfer();
        if ((transfer instanceof COSArray) || (transfer instanceof COSDictionary)) {
            bitmap = applyTransferFunction(bitmap, transfer);
        }
        this.canvas.drawBitmap(bitmap, affineTransform2.toMatrix(), this.paint);
    }

    private void drawGlyph2D(Glyph2D glyph2D, PDFont pDFont, int i10, Vector vector, AffineTransform affineTransform) {
        RenderingMode renderingMode = getGraphicsState().getTextState().getRenderingMode();
        Path pathForCharacterCode = glyph2D.getPathForCharacterCode(i10);
        if (pathForCharacterCode != null) {
            if (!pDFont.isEmbedded() && !pDFont.isVertical() && !pDFont.isStandard14() && pDFont.hasExplicitWidth(i10)) {
                float widthFromFont = pDFont.getWidthFromFont(i10);
                if (widthFromFont > 0.0f && Math.abs(widthFromFont - (vector.getX() * 1000.0f)) > 1.0E-4d) {
                    affineTransform.scale((vector.getX() * 1000.0f) / widthFromFont, 1.0d);
                }
            }
            pathForCharacterCode.transform(affineTransform.toMatrix());
            if (renderingMode.isFill()) {
                this.paint.setColor(getNonStrokingColor());
                setClip();
                if (isContentRendered()) {
                    this.paint.setStyle(Paint.Style.FILL);
                    this.canvas.drawPath(pathForCharacterCode, this.paint);
                }
            }
            if (renderingMode.isStroke()) {
                this.paint.setColor(getStrokingColor());
                setClip();
                if (isContentRendered()) {
                    this.paint.setStyle(Paint.Style.STROKE);
                    this.canvas.drawPath(pathForCharacterCode, this.paint);
                }
            }
            renderingMode.isClip();
        }
    }

    private void endTextClip() {
        PDGraphicsState graphicsState = getGraphicsState();
        if (graphicsState.getTextState().getRenderingMode().isClip() && !this.textClippings.isEmpty()) {
            Path path = new Path();
            path.setFillType(Path.FillType.WINDING);
            for (Path path2 : this.textClippings) {
                path.addPath(path2);
            }
            graphicsState.intersectClippingPath(path);
            this.textClippings = new ArrayList();
            this.lastClip = null;
        }
    }

    private int getColor(PDColor pDColor) {
        float[] rgb = pDColor.getColorSpace().toRGB(pDColor.getComponents());
        return Color.rgb(Math.round(rgb[0] * 255.0f), Math.round(rgb[1] * 255.0f), Math.round(rgb[2] * 255.0f));
    }

    private float[] getDashArray(PDLineDashPattern pDLineDashPattern) {
        float[] dashArray = pDLineDashPattern.getDashArray();
        int phase = pDLineDashPattern.getPhase();
        if (dashArray.length != 0) {
            float f10 = phase;
            if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
                int i10 = 0;
                for (int i11 = 0; i11 < dashArray.length; i11++) {
                    if (Float.isInfinite(dashArray[i11]) || Float.isNaN(dashArray[i11])) {
                        return null;
                    }
                }
                if (JAVA_VERSION < 10) {
                    float scalingFactorX = new Matrix(this.xform).getScalingFactorX();
                    while (i10 < dashArray.length) {
                        float transformWidth = transformWidth(dashArray[i10]);
                        if (scalingFactorX < 0.5f) {
                            dashArray[i10] = Math.max(transformWidth, 0.2f);
                        } else {
                            dashArray[i10] = Math.max(transformWidth, 0.062f);
                        }
                        i10++;
                    }
                } else {
                    while (i10 < dashArray.length) {
                        dashArray[i10] = transformWidth(dashArray[i10]);
                        i10++;
                    }
                }
                return dashArray;
            }
        }
        return null;
    }

    private static int getJavaVersion() {
        StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.specification.version"), ".");
        int i10 = 0;
        try {
            int parseInt = Integer.parseInt(stringTokenizer.nextToken());
            if (stringTokenizer.hasMoreTokens()) {
                i10 = Integer.parseInt(stringTokenizer.nextToken());
            }
            if (parseInt == 1) {
                return i10;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private int getStrokingColor() {
        return getColor(getGraphicsState().getStrokingColor());
    }

    private int getSubsampling(PDImage pDImage, AffineTransform affineTransform) {
        int floor = (int) Math.floor(Math.sqrt((pDImage.getHeight() * pDImage.getWidth()) / Math.abs(this.xform.getDeterminant() * affineTransform.getDeterminant())));
        if (floor > 8) {
            floor = 8;
        }
        if (floor < 1) {
            floor = 1;
        }
        if (floor > pDImage.getWidth() || floor > pDImage.getHeight()) {
            return Math.min(pDImage.getWidth(), pDImage.getHeight());
        }
        return floor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasBlendMode(PDTransparencyGroup pDTransparencyGroup, Set<COSBase> set) {
        if (set.contains(pDTransparencyGroup.getCOSObject())) {
            return false;
        }
        set.add(pDTransparencyGroup.getCOSObject());
        PDResources resources = pDTransparencyGroup.getResources();
        if (resources == null) {
            return false;
        }
        for (COSName cOSName : resources.getExtGStateNames()) {
            PDExtendedGraphicsState extGState = resources.getExtGState(cOSName);
            if (extGState != null && extGState.getBlendMode() != BlendMode.NORMAL) {
                return true;
            }
        }
        for (COSName cOSName2 : resources.getXObjectNames()) {
            try {
                PDXObject xObject = resources.getXObject(cOSName2);
                if ((xObject instanceof PDTransparencyGroup) && hasBlendMode((PDTransparencyGroup) xObject, set)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private boolean isAllZeroDash(float[] fArr) {
        if (fArr.length <= 0) {
            return false;
        }
        for (int i10 = 0; i10 < fArr.length; i10++) {
            if (fArr[i10] != 0.0f) {
                return false;
            }
        }
        return true;
    }

    private boolean isContentRendered() {
        if (this.nestedHiddenOCGCount <= 0) {
            return true;
        }
        return false;
    }

    private boolean isHiddenOCG(PDPropertyList pDPropertyList) {
        if (pDPropertyList instanceof PDOptionalContentGroup) {
            PDOptionalContentGroup pDOptionalContentGroup = (PDOptionalContentGroup) pDPropertyList;
            PDOptionalContentGroup.RenderState renderState = pDOptionalContentGroup.getRenderState(this.destination);
            if (renderState == null) {
                if (!getRenderer().isGroupEnabled(pDOptionalContentGroup)) {
                    return true;
                }
                return false;
            } else if (PDOptionalContentGroup.RenderState.OFF.equals(renderState)) {
                return true;
            } else {
                return false;
            }
        } else if (pDPropertyList instanceof PDOptionalContentMembershipDictionary) {
            return isHiddenOCMD((PDOptionalContentMembershipDictionary) pDPropertyList);
        } else {
            return false;
        }
    }

    private boolean isHiddenOCMD(PDOptionalContentMembershipDictionary pDOptionalContentMembershipDictionary) {
        pDOptionalContentMembershipDictionary.getCOSObject().getCOSArray(COSName.VE);
        ArrayList arrayList = new ArrayList();
        for (PDPropertyList pDPropertyList : pDOptionalContentMembershipDictionary.getOCGs()) {
            arrayList.add(Boolean.valueOf(!isHiddenOCG(pDPropertyList)));
        }
        COSName visibilityPolicy = pDOptionalContentMembershipDictionary.getVisibilityPolicy();
        if (COSName.ANY_OFF.equals(visibilityPolicy)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    return false;
                }
            }
            return true;
        } else if (COSName.ALL_ON.equals(visibilityPolicy)) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((Boolean) it2.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        } else if (COSName.ALL_OFF.equals(visibilityPolicy)) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (((Boolean) it3.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        } else {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                if (((Boolean) it4.next()).booleanValue()) {
                    return false;
                }
            }
            return true;
        }
    }

    private boolean isRectangular(Path path) {
        return path.isRect(new RectF());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderingHints() {
        this.paint.setAntiAlias(true);
    }

    private void setStroke() {
        PDGraphicsState graphicsState = getGraphicsState();
        float transformWidth = transformWidth(graphicsState.getLineWidth());
        if (transformWidth < 0.25d) {
            transformWidth = 0.25f;
        }
        PDLineDashPattern lineDashPattern = graphicsState.getLineDashPattern();
        if (isAllZeroDash(lineDashPattern.getDashArray())) {
            return;
        }
        float[] dashArray = getDashArray(lineDashPattern);
        float transformWidth2 = transformWidth(lineDashPattern.getPhase());
        this.paint.setStrokeWidth(transformWidth);
        this.paint.setStrokeCap(graphicsState.getLineCap());
        this.paint.setStrokeJoin(graphicsState.getLineJoin());
        float miterLimit = graphicsState.getMiterLimit();
        if (miterLimit < 1.0f) {
            miterLimit = 10.0f;
        }
        this.paint.setStrokeMiter(miterLimit);
        if (dashArray != null) {
            this.paint.setPathEffect(new DashPathEffect(dashArray, transformWidth2));
        }
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void appendRectangle(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        this.linePath.moveTo(pointF.x, pointF.y);
        this.linePath.lineTo(pointF2.x, pointF2.y);
        this.linePath.lineTo(pointF3.x, pointF3.y);
        this.linePath.lineTo(pointF4.x, pointF4.y);
        this.linePath.close();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void beginMarkedContentSequence(COSName cOSName, COSDictionary cOSDictionary) {
        int i10 = this.nestedHiddenOCGCount;
        if (i10 > 0) {
            this.nestedHiddenOCGCount = i10 + 1;
        } else if (cOSName != null && getPage().getResources() != null && isHiddenOCG(getPage().getResources().getProperties(cOSName))) {
            this.nestedHiddenOCGCount = 1;
        }
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void beginText() {
        setClip();
        beginTextClip();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void clip(Path.FillType fillType) {
        this.clipWindingRule = fillType;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void closePath() {
        this.linePath.close();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void curveTo(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.currentPoint.set(f14, f15);
        this.linePath.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void drawImage(PDImage pDImage) {
        Bitmap image;
        if (((pDImage instanceof PDImageXObject) && isHiddenOCG(((PDImageXObject) pDImage).getOptionalContent())) || !isContentRendered()) {
            return;
        }
        AffineTransform createAffineTransform = getGraphicsState().getCurrentTransformationMatrix().createAffineTransform();
        if (!pDImage.getInterpolate()) {
            if (this.subsamplingAllowed) {
                image = pDImage.getImage(null, getSubsampling(pDImage, createAffineTransform));
            } else {
                image = pDImage.getImage();
            }
            if (image.getWidth() >= Math.round(createAffineTransform.getScaleX())) {
                int i10 = (image.getHeight() > Math.round(createAffineTransform.getScaleY()) ? 1 : (image.getHeight() == Math.round(createAffineTransform.getScaleY()) ? 0 : -1));
            }
        }
        if (!pDImage.isStencil()) {
            if (this.subsamplingAllowed) {
                drawBitmap(pDImage.getImage(null, getSubsampling(pDImage, createAffineTransform)), createAffineTransform);
            } else {
                drawBitmap(pDImage.getImage(), createAffineTransform);
            }
        }
        if (!pDImage.getInterpolate()) {
            setRenderingHints();
        }
    }

    public void drawPage(Paint paint, Canvas canvas, PDRectangle pDRectangle) {
        this.paint = paint;
        this.canvas = canvas;
        this.xform = new AffineTransform(canvas.getMatrix());
        this.pageSize = pDRectangle;
        setRenderingHints();
        this.canvas.translate(0.0f, pDRectangle.getHeight());
        this.canvas.scale(1.0f, -1.0f);
        this.canvas.translate(-pDRectangle.getLowerLeftX(), -pDRectangle.getLowerLeftY());
        this.canvas.save();
        processPage(getPage());
        for (PDAnnotation pDAnnotation : getPage().getAnnotations(this.annotationFilter)) {
            showAnnotation(pDAnnotation);
        }
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void endMarkedContentSequence() {
        int i10 = this.nestedHiddenOCGCount;
        if (i10 > 0) {
            this.nestedHiddenOCGCount = i10 - 1;
        }
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void endPath() {
        this.linePath.reset();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void endText() {
        endTextClip();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void fillAndStrokePath(Path.FillType fillType) {
        Path path = new Path(this.linePath);
        fillPath(fillType);
        this.linePath = path;
        strokePath();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void fillPath(Path.FillType fillType) {
        this.paint.setColor(getNonStrokingColor());
        setClip();
        this.linePath.setFillType(fillType);
        RectF rectF = new RectF();
        boolean z10 = true;
        this.linePath.computeBounds(rectF, true);
        if (!isRectangular(this.linePath) || rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            z10 = false;
        }
        if (z10) {
            this.paint.setAntiAlias(false);
        }
        if (isContentRendered()) {
            this.paint.setStyle(Paint.Style.FILL);
            this.canvas.drawPath(this.linePath, this.paint);
        }
        this.linePath.reset();
        if (z10) {
            setRenderingHints();
        }
    }

    public AnnotationFilter getAnnotationFilter() {
        return this.annotationFilter;
    }

    public final Canvas getCanvas() {
        return this.canvas;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public PointF getCurrentPoint() {
        return this.currentPoint;
    }

    public final Path getLinePath() {
        return this.linePath;
    }

    public final int getNonStrokingColor() {
        return getColor(getGraphicsState().getNonStrokingColor());
    }

    public final PDFRenderer getRenderer() {
        return this.renderer;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void lineTo(float f10, float f11) {
        this.currentPoint.set(f10, f11);
        this.linePath.lineTo(f10, f11);
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void moveTo(float f10, float f11) {
        this.currentPoint.set(f10, f11);
        this.linePath.moveTo(f10, f11);
    }

    public void setAnnotationFilter(AnnotationFilter annotationFilter) {
        this.annotationFilter = annotationFilter;
    }

    public final void setClip() {
        Region currentClippingPath = getGraphicsState().getCurrentClippingPath();
        if (currentClippingPath != this.lastClip) {
            this.lastClip = currentClippingPath;
        }
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void shadingFill(COSName cOSName) {
        RectF bounds;
        PDShading shading = getResources().getShading(cOSName);
        if (shading == null) {
            Objects.toString(cOSName);
            return;
        }
        Matrix currentTransformationMatrix = getGraphicsState().getCurrentTransformationMatrix();
        if (shading.getBBox() == null && (bounds = shading.getBounds(new AffineTransform(), currentTransformationMatrix)) != null) {
            bounds.union((float) Math.floor(bounds.left - 1.0f), (float) Math.floor(bounds.top - 1.0f));
            bounds.union((float) Math.ceil(bounds.right + 1.0f), (float) Math.ceil(bounds.bottom + 1.0f));
        }
        isContentRendered();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void showAnnotation(PDAnnotation pDAnnotation) {
        this.lastClip = null;
        if (pDAnnotation.isNoView() || pDAnnotation.isHidden()) {
            return;
        }
        if ((pDAnnotation.isInvisible() && (pDAnnotation instanceof PDAnnotationUnknown)) || isHiddenOCG(pDAnnotation.getOptionalContent())) {
            return;
        }
        PDAppearanceDictionary appearance = pDAnnotation.getAppearance();
        if (appearance == null || appearance.getNormalAppearance() == null) {
            pDAnnotation.constructAppearances(this.renderer.document);
        }
        if (pDAnnotation.isNoRotate() && getCurrentPage().getRotation() != 0) {
            PDRectangle rectangle = pDAnnotation.getRectangle();
            android.graphics.Matrix matrix = this.canvas.getMatrix();
            this.canvas.rotate(getCurrentPage().getRotation(), rectangle.getLowerLeftX(), rectangle.getUpperRightY());
            super.showAnnotation(pDAnnotation);
            this.canvas.setMatrix(matrix);
            return;
        }
        super.showAnnotation(pDAnnotation);
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void showFontGlyph(Matrix matrix, PDFont pDFont, int i10, Vector vector) {
        AffineTransform createAffineTransform = matrix.createAffineTransform();
        createAffineTransform.concatenate(pDFont.getFontMatrix().createAffineTransform());
        drawGlyph2D(createGlyph2D(pDFont), pDFont, i10, vector, createAffineTransform);
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void showForm(PDFormXObject pDFormXObject) {
        if (!isHiddenOCG(pDFormXObject.getOptionalContent()) && isContentRendered()) {
            super.showForm(pDFormXObject);
        }
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void showTransparencyGroup(PDTransparencyGroup pDTransparencyGroup) {
        if (isHiddenOCG(pDTransparencyGroup.getOptionalContent()) || !isContentRendered()) {
            return;
        }
        new TransparencyGroup(this, pDTransparencyGroup, getGraphicsState().getCurrentTransformationMatrix());
        setClip();
        Matrix matrix = new Matrix(this.xform);
        new AffineTransform(this.xform).scale(1.0d / Math.abs(matrix.getScalingFactorX()), 1.0d / Math.abs(matrix.getScalingFactorY()));
        if (getGraphicsState().getSoftMask() != null) {
            isContentRendered();
        } else {
            isContentRendered();
        }
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void showType3Glyph(Matrix matrix, PDType3Font pDType3Font, int i10, Vector vector) {
        if (!RenderingMode.NEITHER.equals(getGraphicsState().getTextState().getRenderingMode())) {
            super.showType3Glyph(matrix, pDType3Font, i10, vector);
        }
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void strokePath() {
        setStroke();
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setColor(getStrokingColor());
        setClip();
        if (isContentRendered()) {
            this.canvas.drawPath(this.linePath, this.paint);
        }
        this.linePath.reset();
    }

    public void setStroke(Paint paint, float f10, Paint.Cap cap, Paint.Join join, float f11, float[] fArr, float f12) {
        paint.setStrokeWidth(f10);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f11);
        if (fArr != null) {
            paint.setPathEffect(new DashPathEffect(fArr, f12));
        }
    }
}

package com.tom_roush.pdfbox.rendering;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.AnnotationFilter;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import java.io.IOException;

/* loaded from: classes2.dex */
public class PDFRenderer {
    private RenderDestination defaultDestination;
    protected final PDDocument document;
    private Bitmap pageImage;
    private AnnotationFilter annotationFilter = new AnnotationFilter() { // from class: com.tom_roush.pdfbox.rendering.PDFRenderer.1
        @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.AnnotationFilter
        public boolean accept(PDAnnotation pDAnnotation) {
            return true;
        }
    };
    private boolean subsamplingAllowed = false;
    private float imageDownscalingOptimizationThreshold = 0.5f;

    public PDFRenderer(PDDocument pDDocument) {
        this.document = pDDocument;
    }

    private boolean hasBlendMode(PDPage pDPage) {
        PDResources resources = pDPage.getResources();
        if (resources == null) {
            return false;
        }
        for (COSName cOSName : resources.getExtGStateNames()) {
            PDExtendedGraphicsState extGState = resources.getExtGState(cOSName);
            if (extGState != null && extGState.getBlendMode() != BlendMode.NORMAL) {
                return true;
            }
        }
        return false;
    }

    private void transform(Canvas canvas, PDPage pDPage, float f10, float f11) {
        float f12;
        canvas.scale(f10, f11);
        int rotation = pDPage.getRotation();
        if (rotation != 0) {
            PDRectangle cropBox = pDPage.getCropBox();
            float f13 = 0.0f;
            if (rotation != 90) {
                if (rotation != 180) {
                    if (rotation != 270) {
                        f12 = 0.0f;
                    } else {
                        f12 = cropBox.getWidth();
                    }
                } else {
                    f13 = cropBox.getWidth();
                    f12 = cropBox.getHeight();
                }
            } else {
                f13 = cropBox.getHeight();
                f12 = 0.0f;
            }
            canvas.translate(f13, f12);
            canvas.rotate(rotation);
        }
    }

    public PageDrawer createPageDrawer(PageDrawerParameters pageDrawerParameters) {
        PageDrawer pageDrawer = new PageDrawer(pageDrawerParameters);
        pageDrawer.setAnnotationFilter(this.annotationFilter);
        return pageDrawer;
    }

    public AnnotationFilter getAnnotationsFilter() {
        return this.annotationFilter;
    }

    public RenderDestination getDefaultDestination() {
        return this.defaultDestination;
    }

    public float getImageDownscalingOptimizationThreshold() {
        return this.imageDownscalingOptimizationThreshold;
    }

    public Bitmap getPageImage() {
        return this.pageImage;
    }

    public boolean isGroupEnabled(PDOptionalContentGroup pDOptionalContentGroup) {
        PDOptionalContentProperties oCProperties = this.document.getDocumentCatalog().getOCProperties();
        if (oCProperties != null && !oCProperties.isGroupEnabled(pDOptionalContentGroup)) {
            return false;
        }
        return true;
    }

    public boolean isSubsamplingAllowed() {
        return this.subsamplingAllowed;
    }

    public Bitmap renderImage(int i10) {
        return renderImage(i10, 1.0f);
    }

    public Bitmap renderImageWithDPI(int i10, float f10) {
        return renderImage(i10, f10 / 72.0f, ImageType.RGB);
    }

    public void renderPageToGraphics(int i10, Paint paint, Canvas canvas) {
        renderPageToGraphics(i10, paint, canvas, 1.0f);
    }

    public void setAnnotationsFilter(AnnotationFilter annotationFilter) {
        this.annotationFilter = annotationFilter;
    }

    public void setDefaultDestination(RenderDestination renderDestination) {
        this.defaultDestination = renderDestination;
    }

    public void setImageDownscalingOptimizationThreshold(float f10) {
        this.imageDownscalingOptimizationThreshold = f10;
    }

    public void setSubsamplingAllowed(boolean z10) {
        this.subsamplingAllowed = z10;
    }

    public Bitmap renderImage(int i10, float f10) {
        return renderImage(i10, f10, ImageType.RGB);
    }

    public Bitmap renderImageWithDPI(int i10, float f10, ImageType imageType) {
        return renderImage(i10, f10 / 72.0f, imageType);
    }

    public void renderPageToGraphics(int i10, Paint paint, Canvas canvas, float f10) {
        renderPageToGraphics(i10, paint, canvas, f10, f10);
    }

    public Bitmap renderImage(int i10, float f10, ImageType imageType) {
        RenderDestination renderDestination = this.defaultDestination;
        if (renderDestination == null) {
            renderDestination = RenderDestination.EXPORT;
        }
        return renderImage(i10, f10, imageType, renderDestination);
    }

    public void renderPageToGraphics(int i10, Paint paint, Canvas canvas, float f10, float f11) {
        RenderDestination renderDestination = this.defaultDestination;
        if (renderDestination == null) {
            renderDestination = RenderDestination.VIEW;
        }
        renderPageToGraphics(i10, paint, canvas, f10, f11, renderDestination);
    }

    public Bitmap renderImage(int i10, float f10, ImageType imageType, RenderDestination renderDestination) {
        Bitmap createBitmap;
        PDPage page = this.document.getPage(i10);
        PDRectangle cropBox = page.getCropBox();
        float width = cropBox.getWidth();
        float height = cropBox.getHeight();
        int max = (int) Math.max(Math.floor(width * f10), 1.0d);
        int max2 = (int) Math.max(Math.floor(height * f10), 1.0d);
        if (max * max2 <= 2147483647L) {
            int rotation = page.getRotation();
            Bitmap.Config bitmapConfig = imageType.toBitmapConfig();
            ImageType imageType2 = ImageType.ARGB;
            if (imageType != imageType2 && hasBlendMode(page)) {
                bitmapConfig = Bitmap.Config.ARGB_8888;
            }
            if (rotation != 90 && rotation != 270) {
                createBitmap = Bitmap.createBitmap(max, max2, bitmapConfig);
            } else {
                createBitmap = Bitmap.createBitmap(max2, max, bitmapConfig);
            }
            Bitmap bitmap = createBitmap;
            this.pageImage = bitmap;
            Paint paint = new Paint();
            Canvas canvas = new Canvas(bitmap);
            if (imageType == imageType2) {
                paint.setColor(0);
            } else {
                paint.setColor(-1);
            }
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint);
            paint.reset();
            transform(canvas, page, f10, f10);
            createPageDrawer(new PageDrawerParameters(this, page, this.subsamplingAllowed, renderDestination, this.imageDownscalingOptimizationThreshold)).drawPage(paint, canvas, page.getCropBox());
            if (bitmap.getConfig() != imageType.toBitmapConfig()) {
                Bitmap createBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), imageType.toBitmapConfig());
                Canvas canvas2 = new Canvas(createBitmap2);
                paint.setColor(-1);
                paint.setStyle(Paint.Style.FILL);
                canvas2.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint);
                canvas2.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                return createBitmap2;
            }
            return bitmap;
        }
        throw new IOException("Maximum size of image exceeded (w * h * scale ^ 2) = " + width + " * " + height + " * " + f10 + " ^ 2 > 2147483647");
    }

    public void renderPageToGraphics(int i10, Paint paint, Canvas canvas, float f10, float f11, RenderDestination renderDestination) {
        PDPage page = this.document.getPage(i10);
        transform(canvas, page, f10, f11);
        PDRectangle cropBox = page.getCropBox();
        canvas.drawRect(0.0f, 0.0f, cropBox.getWidth(), cropBox.getHeight(), paint);
        createPageDrawer(new PageDrawerParameters(this, page, this.subsamplingAllowed, renderDestination, this.imageDownscalingOptimizationThreshold)).drawPage(paint, canvas, cropBox);
    }
}

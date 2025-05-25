package com.tom_roush.pdfbox.rendering;

import com.tom_roush.pdfbox.pdmodel.PDPage;

/* loaded from: classes2.dex */
public final class PageDrawerParameters {
    private final RenderDestination destination;
    private final float imageDownscalingOptimizationThreshold;
    private final PDPage page;
    private final PDFRenderer renderer;
    private final boolean subsamplingAllowed;

    public PageDrawerParameters(PDFRenderer pDFRenderer, PDPage pDPage, boolean z10, RenderDestination renderDestination, float f10) {
        this.renderer = pDFRenderer;
        this.page = pDPage;
        this.subsamplingAllowed = z10;
        this.destination = renderDestination;
        this.imageDownscalingOptimizationThreshold = f10;
    }

    public RenderDestination getDestination() {
        return this.destination;
    }

    public float getImageDownscalingOptimizationThreshold() {
        return this.imageDownscalingOptimizationThreshold;
    }

    public PDPage getPage() {
        return this.page;
    }

    public PDFRenderer getRenderer() {
        return this.renderer;
    }

    public boolean isSubsamplingAllowed() {
        return this.subsamplingAllowed;
    }
}

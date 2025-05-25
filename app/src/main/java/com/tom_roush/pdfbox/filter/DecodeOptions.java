package com.tom_roush.pdfbox.filter;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public class DecodeOptions {
    public static final DecodeOptions DEFAULT = new FinalDecodeOptions(true);
    private boolean filterSubsampled;
    private Rect sourceRegion;
    private int subsamplingOffsetX;
    private int subsamplingOffsetY;
    private int subsamplingX;
    private int subsamplingY;

    public DecodeOptions() {
        this.sourceRegion = null;
        this.subsamplingX = 1;
        this.subsamplingY = 1;
        this.subsamplingOffsetX = 0;
        this.subsamplingOffsetY = 0;
        this.filterSubsampled = false;
    }

    public Rect getSourceRegion() {
        return this.sourceRegion;
    }

    public int getSubsamplingOffsetX() {
        return this.subsamplingOffsetX;
    }

    public int getSubsamplingOffsetY() {
        return this.subsamplingOffsetY;
    }

    public int getSubsamplingX() {
        return this.subsamplingX;
    }

    public int getSubsamplingY() {
        return this.subsamplingY;
    }

    public boolean isFilterSubsampled() {
        return this.filterSubsampled;
    }

    public void setFilterSubsampled(boolean z10) {
        this.filterSubsampled = z10;
    }

    public void setSourceRegion(Rect rect) {
        this.sourceRegion = rect;
    }

    public void setSubsamplingOffsetX(int i10) {
        this.subsamplingOffsetX = i10;
    }

    public void setSubsamplingOffsetY(int i10) {
        this.subsamplingOffsetY = i10;
    }

    public void setSubsamplingX(int i10) {
        this.subsamplingX = i10;
    }

    public void setSubsamplingY(int i10) {
        this.subsamplingY = i10;
    }

    public DecodeOptions(Rect rect) {
        this.subsamplingX = 1;
        this.subsamplingY = 1;
        this.subsamplingOffsetX = 0;
        this.subsamplingOffsetY = 0;
        this.filterSubsampled = false;
        this.sourceRegion = rect;
    }

    public DecodeOptions(int i10, int i11, int i12, int i13) {
        this(new Rect(i10, i11, i12, i13));
    }

    public DecodeOptions(int i10) {
        this.sourceRegion = null;
        this.subsamplingOffsetX = 0;
        this.subsamplingOffsetY = 0;
        this.filterSubsampled = false;
        this.subsamplingX = i10;
        this.subsamplingY = i10;
    }

    /* loaded from: classes2.dex */
    public static class FinalDecodeOptions extends DecodeOptions {
        public FinalDecodeOptions(boolean z10) {
            super.setFilterSubsampled(z10);
        }

        @Override // com.tom_roush.pdfbox.filter.DecodeOptions
        public void setSourceRegion(Rect rect) {
            throw new UnsupportedOperationException("This instance may not be modified.");
        }

        @Override // com.tom_roush.pdfbox.filter.DecodeOptions
        public void setSubsamplingOffsetX(int i10) {
            throw new UnsupportedOperationException("This instance may not be modified.");
        }

        @Override // com.tom_roush.pdfbox.filter.DecodeOptions
        public void setSubsamplingOffsetY(int i10) {
            throw new UnsupportedOperationException("This instance may not be modified.");
        }

        @Override // com.tom_roush.pdfbox.filter.DecodeOptions
        public void setSubsamplingX(int i10) {
            throw new UnsupportedOperationException("This instance may not be modified.");
        }

        @Override // com.tom_roush.pdfbox.filter.DecodeOptions
        public void setSubsamplingY(int i10) {
            throw new UnsupportedOperationException("This instance may not be modified.");
        }

        @Override // com.tom_roush.pdfbox.filter.DecodeOptions
        public void setFilterSubsampled(boolean z10) {
        }
    }
}

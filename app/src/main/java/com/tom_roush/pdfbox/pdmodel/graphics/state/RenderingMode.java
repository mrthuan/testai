// Auto-fixed: added missing class declaration
public class RenderingMode {
package com.tom_roush.pdfbox.pdmodel.graphics.state;

/* loaded from: classes2.dex */
public enum RenderingMode {
    FILL(0),
    STROKE(1),
    FILL_STROKE(2),
    NEITHER(3),
    FILL_CLIP(4),
    STROKE_CLIP(5),
    FILL_STROKE_CLIP(6),
    NEITHER_CLIP(7);
    
    private static final RenderingMode[] VALUES = values();
    private final int value;

    RenderingMode(int i10) {
        this.value = i10;
    }

    public static RenderingMode fromInt(int i10) {
        return VALUES[i10];
    }

    public int intValue() {
        return this.value;
    }

    public boolean isClip() {
        if (this != FILL_CLIP && this != STROKE_CLIP && this != FILL_STROKE_CLIP && this != NEITHER_CLIP) {
            return false;
        }
        return true;
    }

    public boolean isFill() {
        if (this != FILL && this != FILL_STROKE && this != FILL_CLIP && this != FILL_STROKE_CLIP) {
            return false;
        }
        return true;
    }

    public boolean isStroke() {
        if (this != STROKE && this != FILL_STROKE && this != STROKE_CLIP && this != FILL_STROKE_CLIP) {
            return false;
        }
        return true;
    }
}

}

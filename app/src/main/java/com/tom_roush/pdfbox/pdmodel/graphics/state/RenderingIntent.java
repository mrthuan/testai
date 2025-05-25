// Auto-fixed: added missing class declaration
public class RenderingIntent {
package com.tom_roush.pdfbox.pdmodel.graphics.state;

/* loaded from: classes2.dex */
public enum RenderingIntent {
    ABSOLUTE_COLORIMETRIC("AbsoluteColorimetric"),
    RELATIVE_COLORIMETRIC("RelativeColorimetric"),
    SATURATION("Saturation"),
    PERCEPTUAL("Perceptual");
    
    private final String value;

    RenderingIntent(String str) {
        this.value = str;
    }

    public static RenderingIntent fromString(String str) {
        RenderingIntent[] values;
        for (RenderingIntent renderingIntent : values()) {
            if (renderingIntent.value.equals(str)) {
                return renderingIntent;
            }
        }
        return RELATIVE_COLORIMETRIC;
    }

    public String stringValue() {
        return this.value;
    }
}

}

// Auto-fixed: added missing class declaration
public class PageMode {
package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences;

/* loaded from: classes2.dex */
public enum PageMode {
    USE_NONE(PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE_USE_NONE),
    USE_OUTLINES(PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE_USE_OUTLINES),
    USE_THUMBS(PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE_USE_THUMBS),
    FULL_SCREEN("FullScreen"),
    USE_OPTIONAL_CONTENT(PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE_USE_OPTIONAL_CONTENT),
    USE_ATTACHMENTS("UseAttachments");
    
    private final String value;

    PageMode(String str) {
        this.value = str;
    }

    public static PageMode fromString(String str) {
        PageMode[] values;
        for (PageMode pageMode : values()) {
            if (pageMode.value.equals(str)) {
                return pageMode;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String stringValue() {
        return this.value;
    }
}

}

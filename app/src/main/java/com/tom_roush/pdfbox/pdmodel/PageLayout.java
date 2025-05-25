// Auto-fixed: added missing class declaration
public class PageLayout {
package com.tom_roush.pdfbox.pdmodel;

/* loaded from: classes2.dex */
public enum PageLayout {
    SINGLE_PAGE("SinglePage"),
    ONE_COLUMN("OneColumn"),
    TWO_COLUMN_LEFT("TwoColumnLeft"),
    TWO_COLUMN_RIGHT("TwoColumnRight"),
    TWO_PAGE_LEFT("TwoPageLeft"),
    TWO_PAGE_RIGHT("TwoPageRight");
    
    private final String value;

    PageLayout(String str) {
        this.value = str;
    }

    public static PageLayout fromString(String str) {
        PageLayout[] values;
        for (PageLayout pageLayout : values()) {
            if (pageLayout.value.equals(str)) {
                return pageLayout;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String stringValue() {
        return this.value;
    }
}

}

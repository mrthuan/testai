// Auto-fixed: added missing class declaration
public class Position {
package com.iab.omid.library.bytedance2.adsession.media;

/* loaded from: classes2.dex */
public enum Position {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");
    
    private final String position;

    Position(String str) {
        this.position = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.position;
    }
}

}

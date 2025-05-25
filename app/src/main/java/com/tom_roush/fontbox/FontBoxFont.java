package com.tom_roush.fontbox;

import android.graphics.Path;
import com.tom_roush.fontbox.util.BoundingBox;
import java.util.List;

/* loaded from: classes2.dex */
public interface FontBoxFont {
    BoundingBox getFontBBox();

    List<Number> getFontMatrix();

    String getName();

    Path getPath(String str);

    float getWidth(String str);

    boolean hasGlyph(String str);
}

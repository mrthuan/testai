package com.tom_roush.pdfbox.rendering;

import android.graphics.Path;

/* loaded from: classes2.dex */
interface Glyph2D {
    void dispose();

    Path getPathForCharacterCode(int i10);
}

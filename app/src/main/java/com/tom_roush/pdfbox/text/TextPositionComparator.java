package com.tom_roush.pdfbox.text;

import java.util.Comparator;

/* loaded from: classes2.dex */
public class TextPositionComparator implements Comparator<TextPosition> {
    @Override // java.util.Comparator
    public int compare(TextPosition textPosition, TextPosition textPosition2) {
        int compare = Float.compare(textPosition.getDir(), textPosition2.getDir());
        if (compare != 0) {
            return compare;
        }
        float xDirAdj = textPosition.getXDirAdj();
        float xDirAdj2 = textPosition2.getXDirAdj();
        float yDirAdj = textPosition.getYDirAdj();
        float yDirAdj2 = textPosition2.getYDirAdj();
        float heightDir = yDirAdj - textPosition.getHeightDir();
        float heightDir2 = yDirAdj2 - textPosition2.getHeightDir();
        if (Math.abs(yDirAdj - yDirAdj2) < 0.1d || ((yDirAdj2 >= heightDir && yDirAdj2 <= yDirAdj) || (yDirAdj >= heightDir2 && yDirAdj <= yDirAdj2))) {
            return Float.compare(xDirAdj, xDirAdj2);
        }
        return yDirAdj < yDirAdj2 ? -1 : 1;
    }
}

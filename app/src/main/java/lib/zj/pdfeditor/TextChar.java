package lib.zj.pdfeditor;

import android.graphics.RectF;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class TextChar extends RectF implements Serializable {
    public char c;
    public boolean isInvalid;

    public TextChar(float f10, float f11, float f12, float f13, char c) {
        super(f10, f11, f12, f13);
        this.c = c;
    }
}

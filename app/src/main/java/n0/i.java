package n0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TypedArrayUtils.java */
/* loaded from: classes.dex */
public final class i {
    public static c a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        c cVar;
        if (e(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new c(null, null, typedValue.data);
            }
            try {
                cVar = c.a(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception unused) {
                cVar = null;
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return new c(null, null, 0);
    }

    public static float b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        if (!e(xmlPullParser, str)) {
            return f10;
        }
        return typedArray.getFloat(i10, f10);
    }

    public static int c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        if (!e(xmlPullParser, str)) {
            return i11;
        }
        return typedArray.getInt(i10, i11);
    }

    public static String d(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i10) {
        if (!e(xmlResourceParser, str)) {
            return null;
        }
        return typedArray.getString(i10);
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}

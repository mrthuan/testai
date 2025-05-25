package c3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Field;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: MDTintHelper.java */
@SuppressLint({"PrivateResource"})
/* loaded from: classes.dex */
public final class c {
    public static void a(EditText editText, int i10) {
        Context context = editText.getContext();
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{d3.b.g(context, R.attr.colorControlNormal, 0), d3.b.g(context, R.attr.colorControlNormal, 0), i10});
        if (editText instanceof AppCompatEditText) {
            ((AppCompatEditText) editText).setSupportBackgroundTintList(colorStateList);
        } else {
            editText.setBackgroundTintList(colorStateList);
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i11 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {androidx.core.content.a.getDrawable(editText.getContext(), i11), androidx.core.content.a.getDrawable(editText.getContext(), i11)};
            drawableArr[0].setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            drawableArr[1].setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, drawableArr);
        } catch (NoSuchFieldException e10) {
            e10.getMessage();
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}

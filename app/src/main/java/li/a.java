package li;

import android.content.Context;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: SheetbarResManager.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f20656a;

    public a(Context context) {
        this.f20656a = context;
        ClassLoader classLoader = context.getClassLoader();
        androidx.core.content.a.getDrawable(context, R.drawable.ss_sheetbar_bg);
        classLoader.getResourceAsStream("com/wxiwei/office/res/icon/ss_sheetbar_bg.png");
        classLoader.getResourceAsStream("com/wxiwei/office/res/icon/ss_sheetbar_shadow_left.png");
        androidx.core.content.a.getDrawable(context, R.drawable.ss_sheetbar_shadow_left);
        androidx.core.content.a.getDrawable(context, R.drawable.ss_sheetbar_shadow_right);
        androidx.core.content.a.getDrawable(context, R.drawable.ss_sheetbar_separated_horizontal);
        androidx.core.content.a.getDrawable(context, R.drawable.ss_sheetbar_button_normal_left);
        androidx.core.content.a.getDrawable(context, R.drawable.ss_sheetbar_button_normal_right);
        androidx.core.content.a.getDrawable(context, R.drawable.ss_sheetbar_button_normal_middle);
        androidx.core.content.a.getDrawable(context, R.drawable.ss_sheetbar_button_push_left);
        androidx.core.content.a.getDrawable(context, R.drawable.ss_sheetbar_button_push_middle);
        androidx.core.content.a.getDrawable(context, R.drawable.ss_sheetbar_button_push_right);
        androidx.core.content.a.getDrawable(context, R.drawable.ss_sheetbar_button_focus_left);
        androidx.core.content.a.getDrawable(context, R.drawable.ss_sheetbar_button_focus_middle);
        androidx.core.content.a.getDrawable(context, R.drawable.ss_sheetbar_button_focus_right);
    }
}

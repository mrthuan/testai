package lib.zj.office.officereader;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.core.content.a;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class AppFrame extends LinearLayout {
    public AppFrame(Context context) {
        super(context);
        setOrientation(1);
        setBackgroundColor(a.getColor(context, R.color.colorOfficeBackground));
    }
}

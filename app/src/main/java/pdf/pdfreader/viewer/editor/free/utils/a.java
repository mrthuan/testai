package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Intent;
import androidx.activity.ComponentActivity;

/* compiled from: ActivityBridge.kt */
/* loaded from: classes3.dex */
public final class a extends j.a<Boolean, Intent> {
    @Override // j.a
    public final Intent a(ComponentActivity context, Object obj) {
        ((Boolean) obj).booleanValue();
        kotlin.jvm.internal.g.e(context, "context");
        Intent intent = new Intent(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLgRFY192TzdUIk5U", "75yghOYQ"));
        intent.addCategory(ea.a.p("Lm5VchZpUy4zbj5lG3RGY1R0C2cqchwuFlAiTg9CeEU=", "Rji2YgN4"));
        intent.putExtra(ea.a.p("Lm5VchZpUy4zbj5lG3RGZU10HGFrTSxNLV84WQdFUw==", "gyUGhlWW"), v.x());
        intent.setType(ea.a.p("WS8q", "2UsGEE7z"));
        return intent;
    }

    @Override // j.a
    public final Intent c(int i10, Intent intent) {
        if (i10 != -1) {
            return null;
        }
        return intent;
    }
}

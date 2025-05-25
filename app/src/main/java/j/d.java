package j;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.g;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class d extends a<Intent, androidx.activity.result.a> {
    @Override // j.a
    public final Intent a(ComponentActivity context, Object obj) {
        Intent input = (Intent) obj;
        g.e(context, "context");
        g.e(input, "input");
        return input;
    }

    @Override // j.a
    public final androidx.activity.result.a c(int i10, Intent intent) {
        return new androidx.activity.result.a(i10, intent);
    }
}

package j;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.h;
import kotlin.jvm.internal.g;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class e extends a<h, androidx.activity.result.a> {
    @Override // j.a
    public final Intent a(ComponentActivity context, Object obj) {
        h input = (h) obj;
        g.e(context, "context");
        g.e(input, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
        g.d(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return putExtra;
    }

    @Override // j.a
    public final androidx.activity.result.a c(int i10, Intent intent) {
        return new androidx.activity.result.a(i10, intent);
    }
}

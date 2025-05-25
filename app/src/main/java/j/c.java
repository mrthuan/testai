package j;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import j.a;
import kotlin.jvm.internal.g;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class c extends a<String, Boolean> {
    @Override // j.a
    public final Intent a(ComponentActivity context, Object obj) {
        String input = (String) obj;
        g.e(context, "context");
        g.e(input, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input});
        g.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // j.a
    public final a.C0256a b(ComponentActivity context, Object obj) {
        boolean z10;
        String input = (String) obj;
        g.e(context, "context");
        g.e(input, "input");
        if (androidx.core.content.a.checkSelfPermission(context, input) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new a.C0256a(Boolean.TRUE);
        }
        return null;
    }

    @Override // j.a
    public final Boolean c(int i10, Intent intent) {
        boolean z10;
        boolean z11;
        if (intent != null && i10 == -1) {
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z12 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        if (intArrayExtra[i11] == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    z12 = true;
                }
            }
            return Boolean.valueOf(z12);
        }
        return Boolean.FALSE;
    }
}

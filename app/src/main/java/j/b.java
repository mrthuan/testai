package j;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import j.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.f;
import kotlin.collections.q;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class b extends a<String[], Map<String, Boolean>> {
    @Override // j.a
    public final Intent a(ComponentActivity context, Object obj) {
        String[] input = (String[]) obj;
        g.e(context, "context");
        g.e(input, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
        g.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // j.a
    public final a.C0256a b(ComponentActivity context, Object obj) {
        boolean z10;
        boolean z11;
        String[] input = (String[]) obj;
        g.e(context, "context");
        g.e(input, "input");
        boolean z12 = true;
        if (input.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new a.C0256a((Serializable) q.y0());
        }
        int length = input.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (androidx.core.content.a.checkSelfPermission(context, input[i10]) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                z12 = false;
                break;
            }
            i10++;
        }
        if (z12) {
            int g02 = t0.g0(input.length);
            if (g02 < 16) {
                g02 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(g02);
            for (String str : input) {
                Pair pair = new Pair(str, Boolean.TRUE);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return new a.C0256a(linkedHashMap);
        }
        return null;
    }

    @Override // j.a
    public final Map<String, Boolean> c(int i10, Intent intent) {
        boolean z10;
        if (i10 != -1) {
            return q.y0();
        }
        if (intent == null) {
            return q.y0();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra != null && stringArrayExtra != null) {
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i11 : intArrayExtra) {
                if (i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(Boolean.valueOf(z10));
            }
            ArrayList C = f.C(stringArrayExtra);
            Iterator it = C.iterator();
            Iterator it2 = arrayList.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(kotlin.collections.g.h0(C, 10), kotlin.collections.g.h0(arrayList, 10)));
            while (it.hasNext() && it2.hasNext()) {
                arrayList2.add(new Pair(it.next(), it2.next()));
            }
            return q.E0(arrayList2);
        }
        return q.y0();
    }
}

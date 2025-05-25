package m0;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.content.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k0.x;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: ShortcutInfoCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public Context f21788a;

    /* renamed from: b  reason: collision with root package name */
    public Intent[] f21789b;
    public CharSequence c;

    /* compiled from: ShortcutInfoCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f21790a;

        public a(Context context, ShortcutInfo shortcutInfo) {
            Intent[] intents;
            CharSequence shortLabel;
            PersistableBundle extras;
            PersistableBundle extras2;
            String string;
            LocusId locusId;
            LocusId locusId2;
            d dVar = new d();
            this.f21790a = dVar;
            dVar.f21788a = context;
            shortcutInfo.getId();
            shortcutInfo.getPackage();
            intents = shortcutInfo.getIntents();
            dVar.f21789b = (Intent[]) Arrays.copyOf(intents, intents.length);
            shortcutInfo.getActivity();
            shortLabel = shortcutInfo.getShortLabel();
            dVar.c = shortLabel;
            shortcutInfo.getLongLabel();
            shortcutInfo.getDisabledMessage();
            if (Build.VERSION.SDK_INT >= 28) {
                shortcutInfo.getDisabledReason();
            } else {
                shortcutInfo.isEnabled();
            }
            shortcutInfo.getCategories();
            extras = shortcutInfo.getExtras();
            if (extras != null && extras.containsKey("extraPersonCount")) {
                int i10 = extras.getInt("extraPersonCount");
                x[] xVarArr = new x[i10];
                int i11 = 0;
                while (i11 < i10) {
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i12 = i11 + 1;
                    sb2.append(i12);
                    xVarArr[i11] = x.a.a(extras.getPersistableBundle(sb2.toString()));
                    i11 = i12;
                }
            }
            d dVar2 = this.f21790a;
            shortcutInfo.getUserHandle();
            dVar2.getClass();
            d dVar3 = this.f21790a;
            shortcutInfo.getLastChangedTimestamp();
            dVar3.getClass();
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                d dVar4 = this.f21790a;
                shortcutInfo.isCached();
                dVar4.getClass();
            }
            d dVar5 = this.f21790a;
            shortcutInfo.isDynamic();
            dVar5.getClass();
            d dVar6 = this.f21790a;
            shortcutInfo.isPinned();
            dVar6.getClass();
            d dVar7 = this.f21790a;
            shortcutInfo.isDeclaredInManifest();
            dVar7.getClass();
            d dVar8 = this.f21790a;
            shortcutInfo.isImmutable();
            dVar8.getClass();
            d dVar9 = this.f21790a;
            shortcutInfo.isEnabled();
            dVar9.getClass();
            d dVar10 = this.f21790a;
            shortcutInfo.hasKeyFieldsOnly();
            dVar10.getClass();
            d dVar11 = this.f21790a;
            if (i13 >= 29) {
                locusId = shortcutInfo.getLocusId();
                if (locusId != null) {
                    locusId2 = shortcutInfo.getLocusId();
                    t0.v(locusId2, "locusId cannot be null");
                    String b10 = b.a.b(locusId2);
                    if (!TextUtils.isEmpty(b10)) {
                        new androidx.core.content.b(b10);
                    } else {
                        throw new IllegalArgumentException("id cannot be empty");
                    }
                }
            } else {
                extras2 = shortcutInfo.getExtras();
                if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                    new androidx.core.content.b(string);
                }
            }
            dVar11.getClass();
            d dVar12 = this.f21790a;
            shortcutInfo.getRank();
            dVar12.getClass();
            d dVar13 = this.f21790a;
            shortcutInfo.getExtras();
            dVar13.getClass();
        }
    }

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            d dVar = new a(context, b.a(obj)).f21790a;
            if (!TextUtils.isEmpty(dVar.c)) {
                Intent[] intentArr = dVar.f21789b;
                if (intentArr != null && intentArr.length != 0) {
                    arrayList.add(dVar);
                } else {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
            } else {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
        }
        return arrayList;
    }
}

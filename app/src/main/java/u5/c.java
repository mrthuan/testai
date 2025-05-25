package u5;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.g;
import kotlin.text.Regex;
import kotlin.text.k;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: MetadataMatcher.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f30222a = new c();

    public static final ArrayList a(View view) {
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup i10 = w5.c.i(view);
            if (i10 != null) {
                Iterator it = w5.c.b(i10).iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    if (view != view2) {
                        arrayList.addAll(f30222a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final ArrayList b(View view) {
        boolean z10;
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(w5.c.h(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    g.d(resourceName, "resourceName");
                    String[] strArr = (String[]) new Regex(PackagingURIHelper.FORWARD_SLASH_STRING).split(resourceName, 0).toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    g.d(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final boolean d(ArrayList indicators, ArrayList keys) {
        boolean z10;
        if (k6.a.b(c.class)) {
            return false;
        }
        try {
            g.e(indicators, "indicators");
            g.e(keys, "keys");
            Iterator it = indicators.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                c cVar = f30222a;
                cVar.getClass();
                if (!k6.a.b(cVar)) {
                    Iterator it2 = keys.iterator();
                    while (it2.hasNext()) {
                        if (k.O(str, (String) it2.next(), false)) {
                            z10 = true;
                            continue;
                            break;
                        }
                    }
                }
                z10 = false;
                continue;
                if (z10) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return false;
        }
    }

    public final ArrayList c(View view) {
        boolean z10;
        if (k6.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String obj = ((TextView) view).getText().toString();
                if (obj.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && obj.length() < 100) {
                    String lowerCase = obj.toLowerCase();
                    g.d(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                }
                return arrayList;
            }
            Iterator it = w5.c.b(view).iterator();
            while (it.hasNext()) {
                arrayList.addAll(c((View) it.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }
}

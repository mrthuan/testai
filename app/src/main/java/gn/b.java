package gn;

import a6.h;
import android.content.Context;
import androidx.appcompat.view.menu.d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;

/* compiled from: PdfEditTextEventHelper.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17937a;

    /* renamed from: b  reason: collision with root package name */
    public static final CopyOnWriteArraySet<String> f17938b;
    public static final CopyOnWriteArraySet<String> c;

    /* compiled from: PdfEditTextEventHelper.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, String str, List list) {
            boolean z10;
            Iterator<String> it = b.c.iterator();
            while (it.hasNext()) {
                String next = it.next();
                tn.a.d(context, ea.a.p("VmQidCxzA3Zl", "1idafnyn"), ea.a.p("VmQidABhFGUtc1V2DF8ybypl", "30uPq2b4"), a0.a.h("editpdf_total_", next), false);
                tn.a.d(context, ea.a.p("KmRYdCZzVnZl", "GutBroEj"), ea.a.p("VmQidABhFGUtc1V2DF8ybypl", "6gVuc5HM"), d.d("editpdf_", str, "_", next), false);
            }
            Iterator<String> it2 = b.f17938b.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                tn.a.d(context, ea.a.p("KmRYdCZzVnZl", "WkOLTIOU"), ea.a.p("VmQidABhFGUtc1V2DF8ybypl", "i5MCVXJO"), a0.a.h("editpdf_total_", next2), false);
                tn.a.d(context, ea.a.p("VmQidCxzA3Zl", "MgknTgSS"), ea.a.p("KmRYdAphQWUFcyt2EF8Mb1tl", "kEmYPJCd"), h.d("editpdf_", str, "_edt_color_total"), false);
                tn.a.d(context, ea.a.p("KmRYdCZzVnZl", "44pLI8ev"), ea.a.p("VmQidABhFGUtc1V2DF8ybypl", "PwwS6EoE"), d.d("editpdf_", str, "_", next2), false);
            }
            if (list != null) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    String str2 = (String) it3.next();
                    tn.a.d(context, ea.a.p("VmQidCxzA3Zl", "0mNmGHGD"), ea.a.p("KmRYdAphQWUFcyt2EF8Mb1tl", "rVJi6Qww"), a0.a.h("addtext_total_", str2), false);
                    tn.a.d(context, ea.a.p("B2QPdGlzWXZl", "EDbf68HC"), ea.a.p("KmRYdAphQWUFcyt2EF8Mb1tl", "ClLYY6nK"), d.d("addtext_", str, "_", str2), false);
                }
            }
            if (b.c.isEmpty() && b.f17938b.isEmpty()) {
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    tn.a.d(context, ea.a.p("KmRYdCZzVnZl", "eGyhNZW3"), ea.a.p("KmRYdAphQWUFcyt2EF8Mb1tl", "wOfBbcJf"), ea.a.p("LWQQdEdkNF88bxJhbA==", "pKHy7RfD"), false);
                    tn.a.d(context, ea.a.p("VmQidCxzA3Zl", "s01qjCvh"), ea.a.p("VmQidABhFGUtc1V2DF8ybypl", "tvEah0zj"), "editpdf_".concat(str), false);
                }
            }
        }

        public static void b(Context context, String str) {
            g.e(context, "context");
            CopyOnWriteArraySet<String> copyOnWriteArraySet = EventCenter.f28668o;
            if (!copyOnWriteArraySet.contains(str)) {
                tn.a.b(context, ea.a.p("CmQVXzttZw==", "ORkqR4nf"), str);
                copyOnWriteArraySet.add(str);
            }
        }
    }

    static {
        ea.a.p("KmRFXx1lbA==", "tRZnUUvh");
        ea.a.p("VmQ_XxBvEnk=", "MBSXTUvy");
        ea.a.p("VmQ_XwB0EGUGY2g=", "xSRGuvOI");
        ea.a.p("JGQwX1VvLWQ=", "ybAD7ANj");
        ea.a.p("KmRFXxB0VmwzYw==", "3yiWnZUT");
        ea.a.p("VmQ_XwZuBmUAbF1uZQ==", "TncK9j5I");
        ea.a.p("KmRFXxpvW28oXz5vAWFs", "MCjLjtVj");
        ea.a.p("KmRFXxpvW28oXw==", "rYskjlrg");
        ea.a.p("VmQ_XxVvDHQBaU5l", "aj9E8FwA");
        ea.a.p("Jm1WXxhkZA==", "thCm3kA8");
        ea.a.p("Wm0sXwlvDW0=", "bP9pkxaw");
        ea.a.p("L20XXxtvPGE8ZQ==", "rTFpiHYL");
        ea.a.p("KmRFXx1yVmc=", "PC3y8pO3");
        f17937a = new a();
        f17938b = new CopyOnWriteArraySet<>();
        c = new CopyOnWriteArraySet<>();
    }
}

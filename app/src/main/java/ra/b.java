package ra;

import java.io.File;
import java.util.Comparator;
import pdf.pdfreader.viewer.editor.free.utils.v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29487a;

    public /* synthetic */ b(int i10) {
        this.f29487a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f29487a) {
            case 0:
                String name = ((File) obj).getName();
                int i10 = c.f29489e;
                return name.substring(0, i10).compareTo(((File) obj2).getName().substring(0, i10));
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = vl.d.f30847b;
                try {
                    if (!str.equals(v.h()) || str2.equals(v.h())) {
                        if (!str2.equals(v.h()) || str.equals(v.h())) {
                            if (str.equals(v.h())) {
                                return 0;
                            }
                            String str4 = vl.d.f30847b;
                            if (!str.equals(str4) || str2.equals(str4)) {
                                if (!str2.equals(str4) || str.equals(str4)) {
                                    if (str.equals(str4)) {
                                        return 0;
                                    }
                                    String substring = str.substring(str.lastIndexOf(ea.a.p("Lw==", "3XvPI8IE")));
                                    String substring2 = str2.substring(str2.lastIndexOf(ea.a.p("Lw==", "5t4jTcUQ")));
                                    if (substring.toLowerCase().equals(substring2.toLowerCase())) {
                                        int compareTo = substring.compareTo(substring2);
                                        if (compareTo <= 0) {
                                            if (compareTo == 0) {
                                                return str.substring(0, str.lastIndexOf(ea.a.p("Lw==", "kbHUx0sO"))).compareTo(str2.substring(0, str2.lastIndexOf(ea.a.p("Lw==", "ZCaFtoPj"))));
                                            }
                                        }
                                    } else {
                                        return substring.compareToIgnoreCase(substring2);
                                    }
                                }
                            }
                        }
                        return 1;
                    }
                    return -1;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    ea.a.p("1ZbM5Mi2h6TL5riJjoXx5dSN1af25s2SrLrMLQZjMHVBIC54EGUSdBtvbg==", "ICISDgSW");
                    return 0;
                }
        }
    }
}

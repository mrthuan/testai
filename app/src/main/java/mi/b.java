package mi;

import ei.d;
import ii.e;
import lib.zj.office.fc.ppt.attribute.ParaAttr;
import lib.zj.office.fc.ppt.attribute.RunAttr;
import zh.c;
import zh.f;
import zh.i;
import zh.j;
import zh.l;

/* compiled from: SectionElementFactory.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static d f22040a;

    /* renamed from: b  reason: collision with root package name */
    public static int f22041b;
    public static j c;

    /* renamed from: d  reason: collision with root package name */
    public static c f22042d;

    /* renamed from: e  reason: collision with root package name */
    public static i f22043e;

    public static int a(l lVar, e eVar, int i10, byte b10, String str) {
        if (str != null && str.length() != 0) {
            f22043e = new i(str);
            RunAttr.instance().setRunAttribute(f22040a, i10, null, f22043e.c, f22042d);
            i iVar = f22043e;
            int i11 = f22041b;
            iVar.f32371a = i11;
            int length = str.length() + i11;
            f22041b = length;
            i iVar2 = f22043e;
            iVar2.f32372b = length;
            c.e(iVar2);
            i iVar3 = f22043e;
            iVar3.e(f22043e.f32388e + "\n");
            int i12 = f22041b + 1;
            f22041b = i12;
            long j10 = (long) i12;
            f22043e.f32372b = j10;
            j jVar = c;
            jVar.f32372b = j10;
            lVar.e(jVar);
            j jVar2 = new j();
            c = jVar2;
            jVar2.f32371a = f22041b;
            f22042d = new c();
            ParaAttr.instance().setParaAttribute(eVar, c.c, f22042d);
            zh.b bVar = zh.b.f32374b;
            f fVar = c.c;
            bVar.getClass();
            zh.b.N(fVar, b10);
            f22043e = null;
        } else {
            i iVar4 = f22043e;
            if (iVar4 != null) {
                iVar4.e(f22043e.f32388e + "\n");
                int i13 = f22041b + 1;
                f22041b = i13;
                f22043e.f32372b = (long) i13;
            } else {
                f22043e = new i("\n");
                RunAttr.instance().setRunAttribute(f22040a, i10, null, f22043e.c, f22042d);
                i iVar5 = f22043e;
                int i14 = f22041b;
                iVar5.f32371a = i14;
                int i15 = i14 + 1;
                f22041b = i15;
                iVar5.f32372b = i15;
                c.e(iVar5);
            }
            j jVar3 = c;
            jVar3.f32372b = f22041b;
            lVar.e(jVar3);
            j jVar4 = new j();
            c = jVar4;
            jVar4.f32371a = f22041b;
            f22042d = new c();
            ParaAttr.instance().setParaAttribute(eVar, c.c, f22042d);
            zh.b bVar2 = zh.b.f32374b;
            f fVar2 = c.c;
            bVar2.getClass();
            zh.b.N(fVar2, b10);
            f22043e = null;
        }
        return f22041b;
    }

    public static void b(l lVar, e eVar, String str, int i10, byte b10) {
        if (!str.contains("\n")) {
            f22043e = new i(str);
            RunAttr.instance().setRunAttribute(f22040a, i10, null, f22043e.c, f22042d);
            i iVar = f22043e;
            int i11 = f22041b;
            iVar.f32371a = i11;
            int length = str.length() + i11;
            f22041b = length;
            i iVar2 = f22043e;
            iVar2.f32372b = length;
            c.e(iVar2);
            return;
        }
        int indexOf = str.indexOf(10);
        while (true) {
            if (indexOf < 0) {
                break;
            }
            f22041b = a(lVar, eVar, i10, b10, str.substring(0, indexOf));
            int i12 = indexOf + 1;
            if (i12 < str.length()) {
                str = str.substring(i12, str.length());
                indexOf = str.indexOf(10);
            } else {
                str = null;
                break;
            }
        }
        if (str != null) {
            f22041b = a(lVar, eVar, i10, b10, str);
        }
    }
}

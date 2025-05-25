package j3;

import java.util.ArrayList;
import java.util.List;
import l3.i;

/* compiled from: FontCharacter.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final List<i> f19028a;

    /* renamed from: b  reason: collision with root package name */
    public final char f19029b;
    public final double c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19030d;

    /* renamed from: e  reason: collision with root package name */
    public final String f19031e;

    public c(ArrayList arrayList, char c, double d10, String str, String str2) {
        this.f19028a = arrayList;
        this.f19029b = c;
        this.c = d10;
        this.f19030d = str;
        this.f19031e = str2;
    }

    public static int a(char c, String str, String str2) {
        return str2.hashCode() + androidx.activity.f.h(str, (c + 0) * 31, 31);
    }

    public final int hashCode() {
        return a(this.f19029b, this.f19031e, this.f19030d);
    }
}

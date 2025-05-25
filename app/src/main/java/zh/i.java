package zh;

/* compiled from: LeafElement.java */
/* loaded from: classes3.dex */
public class i extends a {

    /* renamed from: e  reason: collision with root package name */
    public String f32388e;

    public i(String str) {
        this.f32388e = str;
    }

    public final Object clone() {
        try {
            return (i) super.clone();
        } catch (CloneNotSupportedException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // zh.a, zh.h
    public void dispose() {
        super.dispose();
    }

    public final void e(String str) {
        this.f32388e = str;
        this.f32372b = this.f32371a + str.length();
    }

    @Override // zh.a, zh.h
    public String getText() {
        return this.f32388e;
    }

    @Override // zh.a, zh.h
    public short getType() {
        return (short) 1;
    }
}

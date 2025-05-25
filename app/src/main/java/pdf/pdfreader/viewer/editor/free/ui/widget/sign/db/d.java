package pdf.pdfreader.viewer.editor.free.ui.widget.sign.db;

import androidx.room.RoomDatabase;

/* compiled from: SignPathDao_Impl.java */
/* loaded from: classes3.dex */
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f28510a;

    /* renamed from: b  reason: collision with root package name */
    public final b f28511b;
    public final e c = new e();

    /* renamed from: d  reason: collision with root package name */
    public final c f28512d;

    public d(SignPathDataBase signPathDataBase) {
        this.f28510a = signPathDataBase;
        this.f28511b = new b(this, signPathDataBase);
        this.f28512d = new c(signPathDataBase);
    }
}

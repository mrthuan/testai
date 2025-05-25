package n4;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* compiled from: DrawableCrossFadeFactory.java */
/* loaded from: classes.dex */
public final class a implements e<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final int f22333a;

    /* renamed from: b  reason: collision with root package name */
    public b f22334b;

    public a(int i10) {
        this.f22333a = i10;
    }

    @Override // n4.e
    public final d a(DataSource dataSource) {
        if (dataSource == DataSource.MEMORY_CACHE) {
            return c.f22337a;
        }
        if (this.f22334b == null) {
            this.f22334b = new b(this.f22333a, false);
        }
        return this.f22334b;
    }
}

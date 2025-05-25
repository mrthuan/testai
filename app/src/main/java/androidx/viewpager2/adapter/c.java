package androidx.viewpager2.adapter;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f4816a;

    public c(FragmentStateAdapter fragmentStateAdapter) {
        this.f4816a = fragmentStateAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentStateAdapter fragmentStateAdapter = this.f4816a;
        fragmentStateAdapter.f4800j = false;
        fragmentStateAdapter.j();
    }
}

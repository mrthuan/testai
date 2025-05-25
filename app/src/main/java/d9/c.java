package d9;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.search.SearchView;
import com.inmobi.media.C1720m3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16153a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f16154b;

    public /* synthetic */ c(ViewGroup viewGroup, int i10) {
        this.f16153a = i10;
        this.f16154b = viewGroup;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f16153a;
        ViewGroup viewGroup = this.f16154b;
        switch (i10) {
            case 0:
                SearchView searchView = (SearchView) viewGroup;
                int i11 = SearchView.A;
                if (searchView.c()) {
                    searchView.b();
                    return false;
                }
                return false;
            default:
                return C1720m3.d((C1720m3) viewGroup, view, motionEvent);
        }
    }
}

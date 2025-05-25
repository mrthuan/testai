package u1;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Vector;
import lh.g;
import lh.n;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import rh.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30119a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f30120b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f30121d;

    public /* synthetic */ a(Object obj, int i10, Object obj2, int i11) {
        this.f30119a = i11;
        this.c = obj;
        this.f30120b = i10;
        this.f30121d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30119a;
        Object obj = this.f30121d;
        int i11 = this.f30120b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ((androidx.profileinstaller.b) obj2).f4164b.b(i11, obj);
                return;
            case 1:
                h hVar = (h) obj2;
                hVar.getClass();
                hVar.a(i11, (n) ((g) obj));
                return;
            case 2:
                pdf.pdfreader.viewer.editor.free.convert.opt.h.a((pdf.pdfreader.viewer.editor.free.convert.opt.a) obj2, i11, (Vector) obj);
                return;
            default:
                ReaderHomeActivity readerHomeActivity = (ReaderHomeActivity) obj2;
                String str = ReaderHomeActivity.Y1;
                readerHomeActivity.getClass();
                j1.e((Context) ((WeakReference) obj).get(), readerHomeActivity.getString(i11), true, null, (int) readerHomeActivity.getResources().getDimension(R.dimen.dp_104));
                return;
        }
    }

    public /* synthetic */ a(ReaderHomeActivity readerHomeActivity, WeakReference weakReference, int i10) {
        this.f30119a = 3;
        this.c = readerHomeActivity;
        this.f30121d = weakReference;
        this.f30120b = i10;
    }
}

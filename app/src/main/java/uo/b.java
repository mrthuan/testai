package uo;

import androidx.lifecycle.j0;
import androidx.lifecycle.w;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;

/* compiled from: SelectImagePreviewViewModel.kt */
/* loaded from: classes3.dex */
public final class b extends j0 {

    /* renamed from: d  reason: collision with root package name */
    public final w<ArrayList<ul.b>> f30455d;

    /* renamed from: e  reason: collision with root package name */
    public final w f30456e;

    /* renamed from: f  reason: collision with root package name */
    public final w<Integer> f30457f;

    /* renamed from: g  reason: collision with root package name */
    public final w f30458g;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        w<ArrayList<ul.b>> wVar = new w<>();
        this.f30455d = wVar;
        this.f30456e = wVar;
        w<Integer> wVar2 = new w<>();
        this.f30457f = wVar2;
        this.f30458g = wVar2;
        ImageConvertDataRepository.f26536a.getClass();
        wVar.j(ImageConvertDataRepository.f26546l.d());
    }

    public final int d() {
        Integer num = (Integer) this.f30458g.d();
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}

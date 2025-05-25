package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import kotlin.jvm.internal.Ref$BooleanRef;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: CameraActivity.kt */
/* loaded from: classes3.dex */
public final class n implements oo.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f25835a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraActivity f25836b;

    public n(Ref$BooleanRef ref$BooleanRef, CameraActivity cameraActivity) {
        this.f25835a = ref$BooleanRef;
        this.f25836b = cameraActivity;
    }

    @Override // oo.a
    public final void a() {
        this.f25835a.element = true;
        ImageConvertDataRepository.f26536a.getClass();
        ImageConvertDataRepository.k();
        CameraActivity cameraActivity = this.f25836b;
        cameraActivity.q2().f918p.setVisibility(8);
        cameraActivity.q2().f921s.setVisibility(8);
        cameraActivity.q2().f922t.setVisibility(0);
        w0.a().f28790a.execute(new u5.a(6));
    }

    @Override // oo.a
    public final void cancel() {
    }
}

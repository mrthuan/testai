package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import java.io.File;
import java.util.Map;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.bean.ThirdOpenBean;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenStatus;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: OfficeAIReaderActivity.kt */
/* loaded from: classes3.dex */
public final class z0 implements androidx.lifecycle.x<Map<Uri, ? extends ip.c>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ThirdOpenBean f24673a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OfficeAIReaderActivity f24674b;
    public final /* synthetic */ Bundle c;

    public z0(ThirdOpenBean thirdOpenBean, OfficeAIReaderActivity officeAIReaderActivity, Bundle bundle) {
        this.f24673a = thirdOpenBean;
        this.f24674b = officeAIReaderActivity;
        this.c = bundle;
    }

    @Override // androidx.lifecycle.x
    public final void m(Map<Uri, ? extends ip.c> map) {
        Map<Uri, ? extends ip.c> map2 = map;
        if (map2 != null) {
            ea.a.p("Z2gichdPEmUcUFVyGmUbYSphVWVy", "la6n6fmz");
            map2.toString();
            ip.c cVar = map2.get(this.f24673a.getUri());
            String str = null;
            OfficeAIReaderActivity officeAIReaderActivity = this.f24674b;
            if (cVar != null) {
                ThirdOpenStatus thirdOpenStatus = ThirdOpenStatus.PARSE;
                ThirdOpenStatus thirdOpenStatus2 = cVar.f18970b;
                if (thirdOpenStatus2 != thirdOpenStatus) {
                    officeAIReaderActivity.f24454u0 = false;
                    ViewGroup viewGroup = officeAIReaderActivity.f24455v;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                        ViewGroup viewGroup2 = (ViewGroup) officeAIReaderActivity.findViewById(16908290);
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(officeAIReaderActivity.findViewById(R.id.loadingRoot));
                        }
                        if (thirdOpenStatus2 != ThirdOpenStatus.DONE) {
                            t1.b(ea.a.p("Q2QtUAFlFGkXdxR0AWkkZAtwV25mcCJyNWUWciJvRjE=", "FSP4MUeC"));
                            if (thirdOpenStatus2 == ThirdOpenStatus.NOT_SUPPORT) {
                                String string = officeAIReaderActivity.getString(R.string.arg_res_0x7f13004c);
                                kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGEpbDpyKmETZSAyFHQ2cFRfF29DXyl1OnAachwp", "YkwYOwRK"));
                                String string2 = officeAIReaderActivity.getString(R.string.arg_res_0x7f13004d);
                                kotlin.jvm.internal.g.d(string2, ea.a.p("VGUQUwxyO24vKDQuR3QlaVZnfGElbGlyloDXMg50O3BWXwpvDF8hdThwCXJAXzNlS19jKQ==", "Qu3dxR7W"));
                                officeAIReaderActivity.w2(string, string2, officeAIReaderActivity.getString(R.string.arg_res_0x7f13004e));
                            } else {
                                String string3 = officeAIReaderActivity.getString(R.string.arg_res_0x7f130391);
                                kotlin.jvm.internal.g.d(string3, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHIgYQFlG18_aRxlMGU3Y1RwDWlYbik=", "tz3JiYpo"));
                                String string4 = officeAIReaderActivity.getString(R.string.arg_res_0x7f130390);
                                kotlin.jvm.internal.g.d(string4, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHIjYSdlm4DOZhtsEV9QbzlyBnAWXxFhWm4GdAlvNGVcKQ==", "yhrt70Y9"));
                                officeAIReaderActivity.w2(string3, string4, null);
                            }
                        } else {
                            PdfPreviewEntity pdfPreviewEntity = cVar.c;
                            if (pdfPreviewEntity != null) {
                                if (officeAIReaderActivity.b2(pdfPreviewEntity.getPath())) {
                                    Intent intent = officeAIReaderActivity.getIntent();
                                    if (intent != null) {
                                        intent.putExtra(ea.a.p("QGgkdyxwBmY=", "CDKMxJq0"), pdfPreviewEntity);
                                    }
                                    Intent intent2 = officeAIReaderActivity.getIntent();
                                    if (intent2 != null) {
                                        intent2.setData(Uri.fromFile(new File(pdfPreviewEntity.getPath())));
                                    }
                                    Bundle bundle = this.c;
                                    if (!officeAIReaderActivity.c2(bundle)) {
                                        officeAIReaderActivity.o2(bundle);
                                    }
                                }
                            } else {
                                t1.b(ea.a.p("Q2QtUAFlFGkXdxR0AWkkZAtwV25mcCJyMGVzcgFvNzI=", "C6sEMG57"));
                                String string5 = officeAIReaderActivity.getString(R.string.arg_res_0x7f130391);
                                kotlin.jvm.internal.g.d(string5, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHIgYQFlAl8laQBlG2U3Y1RwDWlYbik=", "xUenpClD"));
                                String string6 = officeAIReaderActivity.getString(R.string.arg_res_0x7f130390);
                                kotlin.jvm.internal.g.d(string6, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHIjYSdl0oDKZl1sFV9QbzlyBnAWXxFhWm4GdAlvNGVcKQ==", "0l4pSihk"));
                                officeAIReaderActivity.w2(string5, string6, null);
                            }
                        }
                        ThirdOpenParseManager.f28764f.i(this);
                        return;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("QW8kdCVpB3c=", "Wi9cj90H"));
                    throw null;
                }
            }
            ViewGroup viewGroup3 = officeAIReaderActivity.f24455v;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
                ViewGroup viewGroup4 = (ViewGroup) officeAIReaderActivity.findViewById(16908290);
                if (viewGroup4 != null) {
                    View inflate = LayoutInflater.from(officeAIReaderActivity).inflate(R.layout.layout_preview_loading, viewGroup4, false);
                    ((LottieAnimationView) inflate.findViewById(R.id.loadingLottie)).setAnimation(R.raw.loading);
                    TextView textView = (TextView) inflate.findViewById(R.id.loadingText);
                    Intent intent3 = officeAIReaderActivity.getIntent();
                    if (intent3 != null) {
                        str = intent3.getStringExtra(ea.a.p("R3k7ZTdlEWMmZUx0", "I2KSlQyY"));
                    }
                    textView.setText(str);
                    ((ImageView) inflate.findViewById(R.id.loadingBack)).setOnClickListener(new f5.d(officeAIReaderActivity, 4));
                    viewGroup4.addView(inflate, new FrameLayout.LayoutParams(-1, -1));
                    return;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("QW8kdCVpB3c=", "OhCzsil0"));
            throw null;
        }
    }
}

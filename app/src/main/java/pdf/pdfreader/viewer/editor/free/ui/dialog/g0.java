package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: PdfDetailsInfoDialog.java */
/* loaded from: classes3.dex */
public final class g0 extends oo.g {
    public static final /* synthetic */ int A = 0;

    /* renamed from: y  reason: collision with root package name */
    public final PdfPreviewEntity f27573y;

    /* renamed from: z  reason: collision with root package name */
    public final Activity f27574z;

    /* compiled from: PdfDetailsInfoDialog.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            g0.this.dismiss();
        }
    }

    static {
        ea.a.p("Y2QtRBZ0A2kec31uD28SaSVsXWc=", "ZSarDCA1");
    }

    public g0(Activity activity, PdfPreviewEntity pdfPreviewEntity) {
        super(activity);
        this.f27574z = activity;
        this.f27573y = pdfPreviewEntity;
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    @Override // oo.g
    public final boolean C() {
        return true;
    }

    @Override // oo.g
    public final float E() {
        return 0.9f;
    }

    @Override // oo.g
    public final int w() {
        return R.layout.layout_pdf_info_dialog;
    }

    @Override // oo.g
    public final void z() {
        ((TextView) x().findViewById(R.id.tv_create_time)).setText(getContext().getString(R.string.arg_res_0x7f130397));
        TextView textView = (TextView) x().findViewById(R.id.tv_last_viewed_label);
        textView.setText(getContext().getString(R.string.arg_res_0x7f1303a1));
        ((TextView) x().findViewById(R.id.tv_file_name_label)).setText(getContext().getString(R.string.arg_res_0x7f130392));
        ((TextView) x().findViewById(R.id.tv_path_label)).setText(getContext().getString(R.string.arg_res_0x7f1303fe));
        ((TextView) x().findViewById(R.id.tv_size_label)).setText(getContext().getString(R.string.arg_res_0x7f130150));
        x().findViewById(R.id.tv_action_ok).setOnClickListener(new d9.f(this, 23));
        PdfPreviewEntity pdfPreviewEntity = this.f27573y;
        pdf.pdfreader.viewer.editor.free.utils.extension.b.a((TextView) x().findViewById(R.id.tv_file_name), pdfPreviewEntity.getName(), pdfPreviewEntity.getPath());
        ((TextView) x().findViewById(R.id.tv_file_path)).setText(pdfPreviewEntity.getPath());
        TextView textView2 = (TextView) x().findViewById(R.id.tv_file_size);
        if (pdfPreviewEntity.getSize() == 0) {
            pdfPreviewEntity.setSize(new File(pdfPreviewEntity.getPath()).length());
        }
        Context context = getContext();
        pdfPreviewEntity.getPath();
        textView2.setText(pdf.pdfreader.viewer.editor.free.utils.v.t(context, pdfPreviewEntity.getSize()));
        TextView textView3 = (TextView) x().findViewById(R.id.file_last_viewed);
        Locale locale = this.f27574z.getResources().getConfiguration().locale;
        String[] strArr = pdf.pdfreader.viewer.editor.free.utils.a0.f28530a;
        String p10 = ea.a.p("AUgDbRcscE0FTUZkGCAueUF5", "gDI9zPQO");
        String language = locale.getLanguage();
        if (language.equals(ea.a.p("Km4=", "R4NfJUbe"))) {
            p10 = ea.a.p("e0hxbR4sQk0_TRRkRSAveT15", "0TtGw1Ff");
        }
        if (language.equals(ea.a.p("VXI=", "MbXWYaZe"))) {
            p10 = ea.a.p("B0gLbRQsF2R6TQdNVXkReXk=", "DmmKMWkW");
        }
        if (language.equals(ea.a.p("JnQ=", "VfOGVGwe"))) {
            p10 = ea.a.p("BEh-bRkseGRoTStNFHkueXk=", "7mLDtXhy");
        }
        if (language.equals(ea.a.p("VWU=", "K81KQshH"))) {
            p10 = ea.a.p("OUhYbRUuRWRmICtNeSAueUF5", "nvqbxeLm");
        }
        if (language.equals(ea.a.p("VnM=", "6naXo8Uc"))) {
            p10 = ea.a.p("B0gLbRQgUyAXTQcgDHkReQ==", "eKPnjUYg");
        }
        if (language.equals(ea.a.p("JG8=", "Y2fG1Bnc"))) {
            p10 = ea.a.p("QHk-ebuF4iAF7P2UFGS7nYQgGkhzbVsg", "Dy9GPfoL");
        }
        if (language.equals(ea.a.p("O2E=", "brQtzHce"))) {
            p10 = ea.a.p("SnkyeZa51k2UnLxkj5fzIAxICG1t", "cmLqalvI");
        }
        if (language.equals(ea.a.p("R2g=", "A9z0yToL"))) {
            p10 = ea.a.p("ekhUbSUgIiAFTSsgTXkueQ==", "kb2nHFmX");
        }
        if (language.equals(ea.a.p("P2g=", "uNEqbzJR"))) {
            p10 = ea.a.p("SnkyeZa51k2UnLxkj5fzIAxICG1t", "aqYpFsvm");
        }
        if (language.equals(ea.a.p("UnI=", "ZNzvssxS"))) {
            p10 = ea.a.p("B0gLbRQgUyAXTQfY-SAReUx5", "B6KKkdt6");
        }
        if (language.equals(ea.a.p("NXU=", "4eGL72fn"))) {
            p10 = ea.a.p("B0gLbRQgUyAXTQcgDHkReRUnvrNrJw==", "gFErCtO8");
        }
        if (language.equals(ea.a.p("Jm4=", "Du6rjI6b"))) {
            p10 = ea.a.p("BEh4bSMsVGRoTStNFHkueXk=", "HHLBNtGp");
        }
        if (language.equals(ea.a.p("R3I=", "IDS5ReHD"))) {
            p10 = ea.a.p("B0gLbRQsF2Q-IAdNOCAReUx5", "Rh4NDzOo");
        }
        if (language.equals(ea.a.p("Q3Q=", "ESbAl8n7"))) {
            if ((locale.getCountry() + "").equals(ea.a.p("H1Q=", "e4bWrmQJ"))) {
                p10 = ea.a.p("B0gLbRQgUy8XTWV5DHl5", "KhIybnMb");
            } else {
                p10 = ea.a.p("e0hxbR4gBiBVZFEnSU0bTWQnVmVhIDp5Nnk=", "Ot3WYEad");
            }
        }
        if (language.equals(ea.a.p("NGw=", "peQ9Ed1o"))) {
            p10 = ea.a.p("B0gLbRQgUyAXTQcgDHkReQ==", "LXMz43V6");
        }
        if (language.equals(ea.a.p("QHI=", "5lutM4g2"))) {
            p10 = ea.a.p("DUhXbTsuSWRmICtNeSAueUF5Lg==", "uIEmViBH");
        }
        if (language.equals(ea.a.p("UWc=", "5LeczRpd"))) {
            p10 = ea.a.p("e0hxbR4gBi4_TRp5EHkvIGPQgS4n", "wgKkK0Z6");
        }
        if (language.equals(ea.a.p("Rms=", "V3e3Rm5M"))) {
            p10 = ea.a.p("cUhLbQcgPiAFTSsgTXkueQ==", "Ku9qjZQn");
        }
        if (language.equals(ea.a.p("KWE=", "WsT6tDge"))) {
            p10 = ea.a.p("B0gLbRQgUyAXTQcgDHkReQ==", "cKfOAQQl");
        }
        if (language.equals(ea.a.p("XWw=", "cvSIkkHU"))) {
            p10 = ea.a.p("B0gLbRQgUyAXTQcgDHkReQ==", "nGRA3DsZ");
        }
        if (language.equals(ea.a.p("P2w=", "3snJdnmv"))) {
            p10 = ea.a.p("e0hxbR4uQmRcTXkuEHkveQ==", "vrbgYM0V");
        }
        if (language.equals(ea.a.p("QGs=", "O6NtnSwk"))) {
            p10 = ea.a.p("I0hObSYuEWRmICsuFHkueXk=", "ZyktK19i");
        }
        if (language.equals(ea.a.p("K2E=", "XLRmyEy4"))) {
            p10 = ea.a.p("B0gLbRQuF2R0IAdNOCAReUx5", "bbRvFNk3");
        }
        if (language.equals(ea.a.p("J3U=", "oo6hzcWZ"))) {
            p10 = ea.a.p("FnlAeWUgBk0FIAIuFEgfOlVtIA==", "tyo9KK8M");
        }
        if (language.equals(ea.a.p("N28=", "I1E8qIce"))) {
            p10 = ea.a.p("e0hxbR4gBiA_TXkgEHkveQ==", "ljOj5Aol");
        }
        if (language.equals(ea.a.p("Xnk=", "rx3D9zpe"))) {
            p10 = ea.a.p("C0hMbVkgFyAFTSsgTXkueQ==", "q6Cv4s3U");
        }
        if (language.equals(ea.a.p("PHE=", "zTkgUleN"))) {
            p10 = ea.a.p("HUhQbRsgLCAFTSsgTXkueQ==", "cWUjvHwT");
        }
        if (language.equals(ea.a.p("JGk=", "oFRh7txH"))) {
            p10 = ea.a.p("e0hxbR4sQmQWIHlNJCx2eT15eQ==", "Pq15Nx2y");
        }
        if (language.equals(ea.a.p("Xms=", "RSyp90yX"))) {
            p10 = ea.a.p("e0hxbR4sQmRSTXlNSXkveT0gFdD1Lic=", "RJdySdBN");
        }
        if (language.equals(ea.a.p("W3I=", "9Q5SVFxJ"))) {
            p10 = ea.a.p("e0hxbR4uQmRcIHlNJCAveT15Lg==", "adDPGIZL");
        }
        if (language.equals(ea.a.p("WWk=", "gm14oo73"))) {
            p10 = ea.a.p("L0hubSsgFSAFTSsgTXkueQ==", "htgTFqtn");
        }
        if (language.equals(ea.a.p("UHc=", "Wh9WYlJ6"))) {
            p10 = ea.a.p("e0hxbR4gBiA_TXkgEHkveQ==", "5EDbjpxD");
        }
        if (language.equals(ea.a.p("RnI=", "LkSy1oPE"))) {
            p10 = ea.a.p("KkhybQggKSAFTSvYuCAueUF5", "4vbHeMpo");
        }
        if (language.equals(ea.a.p("PHY=", "1gJdnbzG"))) {
            p10 = ea.a.p("B0gLbRQgUyAXTQcgDHkReQ==", "WERJn4us");
        }
        if (language.equals(ea.a.p("JXM=", "dLFAe77W"))) {
            p10 = ea.a.p("PUh7bRQuUmRmICsuFHkueXk=", "DsuAyrAH");
        }
        if (language.equals(ea.a.p("IWI=", "cJFk4n6b"))) {
            p10 = ea.a.p("B0gLbRQuF2R0IAdNOCAReUx5", "V1dJcTfk");
        }
        if (language.equals(ea.a.p("VWk=", "h5VBfXWA"))) {
            p10 = ea.a.p("C0gLbSUuSWRmICtNeSAueUF5", "qCC1HiJt");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(p10, locale);
        if (pdfPreviewEntity.getRecentDate() == 0) {
            textView.setVisibility(8);
            textView3.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setText(simpleDateFormat.format(Long.valueOf(pdfPreviewEntity.getRecentDate())));
        }
        ((TextView) x().findViewById(R.id.file_creation_time)).setText(simpleDateFormat.format(Long.valueOf(pdfPreviewEntity.getDate())));
        ((TextView) x().findViewById(R.id.tv_action_ok)).setOnClickListener(new a());
    }
}

package si;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import lib.zj.office.system.dialog.ColorPickerView;
import lib.zj.office.system.p;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ColorPickerDialog.java */
/* loaded from: classes3.dex */
public final class a extends Dialog {
    public static int c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29811a;

    /* renamed from: b  reason: collision with root package name */
    public final qi.a f29812b;

    /* compiled from: ColorPickerDialog.java */
    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ColorPickerView f29814a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ SeekBar f29815b;
        public final /* synthetic */ SeekBar c;

        public c(ColorPickerView colorPickerView, SeekBar seekBar, SeekBar seekBar2) {
            this.f29814a = colorPickerView;
            this.f29815b = seekBar;
            this.c = seekBar2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            aVar.f29812b.f29349b = this.f29814a.getColor();
            aVar.f29812b.c = this.f29815b.getProgress();
            aVar.f29812b.f29348a = this.c.getProgress();
            aVar.dismiss();
        }
    }

    /* compiled from: ColorPickerDialog.java */
    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.dismiss();
        }
    }

    public a(Context context, p pVar) {
        super(context);
        qi.a b10 = pVar.f21062o.b();
        this.f29812b = b10;
        this.f29811a = context;
        c = b10.f29349b;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this.f29811a).inflate(R.layout.pen_setting_dialog, (ViewGroup) null);
        ColorPickerView colorPickerView = (ColorPickerView) inflate.findViewById(R.id.colorPickerView);
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.strokeBar);
        SeekBar seekBar2 = (SeekBar) inflate.findViewById(R.id.alphaBar);
        qi.a aVar = this.f29812b;
        seekBar.setProgress(aVar.c);
        seekBar.setOnSeekBarChangeListener(new C0375a());
        seekBar2.setProgress(aVar.f29348a);
        colorPickerView.setAlpha(aVar.f29348a);
        seekBar2.setOnSeekBarChangeListener(new b(colorPickerView));
        ((Button) inflate.findViewById(R.id.f32429ok)).setOnClickListener(new c(colorPickerView, seekBar, seekBar2));
        ((Button) inflate.findViewById(R.id.cancel)).setOnClickListener(new d());
        setContentView(inflate);
        setTitle(R.string.arg_res_0x7f130065);
    }

    /* compiled from: ColorPickerDialog.java */
    /* renamed from: si.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0375a implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (i10 < 1) {
                seekBar.setProgress(1);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* compiled from: ColorPickerDialog.java */
    /* loaded from: classes3.dex */
    public class b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ColorPickerView f29813a;

        public b(ColorPickerView colorPickerView) {
            this.f29813a = colorPickerView;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            this.f29813a.setAlpha(i10);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}

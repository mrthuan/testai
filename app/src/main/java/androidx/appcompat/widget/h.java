package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.appcompat.widget.g0;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: AppCompatDrawableManager.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f2593b = PorterDuff.Mode.SRC_IN;
    public static h c;

    /* renamed from: a  reason: collision with root package name */
    public g0 f2594a;

    /* compiled from: AppCompatDrawableManager.java */
    /* loaded from: classes.dex */
    public class a implements g0.f {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f2595a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f2596b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f2597d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f2598e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f2599f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int i10, int[] iArr) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i10) {
            int c = p0.c(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{p0.f2647b, p0.f2648d, p0.c, p0.f2650f}, new int[]{p0.b(context, R.attr.colorButtonNormal), o0.a.c(c, i10), o0.a.c(c, i10), i10});
        }

        public static LayerDrawable c(g0 g0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable f10 = g0Var.f(context, R.drawable.abc_star_black_48dp);
            Drawable f11 = g0Var.f(context, R.drawable.abc_star_half_black_48dp);
            if ((f10 instanceof BitmapDrawable) && f10.getIntrinsicWidth() == dimensionPixelSize && f10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) f10;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                f10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f10.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((f11 instanceof BitmapDrawable) && f11.getIntrinsicWidth() == dimensionPixelSize && f11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) f11;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                f11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f11.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i10, PorterDuff.Mode mode) {
            int[] iArr = a0.f2488a;
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = h.f2593b;
            }
            mutate.setColorFilter(h.c(i10, mode));
        }

        public final ColorStateList d(Context context, int i10) {
            if (i10 == R.drawable.abc_edit_text_material) {
                return androidx.core.content.a.getColorStateList(context, R.color.abc_tint_edittext);
            }
            if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
                return androidx.core.content.a.getColorStateList(context, R.color.abc_tint_switch_track);
            }
            if (i10 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                ColorStateList d10 = p0.d(context, R.attr.colorSwitchThumbNormal);
                if (d10 != null && d10.isStateful()) {
                    int[] iArr3 = p0.f2647b;
                    iArr[0] = iArr3;
                    iArr2[0] = d10.getColorForState(iArr3, 0);
                    iArr[1] = p0.f2649e;
                    iArr2[1] = p0.c(context, R.attr.colorControlActivated);
                    iArr[2] = p0.f2650f;
                    iArr2[2] = d10.getDefaultColor();
                } else {
                    iArr[0] = p0.f2647b;
                    iArr2[0] = p0.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = p0.f2649e;
                    iArr2[1] = p0.c(context, R.attr.colorControlActivated);
                    iArr[2] = p0.f2650f;
                    iArr2[2] = p0.c(context, R.attr.colorSwitchThumbNormal);
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, p0.c(context, R.attr.colorButtonNormal));
            } else {
                if (i10 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i10 == R.drawable.abc_btn_colored_material) {
                    return b(context, p0.c(context, R.attr.colorAccent));
                }
                if (i10 != R.drawable.abc_spinner_mtrl_am_alpha && i10 != R.drawable.abc_spinner_textfield_background_material) {
                    if (a(i10, this.f2596b)) {
                        return p0.d(context, R.attr.colorControlNormal);
                    }
                    if (a(i10, this.f2598e)) {
                        return androidx.core.content.a.getColorStateList(context, R.color.abc_tint_default);
                    }
                    if (a(i10, this.f2599f)) {
                        return androidx.core.content.a.getColorStateList(context, R.color.abc_tint_btn_checkable);
                    }
                    if (i10 == R.drawable.abc_seekbar_thumb_material) {
                        return androidx.core.content.a.getColorStateList(context, R.color.abc_tint_seek_thumb);
                    }
                    return null;
                }
                return androidx.core.content.a.getColorStateList(context, R.color.abc_tint_spinner);
            }
        }
    }

    public static synchronized h a() {
        h hVar;
        synchronized (h.class) {
            if (c == null) {
                d();
            }
            hVar = c;
        }
        return hVar;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h10;
        synchronized (h.class) {
            h10 = g0.h(i10, mode);
        }
        return h10;
    }

    public static synchronized void d() {
        synchronized (h.class) {
            if (c == null) {
                h hVar = new h();
                c = hVar;
                hVar.f2594a = g0.d();
                c.f2594a.l(new a());
            }
        }
    }

    public static void e(Drawable drawable, s0 s0Var, int[] iArr) {
        boolean z10;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = g0.f2584h;
        int[] state = drawable.getState();
        int[] iArr2 = a0.f2488a;
        if (drawable.mutate() == drawable) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z11 = s0Var.f2674d;
            if (!z11 && !s0Var.c) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z11) {
                    colorStateList = s0Var.f2672a;
                } else {
                    colorStateList = null;
                }
                if (s0Var.c) {
                    mode = s0Var.f2673b;
                } else {
                    mode = g0.f2584h;
                }
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilter = g0.h(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f2594a.f(context, i10);
    }
}

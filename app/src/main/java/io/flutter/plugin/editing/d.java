package io.flutter.plugin.editing;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.common.api.Api;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.editing.f;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: InputConnectionAdaptor.java */
/* loaded from: classes.dex */
public final class d extends BaseInputConnection implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public final View f18747a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18748b;
    public final TextInputChannel c;

    /* renamed from: d  reason: collision with root package name */
    public final f f18749d;

    /* renamed from: e  reason: collision with root package name */
    public final EditorInfo f18750e;

    /* renamed from: f  reason: collision with root package name */
    public ExtractedTextRequest f18751f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18752g;

    /* renamed from: h  reason: collision with root package name */
    public CursorAnchorInfo.Builder f18753h;

    /* renamed from: i  reason: collision with root package name */
    public final ExtractedText f18754i;

    /* renamed from: j  reason: collision with root package name */
    public final InputMethodManager f18755j;

    /* renamed from: k  reason: collision with root package name */
    public final DynamicLayout f18756k;

    /* renamed from: l  reason: collision with root package name */
    public final m7.g f18757l;

    /* renamed from: m  reason: collision with root package name */
    public final a f18758m;

    /* renamed from: n  reason: collision with root package name */
    public int f18759n;

    /* compiled from: InputConnectionAdaptor.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view, int i10, TextInputChannel textInputChannel, a aVar, f fVar, EditorInfo editorInfo) {
        super(view, true);
        FlutterJNI flutterJNI = new FlutterJNI();
        this.f18752g = false;
        this.f18754i = new ExtractedText();
        this.f18759n = 0;
        this.f18747a = view;
        this.f18748b = i10;
        this.c = textInputChannel;
        this.f18749d = fVar;
        int i11 = fVar.f18762b;
        if (fVar.f18761a > 0) {
            fVar.f18763d.add(this);
        } else {
            fVar.c.add(this);
        }
        this.f18750e = editorInfo;
        this.f18758m = aVar;
        this.f18757l = new m7.g(flutterJNI);
        this.f18756k = new DynamicLayout(fVar, new TextPaint(), Api.BaseClientBuilder.API_PRIORITY_OTHER, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f18755j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.f.a
    public final void a(boolean z10) {
        InputMethodManager inputMethodManager = this.f18755j;
        View view = this.f18747a;
        f fVar = this.f18749d;
        fVar.getClass();
        inputMethodManager.updateSelection(view, Selection.getSelectionStart(fVar), Selection.getSelectionEnd(fVar), BaseInputConnection.getComposingSpanStart(fVar), BaseInputConnection.getComposingSpanEnd(fVar));
        ExtractedTextRequest extractedTextRequest = this.f18751f;
        View view2 = this.f18747a;
        InputMethodManager inputMethodManager2 = this.f18755j;
        if (extractedTextRequest != null) {
            inputMethodManager2.updateExtractedText(view2, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f18752g) {
            inputMethodManager2.updateCursorAnchorInfo(view2, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f18753h;
        if (builder == null) {
            this.f18753h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f18753h;
        f fVar = this.f18749d;
        fVar.getClass();
        int selectionStart = Selection.getSelectionStart(fVar);
        fVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(fVar));
        fVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar);
        fVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar);
        if (composingSpanStart >= 0 && composingSpanEnd > composingSpanStart) {
            this.f18753h.setComposingText(composingSpanStart, fVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        } else {
            this.f18753h.setComposingText(-1, "");
        }
        return this.f18753h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f18749d.a();
        this.f18759n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f18754i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence charSequence = this.f18749d;
        charSequence.getClass();
        extractedText.selectionStart = Selection.getSelectionStart(charSequence);
        charSequence.getClass();
        extractedText.selectionEnd = Selection.getSelectionEnd(charSequence);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            charSequence = charSequence.toString();
        }
        extractedText.text = charSequence;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        return super.clearMetaKeyStates(i10);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.f18749d.d(this);
        while (this.f18759n > 0) {
            endBatchEdit();
            this.f18759n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    @TargetApi(25)
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        ClipDescription description;
        Uri contentUri;
        ClipDescription description2;
        int i11;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                description = inputContentInfo.getDescription();
                if (description.getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    contentUri = inputContentInfo.getContentUri();
                    description2 = inputContentInfo.getDescription();
                    String mimeType = description2.getMimeType(0);
                    Context context = this.f18747a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i11 = openInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i11 = -1;
                                    }
                                    if (i11 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("mimeType", mimeType);
                                        hashMap.put("data", byteArray);
                                        hashMap.put("uri", contentUri.toString());
                                        TextInputChannel textInputChannel = this.c;
                                        textInputChannel.getClass();
                                        textInputChannel.f18704a.a(Arrays.asList(Integer.valueOf(this.f18748b), "TextInputAction.commitContent", hashMap), "TextInputClient.performAction");
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i11);
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        return super.commitText(charSequence, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x02b7, code lost:
        r14 = (r6 + 0) + r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x018f A[EDGE_INSN: B:197:0x018f->B:98:0x018f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ee A[EDGE_INSN: B:203:0x02ee->B:183:0x02ee ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.d.d(boolean, boolean):boolean");
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        f fVar = this.f18749d;
        fVar.getClass();
        if (Selection.getSelectionStart(fVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return super.deleteSurroundingTextInCodePoints(i10, i11);
    }

    public final boolean e(boolean z10, boolean z11) {
        f fVar = this.f18749d;
        int selectionStart = Selection.getSelectionStart(fVar);
        int selectionEnd = Selection.getSelectionEnd(fVar);
        boolean z12 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z11) {
            z12 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f18756k;
        if (z12) {
            if (z10) {
                Selection.moveUp(fVar, dynamicLayout);
            } else {
                Selection.moveDown(fVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(fVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z10) {
                Selection.extendUp(fVar, dynamicLayout);
            } else {
                Selection.extendDown(fVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(fVar), Selection.getSelectionEnd(fVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f18759n--;
        this.f18749d.b();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f18749d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10;
        ExtractedTextRequest extractedTextRequest2;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f18751f != null) {
        }
        if (z10) {
            extractedTextRequest2 = extractedTextRequest;
        } else {
            extractedTextRequest2 = null;
        }
        this.f18751f = extractedTextRequest2;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        beginBatchEdit();
        boolean z10 = true;
        f fVar = this.f18749d;
        if (i10 == 16908319) {
            setSelection(0, fVar.length());
        } else {
            View view = this.f18747a;
            if (i10 == 16908320) {
                int selectionStart = Selection.getSelectionStart(fVar);
                int selectionEnd = Selection.getSelectionEnd(fVar);
                if (selectionStart != selectionEnd) {
                    int min = Math.min(selectionStart, selectionEnd);
                    int max = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", fVar.subSequence(min, max)));
                    fVar.delete(min, max);
                    setSelection(min, min);
                }
            } else if (i10 == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(fVar);
                int selectionEnd2 = Selection.getSelectionEnd(fVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", fVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i10 == 16908322) {
                ClipData primaryClip = ((ClipboardManager) view.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(view.getContext());
                    int max2 = Math.max(0, Selection.getSelectionStart(fVar));
                    int max3 = Math.max(0, Selection.getSelectionEnd(fVar));
                    int min2 = Math.min(max2, max3);
                    int max4 = Math.max(max2, max3);
                    if (min2 != max4) {
                        fVar.delete(min2, max4);
                    }
                    fVar.insert(min2, coerceToText);
                    int length = coerceToText.length() + min2;
                    setSelection(length, length);
                }
            } else {
                z10 = false;
            }
        }
        endBatchEdit();
        return z10;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11 = this.f18748b;
        TextInputChannel textInputChannel = this.c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 7) {
                                    textInputChannel.getClass();
                                    textInputChannel.f18704a.a(Arrays.asList(Integer.valueOf(i11), "TextInputAction.done"), "TextInputClient.performAction");
                                } else {
                                    textInputChannel.getClass();
                                    textInputChannel.f18704a.a(Arrays.asList(Integer.valueOf(i11), "TextInputAction.previous"), "TextInputClient.performAction");
                                }
                            } else {
                                textInputChannel.getClass();
                                textInputChannel.f18704a.a(Arrays.asList(Integer.valueOf(i11), "TextInputAction.next"), "TextInputClient.performAction");
                            }
                        } else {
                            textInputChannel.getClass();
                            textInputChannel.f18704a.a(Arrays.asList(Integer.valueOf(i11), "TextInputAction.send"), "TextInputClient.performAction");
                        }
                    } else {
                        textInputChannel.getClass();
                        textInputChannel.f18704a.a(Arrays.asList(Integer.valueOf(i11), "TextInputAction.search"), "TextInputClient.performAction");
                    }
                } else {
                    textInputChannel.getClass();
                    textInputChannel.f18704a.a(Arrays.asList(Integer.valueOf(i11), "TextInputAction.go"), "TextInputClient.performAction");
                }
            } else {
                textInputChannel.getClass();
                textInputChannel.f18704a.a(Arrays.asList(Integer.valueOf(i11), "TextInputAction.newline"), "TextInputClient.performAction");
            }
        } else {
            textInputChannel.getClass();
            textInputChannel.f18704a.a(Arrays.asList(Integer.valueOf(i11), "TextInputAction.unspecified"), "TextInputClient.performAction");
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        TextInputChannel textInputChannel = this.c;
        textInputChannel.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        textInputChannel.f18704a.a(Arrays.asList(Integer.valueOf(this.f18748b), hashMap), "TextInputClient.performPrivateCommand");
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i10) {
        boolean z10;
        if ((i10 & 1) != 0) {
            this.f18755j.updateCursorAnchorInfo(this.f18747a, b());
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f18752g;
        this.f18752g = z10;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return ((io.flutter.embedding.android.f) this.f18758m).a(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        return super.setComposingRegion(i10, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean composingText;
        beginBatchEdit();
        if (charSequence.length() == 0) {
            composingText = super.commitText(charSequence, i10);
        } else {
            composingText = super.setComposingText(charSequence, i10);
        }
        endBatchEdit();
        return composingText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        beginBatchEdit();
        boolean selection = super.setSelection(i10, i11);
        endBatchEdit();
        return selection;
    }
}
